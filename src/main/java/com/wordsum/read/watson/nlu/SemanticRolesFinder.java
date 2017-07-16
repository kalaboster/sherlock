package com.wordsum.read.watson.nlu;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.*;

/**
 * A class to call Watson's semantic roles finder and ouput the
 * return into a json object.
 */
public class SemanticRolesFinder {


    protected SemanticRolesFinder(){}

    /**
     * A static method that returns this service that has ben validated.
     *
     * @param username is the user using the watson service.
     * @param password
     * @return
     */
    public static NaturalLanguageUnderstanding getService(String username, String password){

        NaturalLanguageUnderstanding service = new NaturalLanguageUnderstanding(
                NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27,
                username,
                password);

        return service;

    }

    /**
     * A method that returns the Analysis Results that I should the be able to print?
     *
     * @param service is the service I call to get the results.
     * @param text is the text I want to compute with watson.
     * @return is the Analysis Results. ...
     */
    public static AnalysisResults getAnalysisResults(NaturalLanguageUnderstanding service, String text) {

        SemanticRolesOptions semanticRolesOptions = new SemanticRolesOptions.Builder()
                .entities(true)
                .keywords(true)
                .limit(5)
                .build();

        EntitiesOptions entitiesOptions = new EntitiesOptions.Builder()
                .emotion(true)
                .sentiment(true)
                .limit(5)
                .build();

        KeywordsOptions keywordsOptions = new KeywordsOptions.Builder()
                .emotion(true)
                .sentiment(true)
                .limit(5)
                .build();

        Features features = new Features.Builder()
                .semanticRoles(semanticRolesOptions)
                .entities(entitiesOptions)
                .keywords(keywordsOptions)
                .build();

        AnalyzeOptions parameters = new AnalyzeOptions.Builder()
                .text(text)
                .features(features)
                .build();

        AnalysisResults response = service
                .analyze(parameters)
                .execute();


        return response;
    }

}

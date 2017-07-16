package com.wordsum.read.watson.nlu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.wordsum.read.watson.utils.Publisher;
import com.wordsum.read.watson.utils.Reader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A test class for SemanticRolesFinder.
 *
 */
public class SemanticRolesFinderTest {

    NaturalLanguageUnderstanding service;

    @BeforeTest
    public void setup() throws Exception {

        List<String> creds = Reader.getCredsEnv();

        //TODO: Mock when time and have a utility to executed this.
        service = SemanticRolesFinder.getService(creds.get(0), creds.get(1));

    }

    @Test
    public void testFindRootActTrueSubjectVerbObject() throws IOException {


        String text = "Don slapped Sue and his hand smashed the mosquito";
        String path = "/home/kalab/github/sherlock/src/test/resources/watson/language/nlu/test.json";

        AnalysisResults analysisResults = SemanticRolesFinder.getAnalysisResults(service, text);

        Publisher.printPrettyObjectState(analysisResults, path);

    }




}

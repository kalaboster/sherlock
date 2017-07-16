package com.wordsum.read.watson.nlu;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.wordsum.read.watson.utils.Reader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A test class for SemanticRolesFinder.
 *
 */
public class SemanticRolesFinderTest {



    @BeforeTest
    public void setup() throws Exception {

        List<String> creds = Reader.getCredsEnv();

        //TODO: Mock when time and have a utility to executed this.
        NaturalLanguageUnderstanding service = SemanticRolesFinder.getService(creds.get(0), creds.get(1));

    }

    @Test
    public static void testFindRootActTrueSubjectVerbObject(){




    }




}

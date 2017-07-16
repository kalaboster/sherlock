package com.wordsum.read.watson.utls;

import com.wordsum.read.watson.utils.Reader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * A test for the reader class to better iterate and improve the existing wordsum by rewriting.
 */
public class ReaderTest {

    @Test
    public void testReadResourceFile() throws Exception {


        String path = "/read/story/Automation_God.txt";

        File file = Reader.readResourceFile(path);

        Assert.assertTrue(file.isFile());

    }


    @Test
    public void testReadTxtFileToString() throws Exception {

        String path = "/read/story/Automation_God.txt";

        File file = Reader.readResourceFile(path);

        String text = Reader.readTxtFileToString(file);

        Assert.assertTrue(text.contains("I want to be an Automation God"));

    }


    //TODO: I am working on this process after making at least on rest call.
    //@Test
    public void testSerialSentences() throws Exception {

        String path = "/read/story/Automation_God.txt";

        File file = Reader.readResourceFile(path);
        String text = Reader.readTxtFileToString(file);

        List<String> list = Reader.serialSentences(text);

        Assert.assertEquals(list.get(0), "I want to be an Automation God.");

    }

}

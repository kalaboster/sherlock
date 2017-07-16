package com.wordsum.read.watson.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class that simply reads in a file and makes it a String.
 *
 */
public class Reader {

    private static Logger logger = LoggerFactory.getLogger(Reader.class);

    protected Reader(){}

    /**
     * Read a resource file and return that file object.
     *
     *
     * @param resourcePath is the path to the fie in the resource file directory.
     * @return is the file.
     * @throws Exception
     */
    public static File readResourceFile(String resourcePath) throws Exception {

        File resourceFile = null;

        if (resourcePath.isEmpty()) {
            throw new Exception("No File for readResourceFile.");
        }

        resourceFile = new File(FileReader.class.getResource(resourcePath).getFile());

        return resourceFile;

    }

    /**
     * This utility class is to make a string object to pass to some method that wants a string.
     *
     * @param file is the file to be read in as text.
     * @return A String version of the txt file.
     */
    public static String readTxtFileToString(File file) {

        String stringFile = null;

        try {

            stringFile = FileUtils.readFileToString(file);


        } catch (IOException e) {

            e.printStackTrace();

        }

        return stringFile;

    }


    public static List<String> getCredsEnv(){

        List<String> creds = new ArrayList<String>();

        logger.debug("System.getenv(\"WATSON_USER\"): " + System.getenv("WATSON_USER"));
        logger.debug("System.getenv(\"WATSON_PASSWORD\"): " + System.getenv("WATSON_PASSWORD"));

        if(System.getenv("WATSON_USER").isEmpty() || System.getenv("WATSON_PASSWORD").isEmpty()){
            logger.debug("Environment variables for username and password are both not found.");
        }

        creds.add(System.getenv("WATSON_USER"));
        creds.add(System.getenv("WATSON_PASSWORD"));

        return creds;
    }

    /**
     * A method to serialize the sentence sin paragraphs of a file.
     *
     * @param fileString The string object that contains the text of a file.
     * @return A list array for the sentences in the file.
     */
    public static List<String> serialSentences(String fileString){

        List<String> list = new ArrayList<String>();





        return list;
    }


}

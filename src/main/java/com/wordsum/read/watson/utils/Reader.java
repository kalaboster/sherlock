package com.wordsum.read.watson.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that simply reads in a file and makes it a String.
 *
 */
public class Reader {


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

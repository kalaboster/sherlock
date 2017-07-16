package com.wordsum.read.watson.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Utilities to publish stuff (Copied and rewritten from wordsum and put here for being easy to do.
 *
 * .
 */
public class Publisher {


    protected Publisher(){}

    /**
     * A method that will take an object and print it in json in a defined path.
     *
     * @param objectState is the object to print ot a file as a json string.
     * @param pathFile is the location to print the file.
     * @throws IOException
     */
    public static void printPrettyObjectState(Object objectState, String pathFile) throws IOException {

        //Print the pretty json to a file...
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonElement jsonElement = jsonParser.parse(objectMapper.writeValueAsString(objectState));

        String prettyJsonString = gson.toJson(jsonElement);

        FileUtils.writeStringToFile(new File(pathFile), prettyJsonString);

    }


}

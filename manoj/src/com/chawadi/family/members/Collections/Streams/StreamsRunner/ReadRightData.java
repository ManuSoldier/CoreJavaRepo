package com.chawadi.family.members.Collections.Streams.StreamsRunner;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadRightData {

    public static void main(String[] args) {
        // Write text to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\dataread.txt"))) {
            writer.write("hai this i manoj");
            writer.write("This is the second line.\n");
            writer.write("And this is the third line.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read text from a file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\dataread.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



package org.example;
// Java program (CallNodeScript.java)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallNodeScript {
    public static void main(String[] args) {
        try {
            String nodeScriptPath = "script/caps.js";
            String inputString = "SomeRandomTestString";
            String outputFilePath = "src/main/java/org/example/out.txt";

            // build
            ProcessBuilder processBuilder = new ProcessBuilder("node", nodeScriptPath, inputString, outputFilePath);
            Process process = processBuilder.start();

            // Wait time
            process.waitFor();

            // Print
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//********************************************************************
//
//  Author:        Nicholas Haight
//
//  Program #:     Program 1
//
//  File Name:     FileCopyApp.java
//
//  Course:        COSC 4302 - Operating Systems
//
//  Due Date:      02/26/2025
//
//  Instructor:    Prof. Fred Kumi
//
//  Java Version:  23.0.1
//
//  Chapter:       Chapter 2 and 3
//
//  Description:   Handles user interaction and validation for source and destination files.
//                 If source file doesn't exist will prompt user to try again. If destination file
//                 already exists will overwrite it. Will allow user to run the program as many times
//                 as they want until they enter "None" as the input for the source file.
//
//********************************************************************

import java.io.*;
import java.util.Scanner;

public class FileCopyApp
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("File Copy Utility: Copy the contents of one file to another\n");

        // sentinel value to control loop
        String sourceFileName = "";

        // Loop until user chooses to exit
        while (!sourceFileName.equalsIgnoreCase("None"))
        {
            // Prompt user for source file name
            System.out.print("Enter the source file name (or type 'None' to exit): ");
            sourceFileName = scanner.nextLine();

            // if user types "None" notify them that the program is exiting
            if (sourceFileName.equalsIgnoreCase("None"))
            {
                System.out.println("Exiting the program.");
            }

            // if user has not entered "None" continue with the program
            if (!sourceFileName.equalsIgnoreCase("None")) {
                // Check if source file exists
                File sourceFile = new File(sourceFileName);
                if (!sourceFile.exists() || !sourceFile.isFile()) {
                    System.out.println("Error: Source file does not exist or is not a valid file. Please try again.");
                }

                // Prompt for destination file name
                System.out.print("Enter the destination file name: ");
                String destinationFileName = scanner.nextLine();

                // Try copying the file using the FileCopyUtility class
                try {
                    FileCopyUtility.copyFile(sourceFileName, destinationFileName);
                } catch (IOException e) {
                    System.out.println("An error occurred while copying the file: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}

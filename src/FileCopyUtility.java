//********************************************************************
//
//  Author:        Nicholas Haight
//
//  Program #:     Program 1
//
//  File Name:     FileCopyUtility.java
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
//  Description:   Handles the copying of files from a source file to a
//                 destination file, byte-by-byte. Alerts the user if the
//                 destination file exists and asks if they want to overwrite.
//
//********************************************************************

import java.io.*;
import java.util.Scanner;

public class FileCopyUtility
{
    //***************************************************************
    //
    //  Method:       copyFile
    //
    //  Description:  Copies the contents from the source file to the
    //                destination file. It reads the file byte by byte
    //                and writes the content to the destination.
    //                Throws an IOException if an error occurs during
    //                file operations.
    //
    //  Parameters:   sourceFileName - The name of the source file.
    //                destinationFileName - The name of the destination file.
    //
    //  Returns:      N/A
    //
    //  Throws:       IOException if an error occurs during reading or
    //                writing the file.
    //
    //***************************************************************
    public static void copyFile(String sourceFileName, String destinationFileName) throws IOException
    {
        File sourceFile = new File(sourceFileName);
        File destinationFile = new File(destinationFileName);
        Scanner scanner = new Scanner(System.in);

        // Check if the source file exists before proceeding
        if (!sourceFile.exists())
        {
            throw new IOException("Source file does not exist: " + sourceFileName);
        }

        // If the destination file exists, prompt the user for confirmation to overwrite
        if (destinationFile.exists())
        {
            System.out.print("Destination file already exists. Do you want to overwrite it? (yes/no): ");
            String userResponse = scanner.nextLine().toLowerCase();

            // If the user doesn't want to overwrite, exit the method
            if (!userResponse.equals("yes"))
            {
                System.out.println("Operation aborted. Destination file was not overwritten.");
                return; // Exit the method without copying the file
            }
        }

        // Perform the file copy operation
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile))
        {
            int byteData;
            while ((byteData = inputStream.read()) != -1)
            {
                outputStream.write(byteData);
            }
        }

        System.out.println("File copied successfully from " + sourceFileName + " to " + destinationFileName);
    }
}

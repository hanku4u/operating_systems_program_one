//********************************************************************
//
//  Author:        Nicholas Haight
//
//  Program #:     Program 1
//
//  File Name:     Program1.java
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
//  Description:   Copies contents of one file to a destination file. Will first prompt the user for the
//  name of the source and destination files. Will allow the user to run the program as many times the want
//  until they enter “None” as the input for the source file.
//
//********************************************************************

public class Program1
{
   //***************************************************************
   //
   //  Method:       main
   //
   //  Description:  The main method of the program
   //
   //  Parameters:   String array
   //
   //  Returns:      N/A
   //
   //**************************************************************
   public static void main(String[] args)
   {
      // Create an object of the main class and
      // use it to call the non-static methods
      FileCopyApp obj = new FileCopyApp();

      // Call the method to copy file
      obj.main(); // This launches the file copy app

   } // End of the main method

   //***************************************************************
   //
   //  Method:       developerInfo
   //
   //  Description:  The developer information method of the program
   //                This method and comments must be included in all
   //                programming assignments.
   //
   //  Parameters:   None
   //
   //  Returns:      N/A
   //
   //***************************************************************
   public void developerInfo()
   {
      System.out.println("Name:     Nicholas Haight");
      System.out.println("Course:   COSC 4302 - Operating Systems");
      System.out.println("Program:  One");
      System.out.println("Due Date: 02/26/2025\n");
   } // End of the developerInfo method
}
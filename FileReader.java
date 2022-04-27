/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */

import java.io.*;
import java.lang.IllegalStateException;
import java.nio.file.*;
import java.util.*;


public class FileReader
{
    private static Scanner input;
    
    public static void readFile() throws Exception {
    Scanner sc = new Scanner(new File("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\american.csv"));
    //parsing a CSV file into the constructor of Scanner class 
    sc.useDelimiter(",");
    //setting comma as delimiter pattern
    while (sc.hasNext()) {
      System.out.printf(sc.next() + " ");
    }
    sc.close();
    //closes the scanner  
    }
    
    public static void openFile()
    {
        try 
        {
            input = new Scanner(Paths.get("american.csv"));
        }
        
        catch (IOException ioExc)
        {
            System.err.println("Error opening File");
            System.exit(1);
        }
        
    }
    
    public static void readRecords()
    {
        System.out.printf("First Name\t Last Name\t Position\t Stats\n");
        try
        {
            while (input.hasNext())
            {
                System.out.printf("%s\t %s\t %s\t %f\n", input.next(), input.next(),
                        input.next(), input.nextFloat());
            }
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("Invalid format");
        }
        catch (IllegalStateException stateException)
        {
            System.err.println("error reading");
            
        }
    }
    
    public static void closeFile()
    {
        if (input != null)
        {
            input.close();
        }
    }
    
}

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
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


public class FileReader
{
    private static Scanner input;
    /*
    public static void readFile() throws Exception {
        Scanner sc = new Scanner(new File("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\american.csv"));
        //parsing a CSV file into the constructor of Scanner class 
        sc.useDelimiter(",");
        //setting comma as delimiter pattern
        while (sc.hasNext()) 
        {
            String fName = sc.next();
            String lName = sc.next();
            String position = sc.next();
            String stats = sc.next();
            Player newPlayer = new Player(fName, lName, position, stats);
            System.out.println(newPlayer.toString());
          //System.out.printf(sc.next() + " ");
        }
        sc.close();
        //closes the scanner  
    }
    */
    
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
    
    public static ArrayList<Player> readFromCsv(String filename)
    {
        //ArrayList<Batter> roster = new ArrayList<>();
        ArrayList<Player> roster = new ArrayList<>();
        Path pathToFile = Paths.get(filename);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
        {
            String line = br.readLine();
            while (line != null)
            {
                String[] attributes = line.split(",");
                String fName = attributes[0];
                String lName = attributes[1];
                String position = attributes[2];
                String stats = attributes[3];
                Batter player = new Batter(fName, lName, position, stats);
                roster.add(player);
                
                line = br.readLine();
            }
        }
        
        catch (IOException ioe)
        {
            System.out.println("Invalid File Name.");
        }
        
        return roster;
            
    }
    
    
    public static void closeFile()
    {
        if (input != null)
        {
            input.close();
        }
    }
    
}

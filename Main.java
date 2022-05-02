/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3330finalproject;
        
import java.util.*;


/**
 *
 * @author Conor Wood
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        boolean loop = true;
        while (loop)
        {
            Scanner input = new Scanner(System.in);
            
//            System.out.println("Would you like the American League or National League to be the home team?");
//            String homeTeamChoice = input.nextLine();
//            Team home;
//            Team away;
            boolean inputLoop = true;
            do 
            {
//                if (homeTeamChoice.equalsIgnoreCase("american"))
//                {
//                    home = new Team("American");
//                    away = new Team("National");
//                }            
//                else 
//                {
//                    home = new Team("National");
//                    away = new Team("American");
//                }
                try
                {
                    System.out.println("Would you like the American League (1) or National League (2) to be the home team?");
                    int homeTeamChoice = Integer.parseInt(input.nextLine());
                    Team home;
                    Team away;
                    if (homeTeamChoice==1)
                    {
                        home = new Team("American");
                        away = new Team("National");
                    }   
                    else if (homeTeamChoice < 1 || homeTeamChoice > 2)
                    {
                        throw new InvalidTeamException("Team must be either American or National. Please try again.");
                    }
                    else 
                    {
                        home = new Team("National");
                        away = new Team("American");
                    }
                    System.out.println("How many innings should the game be? ");
                    
                    int inningsChoice = Integer.parseInt(input.nextLine());
                    if (inningsChoice > 9 || inningsChoice <= 0)
                    {
                        throw new InvalidInningsException("Innings Must be between 1 and 9. Please try again.");
                    }
                    Game newGame = new Game(home, away, inningsChoice);
                    newGame.startGame();
                    inputLoop = false;
                }
                
                catch (InvalidInningsException invalidInnings)
                {
                    System.out.println(invalidInnings.getMessage());
                }
                catch (InvalidTeamException invalidTeam)
                {
                    System.out.println(invalidTeam.getMessage());
                }
                catch (NumberFormatException numberFormatting)
                {
                    System.out.println("You must enter an Integer. Please try again.");
                }                
                catch (InputMismatchException inputMismatch)
                {
                    System.out.println("You must enter a String. Please Try again");
                }
            } while(inputLoop);
                        
            
            //Game newGame = new Game(home, away, inningsChoice);
            // newGame.startGame();
            
            System.out.println("Would you like to play another game? (y/n) ");
            String userChoice = input.nextLine();
            if (userChoice.equalsIgnoreCase("n"))
            {
                loop = false;
            }
                
        }
        
        
            
            
            
            
            
        
//        Team home = new Team("American");
//        Team away = new Team("National");
//        
//        Game newGame = new Game(home, away, 3);
//        newGame.startGame();
        

    }
        
}

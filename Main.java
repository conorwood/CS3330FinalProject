/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3330finalproject;
        

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
        try
        {
            FileReader.readFile();
        }
        catch (Exception exc)
        {
            System.out.println(" ");
        }
        
        
        Team home = new Team("American");
        Team away = new Team("National");
        Game newGame = new Game(home, away, 3);
        newGame.startGame();
         /*       
        AtBat newAB = new AtBat();
        newAB.doAB();
        */
//        Inning newInn = new Inning();
//        newInn.doInning();
    }
        
}

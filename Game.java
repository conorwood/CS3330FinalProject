/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */

import java.util.*;

public class Game 
{
    private Team m_homeTeam;
    private Team m_awayTeam; 
    private final int m_innings;
    private int m_currentInning;

   
    
    
    public Game(Team team1, Team team2, int innings)
    {
        m_homeTeam = team1;
        m_awayTeam = team2;
        m_innings = innings;
        m_currentInning = 1;
    }
    
    private void nextInning()
    {
        m_currentInning++;
    }
    
    private void startInning(Team team, Pitcher pitcher)
    {
        Inning inn = new Inning(team, pitcher);
        inn.doInning();
    }
    
    public void getGameDetails() throws InputMismatchException
    {
        Scanner myScanner = new Scanner(System.in);
        try
        {
            System.out.println("Enter Home Team: ");
            String homeTeamName = myScanner.nextLine();
            System.out.println("Enter Away Team: ");
            String awayTeamName = myScanner.nextLine();
            System.out.println("Home Team: " + homeTeamName + " Away Team: " + awayTeamName);
        }
        
        catch (InputMismatchException ex)
        {
            throw ex;
        }
        
    }
    
    public void determineWinner()
    {
        if (m_homeTeam.getScore() > m_awayTeam.getScore())
        {
            System.out.println(m_homeTeam.getTeamName() + " League Wins!");
        }
        else if (m_homeTeam.getScore() == m_awayTeam.getScore())
        {
            System.out.println("It's a tie!");
        }
        else 
        {
            System.out.println(m_awayTeam.getTeamName() + " League Wins!");
        }
    }
    
    
    public int getCurrentInning()
    {
        return m_currentInning;
    }
    
    private void pressKeyToContinue()
    {
        System.out.println("Press enter play the next inning");
        try
        {
            System.in.read();
        }
        catch (Exception ex)
        {
        }
    }
    
    public void startGame()
    {
        System.out.println("**** Play Ball! ****");
        m_homeTeam.fillRoster(m_homeTeam.getTeamName());
        m_awayTeam.fillRoster(m_awayTeam.getTeamName());
        // something here printing team vs team and roster
        while (m_currentInning <= m_innings)
        {
            pressKeyToContinue();
            System.out.println("Current Inning: " + m_currentInning);
            startInning(m_awayTeam, m_homeTeam.getPitcher());
            startInning(m_homeTeam, m_awayTeam.getPitcher());
            //pressKeyToContinue();
            nextInning();
        }
        
        determineWinner();
        System.out.println("\n*** SCORE *** \n"
                           + m_homeTeam.getTeamName() + ": " + m_homeTeam.getScore() + "\n"
                           + m_awayTeam.getTeamName() + ": " + m_awayTeam.getScore() + "\n");
        
       
        
        
    }
    
    
    
}

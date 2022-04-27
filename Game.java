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
    private Team m_team1;
    private Team m_team2; 
    private final int m_innings;
    private int m_currentInning;
    private int m_homeScore;
    private int m_awayScore;
   
    
    
    public Game(Team team1, Team team2, int innings)
    {
        m_team1 = team1;
        m_team2 = team2;
        m_innings = innings;
        m_currentInning = 1;
    }
    
    private void nextInning()
    {
        m_currentInning++;
    }
    
    private void startInning()
    {
        Inning inn = new Inning();
        inn.doInning();
    }
    
    
    public int getCurrentInning()
    {
        return m_currentInning;
    }
    
    public void startGame()
    {
        System.out.println("**** Play Ball! ****");
        // something here printing team vs team and roster
        while (m_currentInning <= m_innings)
        {
            System.out.println("Current Inning: " + m_currentInning);
            startInning();
            nextInning();
        }
        
    }
    
    
    
}

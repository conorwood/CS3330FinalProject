/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */

import java.util.ArrayList;

public class Team 
{
    private String m_name;
    private ArrayList<Batter> m_lineup;
    private Pitcher m_pitcher;
    private int m_runs;
    
    
    public Team(String name)
    {
        m_name = name;
    }
    
    
    public Team(String name, ArrayList<Batter> lineup, Pitcher pitcher)
    {
        m_name = name;
        m_lineup = lineup;
        m_pitcher = pitcher;
    }
    
    public void setTeamName(String name)
    {
        m_name = name;
    }
    
    public String getTeamName()
    {
        return m_name;
    }
    
    public void addRun()
    {
        m_runs++;
    }
    
    public int getScore()
    {
        return m_runs;
    }
    
    
    
}

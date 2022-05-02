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
    private ArrayList<Player> m_roster = new ArrayList<>();
    private ArrayList<Batter> m_lineup = new ArrayList<>();
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
    
    public ArrayList<Batter> getLineup()
    {
        return m_lineup;
    }
    
    public void fillRoster(String teamName)
    {
        if (teamName.equalsIgnoreCase("american"))
        {
           // m_lineup = FileReader.readFromCsv("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\american.csv");
           //m_roster = FileReader.readFromCsv("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\american.csv");
           m_roster = FileReader.readFromCsv("src\\american.csv");
           
        }
        
        else if (teamName.equalsIgnoreCase("national"))
        {
            //m_lineup = FileReader.readFromCsv("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\national.csv");
            //m_roster = FileReader.readFromCsv("C:\\Users\\Conor Wood\\Documents\\CS 3330\\Final Project\\national.csv");
            m_roster = FileReader.readFromCsv("src\\national.csv");
        }
        
        /*
        for (var v : m_roster)
        {
            System.out.println(v);
        }
        */
        m_pitcher = getPitcherFromRoster();
        
        
    }
    
    private Pitcher getPitcherFromRoster()
    {
        Player lastIndex = m_roster.get(m_roster.size()-1);
        Pitcher pitcher = new Pitcher(lastIndex.getFirstName(), lastIndex.getLastName(), lastIndex.getPosition(), lastIndex.getStats());
        return pitcher;
    }
    
    public Pitcher getPitcher()
    {
        return m_pitcher;
    }
    
    
    public Batter getBatter(int i)
    {
        //return m_lineup.get(i);
        return (Batter)m_roster.get(i);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */
public class Pitcher extends Player
{
    private float m_ERA;
    private int m_pitchCount;
    private int m_runsAllowed;
    
    public Pitcher(String fName, String lName, String position, String stats)
    {
        super(fName, lName, position, stats);
        m_ERA = Float.parseFloat(stats);
        m_pitchCount = 0;
    }
    
    public Pitcher()
    {
        m_pitchCount = 0;
    }
    
    public String getERA()
    {
        return ("ERA : " + m_ERA);
    }
        
    public String getPitchCount()
    {
        return ("Pitches Thrown : " + m_pitchCount);
    }
    
    public int getRunsAllowed()
    {
        return m_runsAllowed;
    }
    
    public void addRunsAllowed()
    {
        m_runsAllowed++;
    }
    
    public void addToPitchCount()
    {
        m_pitchCount++;
    }
    
}

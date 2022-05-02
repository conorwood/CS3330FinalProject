/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */
public class Batter extends Player
{
    private int m_currentBase;
    private float m_battingAverage;
    private int m_hits;
    private int m_walks;
    
    public Batter()
    {
        m_currentBase = 0;
    }
    
    public Batter(String fName, String lName, String position, String stats)
    {
        super(fName, lName, position, stats);
        m_battingAverage = Float.parseFloat(stats);
        m_currentBase = 0;
    }
    
    public void addHit()
    {
        m_hits++;
    }
    
    public int getHits()
    {
        return m_hits;
    }
    
    public void addWalk()
    {
        m_walks++;
    }
    
    public float getBattingAverage()
    {
        return m_battingAverage;
    }
    
    public int getCurrentBase()
    {
        return m_currentBase;
    }
    
    public void clearBase()
    {
        m_currentBase = 0;
    }
    
    
    public void advanceRunner(int bases)
    {
        m_currentBase = m_currentBase + bases;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */
public class BaseRunner
{
    private int m_currentBase;
    
    public BaseRunner()
    {
        m_currentBase = 0;
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

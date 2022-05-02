/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

/**
 *
 * @author Conor Wood
 */
public class Player 
{
    private String m_firstName;
    private String m_lastName;
    private String m_position;
    private String m_stats;    
    
    
    public Player(String firstName, String lastName, String position, String stats)
    {
        m_firstName = firstName;
        m_lastName = lastName;
        m_position = position;
        m_stats = stats;
    }
    
    public String getFirstName()
    {
        return m_firstName;
    }
    
    public String getLastName()
    {
        return m_lastName;
    }
    
    public String getFullName()
    {
        return m_firstName + " " + m_lastName;
    }
    
    public String getPosition()
    {
        return m_position;
    }
    
    public String getStats()
    {
        return m_stats;
    }
    
    @Override
    public String toString()
    {
        return ("Name: " + m_firstName + " " + m_lastName + 
                "\nPosition: " + m_position +
                "\nStats: " + m_stats
                +"\n");
    }
    
}

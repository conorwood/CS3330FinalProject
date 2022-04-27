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

public class Pitch implements Action
{
    private int m_counter;
    
    public Pitch()
    {
        m_counter = 0;
    }
    
    @Override
    public int actionGenerator()
    {
        Random r = new Random();
        int low = 1;
        int high = 4;
        int result = r.nextInt(high-low) + low;
        return result;
    } 
    
    @Override
    public int doAction()
    {
        int pitch = actionGenerator();
        m_counter++;
        return pitch;
    }
    
    public int getPitchCount()
    {
        return m_counter;
    }
}

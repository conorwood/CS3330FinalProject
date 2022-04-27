/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;
import java.lang.Thread;

/**
 *
 * @author Conor Wood
 */
public class AtBat
{
    private int m_strikeCounter;
    private int m_ballCounter;
    private boolean m_isOut;
    private Batter m_batter;
    private Pitch m_pitch = new Pitch();
    private BattedBall m_battedBall;
    
    public AtBat()
    {
        m_strikeCounter=0;
        m_ballCounter=0;
        m_isOut = false;
    }
    
    public int getStrikes()
    {
        return m_strikeCounter;
    }
    
    public int getBalls()
    {
        return m_ballCounter;
    }
    
    public String getCount()
    {
        return ("Balls: " + m_ballCounter + " Strikes: " + m_strikeCounter);
    }
    
    public boolean checkIsOut()
    {
        if (m_isOut)
        {
            return m_isOut;
        }
        else 
        {
            return false;
        }
    }
    
    public void clearCount()
    {
        m_strikeCounter=0;
        m_ballCounter=0;
    }
    
    public int doAB()
    {
        while ((getStrikes() < 3) && (getBalls() < 4))
        {
            System.out.println(getCount());
            int check = m_pitch.doAction();       
            Boolean loop = true;
            switch (check)
            {
                case 1: 
                    System.out.println("Strike!");
                    m_strikeCounter++;
                    break;
                case 2: 
                    System.out.println("Ball!");
                    m_ballCounter++;
                    break;
                case 3:
                    System.out.println("In Play!");
                    loop = false;
                    int battedBallType = doInPlay();
                    return battedBallType;
                   // break;
            }
            if (loop == false)
            {
                break;
            }
            
            if (getStrikes()==3)
            {
                m_isOut = true;
                clearCount();  
                System.out.println("Strike 3, you're out!");
                return 0;
            }
            else if (getBalls()==4)
            {
                System.out.println("Ball 4, take your base!");
                clearCount(); 
                return 1;
            }          
        }   
        return 0;
    }
    
    public int doInPlay()
    {   
        m_battedBall = new BattedBall();
        int check = m_battedBall.doAction();
        if (check==5)
        {
            m_isOut = true;
        }
        else 
        {
            m_isOut = false;
        }
        clearCount();
        return check;
        
    }
    
    
}

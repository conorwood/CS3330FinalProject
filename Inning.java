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

public class Inning
{
    private int m_outs;
    private AtBat m_AB;
    private Team m_Team;
    ArrayList<BaseRunner> m_baseRunners;
    private int m_runsScored;
    
    public Inning()
    {
        m_outs = 0;
        m_AB = new AtBat();
        m_baseRunners = new ArrayList<>();
    }
    
    private void scoreRun(BaseRunner runner)
    {
        System.out.println("Run Scored!");
        runner.clearBase();
        m_baseRunners.remove(runner);
        m_runsScored++;
    }
    
    private void addNewBaseRunner()
    {
        BaseRunner newRunner = new BaseRunner();
        m_baseRunners.add(newRunner);
    }
    
//    public void doInning()
//    {
//        ArrayList<BaseRunner> scoredRunners = new ArrayList<>();
//        while (m_outs < 3)
//        {
//            int bases = m_AB.doAB();
//            if (bases>0)
//            {
//                addNewBaseRunner();
//                for (var v:m_baseRunners)
//                {
//                    v.advanceRunner(bases);
//                    if (v.getCurrentBase() == 4)
//                    {
//                        scoredRunners.add(v);
//                        scoreRun(scoredRunners);
//                    }
//                }
//                
//            }
//                
//            if (m_AB.checkIsOut()==true)
//            {
//                m_outs++;
//                System.out.println("*** Outs = " + m_outs + " ***");
//            }
//        }
//        System.out.println("Runs Scored this Inning: " + m_runsScored);
//    }
    
    
    public void doInning()
    {
        ArrayList<BaseRunner> scoredRunners = new ArrayList<>();
        while (m_outs < 3)
        {
            int bases = m_AB.doAB();
            if (bases>0 && bases < 5)
            {
                addNewBaseRunner();
                for (var v : m_baseRunners)
                {
                    v.advanceRunner(bases);
//                    if (v.getCurrentBase()>=4)
//                    {
//                        m_runsScored++;
//                    }
                }
                
                
                
                /*
                for (var v:m_baseRunners)
                {
                    v.advanceRunner(bases);
                    if (v.getCurrentBase() == 4)
                    {
                        scoredRunners.add(v);
                        scoreRun(scoredRunners);
                    }
                }
                */
            }
                
            if (m_AB.checkIsOut()==true)
            {
                m_outs++;
                System.out.println("*** Outs = " + m_outs + " ***");
            }
        }
        for (var v : m_baseRunners)
        {
            if (v.getCurrentBase()>=4)
            {
                m_runsScored++;
            }
        }
        System.out.println("Runs Scored this Inning: " + m_runsScored);
        m_baseRunners.clear();
    }
    
}

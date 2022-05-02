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
    private Team m_team;
    private Team m_awayTeam;
    private Pitcher m_pitcher;
    ArrayList<Batter> m_baseRunners;
    private int m_runsScored;
    static private int m_positionInLineup=0;
    
    public Inning(Team team, Pitcher pitcher)
    {
        m_team = team;
        m_pitcher = pitcher;
        m_outs = 0;
        m_AB = new AtBat();
        m_baseRunners = new ArrayList<>();
    }
    
    private void scoreRun(Batter runner)
    {
        System.out.println("Run Scored!");
        runner.clearBase();
        m_baseRunners.remove(runner);
        m_runsScored++;
    }
    
    /*
    private void addNewBaseRunner()
    {
        Batter newRunner = new Batter();
        m_baseRunners.add(newRunner);
    }
*/
    
    private void addNewBaseRunner(int positionInLineup)
    {
        Batter newRunner = m_team.getBatter(positionInLineup);
        m_baseRunners.add(newRunner);
    }

    
    
    public void doInning()
    {
        //int batterInLineup=0;
        //System.out.println("Pitcher: " + m_Team.getPitcher().getFullName() + " " + m_Team.getPitcher().getERA());

        System.out.println("Pitcher: " + m_pitcher.getFullName() + " " + m_pitcher.getERA() + "\n");
        while (m_outs < 3)
        {
            if (m_positionInLineup > 8)
            {
                m_positionInLineup=0;
            }
            int bases = m_AB.doAB(m_pitcher, m_team.getBatter(m_positionInLineup));
            if (bases>0 && bases < 5)
            {
                m_positionInLineup++;
                addNewBaseRunner(m_positionInLineup);
                for (var v : m_baseRunners)
                {
                    v.advanceRunner(bases);             
                }
                
            }
                
            if (m_AB.checkIsOut()==true)
            {
                m_positionInLineup++;
                m_outs++;
                System.out.println("*** Outs = " + m_outs + " ***");
            }
        }
        for (var v : m_baseRunners)
        {
            if (v.getCurrentBase()>=4)
            {
                m_runsScored++;
                m_team.addRun();
                m_pitcher.addRunsAllowed();
            }
        }
        System.out.println("\nRuns Scored this Half Inning: " + m_runsScored + "\n");
        m_baseRunners.clear();
    }
    
}

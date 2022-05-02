/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3330finalproject;

import java.util.Random;

/**
 *
 * @author Conor Wood
 */
public class BattedBall implements Action
{
    
//    @Override
//    public int actionGenerator()
//    {
//        Random r = new Random();
//        int low = 1;
//        int high = 6;
//        int result = r.nextInt(high-low) + low;
//        return result;
//    }
//    
//    
    
    @Override 
    public int actionGenerator()
    {
        Random r = new Random();
        int low = 1;
        int high = 3;
        int result = r.nextInt(high-low) + low;
        return result;
    }
    
//    @Override 
//    public int doAction()
//    {
//        int ballInPlay = actionGenerator();
//        switch (ballInPlay)
//        {
//            case(1):
//                System.out.println("Single!");
//                return 1;
//                //break;
//            case(2):
//               System.out.println("Double!");
//               return 2;
//               //break;
//            case(3):
//                System.out.println("Triple!");
//                return 3;
//                //break;
//            case(4):
//                System.out.println("Home Run!");
//                return 4;
//                //break;
//            case(5):
//                System.out.println("Out!");
//                return 5;
//        }
//        return 0;
//    }
//}

    @Override 
    public int doAction()
    {
        int ballInPlay = actionGenerator();
        if (ballInPlay==1)
        {
            return 5;
        }
        else
        {
            ballInPlay = hitType();
            switch (ballInPlay)
            {
                case(1):
                    System.out.println("Single!");
                    return 1;
                    //break;
                case(2):
                   System.out.println("Double!");
                   return 2;
                   //break;
                case(3):
                    System.out.println("Triple!");
                    return 3;
                    //break;
                case(4):
                    System.out.println("Home Run!");
                    return 4;
                    //break;
                }
        }
        return 0;      
    }


    private int hitType()
    {
       Random r = new Random();
       int low = 1;
       int high = 5;
       int result = r.nextInt(high-low) + low;
       return result; 
    }

}


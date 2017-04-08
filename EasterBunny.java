/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;
import java.awt.Color;
        

/**
 *
 * @author totoobi
 */
public class EasterBunny extends Walker {
    private static final Shape shape = new PolygonShape(-0.633f,-0.813f, 
            0.45f,-0.813f, 0.813f,-0.174f, 0.813f,0.357f, 0.717f,0.99f, 
            -0.174f,0.993f, -0.81f,-0.273f, -0.807f,-0.458f);
    
    
    private static final BodyImage image =
        new BodyImage("data/bunny.png", 2.25f);
    
    //private int eggCount;
   // private int lifeCount;
    
    public EasterBunny(World world) {
        super(world, shape);
        addImage(image);
       // eggCount = 0;
       // lifeCount = 3;
    }
   /*
    public int getEggCount() {
        return eggCount;
    }

    public void incrementEggCount() {
        eggCount++;
        System.out.println("Mmmmm Tasty! Egg count = " + eggCount);
    }
    
     public int getCarrotCount() {
        return lifeCount;
    }

    public void incrementCarrotCount() {
        lifeCount++;
        
        System.out.println("Mmmmm Tasty! Here's an extra life = " + lifeCount);
    }
    
    
    public int getFoxCount() {
        return lifeCount;
    }

    public void incrementFoxCount() {
        lifeCount--;
        
        System.out.println("OUCH! oh oh, looks like the fox got you. Lives left " + lifeCount);
    }
    public void getBlueEggCount() {
        lifeCount ++;
        System.out.println("Congratulations you have got the magic Egg!!!, Here are 2 more lives!! life count= " + lifeCount);
               System.out.println("Your Egg Count is "+ eggCount);
    }
    */
    
    public boolean basket (){
        return true;
    }
}
 



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
public class PurpleEgg extends DynamicBody {
    private static final Shape shape = new PolygonShape(-0.081f,-0.492f, 
            -0.372f,-0.263f, -0.375f,0.175f, -0.158f,0.481f, 
            0.136f,0.475f, 0.374f,0.072f, 0.374f,-0.295f);
    
    private BodyImage img = new BodyImage("data/pink-egg.png");

    public PurpleEgg(World w) {
        super(w, shape);
        this.addImage(img);
    }
    
    
    
   
    
}

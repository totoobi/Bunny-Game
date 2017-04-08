/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;

/**
 *
 * @author totoobi
 */
public class BlueEgg extends DynamicBody {
    private static Shape shape = new PolygonShape(-0.081f,-0.492f, 
            -0.372f,-0.263f, -0.375f,0.175f, -0.158f,0.481f, 
            0.136f,0.475f, 0.374f,0.072f, 0.374f,-0.295f);
    
    private BodyImage img = new BodyImage("data/blue-egg.png",1.25f);
    
    public BlueEgg (World w) {
        super(w, shape);
        this.addImage(img);
    }
    
}

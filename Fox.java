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
public class Fox extends DynamicBody {
    private static final Shape shape = new PolygonShape(0.58f,2.13f, 1.75f,1.92f, 
            1.87f,0.6f, 1.39f,-1.79f, -2.41f,-1.81f, -2.5f,-1.55f);
    
    private BodyImage img = new BodyImage("data/fox.gif", 5.25f);
    
    public Fox (World w) {
        super(w, shape);
        this.addImage(img);
    }
    
    
}

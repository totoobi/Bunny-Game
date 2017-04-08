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
public class Basket extends DynamicBody {
   
    private static final Shape shape = new PolygonShape(-0.206f,0.622f,
            -0.561f,0.219f, -0.558f,-0.573f, 0.431f,-0.578f, 0.595f,-0.084f, 
            0.547f,0.286f, 0.264f,0.622f);
    
    private BodyImage img = new BodyImage("data/easter_egg_basket.gif", 1.25f);
    
    public Basket (World w) {
        super(w, shape);
        this.addImage(img);
    }
    
}


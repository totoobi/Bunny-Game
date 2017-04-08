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
public class Carrot extends DynamicBody {
    private static Shape shape = new PolygonShape(-0.726f,0.768f, 
            0.222f,0.768f, 0.225f,-0.323f, -0.135f,-1.055f,
            -0.444f,-1.06f, -0.681f,-0.346f);
    
    private BodyImage img = new BodyImage("data/carrot.gif");
    
    public Carrot (World w) {
        super(w, shape);
        this.addImage(img);
    }
    
    
}

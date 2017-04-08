/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import city.cs.engine.*;
import java.awt.Graphics2D;
/**
 *
 * @author totoobi
 */
public class Hub extends UserView {
    
    private Game game;
    
    public Hub(World world, Game game, int width, int height) {
        super(world, width, height);
        this.game = game;
    }
    
    @Override
    protected void paintForeground(Graphics2D g) {
        
        g.drawString("Eggs: " + game.getEggCount() , 10, 40);
       
    }
    
}

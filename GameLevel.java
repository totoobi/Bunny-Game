/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
/**
 *
 * @author totoobi
 */
public abstract class GameLevel extends World {
    private EasterBunny player;
    
    public EasterBunny getPlayer() {
        return player;
    }
    
    /**
     * Populate the world of this level.
     * Child classes should this method with additional bodies.
     */
    public void populate(Game game) {
        player = new EasterBunny(this);
        player.setPosition(startPosition());
        Basket basket = new Basket(this);
        basket.setPosition(basketPosition());
        basket.addCollisionListener(new PickupBasket(game));
    }
    
    /** The initial position of the player. */
    public abstract Vec2 startPosition();
    
    /** The position of the exit portal. */
    public abstract Vec2 basketPosition();
    
    /** Is this level complete? */
    public abstract boolean isCompleted();
}



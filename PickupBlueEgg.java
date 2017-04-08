/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

/**
 *
 * @author totoobi
 */
public class PickupBlueEgg implements CollisionListener {
    private EasterBunny bunny;
    private Game game;
    public PickupBlueEgg(EasterBunny bunny, Game game) {
        this.bunny = bunny;
        this.game = game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == bunny) {
            game.getBlueEggCount();
            e.getReportingBody().destroy();
        }
        
    }
    
}
    
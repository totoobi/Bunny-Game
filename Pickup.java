package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the bird to collect things.
 */
public class Pickup implements CollisionListener {
    private EasterBunny bunny;
    private Game game;
    
    public Pickup(EasterBunny bunny, Game game) {
        this.bunny = bunny;
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == bunny) {
            game.incrementEggCount();
            e.getReportingBody().destroy();
        }
        
    }
    
}

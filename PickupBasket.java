package game;

import city.cs.engine.*;

/**
 * Listener for collision with a door.  When the player collides with a door,
 * if the current level is complete the game is advanced to the next level. 
 */
public class PickupBasket implements CollisionListener {
    private EasterBunny bunny;
    private Game game;
    
    public PickupBasket(Game game) {
        this.bunny = bunny;
        this.game=game;
    }

    @Override
    public void collide(CollisionEvent e) {
        EasterBunny player = game.getPlayer();
        if (e.getOtherBody() == player ) {
            System.out.println("Going to next level...");
            game.goNextLevel();
        }
    }
}
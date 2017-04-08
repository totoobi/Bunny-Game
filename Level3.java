package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import java.awt.Color;
/**
 *
 * @author greg
 */

/**
 * A world with some bodies.
 */
public class Level3 extends GameLevel {
    private EasterBunny bunny;
    public Fox fox;
    
    
    private static final int NUM_EGGS = 9;
    
    /**
     * Populate the world.
     */
    
    @Override
    public void populate(Game game) {
        super.populate(game);
        
        { // make the ground
            Shape shape = new BoxShape(11, 0.5f);
            
            Body ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(0, -11.5f));
            
            //make the ceiling
            
            Body ceiling = new StaticBody (this,shape);
            ceiling.setPosition(new Vec2(0, 11.5f));
            
            // walls
            Shape leftWallShape = new BoxShape(0.5f, 12, new Vec2(-11.5f, 11.5f));
            Fixture leftWall = new SolidFixture(ground, leftWallShape);
            Shape rightWallShape = new BoxShape(0.5f, 12, new Vec2(11.5f, 11.5f));
            Fixture rightWall = new SolidFixture(ground, rightWallShape);
        }

        { // make platforms
            Shape shape = new BoxShape(5, 0.5f);
            
            Shape shape2 = new BoxShape(4, 0.5f);
            Shape shape3 = new BoxShape(0.5f, 1);
            Shape shape4 = new BoxShape(1, 0.5f);
            Shape shape5 = new BoxShape(0.5f, 4);
            
            
            Body platform1 = new StaticBody(this, shape);
            platform1.setPosition(new Vec2(-5, 3.5f));
            
            
            
            Body platform2 = new StaticBody(this, shape2);
            platform2.setPosition(new Vec2(5, -2.5f));
            
            Body platform3 = new StaticBody(this, shape5);
            platform3.setPosition(new Vec2(-1.5f, -3));
            
            Body platform4 = new StaticBody(this, shape4);
            platform4.setPosition(new Vec2(10, 5.5f));
            
            Body platform5 = new StaticBody(this, shape4);
            platform5.setPosition(new Vec2(-8, -8.5f));
            
            Body platform6 = new StaticBody(this, shape3);
            platform6.setPosition(new Vec2(-7.5f, -10));
            
            Body platform7 = new StaticBody(this, shape4);
            platform7.setPosition(new Vec2(-5.5f, 6));
        }

        
        
        {
            for (int i = 0; i < NUM_EGGS; i++) {
                Body purpleEgg = new PurpleEgg(this);
                purpleEgg.setPosition(new Vec2(i*2-7, 10));
                purpleEgg.addCollisionListener(new Pickup(getPlayer(), game));
               
            }
        }
        
        {
            Body carrot = new Carrot (this);
            carrot.setPosition(new Vec2 (-8.5f, -10));
            carrot.addCollisionListener(new PickupCarrot(getPlayer(), game));
        }
        /* {
             Body blueEgg = new BlueEgg (this);
            blueEgg.setPosition(new Vec2 (8, 9));
            blueEgg.addCollisionListener(new PickupBlueEgg(getPlayer(),game));
        }*/
        {
            fox = new Fox (this);
            fox.setPosition(new Vec2 (-5, -10));
            fox.addCollisionListener(new PickupFox(getPlayer(), game));
            fox.setLinearVelocity(new Vec2(7,0));
        }
        
        
        
    }
  
    @Override
    public Vec2 startPosition() {
        return new Vec2(2, -10);
    }

    @Override
    public Vec2 basketPosition() {
        return new Vec2(10, 9);
    }

    @Override
    public boolean isCompleted() {
           return bunny.basket();
    
    }
    
}

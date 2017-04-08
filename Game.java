package game;

import city.cs.engine.*;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

/**
 * A world with some bodies.
 */
public class Game {
    
    private int blueEggCount;
    private int eggCount;
    private int lifeCount;
    /** The World in which the bodies move and interact. */
    private GameLevel world;

    /** A graphical display of the world (a specialised JPanel). */
    private UserView view;
    
    private int level;
    
    private Controller controller;
    boolean pause = false;
    private JFrame frame;
    
    
    
    /** Initialise a new Game. */
    public Game() {
        
        blueEggCount = 0;
         eggCount = 0;
        lifeCount = 3;
        // make the world
        level = 1;
        world = new Level1();
        world.populate(this);
        

        // make a view
        view = new Hub(world,this, 1000, 500);

        // uncomment this to draw a 1-metre grid over the view
        // view.setGridResolution(1);

        // display the view in a frame
        frame = new JFrame("Multi-level game");

        // quit the application when the game window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // display the world in the window
        frame.add(view);
        // don't let the game window be resized
        
        PausePanel pausePanel = new PausePanel(this);
        frame.add(pausePanel, BorderLayout.SOUTH);
        frame.requestFocusInWindow();
        
        frame.setResizable(false);
        // size the game window to fit the world view
        frame.pack();
        // make the window visible
        frame.setVisible(true);
        // get keyboard focus
        frame.requestFocus();
        // give keyboard focus to the frame whenever the mouse enters the view
        view.addMouseListener(new GiveFocus(frame));
        
        controller = new Controller(world.getPlayer());
        frame.addKeyListener(controller);
        
        Container buttons = new PausePanel(this);
        // start!
        world.start();
    }
    
   public void pause() {
       
        
        if(pause == false){
        world.stop();
        pause = true;
        } else {
        pause = false;
        world.start();
        }
         frame.requestFocusInWindow();
    }
   
     public int getEggCount() {
        return eggCount;
    }

    public void incrementEggCount() {
        eggCount++;
        System.out.println("Mmmmm Tasty! Egg count = " + eggCount);
    }
    
     public int getCarrotCount() {
        return lifeCount;
    }

    public void incrementCarrotCount() {
        lifeCount++;
        
        System.out.println("Mmmmm Tasty! Here's an extra life = " + lifeCount);
    }
    
    
    public int getFoxCount() {
        return lifeCount;
    }

    public void incrementFoxCount() {
        lifeCount--;
        
        System.out.println("OUCH! oh oh, looks like the fox got you. Lives left " + lifeCount);
    }
    public int getBlueEggCount() {
        return blueEggCount;}
    
    public void incrementBlueEggCount(){
    
        lifeCount ++;
        System.out.println("Congratulations you have got the magic Egg!!!, Here are 2 more lives!! life count= " + lifeCount);
               System.out.println("Your Egg Count is "+ blueEggCount);
    }
    
    /** The player in the current level. */
    public EasterBunny getPlayer() {
        return world.getPlayer();
    }
    
    /** Is the current level of the game finished? */
    public boolean isCurrentLevelCompleted() {
        return world.isCompleted();
    }
    
    /** Advance to the next level of the game. */
    public void goNextLevel() {
        
        
        
        world.stop();
        level ++;
        if (level == 2){
            world = new Level2();
            world.populate(this);
            controller.setBody(world.getPlayer());
            view.setWorld(world);
            
            world.start();
        }
        if (level == 3){
            world = new Level3();
            world.populate(this);
            controller.setBody(world.getPlayer());
            view.setWorld(world);
            
            world.start();
        }
          
        
        if (level == 4) {
            System.exit(0);
        }
        
    /*
        world.stop();
        if (level == 3) {
            System.exit(0);
        } else {
            level++;
            // get a new world
            world = new Level3();
            // fill it with bodies
            world.populate(this);
            // switch the keyboard control to the new player
            controller.setBody(world.getPlayer());
            // show the new world in the view
            view.setWorld(world);

            world.start();
        }*/
    }

    /** Run the game. */
    public static void main(String[] args) {
        new Game();
    }
}

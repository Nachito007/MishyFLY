import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends World
{
    Superman superman;
    Crosshair pew;
    HealthBar health;
    public static int supermanX;
    public static int supermanY;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        setBackground("back.jpg");
        getBackground().scale(1200,800);
        prepare();
    }

    public void prepare()
    {
        superman = new Superman();
        pew = new Crosshair();
        addObject(superman, 200, 600);
        
        addObject(pew, getWidth()/2,getHeight()/2);
        for (int i=0; i<7; i++) 
          addObject(new Floor(), i*190, 750);
        health = new HealthBar();
        addObject(health,140,40);
        setPaintOrder(Superman.class,Floor.class);  
    }
    public void act(){
        List A = getObjects(HealthBar.class);
       if (A.size()==0) {
           Greenfoot.setWorld(new GOver());
        }
       if (Travel.travel == 800){
           night();
       }
       if(Travel.travel == 1600) {
           Greenfoot.setWorld(new VICTORY());
       }
    }
    public void night(){
        setBackground("Night.jpg");
        getBackground().scale(1200,800);
    }
}

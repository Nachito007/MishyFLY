
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Superman extends Actor
{
    int gravity;
    int counter;
    int playerspeed;
    int timer;
    int dtimer;
    int frame;
    public static int locationX;
    public static int locationY;
    int healthCount;
    int distance;
    
    public Superman() {
        counter = 0;
        timer = 0;
        dtimer = 0;
        frame = 0;
        healthCount = 1;
        
    }
    
    
    
    public void act() 
    {
        counter++;
        Travel.travel++;
        frame++;
        locationX = getX();
        locationY = getY();
        if (Greenfoot.isKeyDown("SPACE")) {
          gravity-=10;
          counter = 0;
        }
        if(gravity<-10)
            gravity = -10;
        if (getY()<=getImage().getHeight()/2)
           setLocation(getX(), 0);
        Actor hit = getOneIntersectingObject(Building.class);
        if(hit!=null){
             getWorld().addObject(new EXPLODE(),hit.getX(),hit.getY());
             
             
             getWorld().removeObject(hit);
            
        }
        Actor hit1 = getOneIntersectingObject(Drone.class);
        if(hit1!=null){
            getWorld().addObject(new EXPLODE(),hit1.getX(),hit1.getY()); 
            
            
            getWorld().removeObject(hit1);
             
        }
        if (getY()<650) {
          if (frame%2==0)
              gravity++;
          if (gravity==10)
            gravity = 10;
          
          playerspeed = 5;
          setImage("superman_fly.png");
          moving_city();
        }
        else  {
            gravity = 0;
            playerspeed = 0;
            setImage("superman_ground.png");            
        }
        if (hit!=null || hit1!=null){
            healthCount++;
            HealthBar.count = healthCount;
        }
        
          
        //update flying
        setLocation(getX(), getY()+gravity);
        if(getY()<25){
            setLocation(getX(),25);
        }
        
    }    
    public void moving_city(){
        timer++;
        if(timer>(Greenfoot.getRandomNumber(40)+20)){
            getWorld().addObject(new Building(), 1300,500);
            timer = 0;
            
        }
        
        dtimer++;
        if (dtimer>(Greenfoot.getRandomNumber(80)+40)){
            getWorld().addObject(new Drone(),1300, getY());
            dtimer = 0;
        }
        
        List B = getWorld().getObjects(Building.class);
        for (int k=0; k<B.size(); k++){
            Actor temp = (Actor) B.get(k);
            
            temp.setLocation(temp.getX()-playerspeed,temp.getY());
        }
    }
}

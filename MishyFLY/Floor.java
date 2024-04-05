import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Floor extends Actor
{
    public Floor() {
        getImage().scale(190,100);
    }
    
    public void act() 
    {
        Actor hit1 = getOneIntersectingObject(Superman.class);
        if(hit1!=null){
            Greenfoot.setWorld(new GOver());
        }
        }
    }    

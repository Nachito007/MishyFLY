import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drone extends Actor
{
    int speed2;
    
    public Drone() {
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
        speed2 = -9;
    }
    public void act() 
    {
        move(speed2);
    }    
}

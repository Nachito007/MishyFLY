import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class HealthBar extends Actor
{
    public static int count;
    public HealthBar(){
        getImage().scale(300,100);
        count = 1;
    }
    public void act() 
    {
        setImage("Health"+count+".png");
        getImage().scale(300,100);
        if(count>5){
            getWorld().removeObject(this);
        }
        }    
}

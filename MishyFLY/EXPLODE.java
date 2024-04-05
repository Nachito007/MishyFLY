import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EXPLODE extends Actor
{
    int count;
    int count2;
    
    public EXPLODE() {
        count = 0;
        count2 = 0;
    }
    public void act() 
    {
       count++;
       if(count>.5){
           count = 0;
           count2++;
           setImage("MC_Ex"+count2+".png");
           if(count2>9){
               
               getWorld().removeObject(this);
            }
        }
    }    
}
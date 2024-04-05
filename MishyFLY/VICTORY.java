import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class VICTORY extends World
{ 
   
    Travel distance;
    ScoreHIT hit;
    public VICTORY()
    {    
        super(600,928, 1);
        setBackground("VICTORY.jpg");
        getBackground().scale(600,928);
        hit = new ScoreHIT();
        distance = new Travel();
        addObject(hit,70,800);
        addObject(distance,170,500);
       
    }
 
}

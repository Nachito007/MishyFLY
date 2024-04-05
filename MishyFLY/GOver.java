import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GOver extends World
{
    Travel distance;
    ScoreHIT hit;
    public GOver()
    {    
        super(592,908, 1);
        setBackground("LOSE.jpg");
        getBackground().scale(592,908);
        hit = new ScoreHIT();
        distance = new Travel();
        addObject(hit,70,800);
        addObject(distance,170,300);
       
    }
 
}

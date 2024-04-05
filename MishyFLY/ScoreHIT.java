import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ScoreHIT extends Actor
{
    public static int scoreHIT;
    public ScoreHIT() {
        
    }
    public void act(){
        
        String text = "Hit:\n"+scoreHIT;
        GreenfootImage image = new GreenfootImage(text,100,new Color(255,255,255),new Color(0,0,0));
        setImage(image);
     }
}

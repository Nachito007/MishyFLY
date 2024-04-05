import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Travel
 extends Actor
{
    public static int travel;
    public Travel() {
        
    }
    public void act(){
        String text = "Traveled:\n"+travel+" KM";
        GreenfootImage image = new GreenfootImage(text,100,new Color(255,255,255),new Color(0,0,0));
        setImage(image);
     }
}

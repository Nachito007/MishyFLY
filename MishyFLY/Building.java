import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Building extends Actor
{
    public Building() {
        int number = Greenfoot.getRandomNumber(8)+1;
        String text = "building"+number+".png";
        GreenfootImage image = new GreenfootImage(text);
        int W = image.getWidth();
        int H =image.getHeight();
        int ratio = Greenfoot.getRandomNumber(20)+30;
        image.scale(W*ratio/100,H*ratio/100);
        setImage(image);
    }
    public void act() 
    {
        setLocation(getX(),810-(getImage().getHeight()/2));
        
    }    
}

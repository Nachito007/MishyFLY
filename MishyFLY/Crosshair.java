import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Crosshair extends Actor
{
    int count;
    boolean shoot;
    
    public Crosshair() {
        count = 0;
        shoot = true;
        getImage().scale(getImage().getWidth()/7,getImage().getHeight()/7);
        
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){   
            setLocation(mouse.getX(), mouse.getY());
            if(mouse.getButton() == 1 && shoot){
                shoot = false;
                getWorld().addObject(new labsoer(mouse.getX(),mouse.getY()),Superman.locationX,Superman.locationY);
                
            }
            }
        //OUTSIDE THE MOUSE IF
        if (shoot == false){
            count++;
            if(count>30){
                count = 0;
                shoot = true;
                
            }
        }
    }    
}
 
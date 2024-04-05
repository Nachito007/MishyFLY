import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class labsoer extends Actor
{
    int X,Y;
    public static int playerspeed = 15;
    int stuffHit;
    public labsoer(int EndX, int EndY) {
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/7);
        X = EndX;
        Y = EndY;
        stuffHit = 0;
        
    }
    
    public void act() 
    {
       turnTowards(X,Y);
       
       move(playerspeed);
       Actor hit1 = getOneIntersectingObject(Drone.class);
       if(hit1!=null || (X+playerspeed>getX() && X-playerspeed<getX() && Y+playerspeed>getY() && Y-playerspeed <getY())){
           if(hit1!=null){
               getWorld().addObject(new EXPLODE(),hit1.getX(),hit1.getY());
               Greenfoot.playSound("Explode.wav");
               
               ScoreHIT.scoreHIT++;
               getWorld().removeObject(hit1);
               getWorld().removeObject(this);
            }
           else{
           getWorld().addObject(new EXPLODE(), X,Y);
           
           getWorld().removeObject(this);
        }
       }
       
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    int count = 1;
    public void act()
    {
        
        count = count+10;
        move();
        turn(count);
    }
}



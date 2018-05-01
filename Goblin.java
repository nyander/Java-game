import java.util.Random;

/**
 * Write a description of class Goblin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblin
{
    // instance variables - these are the two fields
    private boolean nice;
    private Random rnd;

    /**
     * Constructor for objects of class Goblin- this is where you initialise the instance variables
     */
    public Goblin()
    {
        // initialise instance variables
        rnd = new Random();
        nice = rnd.nextBoolean();
    }
    
    public boolean isNice ()
    {
        if (nice == true)
        {
            return nice;
        }
        else 
        {
            return !nice;
           }
      }
    
    public boolean steals (){
      if (!nice) // if the goblin is not nice, it will carry out the if statement nested below
      {
          if (rnd.nextBoolean()) //this if the generated boolean value is true it will return true. meaning that the goblin is bad]
          {                     //and will steal. 
              return true;
              }
      }
      return false; // the goblin is nice, and will not will not steal (steal will return false.
    }
    
    public int doante (int maxAmountToDonate)
        { if (nice == true) //if they are nice
        { if (maxAmountToDonate > 0) //and the amount in which the user entered is greater than zero
            {
                return rnd.nextInt(maxAmountToDonate) + 1; //make the amount donated, between 1 and the amount entered
                }
            }
            return 0;
    }
    
    public String getDescription ()
    {
        if (nice == true) //if the goblin is nice, it will display nice goblin, if not it will display nasty goblin. 
        {
            return "nice goblin" ;
            }
            return "nasty goblin" ;
        }
    }


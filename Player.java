import java.util.Scanner;

public class Player {

    
    //attributes
    private String name;
    
    private int score;

    private int turn;

    //this is the constructor
    public Player()
    {
      System.out.print("Enter Player Name: ");
      Scanner sc = new Scanner(System.in);
      name = sc.nextLine();
      System.out.println("Welcome, " + name);
      score = 0;
      }

     // accessor
    public int takeTurn()
    {
        return turn;
    }

    public String getName()
    {
        return name; 
    } 

    public int getScore()
    {
        return score;
    }

    //mutator
    public void incrScore()
    {
        score++;
    }
       



} // end of whole class


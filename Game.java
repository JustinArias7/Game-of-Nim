import java.util.Scanner;


public class Game
{
    private Player player1;
    private Player player2;
    int roundNumber = 1;
    boolean playAgain = true;

    // constructors
   public Game()
    { 
      // picking a random player to go first
        player1 = new Player();
        player2 = new Player();
   }
   
    public void play()
    {
      while (playAgain)
      {
      int currentPlayer = (int)(Math.random() + 0.5);
      if (currentPlayer == 1)
          {
          System.out.println(player1.getName() + " you are going first");
          }
      else 
          {
              System.out.println(player2.getName() + " you are going first");
          }
        
     // System.out.println(player1.getScore());
      int pieces = Board.getNumPieces();
      
     // System.out.println("Number of Game Pieces: " + pieces);
      int halfPieces = pieces / 2;
      while (halfPieces >= 1) 
      {
     System.out.println("There are " + pieces + " pieces left");
     
      if (currentPlayer == 1)
      {
        System.out.print(player1.getName()+ ", ");
      }
      else
      {
        System.out.print(player2.getName()+ ", ");
      }

      System.out.println("How many pieces would you like to take from 1 to " + halfPieces);
      Scanner sc = new Scanner(System.in);
     int removedPieces = sc.nextInt();
     pieces = pieces - removedPieces;
     halfPieces = pieces / 2;
     if (currentPlayer == 1)
     {
       currentPlayer = 2;
     }
     else
     {
       currentPlayer = 1;
     
     }
      }
     
    
     System.out.println("Congrats! " + player1.getName() + ", you won!");
      
     if (currentPlayer == 2) // Add the points to current player 
     {
       player1.incrScore();
     }
     else
     {
       
       player2.incrScore();
     }
         
    System.out.println(player1.getName() + ", your Score is: " + player1.getScore());
    System.out.println(player2.getName() + ", your Score is: " + player2.getScore());
    //play again here
    roundNumber++;
   
    playAgain = playAgain();

    }
    }
private boolean playAgain()
{
    String playAgain = "";
    System.out.println("Would you like to play again yes->(a), or no->(b)");
    Scanner sc = new Scanner(System.in);
          playAgain = sc.nextLine();
          if (playAgain.equals("a"))
          {
              System.out.println("Starting round " + roundNumber + ", good luck!");
              //points check
              // start round again
            return true;
          }
          else if(playAgain.equals("b"))
          {
              System.out.println("You chose for the game to end, here are the results");
              if (player1.getScore() > player2.getScore())
              {
            System.out.println("congrats " + player1.getName() + " you have won the game");
              }
              else if (player1.getScore() < player2.getScore())
              {
            System.out.println("congrats " + player2.getName() + " you have won the game");
              }
              else
              {
              System.out.println("You guys tied"); // this else statement is in case both player's points are tied
              }
              System.out.println("Final Scores:" + player1.getScore());
               System.out.println("Final Scores:" + player2.getScore());
              return false;
          }
          else
          {
              System.out.println("Please select either a or b");
          }
        return false;
          

        
   

  

  }








} // end of whole class

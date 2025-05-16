public class Board {
    int numPieces = 0;

    //attirbutes 
    private static int pieces; 
    
     /* your code here - constructor(s) */ 
     public static void populate()
     {
      
     }

   //accessors
     public static int getNumPieces()
     {
    double doublePieces =  Math.random() * (50 - 10) + 10;
    int getNumPieces = (int) doublePieces;
      return getNumPieces;
      
     }
    public static void removePieces(int numRemoved)
    {
        
    }
    
}// end of class

/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class StaircaseBuilder {
    
    public static void main(String[] args){
     //read command line arguments
     int d = Integer.parseInt(args[0]);
     int totalBricks = Integer.parseInt(args[1]);

     //create 2D character array to represent staircase
     char[][] staircase = new char[d][d];

     //initialize staircase to all empty spaces
     for (int i = 0; i < d; i++){
         for (int j = 0; j < d; j++){
             staircase[i][j] = ' ';
         }
     }

     //build staircase
     long currentBricks = totalBricks;
     for (int n = 0; n < d; n++){
             for (int i = d - 1; i >= d - 1 - n; i--){
                 if (currentBricks > 0) {
                    currentBricks --;
                  staircase[i][n] = 'X';
                 }
             }
         }

     //print staircase
     for (int i = 0; i < d; i++){
         for (int j = 0; j < d; j++){
             System.out.print(staircase[i][j]);
         }
         System.out.println();
     }

     //print number of bricks remaining
     System.out.println("Bricks remaining: " + currentBricks);
    }

}
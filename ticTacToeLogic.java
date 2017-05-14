
// simple logic behind a tic tac toe game
// in theory it can be bettered by adding Scanners and making it
// more interactive. 

package tictactoe;

import static java.lang.System.out;


public class TicTacToe {

    public static void main(String[] args) {
     
        int[][] board = new int [2][2]; 
        
        // assuming that X = 0 and O = 1 
     
        if ( (board[0][0]== 0 && board[0][1] == 0 && board[0][2] == 0 )
                || (board[1][0]== 0 && board[1][1] == 0 && board[1][2] == 0 )
                || (board[2][0]== 0 && board[2][1] == 0 && board[2][2] == 0 )
                || (board[0][0] == 0 && board[1][1] == 0 && board[2][2] ==0 )
                || ( board[0][1] == 0 && board[1][1]==0 && board[1][2]==0) 
                || ( board[0][2] == 0 && board[1][2]==0 && board[2][2]==0) 
                || ( board[0][0] == 0 && board[0][1]==0 && board[0][2]==0) )
                {
            out.println("Player 1 wins");  
        }
        else if ( (board[0][0]== 1 && board[0][1] == 1 && board[0][2] == 1 )
                || (board[1][0]== 1 && board[1][1] == 1 && board[1][2] == 1 )
                || (board[2][0]== 1 && board[2][1] == 1 && board[2][2] == 1 )
                || (board[0][0] == 1 && board[1][1] == 1 && board[2][2] ==1 )
                || ( board[0][1] == 1 && board[1][1]==1 && board[1][2]==1) 
                || ( board[0][2] == 1 && board[1][2]==1 && board[2][2]==1) 
                || ( board[0][0] == 1 && board[0][1]==1 && board[0][2]==1) ) {
            out.println("Player 2 wins");
        }
        else {
            out.println("Tie");
        }
        
      
        
    }

}

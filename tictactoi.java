import java.util.*;
public class tictactoi {
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
         char[][] board=new char[3][3];
         //placing every character as 'empty'
          for(int i=0;i<3;i++)
         {
            for(int j=0;j<3;j++)
            {
                board[i][j]=' ';
            }
          }
          System.out.println("lets start the game");
          char player='X';
          while(true)
          {
            player=(player=='X')?'O':'X';
            display(board);
            int row=0,col=0;
            System.out.println("enter the row and column");
            row=sc.nextInt();
            col=sc.nextInt();
            //checking the validity
            while(check(board,row,col))
            {
               System.out.println("enter valid location");
               row=sc.nextInt();
               col=sc.nextInt();
            }
            //insering the char player
            board[row][col]=player;
            boolean b;
            b=who(board,player);
           //0 System.out.println(b);
            if(b==true)
              {
                 System.out.println("player: "+player+" won");
                 break;
              } 
              if(full(board))
              {
                System.out.println("Game over");
              break;
              }
           }
        }
        //display function
     public static void display(char board[][])
     {
      System.out.println("- - - - - - - -");
       for(int i=0;i<3;i++)
       {
        System.out.print("| ");
        for(int j=0;j<3;j++)
        {
            System.out.print(board[i][j]+" | ");
        }
        System.out.println();
        System.out.println("- - - - - - - -");
       }
       
     } 
     //checking
     public static boolean check(char board[][],int r,int c)
     {
           if(!(board[r][c]==' '))
           return true;
           else return false;
     }
    //checking
     public static boolean who(char[][] board,char p)
     {
       //n System.out.println(p+"dn11");
        for(int i=0;i<3;i++)
        {
            if(board[i][0]==p && board[i][1]==p && board[i][2]==p)
          {
            return true;
          }
        }
        //
        for(int i=0;i<3;i++)
        {
            if(board[0][i]==p &&board[1][i]==p &&board[2][i]==p)
          {
            return true;
          }
        }
        //
        if(board[0][0]==p &&board[1][1]==p &&board[2][2]==p)
        {
            
          return true;
        }
        //
        if(board[0][2]==p &&board[1][1]==p &&board[2][0]==p)
        {
          return true;
        }
        return false;
     }
     //
     public static boolean full(char[][] board)
     {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]==' ')
                return false;
            }
        }
        return true;
     }
}

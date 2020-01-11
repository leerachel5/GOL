import java.util.Scanner;
/**
 * Game of Life
 *
 * @author Rachel Lee
 * @version 12-08-19
 */
public class GameOfLife
{
    public static void main(String[] args)
    {
        int[][] board =
            {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            };
        int[][]updatedBoard = 
            {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},

            };
        int gens = 0;
        System.out.println("Enter the number of generations: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt())
        {
            gens = in.nextInt();
        }
        System.out.println(printBoard(board));
        for (int currentGen = 1; currentGen <= gens; currentGen++)
        {
            for (int row = 0; row < board.length; row++)
            {
                for (int col = 0; col < board[0].length; col++)
                {
                    int alive = 0;

                    //top edge
                    if(row == 0)
                    {
                        //top left corner
                        if(col==0)
                        {
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }

                        //top right corner
                        else if(col == board[0].length-1)
                        {
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }
                        else
                        {
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                        }
                    }

                    //right edge
                    else if(col == board[0].length-1)
                    {
                        //top right corner
                        if(row == 0)
                        {
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }
                        //bottom right corner
                        else if(row == board.length-1)
                        {
                            if(board[row-1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                        }
                        else
                        {
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }
                    }

                    //bottom edge
                    else if (row == board.length - 1)
                    {
                        //bottom right corner
                        if (col == board[0].length-1)
                        {
                            if(board[row-1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                        }
                        //bottom left corner
                        else if (col == 0)
                        {
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                        }
                        else
                        {
                            if(board[row][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col-1] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                        }
                    }

                    //left edge
                    else if (col == 0)
                    {
                        //bottom left corner
                        if (row == board.length-1)
                        {
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                        }
                        //top left corner
                        else if (row == 0)
                        {
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }

                        else
                        {
                            if(board[row-1][col] == 1)
                            {
                                alive++;
                            }
                            if(board[row-1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col+1] == 1)
                            {
                                alive++;
                            }
                            if(board[row+1][col] == 1)
                            {
                                alive++;
                            }
                        }
                    }

                    //not edges
                    else if (row != 0 && col != 0 && row != board.length-1 && col != board[0].length-1)
                    {
                        if(board[row-1][col-1] == 1)
                        {
                            alive++;
                        }
                        if(board[row-1][col] == 1)
                        {
                            alive++;
                        }
                        if(board[row-1][col+1] == 1)
                        {
                            alive++;
                        }
                        if(board[row][col-1] == 1)
                        {
                            alive++;
                        }
                        if(board[row][col+1] == 1)
                        {
                            alive++;
                        }
                        if(board[row+1][col-1] == 1)
                        {
                            alive++;
                        }
                        if(board[row+1][col] == 1)
                        {
                            alive++;
                        }
                        if(board[row+1][col+1] == 1)
                        {
                            alive++;
                        }
                    }
                    
                    if (alive >= 4)
                    {
                        updatedBoard[row][col] = 0;
                    }
                    else if (alive == 3)
                    {
                        updatedBoard[row][col] = 1;
                    }
                    else if (alive == 2)
                    {
                        updatedBoard[row][col] = board[row][col];
                    }
                    else if (alive < 2)
                    {
                        updatedBoard[row][col] = 0;
                    }
                }
            }
            int[][]temp = new int[board.length][];
            for (int i =0; i<board.length;i++)
            {
                temp[i] = new int[board[i].length];
                for (int j = 0; j<board[0].length;j++)
                {
                    temp[i][j] = updatedBoard[i][j];
                }
            }
            board = temp; 
            System.out.println(GameOfLife.printBoard(board));
        }
    }

    /**
     * Method to print out the 2D-Array
     * 
     * @param int[][] the 2D-Array
     * @return String the game board
     */
    public static String printBoard(int[][] array)
    {
        String board = "";
        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[0].length; col++)
            {
                if (array[row][col] == 0)
                {
                    board += "-";
                }
                else if (array[row][col] == 1)
                {
                    board += "*";
                }
            }
            board += "\n";
        }
        return board;
    }
}
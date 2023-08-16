import java.util.Scanner;

public class Submission
{
    public Submission()
    {
        
    }

    
    public static void main (String[] args) 
    {
        int dimensions = Integer.parseInt(args[0]);
        Scanner number = new Scanner(System.in);
        int[][] numGrid = new int[dimensions][dimensions];
        
        for (int i=0; i<dimensions; i++) {
            for (int j=0; j<dimensions; j++){
                numGrid[i][j] = number.nextInt();
            }
        }
        
        
        
        for (int i = numGrid.length - 2; i >= 0; i--){
            for(int j= 0; j < numGrid.length; j++) {
                
                if (j == 0 ) {
                    numGrid[i][j] += numGrid[i+1][j+1];
                }
                else if (j == numGrid.length - 1) {
                    numGrid[i][j] += numGrid[i+1][j-1];
                }
                else {
                    int r = j+1;
                    int l = j-1;
                    if (numGrid[i+1][r] > numGrid[i+1][l]) {
                            numGrid[i][j] += numGrid[i+1][r];
                    }
                    else {
                            numGrid[i][j] += numGrid[i+1][l];
                    }
                }
            }
        }
        int biggestValue = 0;
        for (int j = 0; j < numGrid.length; j++) {
            if (numGrid[0][j] > biggestValue ) {
                biggestValue = numGrid[0][j];
            }
        }
        System.out.println(biggestValue);
    }
    
    
}  
    

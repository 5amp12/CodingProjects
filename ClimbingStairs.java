import java.util.ArrayList;

public class ClimbingStairs {
    
    public static void main(String[] args){
        ClimbingStairs c = new ClimbingStairs();
        c.climbStairs(5);
    }

    public int climbStairs(int n)            //##this is basically just a fibonacci sequence##
    {
        int counter = 0;
        ArrayList<Integer> variences = new ArrayList<Integer>();
        int x=0;
        for (int i = variences.size(); i < n+1; i++){          
            if (i == 0 || i == 1){                         //this just makes the first two numbers in the serquence 1 
               variences.add(1);
            }
            else{ 
                int num = 0;
                num = variences.get(i-1) + variences.get(i-2);        //this then adds up the previous two awsners 
                variences.add(num);
            }
            x++;
        }
        counter = variences.get(variences.size()-1);
        return counter;
    }
}

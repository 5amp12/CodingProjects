import java.util.Scanner;

public class PalindromeNum {
    
    public static void main (String[] args){
        PalindromeNum pal = new PalindromeNum();
        System.out.println("Type a number, and we can see if its palindrome");
        Scanner scanner = new Scanner(System.in);
        int awnser = scanner.nextInt();

        pal.PalindromeNumber(awnser);
    }

    public boolean PalindromeNumber(int n)
    {
        String number = Integer.toString(n);
        int y=number.length()-1;
        boolean palindrome = false;

        
        int halved = number.length()-1;
        for(int x = 0; x <= halved ; x++){
            if (number.charAt(x) != number.charAt(y)){
                palindrome = false;
                break;
            }

            palindrome = true;
            y--;
        }
        System.out.println(palindrome);      //so user can see
        return(palindrome);
    }
    
}

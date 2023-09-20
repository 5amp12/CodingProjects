import java.util.ArrayList;

public class RomanToInt{

    //This program turns a set of random roman numerals and turns them into the integer they represent
    
    public static void main(String[] args){
        RomanToInt r = new RomanToInt();
        r.romanToInt("LVIII");
    }

    public int romanToInt(String s) {
        int num = 0;
        ArrayList<Integer> numerals  = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++){ 
            String romanList = "IVXLCDM";
            if (s.charAt(i) == romanList.charAt(0)){
                numerals.add(1);
            }
            if (s.charAt(i) == romanList.charAt(1)){
                numerals.add(5);
            }
            if (s.charAt(i) == romanList.charAt(2)){
                numerals.add(10);
            }
            if (s.charAt(i) == romanList.charAt(3)){
                numerals.add(50);
            }
            if (s.charAt(i) == romanList.charAt(4)){
                numerals.add(100);
            }
            if (s.charAt(i) == romanList.charAt(5)){
                numerals.add(500);
            }
            if (s.charAt(i) == romanList.charAt(6)){
                numerals.add(1000);
            }
            //numerals.add(s.charAt(i));
        }
         for (int i = 0; i < numerals.size(); i++){

            if (i == numerals.size()-1){
                num += numerals.get(i);
            }
            else if (numerals.get(i+1) > numerals.get(i)){
                num += numerals.get(i+1) - numerals.get(i);
                numerals.remove(i+1);
            }
            else{
                num += numerals.get(i);
            }

        }

        
        System.out.println(num);
        return num;
        
    }



}
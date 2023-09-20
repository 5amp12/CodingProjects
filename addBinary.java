public class addBinary {
    //  ###### MAKE THIS MORE EFFICIENT #############
    public static void main(String[] args){

        addBinary b = new addBinary();
        b.addingBinary("100", "110010");
    }

    public String addingBinary(String a, String b) {
        String awnser = "";
        
        if (b.length() > a.length()){
            for (int i = a.length(); i < b.length(); i++){
                a = 0+a;
            }
        }
        else if (b.length() < a.length()){
            for (int i = b.length(); i < a.length(); i++){
                b = 0+b;
            }
        }
        else{

        }
        
        boolean carryTheOne = false;

        for (int i = a.length()-1; i > -1; i--){
            char x = '0';
            if (a.charAt(i) == '1' && b.charAt(i) == '1'){
                if (carryTheOne == true){
                    x = '1';
                    awnser = x + awnser;
                }
                else{
                    awnser = x + awnser; 
                }
                carryTheOne = true;
            }
            else if (a.charAt(i) == '1' && b.charAt(i) == '0'){
                x = '1';
                if (carryTheOne == true){
                    x = '0';
                    awnser = x + awnser;
                }
                else{
                    awnser = x + awnser; 
                }
            } 
            else if (a.charAt(i) == '0' && b.charAt(i) == '1'){
                x = '1';
                if (carryTheOne == true){
                    x = '0';
                    awnser = x + awnser;
                }
                else{
                    awnser = x + awnser; 
                }
            }
            else if (a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(carryTheOne == true){
                    x = '1';
                    awnser = x + awnser;
                }
                else{
                    awnser = x + awnser;
                }
                 
                carryTheOne = false;
            }  
            if(i == 0 && carryTheOne == true){
                awnser = '1' + awnser;
            }
            
        }
        System.out.println(awnser);
        return awnser;
    }
}

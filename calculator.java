import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

//import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
public class calculator implements ActionListener
{
    private JFrame frame;
    private JButton button;
    private JTextField text;
    
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonD;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonX;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonS;
    private JButton buttonAC;
    private JButton button0;
    private JButton buttonE;
    private JButton buttonP;
    private String equation; //where the numbers are stored and then deleted
    private String num;
    private String symbol;
    private ArrayList<String> collection;
    
    public calculator()
    {
        // initialise instance variables
        makeFrame();
        equation = "";
        num = "";
        symbol = "";
        //makeMenuBar();
        collection = new ArrayList<>();
    }

    public void makeFrame()
    {
        //button = new JButton();
        // button.setBounds(200, 100, 100, 50);
        // button.addActionListener(this);  //have to add this for actionListener
        //frame = new JFrame("YUH");
        frame = new JFrame("Calculator"); 
        
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        text = new JTextField("0");
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.RIGHT);
        text.setBackground(Color.WHITE);
        text.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text.setFont(new Font("Ariel", Font.PLAIN, 40));
        
        contentPane.add(text, BorderLayout.NORTH); //adding the text field to the north of the screen

        JPanel top = new JPanel();

        //contentPane.add(top, BorderLayout.NORTH);
        //top.add(text);
        // panel.setLayout(new BorderLayout());
        //panel.add(new JButton("0"), BorderLayout.NORTH);

        //Container contentPane = frame.getContentPane();
        
        button7 = new JButton();
        button7.addActionListener(this); 
        button7.setBackground(Color.WHITE);
        button7.setText("7");
        
        button8 = new JButton();
        button8.addActionListener(this); 
        button8.setBackground(Color.WHITE);
        button8.setText("8"); 
        
        button9 = new JButton();
        button9.addActionListener(this); 
        button9.setBackground(Color.WHITE);
        button9.setText("9");
        
        buttonD = new JButton();
        buttonD.addActionListener(this); 
        buttonD.setBackground(Color.WHITE);
        buttonD.setText("/");
        
        button4 = new JButton();
        button4.addActionListener(this); 
        button4.setBackground(Color.WHITE);
        button4.setText("4");
        
        button5 = new JButton();
        button5.addActionListener(this); 
        button5.setBackground(Color.WHITE);
        button5.setText("5");
        
        button6 = new JButton();
        button6.addActionListener(this); 
        button6.setBackground(Color.WHITE);
        button6.setText("6");
        
        buttonX = new JButton();
        buttonX.addActionListener(this); 
        buttonX.setBackground(Color.WHITE);
        buttonX.setText("x");
        
        button1 = new JButton();
        button1.addActionListener(this); 
        button1.setBackground(Color.WHITE);
        button1.setText("1");
        
        button2 = new JButton();
        button2.addActionListener(this); 
        button2.setBackground(Color.WHITE);
        button2.setText("2");
        
        button3 = new JButton();
        button3.addActionListener(this);
        button3.setBackground(Color.WHITE);
        button3.setText("3");
        
        buttonS = new JButton();
        buttonS.addActionListener(this); 
        buttonS.setBackground(Color.WHITE);
        buttonS.setText("-");
        
        buttonAC = new JButton();
        buttonAC.addActionListener(this); 
        buttonAC.setBackground(Color.WHITE);
        buttonAC.setText("AC");
        
        button0 = new JButton();
        button0.addActionListener(this);
        button0.setBackground(Color.WHITE);
        button0.setText("0");
        
        buttonE = new JButton();
        buttonE.addActionListener(this); 
        buttonE.setBackground(Color.WHITE);
        buttonE.setText("=");
        
        buttonP = new JButton();
        buttonP.addActionListener(this);
        buttonP.setBackground(Color.WHITE);
        buttonP.setText("+");
        
        JPanel lower = new JPanel();
        lower.setLayout(new GridLayout(4, 4));
        lower.add(button7); //adding all the buttons to lower
        lower.add(button8);
        lower.add(button9);
        lower.add(buttonD);
        lower.add(button4);
        lower.add(button5);
        lower.add(button6);
        lower.add(buttonX);
        lower.add(button1);
        lower.add(button2);
        lower.add(button3);
        lower.add(buttonS);
        lower.add(buttonAC);
        lower.add(button0);
        lower.add(buttonE);
        lower.add(buttonP);
        contentPane.add(lower, BorderLayout.CENTER);  //adding the buttons of the calculator to the centre
        
        frame.setSize(500,500); 
        
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==button7) {
            // the 7 button
            String seven = (equation + "7");
            equation = seven;
            text.setText(equation);
            
        }
        if (e.getSource()==button8) {
            // the 8 button
            String eight = (equation + "8");
            equation = eight;
            text.setText(equation);
            
        }
        if (e.getSource()==button9) {
            // the 9 button
            String nine = (equation + "9");
            equation = nine;
            text.setText(equation);
        }
        if (e.getSource()==buttonD) {
            // the divide button
            if (equation != "") {
                collection.add(equation);
            }
            equation = "";
            text.setText(equation + "/");
            collection.add("/");
            equation = "";
        }
        if (e.getSource()==button4) {
            // the 4 button
            String four = (equation + "4");
            equation = four;
            text.setText(equation);
            
        }
        if (e.getSource()==button5) {
            // the 5 button
            String five = (equation + "5");
            equation = five;
            text.setText(equation);
            
        }
        if (e.getSource()==button6) {
            // the 6 button
            String six = (equation + "6");
            equation = six;
            text.setText(equation);
            
            
        }
        if (e.getSource()==buttonX) {
            // the multiply button
            if (equation != "") {
                collection.add(equation);
            }
            equation = "";
            text.setText(equation + "x");
            collection.add("*");
            equation = "";
        }
        if (e.getSource()==button1) {
            // the 1 button
            String one = (equation + "1");
            equation = one;
            text.setText(equation);
            
        }
        if (e.getSource()==button2) {
            // the 2 button
            String two = (equation + "2");
            equation = two;
            text.setText(equation);
            
            
        }
        if (e.getSource()==button3) {
            // the 3 button
            String three = (equation + "3");
            equation = three;
            text.setText(equation);
            
        }
        if (e.getSource()==buttonS) {
            // the subtract button
            if (equation != "") {
                collection.add(equation);
            }
            equation = "";
            text.setText(equation + "-");
            
            if (collection.size() == 0) {    //this is for having a minus number
                equation = "-";
            }
            else{
                collection.add("-");
                equation = "";
            }
        }
        if (e.getSource()==buttonAC) {
            // the AC button
            equation = "";
            text.setText(equation + "0");
            
            collection.clear();
        }
        if (e.getSource()==button0) {
            // the 0 button
            String zero = (equation + "0");
            equation = zero;
            text.setText(equation);
            
        }
        if (e.getSource()==buttonE) {
            // the equals button
            collection.add(equation);
            System.out.println(collection.toString());
            int min = 0;
            int max = 2;
            int symbol = 1;
            while(collection.size() > 1) {   //this is all for BIDMADS
                double num1 = 0;
                double num2 = 0;
                double awnser = 0;
                String strMax = Double.toString(num2);
                strMax = String.valueOf(collection.get(max));
                
                int size = collection.size() - 1;
                String size1 = String.valueOf(collection.get(size));
                
                /*if (strMax == "+" || strMax == "*" || strMax == "-" || strMax == "/") {
                    if (collection.get(symbol) == "+" || collection.get(symbol) == "*" || collection.get(symbol) == "-" || collection.get(symbol) == "/") {
                        collection.remove(collection.get(collection.size() -1));
                        collection.remove(collection.get(collection.size() -1));
                        collection.remove(collection.get(collection.size() -1));
                    }
                }*/
                
                if (strMax == "+" || strMax == "*" || strMax == "-" || strMax == "/") {
                    //if there is a symbol where a number should be remove the symbol where the symbol is meant to be 
                    collection.remove(symbol);          
                    System.out.println(collection.toString());
                }
                
                if (size1 == "" ) {//|| size1 == "-" || size1 == "/" || size1 == "*") {
                    collection.remove(collection.get(collection.size() -1));
                    collection.remove(collection.get(collection.size() -1));
                }
                
                num1 = Double.parseDouble(collection.get(min));
                num2 = Double.parseDouble(collection.get(max));
                
                 
                if (collection.get(symbol) == "/") {
                     awnser =(num1 / num2);
                     collection.subList(min ,max).clear();
                     String AnsString = Double.toString(awnser);
                     collection.set(min, AnsString);
                }
                else if (collection.get(symbol) == "*") {
                     awnser =(num1 * num2);
                     collection.subList(min ,max).clear();
                     String AnsString = Double.toString(awnser);
                     collection.set(min, AnsString);
                }
                if (collection.size() == 1){
                    break;
                }
                System.out.println(collection.toString());        
                
                boolean symbolPresent = false;
                for (int i = 0; i < collection.size(); i++) {
                    if (collection.get(i) == "*" || collection.get(i) == "/") {
                        symbolPresent = true;
                        break;
                    }
                }
                if (symbolPresent == true && collection.get(symbol) == "+") { 
                    //skipping the minus and plus till the end
                    min = min +2;
                    max = min +2; 
                    symbol = symbol +2;
                    
                }
                //here
                else if (symbolPresent == true && collection.get(symbol) == "-") {
                    min = min +2;
                    max = min +2; 
                    symbol = symbol +2;
                    
                }
                else if (symbolPresent == false) {   //this is for adding and minusing at the end
                    //when everything else has been worked out.
                    Double number1= Double.parseDouble(collection.get(0));
                    Double number2 = Double.parseDouble(collection.get(2));
                    if(collection.get(1) == "+"){   
                        awnser =(number1 + number2);
                        collection.subList(0 ,2).clear();
                        String AnsString = Double.toString(awnser);
                        collection.set(0, AnsString);
                        max = 0;
                        symbol = 0;
                    }
                    else if(collection.get(1) == "-"){
                        awnser =(number1 - number2);
                        collection.subList(0 ,2).clear();
                        String AnsString = Double.toString(awnser);
                        collection.set(0, AnsString);
                        max = 0;
                        symbol = 0;
                    }
                }
                
                
                //collection.subList(min ,max).clear();
                //String AnsString = Integer.toString(awnser);
                //collection.set(min, AnsString);
                
                
            }
            
            System.out.println(collection.toString());
            String ans = (collection.get(0));
            text.setText(ans);
            
            
        }
        if (e.getSource()==buttonP) {
            // the + button
            if (equation != "") {
                collection.add(equation);
            }
            equation = "";
            text.setText(equation + "+");
            collection.add("+");
            equation = "";
        }
    }
}

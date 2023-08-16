import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class XandO implements ActionListener{
    private static JTextField text;
    private JFrame frame;
    private JPanel lower;
    private static int Player = 0;
    
    static JButton[] button = new JButton[9];

    public static void main(String[] args) throws InterruptedException
    {

        

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());


        
        //setting the frame at the top for messages

        text = new JTextField("Welcome to TIC-TAC-TOE");                      //this does not work
        Thread.sleep(2000); 
        new XandO().PlayerTurn();
        text.setEditable(true);
        text.setBackground(Color.WHITE);
        text.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        text.setFont(new Font("Ariel", Font.PLAIN,   40));

        contentPane.add(text, BorderLayout.NORTH);   

        //this deals with the lower section which is the actual grid
        JPanel lower = new JPanel();
        lower.setLayout(new GridLayout(3, 3,5, 5));

        for (int i = 0; i < 9; i++){
            XandO instance = new XandO();               //if theres errors with action listener its most likely this (instance)
            button[i] = new JButton();
            lower.add(button[i]);
            button[i].addActionListener(instance);     // and this 
            button[i].setBackground(Color.WHITE);
            button[i].setFocusable(false);
            button[i].setFont(new Font("Arial", Font.PLAIN, 60));

            
        }
        contentPane.add(lower, BorderLayout.CENTER);
        



        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource()==button[i]){;
                if(button[i].getText() == ""){
                    if (Player == 1){
                        button[i].setText("X");
                        new XandO().PlayerTurn();
                        new XandO().Player_testing();
                    }
                    else if (Player == 2){
                        button[i].setText("O");
                        new XandO().PlayerTurn();
                        new XandO().Player_testing();
                    }
                }
                
            }

        }

 
    }

    public void PlayerTurn()  //Player 1 == X      Player 2 == O
    {
        if (Player == 0){
            Random rand = new Random();
            int rand_int = rand.nextInt(1, 3);
            Player = rand_int;
            if (Player == 1){
                text.setText("X's turn");
            }
            else{
                text.setText("O's turn");
            }
        }
        else {
            if (Player == 1){
                Player = 2;
                text.setText("O's turn");
            }
            else{
                Player = 1;
                text.setText("X's turn");
            }
        }
    }

    public void Player_testing() 
    {
        //Draw testing
        int counter = 0;
        for (int i = 0; i < 9; i++){
            if (button[i].getText() != "X" && button[i].getText() != "O") {
                
            }
            else{
                counter++;
            }
        }
        if (counter == 9){
            new XandO().PlayerDraw();
            System.out.println("Draw works");
        }


        //X Testing
        int num = 0; 
        if (button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X"){
            XWins(0,1,2);
        }
        if (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X"){
            XWins(3,4,5);
        }
        if (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X"){
            XWins(6,7,8);
        }
        if (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X"){
            XWins(0,3,6);
        }
        if (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X"){
            XWins(1,4,7);
        }
        if (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X"){
            XWins(2,5,8);
        }
        if (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X"){
            XWins(0,4,8);
        }
        if (button[2].getText() == "X" && button[4].getText() == "X" && button[6].getText() == "X"){
            XWins(2,4,6);
        }

        //O Testing
        if (button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O"){
            OWins(0,1,2);
        }
        if (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O"){
            OWins(3,4,5);
        }
        if (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O"){
            OWins(6,7,8);
        }
        if (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O"){
            OWins(0,3,6);
        }
        if (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O"){
            OWins(1,4,7);
        }
        if (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O"){
            OWins(2,5,8);
        }
        if (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O"){
            OWins(0,4,8);
        }
        if (button[2].getText() == "O" && button[4].getText() == "O" && button[6].getText() == "O"){
            OWins(2,4,6);
        }  
    }    

    public void XWins(int a, int b, int c)
    {
        for (int i = 0; i < 9; i++) {
            button[i].setEnabled(false);
            button[i].setBackground(null);
        }
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);
        text.setText("X WINS");
    }

    public void OWins(int a, int b, int c)
    {
        for (int i = 0; i < 9; i++) {
            button[i].setEnabled(false);
            button[i].setBackground(null);
        }
        button[a].setBackground(Color.GREEN);
        button[b].setBackground(Color.GREEN);
        button[c].setBackground(Color.GREEN);
        text.setText("O WINS");
    }

    public void PlayerDraw()
    {
        for (int x = 0; x < 9; x++){
            button[x].setBackground(Color.RED);
        }
        text.setText("DRAW");
        for (int i = 0; i < 9; i++) {
            button[i].setEnabled(false);
        }
    }
    
    



}
package guiapp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUIApp extends JFrame 
        implements ActionListener
{   
    Container content = this.getContentPane();
    /*JButton btn = new JButton("Click Me");
    JLabel lblOutput = new JLabel();
    JTextField tf = new JTextField(10);*/
    //submit buttons
    JButton btn2 = new JButton("Submit");
    JLabel lblOutput2 = new JLabel();
    JLabel lblOutput3 = new JLabel();
    JTextField tf2 = new JTextField(3);

      public GUIApp()
    {
        /*content.add(tf);
        content.add(lblOutput);
        content.add(btn);
        btn.addActionListener(this);*/
        //adds items to content container
        this.setVisible(true);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Extending From JFrame");
        content.setLayout( new FlowLayout());
        content.add(tf2);
        content.add(lblOutput2);
        content.add(lblOutput3);
        content.add(btn2);
        btn2.addActionListener(this);
    }
      // event listeners // define event behavior
    public void actionPerformed(ActionEvent ae) {
        /*int num = Integer.parseInt(tf.getText());
        int sq = square(num);
        lblOutput.setText("" + sq);
        */
        // get input
        String num2 = tf2.getText();
        // assign input to method
        String sum = sumNums(num2);
        lblOutput2.setText(sum);
        //assign input to third method
        String rev = reverseNums(num2);
        lblOutput3.setText(rev);
    }
    // methods 
      public static String sumNums (String input ) {
        StringBuffer buffer = new StringBuffer(input);
        char digit1 = buffer.charAt(0);
        char digit2 = buffer.charAt(1);
        char digit3 = buffer.charAt(2);
        int sum = Character.getNumericValue(digit1) + Character.getNumericValue(digit2) + Character.getNumericValue(digit3);
        String answer2 = Integer.toString(sum);
        return answer2;
    }
    
      private static String reverseNums (String input ) {
        
        StringBuffer buffer = new StringBuffer(input);
        ArrayList<String> answer = new ArrayList<String>();
        for(int i = 0; i < buffer.length(); i++) {
            answer.add(Character.toString(buffer.charAt(buffer.length()-i-1)));
        }
        String mystring = "";
        for (int y = 0; y < answer.size();y ++) {
           mystring = mystring + answer.get(y);
        }
        return mystring;
    }    
      /*
    int square(int x)
    {
        return x * x;
    }
    */
    public static void main(String[] args)
    {
        GUIApp ga = new GUIApp();
     
    }
}
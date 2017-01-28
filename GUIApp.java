/*
 * Name: Enrique Cahua
 * ID: 0523964
 * Date: 1/28/2017
 * Lab #: 2
 * Discription: Swing App
*/


package guiapp;
import java.awt.*; import javax.swing.*; import java.awt.event.*; import java.util.ArrayList; import javax.swing.ButtonGroup; import javax.swing.JRadioButton; import javax.swing.SwingUtilities;

public class GUIApp extends JFrame 
        //implements ActionListener
{   
    String title = "Lab2";
    int width = 500;
    int height = 400;
    Container content = this.getContentPane();
    JLabel instructions = new JLabel("Enter a 3-Digit Number:");
    JButton btn2 = new JButton("Compute");
    JLabel sumtitle = new JLabel("Sum: ");
    JLabel lblOutput2 = new JLabel();
    JLabel reversetitle = new JLabel("Reverse: ");
    JLabel arraytitle = new JLabel("Array: ");
    JLabel colortitle = new JLabel("Text Color: ");
    JLabel lblOutput3 = new JLabel();
    JLabel lblOutput4 = new JLabel();
    JLabel lblOutput5 = new JLabel();
    JLabel lblOutput6 = new JLabel();
    JTextField tf2 = new JTextField(8);
    JRadioButton optionred = new JRadioButton("Red");
    JRadioButton optiongreen = new JRadioButton("Green");  
    JRadioButton optionblue = new JRadioButton("Blue");
    ButtonGroup group = new ButtonGroup();
      public GUIApp(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
      }
    
      public GUIApp()
    {
        group.add(optionred);
        group.add(optiongreen);
        group.add(optionblue);
        this.setVisible(true);
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Lab2");
        
        SpringLayout layout = new SpringLayout();
        content.setLayout(layout);
       
        content.add(instructions);
        content.add(tf2);
        content.add(sumtitle);
        content.add(reversetitle);
        content.add(arraytitle);
        content.add(colortitle);
        content.add(lblOutput2);
        content.add(lblOutput3);
        content.add(lblOutput4);
        content.add(lblOutput5);
        content.add(lblOutput6);
        content.add(optionred);
        content.add(optiongreen);
        content.add(optionblue);
       
         // Spring layout
        layout.putConstraint(SpringLayout.WEST, instructions, 20, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, instructions, 45, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.EAST, tf2, -200, SpringLayout.EAST, content);
        layout.putConstraint(SpringLayout.NORTH, tf2, 45, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, sumtitle, 20, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, sumtitle, 90, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.EAST, lblOutput2, -200, SpringLayout.EAST, content);
        layout.putConstraint(SpringLayout.NORTH, lblOutput2, 90, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, reversetitle, 20, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, reversetitle, 135, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.EAST, lblOutput3, -200, SpringLayout.EAST, content);
        layout.putConstraint(SpringLayout.NORTH, lblOutput3, 135, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, arraytitle, 20, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, arraytitle, 170, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, lblOutput4, 150, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, lblOutput4, 175, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, lblOutput5, 250, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, lblOutput5, 175, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, lblOutput6, 350, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, lblOutput6, 175, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, colortitle, 20, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, colortitle, 215, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, optionred, 120, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, optionred, 215, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, optiongreen, 240, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, optiongreen, 215, SpringLayout.NORTH, content);
        
        layout.putConstraint(SpringLayout.WEST, optionblue, 360, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, optionblue, 215, SpringLayout.NORTH, content);
        
         layout.putConstraint(SpringLayout.WEST, btn2, 200, SpringLayout.WEST, content);
        layout.putConstraint(SpringLayout.NORTH, btn2, 270, SpringLayout.NORTH, content);
     
        
        content.add(btn2);
        btn2.addActionListener(new Calculate());
        
        optionred.addActionListener(new MyButton());
        optiongreen.addActionListener(new MyButton());
        optionblue.addActionListener(new MyButton());        
    }      
           
      // event listeners // define event behavior
    private class Calculate implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
        // get input
        if(ae.getSource() == btn2){
        String num2 = tf2.getText();
        int mynum = Integer.parseInt(num2);
        // assign input to method
        String sum = sumNums(num2);
        lblOutput2.setText(sum);
        //assign input to third method
        String rev = reverseNums(num2);
        lblOutput3.setText(rev);
        
        int firstdigit[]; 
        firstdigit = getArray(mynum);
        lblOutput4.setText(Integer.toString(firstdigit[0]));
        
        int seconddigit[]; 
        firstdigit = getArray(mynum);
        lblOutput5.setText(Integer.toString(firstdigit[1]));
        
        int thirddigit[]; 
        firstdigit = getArray(mynum);
        lblOutput6.setText(Integer.toString(firstdigit[2]));
        }
        }
    }
    private class MyButton implements ActionListener {
        public void actionPerformed(ActionEvent ae)
        {
            if (ae.getSource() == optionred) {
                lblOutput2.setForeground(Color.RED);
                lblOutput3.setForeground(Color.RED);
                lblOutput4.setForeground(Color.RED);
                lblOutput5.setForeground(Color.RED);
                lblOutput6.setForeground(Color.RED);

            }
            else if (ae.getSource() == optiongreen) {
                lblOutput2.setForeground(Color.GREEN);
                lblOutput3.setForeground(Color.GREEN);
                lblOutput4.setForeground(Color.GREEN);
                lblOutput5.setForeground(Color.GREEN);
                lblOutput6.setForeground(Color.GREEN);
            }
            else if (ae.getSource() == optionblue) {
                lblOutput2.setForeground(Color.BLUE);
                lblOutput3.setForeground(Color.BLUE);
                lblOutput4.setForeground(Color.BLUE);
                lblOutput5.setForeground(Color.BLUE);
                lblOutput6.setForeground(Color.BLUE);
            }
        }
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
      //method from Dr. Glenn Stevenson
      public int [] getArray(int digit)
        {
            int[] ar = new int[3];
            for(int i = 2; i > 0; i--)
            {
                ar[i] = digit % 10;
                digit /= 10; 
            }
            ar[0] = digit;
            return ar;
            

        }
      
    public static void main(String[] args)
    {
        GUIApp ga = new GUIApp();
        
        
    }
}
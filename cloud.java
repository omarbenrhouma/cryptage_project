import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class cloud extends JFrame  implements ActionListener {

    JFrame frame = new JFrame("Cryptage");
    JLabel input_text = new JLabel("Tapez votre mot");
    JLabel output_text = new JLabel("mot crypter");
    JTextField input = new JTextField(15);
    JTextField output = new JTextField(15);
    JButton b_cr = new JButton("Crypter");
    JButton b_dcr = new JButton("Decrypter");
    JPanel p_output = new JPanel();
    JPanel p_buttons = new JPanel();
    JPanel p_main = new JPanel();
    String result;
    char x;
    int[] tx=new int[25];
    int i=0;
    int I;

    cloud(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500,350);
        // text fields
        output.setEditable(false);

        // panels 
        p_output.add(input_text);
        p_output.add(input);
        p_output.add(output_text);
        p_output.add(output);
        p_buttons.add(b_cr);
        p_buttons.add(b_dcr);
        p_main.add(p_buttons);
        p_main.add(p_output);
        p_main.setBorder(new EmptyBorder(26, 10, 10, 10));


        // buttons 
        b_cr.setBackground(Color.GRAY);
        b_dcr.setBackground(Color.GRAY);
        b_cr.addActionListener(this);
        b_dcr.addActionListener(this);
        //frame 
        frame.add(p_main);
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new cloud();
    }

    public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b_cr) {
            output.setText(crypt(input.getText())) ;
			}
        if(e.getSource()==b_dcr) {
                output.setText(decrypt(input.getText())) ;
                }
     
		}
    String crypt(String text){
        result ="";
        char[] tab= text.toCharArray();
        String alphabet="#&-5l0JPfC3cgow2iGbsxDpjve6uUQBTWd1FtzVKI4hH9X7kOnm8rRLMEANaYqySZ!";
        
        for (char c:tab){
            int a= alphabet.indexOf(c);
            a = a+3;
            x = alphabet.charAt(a);

            result+=x;
        }



        return result;
    }

    String decrypt(String text){
        result ="";
        char[] tab= text.toCharArray();
        String alphabet="#&-5l0JPfC3cgow2iGbsxDpjve6uUQBTWd1FtzVKI4hH9X7kOnm8rRLMEANaYqySZ!";
        
        for (char c:tab){
            int a= alphabet.indexOf(c);
             a=a-3;
            x = alphabet.charAt(a);
            result+=x;
        }



        return result;
    }
}
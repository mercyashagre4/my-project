
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
         setLayout (new FlowLayout());
      
        textField1=new JTextField("Enter text here");
        add(textField1);
        textField2=new JTextField(20);
        add(textField2);
        textField3=new JTextField("uneditable text",21);
        textField3.setEditable(false);
        add(textField3);
        passwordField=new JPasswordField("Hidden text");
        add(passwordField);
           TextFieldHandler handler=new TextFieldHandler();
              textField1.addActionListener(handler);
              textField2.addActionListener(handler);
              textField3.addActionListener(handler);
              passwordField.addActionListener(handler);
    }

    void setDefauletCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private class TextFieldHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String string="";
            if(event.getSource()==textField1)
                string=String.format("textField1:%s",event.getActionCommand());
            if(event.getSource()==textField2)
                string=String.format("textField2:%s",event.getActionCommand());
            if(event.getSource()==textField3)
                string=String.format("textField3:%s",event.getActionCommand());
            if(event.getSource()==passwordField)
                string=String.format("passwordField:%s",event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
        }
        
    }
    
}

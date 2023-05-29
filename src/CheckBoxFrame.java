
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame {
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;
     public CheckBoxFrame(){
         super("Testing JCheckBox");
         setLayout(new FlowLayout());
         textField=new JTextField("Watch the font style change",20);
         textField.setFont(new Font("serif",Font.PLAIN,14));
         add(textField);
         
         boldJCheckBox=new JCheckBox("Bold");
         italicJCheckBox=new JCheckBox("Italic");
         add(boldJCheckBox);
         add(italicJCheckBox);
           CheckBoxHandler handler=new CheckBoxHandler();
           boldJCheckBox.addItemListener(handler);
           italicJCheckBox.addItemListener(handler);
         }
     private class CheckBoxHandler implements ItemListener{
         @Override
         public void itemStateChanged(ItemEvent event){
             Font font=null;
             if(boldJCheckBox.isSelected()&& italicJCheckBox.isSelected())
                 font=new Font("serif",Font.BOLD+Font.ITALIC,14);
             else if(boldJCheckBox.isSelected())
                 font=new Font("serif",Font.BOLD,14);
              else if(italicJCheckBox.isSelected())
                 font=new Font("serif",Font.ITALIC,14);
             textField.setFont(font);
         }
     }
    
}

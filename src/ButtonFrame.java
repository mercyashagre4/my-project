
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyJButton;
    public ButtonFrame(){
        super("Testing Button");
        setLayout(new FlowLayout());
        plainJButton=new JButton("plainButton");
        add(plainJButton);
        
        Icon bug1=new ImageIcon(getClass().getResource("240_F_592257156_uRwMaK5KuVPQlKs5dO2pIcVs1X4JLK6ahomicon (6).jpg"));
        Icon bug2=new ImageIcon(getClass().getResource("240_F_592257156_uRwMaK5KuVPQlKs5dO2pIcVs1X4JLK6ahomicon (7).jpg"));
        fancyJButton=new JButton("fancyButton");
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);
          ButtonHandler handler=new ButtonHandler();
          fancyJButton.addActionListener(handler);
          plainJButton.addActionListener(handler);
    }
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("you pressed %s",event.getActionCommand()));
        }
    }
    
}

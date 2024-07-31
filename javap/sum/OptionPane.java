import javax.swing.JOptionPane;
//A simple graffic user interface app (GUI)
public class OptionPane{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null, "You are "+ age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height "));
        JOptionPane.showMessageDialog(null, "You are "+ height + " cm tall");

}}

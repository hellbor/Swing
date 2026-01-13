import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
       JButton button = new JButton("Генерировать");
       JFrame frame = new JFrame("Генератор случайных чисел");
       JLabel label = new JLabel("Нажать на кнопку");



       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Random random = new Random();
               int num = random.nextInt(100) + 1;
               label.setText("Номер: " + num);
           }
       });

       frame.setLayout(new FlowLayout());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 150);
       //frame.setLocationRelativeTo(null);
       frame.add(button);
       frame.add(label);
       frame.setVisible(true);
   }
}

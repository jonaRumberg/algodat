package klausurVorbereitung.aufgabe38;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MyNumberFrame
 */
public class MyNumberFrame extends JFrame {

    public static void main(String[] args) {
        new MyNumberFrame();
    }

    public MyNumberFrame() {
        JComboBox<Integer> comboBox = new JComboBox<Integer>();
        for (int i = 0; i < 10; i++) {
            comboBox.addItem(i);
        }

        JLabel label = new JLabel("");
        JCheckBox checkBox = new JCheckBox("numerisch");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!checkBox.isSelected()){
                    label.setText(label.getText() + comboBox.getSelectedItem().toString());
                } else {
                    label.setText("" + (Integer.parseInt(label.getText()) + (int) comboBox.getSelectedItem()));
                }
            }
        });


        JButton button = new JButton("Alles Löschen");

        button.addActionListener(new MyLis(label));

        add(comboBox, BorderLayout.NORTH);
        add(label, BorderLayout.WEST);
        add(checkBox, BorderLayout.SOUTH);
        add(button, BorderLayout.EAST);

        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
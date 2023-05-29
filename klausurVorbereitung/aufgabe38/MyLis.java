package klausurVorbereitung.aufgabe38;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyLis implements ActionListener {

    JLabel lab;

    public MyLis (JLabel _lab) {
        lab = _lab;        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lab.setText("");
    }
    
}

package klausurVorbereitung.aufgabe39;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 * MyDisplayFrame
 */
public class MyDisplayFrame extends JFrame {

    JComboBox<String> liste;
    // String[] zeilen;
    JLabel anzeige;
    JToggleButton auto;
    String name = "";

    public static void main(String[] args) {
        new MyDisplayFrame();
    }


    public MyDisplayFrame () {
        //mock myutils aufruf
        String[] zeilen = {"test", "test", "asdfsakdfh", "laksdfö"};

        liste = new JComboBox<String>();
        for (int i = 0; i < zeilen.length; i++) {
            liste.addItem("Zeile "+i);

        }

        liste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText(zeilen[liste.getSelectedIndex()]);                
            }
        });

        anzeige = new JLabel(zeilen[0]);

        auto = new JToggleButton("Automatischer Wechsesl");
        auto.addActionListener(new MeinHorcher(this));

        add(liste, BorderLayout.NORTH);
        add(anzeige, BorderLayout.CENTER);
        add(auto, BorderLayout.SOUTH);
        
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
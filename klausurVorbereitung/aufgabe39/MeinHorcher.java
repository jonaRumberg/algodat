package klausurVorbereitung.aufgabe39;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class MeinHorcher implements ActionListener{
    
    public MeinHorcher (MyDisplayFrame fr){
        new MyAutomatic(fr).start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JToggleButton tog = (JToggleButton) e.getSource();
        if(tog.getText().equals("Manuell Wechseln")){
            tog.setText("Automatisch Wechseln");;
        } else {
            tog.setText("Manuell Wechseln");;       
        }
    }
}

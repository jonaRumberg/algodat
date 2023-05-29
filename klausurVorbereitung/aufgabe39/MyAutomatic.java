package klausurVorbereitung.aufgabe39;

public class MyAutomatic extends Thread {

    private MyDisplayFrame fr;
    private int i = 0;

    public MyAutomatic(MyDisplayFrame _fr) {
        fr = _fr;
    }

    @Override
    public void run() {
        try {
            {
                while (true) {
                    sleep(1000);
                    i = fr.liste.getSelectedIndex();
                    if (fr.auto.isSelected()) {
                        if (i >= fr.liste.getItemCount()-1) {
                            i = 0;
                        } else {
                            i++;
                        }

                        fr.liste.setSelectedIndex(i);
                    }
                }
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

public class FCFSListe implements WarteSchlange {

    private ZPatient ende, anfang;

    @Override
    public void anmelden(ZPatient p) {
        if(anfang == null){
            anfang = p;
            ende = p;
            return;
        }
        p.next = anfang;
        anfang = p;
    }

    @Override
    public ZPatient derNaechsteBitte() {
        if(anfang == null){
            return null;
        }
        ZPatient temp = anfang;
        if(temp.next == null){
            anfang = null;
            ende = null;
            return temp;
        }
        while(!temp.next.equals(ende)){temp = temp.next;}

        ende = temp;
        temp = temp.next;
        ende.next = null;
        return temp;

    }
    
}

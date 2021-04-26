import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Gestione {
    public Veicoli[] veicoli;
    List<Veicoli> veicolo = new ArrayList<Veicoli>();

    public Gestione() {

    }

    public Gestione(Gestione g) {
        //veicolo = new ArrayList<veicolo>();
        for (int i = 0; i < veicoli.length; i++) {
            veicolo.add(i, g.veicoli[i]);
        }
    }

    public Gestione(Veicoli[] veicoli) {
        for (int i = 0; i < veicoli.length; i++) {
            this.veicoli = veicoli.clone();
        }

    }

    public void setVeicoli(Veicoli[] veicoli) {
        this.veicoli = veicoli;
    }

    public Veicoli[] getVeicoli() {
        return veicoli;
    }


    public String toString() {
        String s = "";
        for (int i = 0; i < veicolo.size(); i++) {
            if (veicolo.get(i) != null) {
                s += "Veicoli: " + veicolo.get(i).toString() + "\n";
            }
        }
        return s;
    }

    /*
     * public void add(Veicoli v){ if(veicoli[veicoli.length-1] != null){ veicoli[i]
     * = v.clone(); } }
     */
    public Gestione clone() {
        Gestione a = new Gestione(getVeicoli());
        return a;
    }
    //SAVE
    public void save(String fileName) throws IOException{
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.veicolo);
        oos.close();
    }
    //LOAD
    public void load(String fileName) throws IOException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        veicolo = (List<Veicoli>) ois.readObject();
        ois.close();
    }

    //SORT
    public void sort(){
        Collections.sort(veicolo);
    }
}

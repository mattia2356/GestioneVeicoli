public class Gestione {
    public Veicoli[] veicoli;

    public Gestione(){
        veicoli = new Veicoli[20];
    }

    public Gestione(int numVeicoli){
        veicoli = new Veicoli[numVeicoli];
    }
    public Gestione(Gestione g){
        for (int i = 0; i < veicoli.length; i++) {
            veicoli[i] = g.veicoli[i];
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

    //ADD
    public void addVeicoli(Veicoli v, int pos){
        if(veicoli[pos] == null && pos< veicoli.length){
            veicoli[pos] = v;
        }
    }

    //Delete
    public void deleteVeicoli(int pos){
        if (pos >= 0 && pos < veicoli.length) {
            veicoli[pos] = null;
        }
        //veicoli[veicoli.length-1] = null;
    }

    public String toString(){
        String s="";
        for (int i = 0; i < veicoli.length; i++) {
            if(veicoli[i] != null){
                s+= "Veicoli: " + veicoli[i].toString() + "\n";
            }
        }
        return s;
    }
/*     public void add(Veicoli v){
        if(veicoli[veicoli.length-1] != null){
            veicoli[i] = v.clone();
        }
    } */
    public Gestione clone()
    {
        Gestione a = new Gestione(getVeicoli());
        return a;
    }
}

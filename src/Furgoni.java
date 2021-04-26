public class Furgoni extends Veicoli{
    //Attributi
    private double capacitaCarico;

    //Costruttore
    public Furgoni(){

    }

    public Furgoni(String targa, String numeroMatricola, String marca, String modello, double cilindrata, int annoAcquisto, double capacitaSerbatoio, double capacitaCarico){
        super(targa, numeroMatricola, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio);
        setCapacitaCarico(capacitaCarico);

    }
    public Furgoni(Furgoni v){
        setTarga(v.getTarga());
        setNumeroMatricola(v.getNumeroMatricola());
        setMarca(v.getMarca());
        setModello(v.getModello());
        setCilindrata(v.getCilindrata());
        setAnnoAcquisto(v.getAnnoAcquisto());
        setCapacitaSerbatoio(v.getCapacitaSerbatoio());
        setCapacitaCarico(v.getCapacitaCarico());
    }
    public void setCapacitaCarico(double capacitaCarico) {
      this.capacitaCarico = capacitaCarico;
    }
    public double getCapacitaCarico() {
        return capacitaCarico;
    }
    
    public double costoAutonoleggio(int giorni, int kmPercorsi, double carburanteRimasto){
        double totale = 0;
        //50$ al giorno
        totale += 70*giorni;
        //1$ ogni Km
        if (kmPercorsi>100) {
            totale += kmPercorsi/30;
        }
        //2$ per ogni lt di carburante usato
        totale += 2* (getCapacitaSerbatoio()-carburanteRimasto);
        return totale;

    }

    public String toString(){
        String s="";
        s+="Targa: " + getTarga() + " Numero matricola: " + getNumeroMatricola() + " Marca: " +getMarca() + " Modello: " +getModello() + " Cilindrata: " +getCilindrata() + " Anno Immatricolazione: " + getAnnoAcquisto() + " Capacità Serbatoio: " + getCapacitaSerbatoio() + " Capacità Carico: " +getCapacitaCarico();
        return s;
    }
    public Furgoni clone()
    {
        Furgoni a = new Furgoni(super.getModello(), super.getNumeroMatricola(), super.getMarca(), super.getModello(), super.getCilindrata(), super.getAnnoAcquisto(), super.getCapacitaSerbatoio(), getCapacitaCarico());
        return a;
    }

}

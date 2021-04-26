public class Vetture extends Veicoli{
    //Attributi
    private int numeroPosti;

    //Costruttore
    public Vetture(){

    }

    public Vetture(String targa, String numeroMatricola, String marca, String modello, double cilindrata, int annoAcquisto, double capacitaSerbatoio, int numeroPosti){
        super(targa, numeroMatricola, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio);
        setNumeroPosti(numeroPosti);

    }
    public Vetture(Vetture v){
        setTarga(v.getTarga());
        setNumeroMatricola(v.getNumeroMatricola());
        setMarca(v.getMarca());
        setModello(v.getModello());
        setCilindrata(v.getCilindrata());
        setAnnoAcquisto(v.getAnnoAcquisto());
        setCapacitaSerbatoio(v.getCapacitaSerbatoio());
        setNumeroPosti(v.getNumeroPosti());
    }

    //Setter && Getter
    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }
    public int getNumeroPosti() {
        return numeroPosti;
    }

    public double costoAutonoleggio(int giorni, int kmPercorsi, double carburanteRimasto){
        double totale = 0;
        //50$ al giorno
        totale += 50*giorni;
        //1$ ogni Km
        totale += kmPercorsi/25;
        //2$ per ogni lt di carburante usato
        totale += 2* (getCapacitaSerbatoio()-carburanteRimasto);
        return totale;
    }

    public String toString(){
        String s="";
        s+="Targa: " + getTarga() + " Numero matricola: " + getNumeroMatricola() + " Marca: " +getMarca() + " Modello: " +getModello() + " Cilindrata: " +getCilindrata() + " Anno Immatricolazione: " + getAnnoAcquisto() + " Capacità Serbatoio: " + getCapacitaSerbatoio() + " Numero posti: " +getNumeroPosti();
        return s;
    }

    //metodo clone VEttura
    public Vetture clone()
    {
        Vetture a = new Vetture(super.getModello(), super.getNumeroMatricola(), super.getMarca(), super.getModello(), super.getCilindrata(), super.getAnnoAcquisto(), super.getCapacitaSerbatoio(), getNumeroPosti());
        return a;
    }
}

abstract public class Veicoli {
    //Attributi
    private String targa;
    private String numeroMatricola;
    private String marca;
    private String modello;
    private double cilindrata;
    private int annoAcquisto;
    private double capacitaSerbatoio;

    //Costruttori
    public Veicoli(){

    }
    public Veicoli(String targa, String numeroMatricola, String marca, String modello, double cilindrata, int annoAcquisto, double capacitaSerbatoio){
        setTarga(targa);
        setNumeroMatricola(numeroMatricola);
        setMarca(marca);
        setModello(modello);
        setCilindrata(cilindrata);
        setAnnoAcquisto(annoAcquisto);
        setCapacitaSerbatoio(capacitaSerbatoio);
    }
    public Veicoli(Veicoli v){
        setTarga(v.getTarga());
        setNumeroMatricola(v.getNumeroMatricola());
        setMarca(v.getMarca());
        setModello(v.getModello());
        setCilindrata(v.getCilindrata());
        setAnnoAcquisto(v.getAnnoAcquisto());
        setCapacitaSerbatoio(v.getCapacitaSerbatoio());
    }

    //Getter && Setter
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public String getNumeroMatricola() {
        return numeroMatricola;
    }
    public void setNumeroMatricola(String numeroMatricola) {
        this.numeroMatricola = numeroMatricola;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public double getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }
    public int getAnnoAcquisto() {
        return annoAcquisto;
    }
    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }
    public double getCapacitaSerbatoio() {
        return capacitaSerbatoio;
    }
    public void setCapacitaSerbatoio(double capacitaSerbatoio) {
        this.capacitaSerbatoio = capacitaSerbatoio;
    }
}

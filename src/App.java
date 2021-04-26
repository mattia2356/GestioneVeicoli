public class App {
    public static void main(String[] args) throws Exception {
        Veicoli vettura = new Vetture("Ab123CD", "1111", "Fiesta", "Ford", 50, 2013, 744, 5);
        Veicoli furgone = new Furgoni("EF456IL", "2222", "Panda", "Fiat",770, 2023, 544, 6);

        System.out.println("----------------");
        System.out.println("|"+"CLASSE VEICOLI:" + "|");
        System.out.println("----------------");
        System.out.println("\n"+"Vettura: " +vettura.toString());
        System.out.println("----------------------------------");
        System.out.println("\n"+"Furgone: " +furgone.toString());
        System.out.println("\n"+"Costo Noleggio Vettura:" + ((Vetture) vettura).costoAutonoleggio(3, 411, 34));
        System.out.println("\n"+"Costo Noleggio furgone:" + ((Furgoni) furgone).costoAutonoleggio(3, 411, 34));

        Gestione g = new Gestione();
        g.veicolo.add(0, vettura);
        g.veicolo.add(1, furgone);
        System.out.println("\n"+"Gestione: \n" + g.toString());
        System.out.println("\n"+"Delete:");
        g.veicolo.remove(0);
        System.out.println(g.toString());
        g.save("dati.bin");
        Gestione g1 = new Gestione();
        g1.load("dati.bin");
        System.out.println("\n"+"Variabile prende valori da FILE BIN: "+"\n"+g1.toString());
    }
}

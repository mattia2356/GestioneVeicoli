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

        Gestione g = new Gestione(3);
        g.addVeicoli(vettura, 0);
        g.addVeicoli(furgone, 1);
        System.out.println("\n"+"Gestione: \n" + g.toString());
        System.out.println("\n"+"Delete:");
        g.deleteVeicoli(0);
        System.out.println(g.toString());
    }
}

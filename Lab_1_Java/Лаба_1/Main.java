package lab_1;

public class Main {

    public static void main(String[] args) {
        {
            Printer epsonL366 = new Printer();
            Printer hpLaserJetProM130a = new Printer("HP_LaserJet_Pro_M130a", 6.8, "White", "LaserPrint");
            Printer ricohMP2014AD = new Printer("Ricoh_MP_2014AD", 29, "Black", 500, "LaserPrint");

            System.out.println(epsonL366.toString());
            System.out.println(hpLaserJetProM130a.toString());
            System.out.println(ricohMP2014AD.toString());

            epsonL366.resetValues("Epson_L366", 4.5, "Black", 70, "JetPrint");

            epsonL366.printSum();
            hpLaserJetProM130a.printSum();
            ricohMP2014AD.printSum();

            hpLaserJetProM130a.setAmountOfPaper(150);

            Printer.printStaticSum();

        }
    }
}
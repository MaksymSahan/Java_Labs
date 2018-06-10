package lab_1;

public class Main {

    public static void main(String[] args) {
        {
            Printer epson_L366 = new Printer();
            Printer hp_LaserJet_Pro_M130a = new Printer("HP_LaserJet_Pro_M130a", 6.8, "White", "LaserPrint");
            Printer ricoh_MP_2014AD = new Printer("Ricoh_MP_2014AD", 29, "Black", 500, "LaserPrint");

            System.out.println(epson_L366.toString());
            System.out.println(hp_LaserJet_Pro_M130a.toString());
            System.out.println(ricoh_MP_2014AD.toString());

            epson_L366.resetValues("Epson_L366", 4.5, "Black", 70, "JetPrint");

            epson_L366.printSum();
            hp_LaserJet_Pro_M130a.printSum();
            ricoh_MP_2014AD.printSum();

            hp_LaserJet_Pro_M130a.setAmountOfPaper(150);

            Printer.printStaticSum();

        }
    }
}
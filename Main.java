package lab_1;

public class Main {

	public static void main(String[] args) {
		   {
		       Printer Epson_L366 = new Printer();
		       Printer HP_LaserJet_Pro_M130a = new Printer("HP_LaserJet_Pro_M130a",6.8, "White","LaserPrint");
		       Printer Ricoh_MP_2014AD = new Printer("Ricoh_MP_2014AD", 29,"Black",500,"LaserPrint");
		        
		        System.out.println( Epson_L366.toString());
		        System.out.println(HP_LaserJet_Pro_M130a.toString());
		        System.out.println(Ricoh_MP_2014AD.toString());
		        
		        Epson_L366.resetValues("Epson_L366", 4.5 ,"Black",70, "JetPrint");
		        
		        Epson_L366.printSum();
		        HP_LaserJet_Pro_M130a.printSum();
		        Ricoh_MP_2014AD.printSum();
		        
		        HP_LaserJet_Pro_M130a.setAmountOfPaper(150);
		        
		        Printer.printStaticSum();
		        
		    }
	}
	}
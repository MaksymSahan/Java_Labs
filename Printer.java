package lab_1;

public class Printer {
	private String name = "No name";
	private double weight;
	private String color;
	private String type;
	private int amountOfPaper;
	
	public static int  totalAmountOfPaper = 0 ;
	
	
	public Printer(){
}
	public Printer(String name, double weight, String colo, String type) {
		setName(name);
		setWeight(weight);
		setColor(color);
		setType(type);	
	}
	public Printer(String name, double weight, String colo,int amountOfPaper,String type) {
		setName(name);
		setWeight(weight);
		setColor(color);
		setType(type);	
		setAmountOfPaper(amountOfPaper);
	}
	public String toString() {
		return "Info about printer: \nname: " + getName() 
				+ "\nweight: " + getWeight() 
				+ "\namountOfPaper: " + getAmountOfPaper() 
				+ "\ncolor: " + getColor() 
				+ "\ntype: " + getType()
				+ "\n";	
	}
	  static void printStaticSum() {
	        System.out.println("All printers use " + totalAmountOfPaper + " paper/n");
	    }
	  public void printSum() {
			System.out.println("The printer uses " + getName() + getAmountOfPaper() + "paper\n");
		}
	  public void resetValues(String name, double weight, String colo,int amountOfPaper,String type) {
		  setName(name);
			setWeight(weight);
			setColor(color);
			setType(type);	
			setAmountOfPaper(amountOfPaper);
			}
	  
	  public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    
	  public double getWeight() {
		  return weight;
	  }
	  public void setWeight(double size) {
			this.weight = weight;
		}
	  
	  
	  public String getColor() {
		  return color;
	  }
	  public void setColor(String color) {
		  this.color = color;
	  }
	  
	  public String getType() {
		  return type;
	  }
	  public void setType(String type) {
		  this.type = type;
	  }
	  
	  
	  public int getAmountOfPaper() {
		  return amountOfPaper;
	  }
	  public void setAmountOfPaper(int amountOfPaper) {
		  totalAmountOfPaper += this.amountOfPaper;
		  totalAmountOfPaper -= amountOfPaper;
		  this.amountOfPaper = amountOfPaper;
	  }
	  
	    }


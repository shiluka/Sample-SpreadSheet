import java.util.Observable;


class NumericCell extends Cell{

	
	private static String DEFAULT_ADDRESS = "defaultN";
    private static int k=0;
	
	private double value;
	
	public NumericCell(){	
		this(DEFAULT_ADDRESS,0);
		DEFAULT_ADDRESS = "defaultN";
		DEFAULT_ADDRESS += k;
		k++;
	}

    public NumericCell(String address, double value){
          super.address = address;
          this.value = value;
    }

    public static double add(Cell...c){
        double total = 0;
        for(Cell x: c){
            total += x.getNumValue();
        }
        return total;
    }

    public static double multiply(Cell...c){
        double mul = c[0].getNumValue();
        
        for(int i=1;i<c.length;i++){
        	mul *= c[i].getNumValue();
        }
       
        return mul;
    }

    public static double subtract(Cell...c){
        double sub = c[0].getNumValue();
        
        for(int i=1;i<c.length;i++){
        	sub -= c[i].getNumValue();
        }
       
        return sub;
    }

    public static double divide(Cell...c){
        double divide = c[0].getNumValue();
        
        for(int i=1;i<c.length;i++){
        	divide /= c[i].getNumValue();
        }
        return divide;
    }
    
    @Override
    public void setValue(double value){
         this.value = value;
         //there is a change in value notify that
         setChanged();
         notifyObservers(this);
    }

    @Override
    public double getNumValue(){
        return value;
    }

    @Override
    public void setContent(Cell c){
         //add NumericCell observer
         c.addObserver(this);
         value = c.getNumValue();
         //there is a change in value notify that
         setChanged();
         notifyObservers(this);
         
    }

    @Override
    public void delete(){
         value = 0;
         //there is a change in value notify that
         setChanged();
         notifyObservers(this);
    }


    @Override
    public void setValue(String value){
          //System.out.println("can not apply this method to a numerical cell");
    	this.value = Double.valueOf(value);
    }

    @Override
    public String getStrValue(){
          return "can not apply this method to a numerical cell";
    }
    
    @Override
    public void update(Observable o, Object arg) {
        //cast arg object to Cell
        this.setContent((Cell)arg);
    }


}
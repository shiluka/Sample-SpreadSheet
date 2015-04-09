import java.util.Observable;

class StringCell extends Cell{
	
	private static final String VALID_PATTERN = "&c[1-9]r[1-9]";
	
	private static String DEFAULT_ADDRESS = "defaultS";
    private static int k=0;

    private String value;
    
    
    public StringCell(){
		this(DEFAULT_ADDRESS,"");
		DEFAULT_ADDRESS = "defaultS";
		DEFAULT_ADDRESS += k;
		k++;
	}

    //constructor
    public StringCell(String address, String value){
          super.address = address;
          this.value = value;
    }

    @Override
    public void setValue(String value){
    	
        //for save address 
         if(value.matches(VALID_PATTERN)){
        	 this.value = value;
         }else{
        	 this.value = value;
             //there is a change in value notify that
             setChanged();
             notifyObservers(this);
         }
  
    }

    @Override
    public void setContent(Cell c){
         //add StringCell observer
         c.addObserver(this);
         value = c.getStrValue();
         //there is a change in value notify that
         setChanged();
         notifyObservers(this);
    }

    public void delete(){
        value = "";
        setChanged();
        //there is a change in value notify that
        notifyObservers(this);
    }
    
    
    @Override
    public String getStrValue(){
        return value;
    }

    public static String concatenate(Cell...c){
        String s = "";
        for(Cell x:c){
            s += x.getStrValue();
        }
        return s;
     }

     public void setStrContent(StringCell sc){
         value = sc.value;
     }

     @Override
     public void setValue(double value){
         //System.out.println("can not apply this method to a string cell");
         this.value = Double.toString(value);
     }
     

     @Override
     public double getNumValue(){
         return 0.0;
     }
     
     @Override
     public void update(Observable o, Object arg) {

         //cast arg object to Cell
         this.setContent((Cell)arg);

     }


}
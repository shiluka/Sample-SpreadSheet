import java.io.*;

class Column implements Serializable{

	private String name;
    private Cell cell[];
    
    private static String DEFAULT_NAME = "default";
    private static int NUMBER_OF_CELLS = 5;
    		
    private static int d=0;
    
    public Column(){
    	this(DEFAULT_NAME,NUMBER_OF_CELLS);
    	DEFAULT_NAME = "default";
    	DEFAULT_NAME += d;
    	d++;
    }
    
    public Column(String name,int i){
        this.name = name;
        cell = new Cell[i];

    }

    public String getColumnName(){
        return name;
    }

    public void setColumnName(String name){
        this.name= name;
    }

    //for numeric cell
    public void setCell(int j,double value){
        NumericCell nc = new NumericCell(getColumnName()+"r"+Integer.toString(j+1) ,value);
        cell[j] = nc;
    }
    
    //for string cell
     public void setCell(int j,String value){
        StringCell sc = new StringCell(getColumnName()+"r"+Integer.toString(j+1) ,value);
        cell[j] = sc;
    }

    public Cell getCell(int j){
        return cell[j];
    }

}
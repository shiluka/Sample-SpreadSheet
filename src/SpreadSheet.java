import java.io.*;

class SpreadSheet implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int NUMBER_OF_COLUMNS = 5;
    private static final int NUMBER_OF_CELLS_IN_ONE_COLUMN = 5;
    private static String DEFAULT_NAME = "default";
    private static int i = 0;
    
    private int numberOfColumns,numberOfRows;

    private String name;

    Column[] column;

    //default constructor
    /*if user didn't give parameters there will be
     * 5 columns and 5 rows spreadsheet*/
    public SpreadSheet(){
           this(DEFAULT_NAME , NUMBER_OF_COLUMNS , NUMBER_OF_CELLS_IN_ONE_COLUMN);
           DEFAULT_NAME = "default";
           DEFAULT_NAME += i;
           i++;
    }

    public SpreadSheet(String name,int numberOfColumns, int numberOfRows){

    	this.numberOfColumns = numberOfColumns;
    	this.numberOfRows = numberOfRows;
    	
        this.name = name;
        this.column = new Column[numberOfColumns];

        for(int i=0;i<numberOfColumns;i++){
            column[i] = new Column( "c"+Integer.toString(i+1) ,numberOfRows);   
        }

        //in default make all the cells as blank numericCells
        for(int i=0;i<numberOfColumns;i++){
            for(int j=0;j<numberOfRows;j++){

                column[i].setCell(j, 0.0);

            }
        }

    }

    //return want column
    public Column getColumn(int index){
        return column[index];
    }
    
    public static SpreadSheet newSpreadSheet(String name,int numberOfColumns, int numberOfRows){
           SpreadSheet sp = new SpreadSheet(name,numberOfColumns,numberOfRows);
           return sp;
    }
    
    public static SpreadSheet newSpreadSheet(){
        SpreadSheet sp = new SpreadSheet(DEFAULT_NAME , NUMBER_OF_COLUMNS , NUMBER_OF_CELLS_IN_ONE_COLUMN);
        DEFAULT_NAME += i;
        return sp;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    //extra method for test
    
    public void printAddress(){
    	
    	for(int i=0;i<numberOfColumns;i++){
			for(int j=0;j<numberOfRows;j++){
				System.out.printf("%s ",this.getColumn(i).getCell(j).getAddress());
			}
			System.out.println();
		}
    }
    
    public void printValue(){
    	
    	for(int i=0;i<numberOfColumns;i++){
			for(int j=0;j<numberOfRows;j++){
				if(this.getColumn(i).getCell(j) instanceof NumericCell)
					System.out.printf("%s ",this.getColumn(i).getCell(j).getNumValue());
				else
					System.out.printf("%s ",this.getColumn(i).getCell(j).getStrValue());
			}
			System.out.println();
		}
    }
    

}

import java.io.*;

public class Step5Cell {
	
	/*public static void main(String args[]) throws IOException{
		
		//create spread sheet with 4 columns. each column has 5 cells
		SpreadSheet sps1 = SpreadSheet.newSpreadSheet("work book 1", 4, 5);
	    
		Column c1,c2,c3,c4;
        
        //columns with 7 cells
        c1 = sps1.getColumn(0);
        c2 = sps1.getColumn(1);
        c3 = sps1.getColumn(2);
        c4 = sps1.getColumn(3);

        //set values for cells in column 1
        c1.setCell(0,25); //column1 cell 1,2 are numeric cell
        c1.setCell(1,5);
        c1.setCell(2," Hello "); //column1 cell 3,5 are string cell
        c1.setCell(3,-8);
        c1.setCell(4," World ");
 
        //set values to cells in column2
        c2.setCell(0," CSE ");
        c2.setCell(1,85.12);
        c2.setCell(2," Java ");
        c2.setCell(3,25.3);
        c2.setCell(4,7);

        //set cells in column3
        c3.setCell(0," facebook ");
        c3.setCell(1,0701);
        c3.setCell(2," love<3 ");

        //set cells in column4
        c4.setCell(0,45);
        c4.setCell(1,23);
        c4.setCell(2," inception ");
        
        //test spread sheet
        
        System.out.println("values of cells in sps1: ");
        sps1.printValue();		
        
        SpreadSheetStorage file = new SpreadSheetStorage("file.data");
        
        file.store(sps1);
        
        SpreadSheet spsLoaded = SpreadSheet.newSpreadSheet("workbookLoaded",6,7);
		spsLoaded = file.load();
		
		System.out.println("values of cells in spsLoaded: ");
        spsLoaded.printValue();
		
	}*/

}


public class StepLastCell {
	
	public static void main(String args[]){
		
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
		   c1.setCell(2," Hello "); //column1 cell 3,5 are string cell
		   
		   //set values to cells in column2
		   c2.setCell(0," CSE ");

		   //set cells in column2
		   c3.setCell(2," love<3 ");

		   //set cells in column4
		   c4.setCell(3,95);
		       
		   /*testing Observer and Observable*/
		   System.out.println("testing Observer and Observable");
		         
		   //print current value of c1r1
		   System.out.println("value of c1r1 = "+c1.getCell(0).getNumValue());
		   System.out.println("value of c4r4 = "+c4.getCell(3).getNumValue());

		   //c1r1 = c4r4
		   c1.getCell(0).setContent(c4.getCell(3));

		   System.out.println("value of clrl(after setContent mehtod)= "+c1.getCell(0).getNumValue());
		   System.out.println("value of c4r4(after setContent method)= "+c4.getCell(3).getNumValue());
		   System.out.println();
		        
		   //change the value of c4r4 = 1111
		   c4.getCell(3).setValue(1111);
		         
		   System.out.println("value of clrl (after change value of c4r4)= "+c1.getCell(0).getNumValue());
		   System.out.println("value of c4r4 (after change value of c4r4)= "+c4.getCell(3).getNumValue());
		   System.out.println();
		        
		   //delete the value of c4r4
		   c4.getCell(3).delete();
		   System.out.println("*value of c4r4: "+c4.getCell(4).getNumValue());
		   System.out.println("print value of c1r1 (it is also deleted)");
		   //now print value of c4r4,c1r1 (it is also deleted)
		   System.out.println("*value of c1r1: "+c1.getCell(0).getNumValue());
		             
	}
	

}

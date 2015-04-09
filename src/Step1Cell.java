
public class Step1Cell {
	
	/*public static void main(String args[]){
		
		//Testing
		
		//create array of Cell type
		Cell[] cell = new Cell[100];  
		
		//creating NumeicCell objects
		NumericCell n1 = new NumericCell("n1",10);
		NumericCell n2 = new NumericCell("n2",15.2);
		NumericCell n3 = new NumericCell("n3",2.3);
		NumericCell n4 = new NumericCell("n4",0);
		
		NumericCell n5 = new NumericCell();
		NumericCell n6 = new NumericCell();
		NumericCell n7 = new NumericCell();
		
		System.out.println(n5.getAddress() + n5.getNumValue());
		System.out.println(n6.getAddress() + n6.getNumValue());
		System.out.println(n7.getAddress() + n7.getNumValue());
		
		//creating StringCell Objects
		StringCell s1 = new StringCell("s1"," hello ");
		StringCell s2 = new StringCell("s2"," world ");
		StringCell s3 = new StringCell("s3","CSE  ");
		StringCell s4 = new StringCell("s4","");
		
		//assign Numeric and String cells to Cell objects
		//polymorphism
		
		cell[0] = n1;  //NumericCell
		cell[1] = n2;  //NumericCell
		cell[2] = s1;  //StringCell
		cell[3] = s2;  //StringCell
		cell[4] = n3;  //NumericCell
		cell[5] = s3;  //StringCell
		cell[6] = n4;  //NumericCell
		cell[7] = s4;  //StringCell
		
		//testing methods
		
		//testing getNumValue() and getStrValue()
		System.out.println("Value of cell[0]: "+ cell[0].getNumValue());
		System.out.println("Value of cell[2]: "+ cell[2].getStrValue());
		
		System.out.println("error: "+cell[0].getStrValue());
		
		//testing setValue() 
		cell[0].setValue(25.55);
		System.out.println("new value of cell[0]: "+ cell[0].getNumValue());
		cell[0].setValue(10);
		
		cell[2].setValue("java");
		System.out.println("new value of cell[2]: "+ cell[2].getStrValue());
		
		cell[0].setValue("error occurs");
		
		//testing add, multiply, divide, subtract
		
		//cell[6] = ce11[0]+cell[1]
        cell[6].setValue(NumericCell.add(cell[0],cell[1]));    
        System.out.println("ce11[0]+cell[1] = "+ cell[6].getNumValue());
        
        //cell[6] = ce11[0]+cell[1]+cell[4]
        cell[6].setValue(NumericCell.add(cell[0],cell[1],cell[4]));    
        System.out.println("ce11[0]+cell[1]+cell[4] = "+ cell[6].getNumValue());
        
        //cell[6] = ce11[0]-cell[1]-cell[4]
        cell[6].setValue(NumericCell.subtract(cell[0],cell[1],cell[4]));    
        System.out.println("ce11[0]-cell[1]-cell[4] = "+ cell[6].getNumValue());
        
        //cell[6] = ce11[0]*cell[1]*cell[4]
        cell[6].setValue(NumericCell.multiply(cell[0],cell[1],cell[4]));    
        System.out.println("ce11[0]*cell[1]*cell[4] = "+ cell[6].getNumValue());
        
        //cell[6] = ce11[0]/cell[1]/cell[4]
        cell[6].setValue(NumericCell.divide(cell[0],cell[1],cell[4]));    
        System.out.println("ce11[0]/cell[1]/cell[4] = "+ cell[6].getNumValue());
        
        //testing concatenation
        
        //cell[7] =  cell[2]+cell[3]+cell[5] (Strings);
        cell[7].setValue(StringCell.concatenate(cell[2],cell[3],cell[5]));    
        System.out.println("'ce11[2]+cell[3]+cell[5]' = "+ cell[7].getStrValue());
        
        //testing delete method
        
        cell[6].delete();
        System.out.println("cell[6] = "+cell[6].getNumValue());
        cell[7].delete();
        System.out.println("cell[7] = "+cell[7].getStrValue());
        
        //testing setContent method
        
        cell[6].setContent(cell[0]);
        System.out.println("cell[6] = "+cell[6].getNumValue());
        cell[7].setContent(cell[2]);
        System.out.println("cell[7] = "+cell[7].getStrValue());
       
		
	}*/

}

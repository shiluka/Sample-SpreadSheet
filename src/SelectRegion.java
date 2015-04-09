
import java.util.List;
import java.util.ArrayList;

class SelectRegion {

    //to select the cells in column
    private int start,destination;
    
    //when select columns point them in list1
    //implements List interface and make instance of ArrayList Class
    private List<Column> list1 = new ArrayList<Column>();
    
    //to point cells in columns (for copy and paste methods)
    //static because don't want to change in paste method
    private static List<Column> LIST2 = new ArrayList<Column>();

    //to separate copy and cut for paste method
    private static boolean copy=false;
    private static boolean cut = false;


    //add columns to list1 for any argument variables of Column type
    //to selectRegion
    public SelectRegion(int start,int destination,Column...col){

        list1.clear();
        
        this.start = start;
        this.destination = destination;
        
        for(Column x: col){
           list1.add(x);
        }

    }
    
    //print method (addresses)
    public void printAddress(){
    	
    	for(int i=0;i<list1.size();i++){
            for(int j=start;j<(destination+1);j++){
                
            	System.out.printf("%s " , list1.get(i).getCell(j).getAddress());
                
            }
            System.out.println();
        }
    }
    
    //print method (values)
    public void printValue(){
    	
    	for(int i=0;i<list1.size();i++){
            for(int j=start;j<(destination+1);j++){
                if(list1.get(i).getCell(j) instanceof NumericCell){
                	System.out.printf("%s " , list1.get(i).getCell(j).getNumValue());
                }
                else if(list1.get(i).getCell(j) instanceof StringCell){
                	System.out.printf("%s " , list1.get(i).getCell(j).getStrValue());
                }
            	
            }
            System.out.println();
        }
    }

    //add method
    public double add(){
        double total = 0;

        for(int i=0;i<list1.size();i++){
            for(int j=start;j<(destination+1);j++){
                //if cell is numeric
                if(list1.get(i).getCell(j) instanceof NumericCell){
                     total += list1.get(i).getCell(j).getNumValue();
                }
            }
        }

        return total;
    }

    //concatenate method
    public String concatenate(){
        String s = "";

        for(int i=0;i<list1.size();i++){
            for(int j=start;j<(destination+1);j++){
                //if cell is numeric
                if(list1.get(i).getCell(j) instanceof StringCell){
                     s += list1.get(i).getCell(j).getStrValue();
                }
            }
        }

        return s;
    }
    
    
  //delete method
    public void delete(){

        for(int i=0;i<list1.size();i++){

            for(int j=start;j<(destination+1);j++){
                //call delete method in cell class (pre defined)
                list1.get(i).getCell(j).delete();
            }
        }
        
    }

    public void copy(){

        //use copy method
        copy = true;
        cut = false;

        //add columns of selected region to the list2
        for(Column x: list1){
             LIST2.add(x);
        }
    
    }

    public void cut(){

        //use cut method
        cut = true;
        copy = false;

        //add columns of selected region to the list2
        for(Column x: list1){

             LIST2.add(x);
        }

    }

    public void paste(SelectRegion sr){

          //if selected region is copied
          if(copy){

              for(int i=0;i<LIST2.size();i++){
                  for(int j=start;j<(destination+1);j++){

                      //if cell is a numeric cell
                      if(LIST2.get(i).getCell(j) instanceof NumericCell ){
                          //paste values for relevant cell to the selectRegion(which chose)
                          sr.list1.get(i).setCell(j-1, LIST2.get(i).getCell(j).getNumValue());
                        
                      }
                      //if cell is a String cell
                      else if(LIST2.get(i).getCell(j) instanceof StringCell){
                          //paste values for relevant cell to the selectRegion(which chose)                        
                    	  sr.list1.get(i).setCell(j-1, LIST2.get(i).getCell(j).getStrValue());
                    	  
                      }
                  }
              }

              LIST2.clear();

          }

          else if(cut){

              //same as copy method
              for(int i=0;i<LIST2.size();i++){
                  for(int j=start;j<(destination+1);j++){
                      if(LIST2.get(i).getCell(j) instanceof NumericCell)
                    	  sr.list1.get(i).setCell(j-1, LIST2.get(i).getCell(j).getNumValue());
                      else if(LIST2.get(i).getCell(j) instanceof StringCell)
                    	  sr.list1.get(i).setCell(j-1, LIST2.get(i).getCell(j).getStrValue());
                  }
              }

              //delete cells in (which we wanted to copy)
              for(int i=0;i<LIST2.size();i++){
                   for(int j=start;j<(destination+1);j++){
                      LIST2.get(i).getCell(j).delete();
                   }
              }

          }
    }

}
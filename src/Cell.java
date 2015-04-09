import java.io.*;
import java.util.*;

abstract class Cell extends Observable implements Serializable,Observer{

    //protected because subclasses can access
    protected String address;

    public void setAddress(String address){
          this.address = address;
    }

    public String getAddress(){
         return address;
    }

 
    public abstract void setValue(double value);
    public abstract void setValue(String value);
    public abstract double getNumValue();
    public abstract String getStrValue();
    public abstract void setContent(Cell c);
    public abstract void delete();


}
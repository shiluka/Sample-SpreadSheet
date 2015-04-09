
import java.io.*;

class SpreadSheetStorage {

    private String fileName;

    //Constructor
    public SpreadSheetStorage(String fileName){
           setFileName(fileName);
    }
    //setFileName method
    public void setFileName(String fileName){
           this.fileName = fileName;
    }

    //write SpreadSheet object to a file
    //throw IOException to handle exceptions
    public void store(SpreadSheet spd) throws IOException{

        File inFile = new File(fileName);
        FileOutputStream outFileStream = new FileOutputStream(inFile);
        //provide access to file by converting objects to bytes
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
        outObjectStream.writeObject(spd);
        outObjectStream.close();
        System.out.println("+++store successful+++");

    }

    public SpreadSheet load() throws IOException{

        File inFile = new File(fileName);
        FileInputStream inFileStream = new FileInputStream(inFile);
        //provide access to file by converting objects to bytes
        ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
        SpreadSheet spd;

        //to catch weather class is exists or not
        try{
            spd = (SpreadSheet)inObjectStream.readObject();
            
        }catch(ClassNotFoundException e){
            System.out.println("there is no SpreadSheet class");
            spd =  null;
        }

        inObjectStream.close();
        System.out.println("+++read successful+++");
        return spd;

    }



}

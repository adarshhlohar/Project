import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {
    public static void  method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\Users\\Adarsh\\Documents\\imp.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }


    public static void main(String[] args) {
        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code....");
    }
}

package opgave1;

import java.io.*;

public class LoadMyTime {
    public static void main(String[] args) {
        try{
           FileInputStream f_in = new FileInputStream("myTime.ser");
           ObjectInputStream obj_in = new ObjectInputStream(f_in);
           Object obj = obj_in.readObject();
           if (obj instanceof MyTime){
               MyTime time = (MyTime) obj;
               System.out.println(time.getTime());
           }

           obj_in.close();
           f_in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

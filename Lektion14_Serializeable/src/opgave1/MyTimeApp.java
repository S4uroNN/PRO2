package opgave1;

import java.io.*;

public class MyTimeApp {
    public static void main(String[] args) {
        MyTime time = null;

        try(FileInputStream f_in = new FileInputStream("myTime.ser")){
            try(ObjectInputStream obj_in = new ObjectInputStream(f_in)){
                Object obj = obj_in.readObject();
                if(obj instanceof MyTime){
                    time = (MyTime) obj;
                    System.out.println(time);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        time.increase();
        time.increase();
        time.increase();
        time.increase();
        System.out.println(time.getTime());
        System.out.println(time.getTime());

        try{
            FileOutputStream f_out = new FileOutputStream("myTime.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
            obj_out.writeObject(time);
            System.out.println("Din tid er nu gemt:" + " " + time.getTime());
            obj_out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

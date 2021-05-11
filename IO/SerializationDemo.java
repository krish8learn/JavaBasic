import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name ;


    public transient int val = 4;
    public int getval(){
        return val;
    }

    public static void main(String[] args) {
        if (args.length>0 && args[0].equals("true")){
            new SerializationDemo().doSerialization();
        }
        new SerializationDemo().doDeSerialization();
    }

    public void doSerialization(){
        System.out.println("Inside doSerilization");

        SerializationDemo ob = new SerializationDemo();
        ob.setName("Java");
        System.out.println("Name before serialization :" + ob.getName());
        System.out.println("Int val before serialization :" + ob.getval());

        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("serial.ser")))) {
            out.writeObject(ob);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

    }

    public void doDeSerialization(){
        System.out.println("Inside doDeSerialization");

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("serial.ser")))) {
            SerializationDemo obd = (SerializationDemo)ois.readObject();
            System.out.println("After serialization and doDeSerialization"+ obd.getName());
            System.out.println("After serialization and DeSerialization" + obd.getval());
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}

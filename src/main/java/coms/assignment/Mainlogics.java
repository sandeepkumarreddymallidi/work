package coms.assignment;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mainlogics  {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Sandeep\\Desktop\\assignment\\data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd");
        Employee e=new Employee("sandeep",sdf.parse(sdf.format("1997/06/13")),"java","associate",6000.45);
        e.setName("sandeep");
        e.setDepartment("java");
        oos.writeObject(e);
        oos.close();
        FileInputStream fis = new FileInputStream("C:\\Users\\Sandeep\\Desktop\\assignment\\data");
        ObjectInputStream ois = new ObjectInputStream(fis);
           Employee employee = (Employee) ois.readObject();
        System.out.println(employee);

    }
}

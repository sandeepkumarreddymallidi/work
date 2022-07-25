package coms.assignment;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainLogic {
    public static void main(String[] args) throws IOException, ParseException {
        File fe=new File("C:\\Users\\Sandeep\\Desktop\\assignment\\data");
        FileWriter write=new FileWriter(fe);
        BufferedWriter buffer=new BufferedWriter(write);
        Date date=new Date("1997/6/23");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
        Employee e=new Employee("sandeep",date,"java","associate",5000.45);
        Employee e2=new Employee("sandeepkumar",new Date("1998/6/13"),"sql","associated",4000.45);
        buffer.write(e.toString());
        buffer.newLine();
        buffer.write(e2.toString());
        buffer.close();
        FileReader reader=new FileReader(fe);
        BufferedReader buffer1=new BufferedReader(reader);
        String str;
        while ((str=buffer1.readLine())!=null){
           System.out.println(str);
        }
        buffer1.close();

    }
}

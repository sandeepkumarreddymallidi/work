package coms.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

abstract class Editor
{
    abstract void show();
}
abstract class Author extends Editor
{
    abstract void print();
}
class Office extends Author
{

    @Override
    void show() {
        System.out.println("haha");
    }

    @Override
    void print() {
        System.out.println("hehe");

    }
}



public abstract class DateExample {

    public static void main(String[] args) {
        System.out.println("o");
    }



      /*  private static Date getDate(String beforeDate) throws Exception{

            SimpleDateFormat readFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
            Date rdate = readFormat.parse(beforeDate);

            SimpleDateFormat writeFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            String format = writeFormat.format(rdate);

            System.out.println(format);

            return writeFormat.parse(format);
        }

    public static void main(String[] args) throws Exception {
        System.out.println(getDate("Sat Dec 12 00:00:00 KST 2020"));
    }*/
}

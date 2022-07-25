package com;
import javax.imageio.spi.ServiceRegistry;
import java.lang.reflect.Field;
import java.util.*;
class Sandeep{
    private String str="sandeep";
}

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String str=new String();
        Class cls=str.getClass();
       System.out.println( cls.getSuperclass());



    }
}

package com.spring11;
class Example3{
    public void display(){
        System.out.println("display");
    }
}
 class Example2 extends Example3 implements Cloneable {
     public Example2 clone() throws CloneNotSupportedException{
         return(Example2) super.clone();
     }
     public void element(){
         System.out.println("the element in the values");
     }

}
public class Example{
    public static void main(String args[]) throws CloneNotSupportedException {
        Example2 ex=new Example2();
        Example2 ex1= ex.clone();
        System.out.println(ex);
        System.out.println(ex1);
        ex.element();
        ex1.element();
        ex.display();
        ex1.display();

    }
}

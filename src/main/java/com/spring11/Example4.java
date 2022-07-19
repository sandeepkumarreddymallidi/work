package com.spring11;

public class Example4 {
    public Example4() {
    }

    private   String name;

    public Example4(String name) {
        this.name = name;
    }
public void sayHello(){
       System.out.println("Hello : "+name);

    }
    public static void main(String args[]) {
        Example4 s = new Example4(){
            public void sayHello() {
                System.out.println("HELLO FROM ANONYMOUS CLASS");
            }
        };
        s.sayHello();
        Example4 s2=new Example4("short"){
            public void sayHello(){
                super.sayHello();
            }
        };
        s2.sayHello();
    }

}
   /* public int test(int i) {
        return i + 1;
    }
    public static void main(String args[]) throws Exception {
        Method testMethod = Example4.class.getDeclaredMethod("test", int.class);
        int result = (Integer) testMethod.invoke(new Example4(), 100);
        System.out.println(result); // 101



    /*public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException {
       Class cls= Class.forName("com.spring7.one.Animal");
      Constructor[] con=cls.getDeclaredConstructors();
      for (Constructor c:con){
          System.out.println(c);
      }
      System.out.println();*/
      /* //Book book=new Book(34,"sandeep");
Class cls=Class.forName("com.spring11.Book");
     //  Class cls=book.getClass();

     System.out.println(cls);
     Method[] method=cls.getDeclaredMethods();p

       for (Method p:method) {
           System.out.println(p);
           Parameter[] para=p.getParameters();
           for (Parameter p2:para) {
               System.out.println(p2.);
           }
       }
       Field[] feild=cls.getDeclaredFields();
       for(Field f:feild){
           System.out.println(f.getName());
       }
       }

*/

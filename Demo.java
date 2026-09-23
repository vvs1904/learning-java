

// import others.*;



 

// // class A{
// //     int num=1;
// // }
// // class B extends A{
// //     int num=2;
// // public int getValue(){
// //     int num=3;
// //     return super.num;
// // }
// //}
//  class Demo{
//     public static void main(String args[]){
//         // B obj=new B();
//         // System.out.println(obj.getValue());
//        B obj1=new B();
//        System.out.println(obj1.marks);









//     //   AdvancedCalc obj=new AdvancedCalc();
//     // sciCalc obj=new sciCalc();
//     //   int r1=obj.add(4,5);
//     //   int r2=obj.sub(7,3);
//     //   int r3=obj.multi(7,3);
//     //   int r4=obj.div(7,3);
//     //   int r5=obj.power(7,8);

//     //   System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
//     }
// }

// class Computer{

// }
// class Laptop extends Computer{

// }
// class A{
//   public void show(){
//     System.out.println("in A show");
//   }
// }
// class B extends A{
//   public void show(){
//     System.out.println("in B show");
//   }

// }
// class C extends A{
//   public void show(){
//     System.out.println("In C show");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     A obj=new B();
//     obj.show();
//     obj=new C();
//     obj.show();

//     Computer obj1=new Laptop();
//   }
// }

//final-variable,method,class

// class Calc{
//   public final void show(){
//     System.out.println("Created by Vanshika");
//   }
//   public void add(int a,int b){
//     System.out.println(a+b);
//   }
// }
// //final class cannot be inherited
// //final method cannot be overriden 
// class AdvancedCalc extends Calc{
//   public void show(){
//     System.out.println("Created by Vanisha");
//   }

// }









// public class Demo{
//   public static void main(String args[]){
//     //  final int num=8;
//     // num=9;
//     // System.out.println(num);
//     AdvancedCalc obj=new AdvancedCalc();
//     obj.show();
//     obj.add(4,5);

//   }
// }

// class Laptop{
//    String model;
//    int price;

//    public String toString(){
//     return "Hey";
//    }

//    public boolean equals(Laptop that){
//     if(this.model.equals(that.model)&& this.price==that.price){
//       return true;
//     }
//     else return false;
//    }
// }
// public class Demo{
//   public static void main(String args[]){
//     Laptop obj=new Laptop();
//     obj.model="Lenevo Yoga";
//     obj.price=1000;

//     Laptop obj2=new Laptop();
//     obj2.model="Lenevo Yoga";
//     obj2.price=1000;

//     boolean result=obj.equals(obj2);
//     System.out.println(result);//based on hexadecimal values
//   }
// }

// class A{
//   public void show1(){
//     System.out.println("in A show");
//   }

// }
// class B extends A{
//   public void show2(){
//     System.out.println("in B show");
//   }

// }

// public class Demo{
//   public static void main(String args[]){
//       //  A obj=new A();
//       //  obj.show1();

//       //upcasting 
//       A obj=new B();
//       obj.show1();


// //Downcasting
//       B obj1= (B)obj;
//       obj1.show2();
//       obj1.show1();


      





//   }
// }

// public class Demo{
//   public static void main(String args[]){
//     int num=7;
//     // Integer num1=new Integer(8);
//     // //boxing

//     Integer num1=num;
//     int num2=num1;
//     System.out.println(num2);

//     String str="12";
//     int num3=Integer.parseInt(str);
//     System.out.println(num3*2);



//   }
// }

//abstract class
// abstract class Car{
//   public abstract void drive();

  
//   public void playMusic(){
//     System.out.println("play msuic");

//   }
// }
// class WagonR extends Car{
//   public void drive(){
//     System.out.println("Driving..");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//   //     Car obj=new Car();
//   //     obj.drive();
//   //     obj.playMusic();
//   Car obj=new WagonR();
//   obj.drive();
//   obj.playMusic();

//   }
//   // }
// }

//inner class
// class A{
//   int age;
//   public void show(){
//    System.out.println("in show");
//   }
//   class B{
//     public void config(){
//       System.out.println("in config");
//     }
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     A obj=new A();
//     obj.show();
//     A.B obj1=obj.new B();
//     obj1.config();
//     //If you use B as a static class then 
//     //A.B obj1=new A.B();


//   }
// }




//Anonymous inner class
// class A{
//   public void show(){
//     System.out.println("in A show");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     A obj=new A(){
//       public void show(){
//         System.out.println("in new Show");
//       }
      
      
//     };
//     obj.show();
    
//   }
// }



//Abstract and anynoumous inner class
// abstract class A{
//   public abstract void show();
// }

// public class Demo{
//   public static void main(String args[]){
//     A obj=new A(){
//       public void show(){
//         System.out.println("Finally printed");
//       }
//     };
//     obj.show();
//   }
// }


//interfaces
// interface A{
//   int age=22;
//   String area="Lucknow";

//   void show();
//   void config();
// }
// interface X{
//   void run();
// }
// interface Y extends X{

// }

// class B implements A,X{
//   public void show(){
//  System.out.println("in show");
//   }
//   public void config(){
//    System.out.println("in config");
//   }
//   public void run(){
//     System.out.println("Running");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//      A obj=new B();
//      obj.show();
//      obj.config();
//      System.out.println(A.area);
//   }
// }






//need of interface

//  abstract class Computer{
//  abstract  public void code ();

  
// }
// interface Computer{
//   void code();
// }
// class Laptop implements Computer{
//   public void code(){
//     System.out.println("write compile run");
//   }

// }
// class Desktop implements Computer{
//   public void code(){
//     System.out.println("write compile run..faster");
//   }

// }
// class Developer{
//   public void devApp(Computer lap){
//     lap.code();
//   }
// }

// public class Demo{
//   public static void main(String args[]){

//     Computer lap=new Laptop();
//     Computer desktop=new Desktop();


//     Developer vanshika=new Developer();
//     vanshika.devApp( lap);
//   }
// }



//Enums
// enum Status{
//   Running,Failed,Pending,Success;
// }
// public class Demo{
//   public static void main(String args[]){
//     Status s=Status.Running;
//     // System.out.println(s.ordinal());
//     // Status []ss=Status.values();
//     // System.out.println(ss);

//     // for(Status st:ss){
//     //   System.out.println(st);
//     // }
//     // if(s==Status.Running)
//     //   System.out.println("All good");
//     // else if(s==Status.Failed)
//     //   System.out.println("Try again");
//     // else if(s==Status.Pending)
//     //   System.out.println("Please wait!");
//     // else
//     //   System.out.println("Done");

// System.out.println(s.getClass().getSuperclass());
//     switch(s){
//       case Running:System.out.println("All good");
//       break;
//       case Failed:System.out.println("Try again!");
//       case Pending:System.out.println("Please wait");
//       break;
//       default:System.out.println("It works!");
//       }




//   }
// }

// enum Laptop{
//   Macbook(2000),XPS(2200),Surface,ThinkPad(9000);
//   private int price;
//   private Laptop(){

//   }
//   private Laptop(int price){
//     this.price=price;
//   }
//   public int getPrice() {
//     return price;
//   }

// }

// public class Demo{
//   public static void main(String args[]){
//     //  Laptop lap=Laptop.Macbook;
//     //  System.out.println(lap+":"+lap.getPrice());
//     for(Laptop lap:Laptop.values()){
//       System.out.println(lap+":"+lap.getPrice());
//     }

//   }
// }



//Annotations
// @Deprecated
// class A{
//   public void show(){
//     System.out.println("in A show");
//   }
// }
// class B extends A{
//   @Override
//   public void show(){
//     System.out.println("in B show");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     B obj=new B();
//     obj.show();
//   }
// }


//functional interface
// @FunctionalInterface
// interface A{
//   void show();
// }

// // class B implements A{
// //   public void show(){
// //     System.out.println("in show");
// //   }
// // }

// // public class Demo{
// //   public static void main(String args[]){
// //     A obj=new A(){
// //       public void show(){
// //         System.out.println("In show");
// //       }
// //     };
// //     obj.show();
// //   }
// // }


// //Lambda expression
// public class Demo{
//   public static void main(String args[]){
//     A obj=()->
//     System.out.println("in show");
//     obj.show();
//     //A obj=(i)->Sopln();

//   }
// }



//Lambda expression with return
// @FunctionalInterface
// interface A
// {
//   int add(int i,int j);
// }

// public class Demo{
//   public static void main(String args[]){
//      A obj=(i,j)->i+j;
//      int result=obj.add(5,4);
//      System.out.println(result);

     
//   }
// }


//Exceptions
// public class Demo{
//   public static void main(String args[]){
//     int i=0;
//     int j=0;
//     try{
//       j=18/i;
//     }
//     catch(Exception e){
//       System.out.println("Something went wrong!" + e);
//     }
//     System.out.println(j);
//     System.out.println("Bye bye");
//   }
// }


// public class Demo{
//   public static void main(String args[]){
//     int i=0;
//     int j=0;

//     int nums[]=new int[5];

//     try{
//       j=18/i;
//       System.out.println(nums[1]);
//       System.out.println(nums[5]);

//     }
//     catch( ArithmeticException e){
//       System.out.println("Cannot divide by zero");
//     }
//     catch(ArrayIndexOutOfBoundsException e){
//       System.out.println("Stay in your limits!");
//     }
//     catch(Exception e){
//       System.out.println("Something went worng!");
//     }
//     System.out.println(j);
//     System.out.println("Bye");
//   }
// }



//throw keyword
// public class Demo{
//   public static void main(String args[]){
//     int i=20;
//     int j=0;
//     try{
//       j=18/i;
//       if(j==0)
//         throw new ArithmeticException("I DONT WANT TO PRINT 0!");
//     }
//     catch(ArithmeticException e){
//       j=18/1;
//       System.out.println("Thats the default output");
//     }
//     catch(Exception e){
//       System.out.println("Something went wrong!"+e);
//     }
//     System.out.println(j);
//     System.out.println("Bye!");
//   }
// }



//Custom exceptions
// class vvsException extends Exception{
//   public vvsException(String string){
//     super(string);
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     int i=20;
//     int j=0;
//      try{
//       j=18/i;
//       if(j==0)
//         throw new vvsException("I dont want to print it");
//      }
//      catch(vvsException e){
//       j=18/1;
//       System.out.println("Thats the default output"+e);

//      }
//   }
// }




//throws exception
// class A{
//   public void show() throws ClassNotFoundException{
//     Class.forName("Demo");
//   }
// }
// public class Demo{
//   public static void main(String args[]){
//     A obj=new A();
//     try{
//     obj.show();
//     }
//     catch(ClassNotFoundException e){
//       e.printStackTrace();
//       System.out.println("Class not found");
//     }
//   }
// }



//Input 
// import java.io.*;
// public class Demo{
//   public static void main (String args[])throws IOException{
//     // System.out.println("Enter a number");
//     // int num=System.in.read();
//     // System.out.println(num);

//     System.out.println("Enter a number");
//     // InputStreamReader in=new InputStreamReader(System.in);
//     // BufferedReader br=new BufferedReader(in);
//     // int num=Integer.parseInt(br.readLine());
//     // System.out.println(num);
//     // br.close();

//     Scanner sc=new Scanner(System.in);


//   }
// }
// import java.io.*;
// public class Demo{
//   public static void main(String args[]) throws IOException{
//     int i=0;
//     int j=0;
//     int num=0;
//     BufferedReader br=null;
//     try{
//       // i=18/i;
//       InputStreamReader in=new InputStreamReader(System.in);
//        br=new BufferedReader(in);
//        num=Integer.parseInt(br.readLine());
//        System.out.println(num);


//     }
//     // catch(Exception e){
//     //   System.out.println("Something went wrong!");
//     // }
//     finally{
//       br.close();
//       System.out.println("Bye");
//     }
//   }
// }

// //try with resources
// //try(create the object here -it will be auto cloased)




//Threads
// class A extends Thread{
//   public void run(){
//     for(int i=0;i<10;i++){
//       System.out.println("Hi");
//       try {
//         Thread.sleep(10);
//       } catch (InterruptedException e) {
        
//         e.printStackTrace();
//       }
//     }
//   }
// }
// class B extends Thread{
//   public void run(){
//     for(int i=0;i<10;i++){
//       System.out.println("Hello");
//     }
//   }

// }

// public class Demo{
//   public static void main(String args[]){
//     A obj1=new A();
//     B obj2=new B();
//     obj2.setPriority(Thread.MAX_PRIORITY);

//     obj1.start();
//     obj2.start();
//   }
// }



// class A implements Runnable{
//   public void run(){
//     for(int i=0;i<=5;i++){
//       System.out.println("Hi");
//     }
//   }
// }
// class B implements Runnable{
//   public void run(){
//     for(int i=1;i<=5;i++){
//       System.out.println("Hello");
//     }
//   }
// }

// public class Demo{
//   public static void main(String args[]){
//     Runnable obj1=new A();
//     Runnable obj2=new B();
//     Thread t1=new Thread(obj1);
//     Thread t2=new Thread(obj2);

//     t1.start();
//     t2.start();

//   }
// }


// public class Demo{
//   public static void main(String args[]){
//     Runnable obj1=()->{
//       for(int i=1;i<=5;i++)
//         System.out.println("hi");
    
//     };
//     Runnable obj2=()->{
//     for(int i=1;i<=5;i++){
//       System.out.println("Hello");
//     }

//     };
//     Thread t1=new Thread(obj1);
//     Thread t2=new Thread(obj2);
//     t1.start();
//     t2.start();
//   }
// }






//Race condition
// class Counter{
//   int count;
//   public synchronized void increment(){
//     count++;
//   }

// }
// public class Demo{
//   public static void main(String args[]) throws InterruptedException{
//     Counter c=new Counter();
//     Runnable obj1=()->{
//       for(int i=1;i<=1000;i++){
//          c.increment();
//       }

//     };
//     Runnable obj2=()->{
//       for(int i=1;i<=1000;i++){
//           c.increment();
//       }
//     };
//     Thread t1=new Thread(obj1);
//     Thread t2=new Thread(obj2);
//     t1.start();
//     t2.start();

//     t1.join();
//     t2.join();

//     System.out.println(c.count);

//   }
// }



//Array List
// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     // Collection<Integer> nums=new ArrayList<>();
//     ArrayList<Integer> nums=new ArrayList<>();
//     System.out.println(nums.get(0));
//     System.out.println(nums.indexOf(9));
//     nums.add(9);
//     nums.add(8);
//     nums.add(7);
//     System.out.println(nums);
//   }
// }




//Set
// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     Set<Integer> nums=new HashSet<>();
//     nums.add(9);
//     nums.add(9);
//     nums.add(6);
//     nums.add(6);


//     // for(int n:nums){
//     //   System.out.println(n); 
//     // }

//     Iterator<Integer> values=nums.iterator();
//     while(values.hasNext())
//       System.out.println(values.next());

//   }
// }





//Map
// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     Map<String,Integer> students=new HashMap<>();//Hshtable-hashmap
//     students.put("Vnashika",22);
//     students.put("vanisha",17);
//     students.put("Vinita",50);
//     students.put("Harsh",45);

//     System.out.println(students.get("Vanshika"));

//     for(String key:students.keySet()){
//       System.out.println(key+" "+students.get(key));
//     }

//   }
// }
//Hashtable for synchronised or to make it thread safe





//Comparator/Comaprable
// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     Comparator<Integer> com=new Comparator<Integer>(){
//       public int compare(Integer i,Integer j){
//         if(i%10>j%10)
//           return 1;
//         else 
//           return -1;
//       }
//     };
//     List<Integer> nums=new ArrayList<>();
//     nums.add(4);
//     nums.add(3);
//     nums.add(7);
//     nums.add(9);
//     Collections.sort(nums,com);
//     System.out.println(nums);

//   }
// }



// import java.util.*;
// class Student{
//   int age;
//   String name;
//   public Student(int age,String name){
//     this.age=age;
//     this.name=name;
//   }

//   @Override
//   public String toString(){
//     return "Student ["+name +" " +age+ "]";
//      }
// }

// public class Demo{
//   public static void main(String args[]){
//     Comparator<Student> com=new Comparator<Student>(){
//       public int compare(Student i,Student j){
//         if(i.age>j.age)
//           return 1;
//         else 
//           return -1;
//       }
//     };
//     List<Student> studs=new ArrayList<>();
//     studs.add(new Student(22,"Vanshika"));
//     studs.add(new Student(17,"Vanisha"));
//     studs.add(new Student(221,"Agrika"));
//     studs.add(new Student(18,"Agrim"));
//     Collections.sort(studs,com);
//     for(Student s:studs){
//       System.out.println(s);
//     }

//   }
// }




//Comparable

// import java.util.*;

// class Student implements Comparable<Student>{
//   int age;
//   String name;

//   public Student(int age,String name){
//     this.age=age;
//     this.name=name;

//   }
//   public String toString(){
//     return "Student ["+age+" "+name+"]";
//   }
//   public int compareTo(Student that){
//     if(this.age>that.age)
//       return 1;
//     else 
//       return -1;
//   }
// }

// public class Demo{
//   public static void main(String args[]){
//     List<Student> studs=new ArrayList<>();
//     studs.add(new Student(22,"Vanshika"));
//     studs.add(new Student(17,"Vanisha"));
//     studs.add(new Student(221,"Agrika"));
//     studs.add(new Student(18,"Agrim"));
//     Collections.sort(studs);
//     for(Student s:studs){
//       System.out.println(s);
//     }

//   }
// }

// //Comparator<Student> com=(i,j)->i.age>j.age?1:-1;




// class Student<T>{
//   T obj;
//   Student(T obj){
//     this.obj=obj;
//   }
//   public void disp(){
//     System.out.println("Type of data passed here is "+obj.getClass().getName());
//   }
//   public T getObj(){
//     return obj;
//   }
// }

// public class Demo{
//   public static void main(String args[]){
//     Student<Integer> st=new Student<>(10);
//     st.disp();
//     System.out.println(st.getObj());
    
//   }
// }



// import java.util.*;
// class Human{
//   public void sleep(){
//     System.out.println("Human needs to sleep well");
//   }
// }
// class Employee extends Human{
//   @Override
//   public void sleep(){
//     System.out.println("Employee needs to sleep well to stay productive");
//   }
// }
// class Student{

// }
// public class Demo{
//   public static void main(String args[]){
//     // Human human=new Human();
//     // Employee emp=new Employee();
//     // human=emp;
//     // ArrayList<?> humanList=new ArrayList<>();
//     // ArrayList<Employee> empList=new ArrayList<>();
//     // humanList=empList;


//     // ArrayList<? extends Human> humanList=new ArrayList<>();
//     // ArrayList<Employee> emplIst=new ArrayList<>();
//     // ArrayList<Human> humanList2=new ArrayList<>();
//     // humanList=empList;
//     // humanList=humanList2;

//     // ArrayList<? super Human> humanList=new ArrayList<>();
//     // ArrayList<Object> objectList=new ArrayList<>();
//     // humanList=objectList;
//     Human human=new Human();
//     Human human2=new Human();
//     Employee emp=new Employee();
//     Employee emp2=new Employee();
//     ArrayList<? super Human> humanList=new ArrayList<>();
//     ArrayList<Employee> empList=new ArrayList<>();
//     empList.add(emp2);
//     empList.add(emp2);
//     List <Student> studentList2=new ArrayList<>();
//     studentList2.add(new Student());

//     ArrayList<String> stringList2=new ArrayList<>();
//     ArrayList<Object> objectList2=new ArrayList<>();
//     ArrayList<Human> humanList2=new ArrayList<>();
//     humanList2.add(human);
//     humanList2.add(human2);
//     invokeSleep(empList);
//     invokeSleep(humanList2);
//     invokeSleep(studentList2);



//     // humanList=humanList2;
//     // humanList=objectList2;

    
   














//   }
//   public static void invokeSleep(List<? extends Human> list){
//     for(Human human:list){
//       human.sleep();
//     }
//   }
// }






//  import java.util.*;
// import java.sql.*;
// public class Demo{
//   public static void main(String args[]){
//     java.util.Date date=new java.util.Date();
//     System.out.println(date);
//     long time=(date.getTime());//gives the time in milliseconds
   
//     java.sql.Date sdate= new java.sql.Date(time);
//     System.out.println(sdate);
//   }
// }



// import java.time.*;
// public class Demo{
//   public static void main(String args[]){
//     LocalDate date=LocalDate.now();
//     System.out.println(date);

//     System.out.println(date.getDayOfMonth());
//     System.out.println(date.getDayOfYear());
//     System.out.println(date.getMonthValue());

//     LocalTime time=LocalTime.now();
//     System.out.println(time);
//     System.out.println(time.getHour());
//     System.out.println(time.getMinute());
//     System.out.println(time.getSecond());
//     System.out.println(time.getNano());
//   }
// }


// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     List<Integer> nums=Arrays.asList(4,5,7,8);
//     System.out.println(nums);
//     int sum=0;
//     for(int n:nums){
//       if(n%2==0){
//         n=n*2;
//         sum+=n;
//       }
//     }
//     System.out.println(sum);
//     for(int i=0;i<nums.size();i++){
//       System.out.println(nums.get(i));
//     }
//     for(int n:nums){
//       System.out.println(n);
//     }
//     nums.forEach(n->System.out.println(n));

    
//   }
// }



//For Each
// import java.util.*;
// import java.util.function.*;
// public class Demo{
//   public static void main(String args[]){
//     List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    // Consumer<Integer> con=new Consumer<Integer>(){
    //   public void accept(Integer n){
    //     System.out.println(n);

    //   }
    // };
//     Consumer<Integer> con=(n)->
//      System.out.println(n);
    
//     nums.forEach(con);
//     //nums.forEach((n)->System.out.println(n));
//   }
// }






//Stream Api
// import java.util.*;
// import java.util.stream.*;

// public class Demo{
//   public static void main(String args[]){
//     List<Integer> nums=Arrays.asList(4,5,7,8,9,10);
//     // Stream<Integer> s1=nums.stream();
//     // s1.forEach(n->System.out.println(n));
//     // Stream<Integer> s2=s1.filter(n->n%2==0);
//     // Stream<Integer> s3=s2.map(n->n*2);
//     // s3.forEach(n->System.out.println(n));
//     // int result=s3.reduce(0,(c,e)->c+e);
//     // System.out.println(result);
//     nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
//   }
// }





//all the functions in detail
// import java.util.*;
// import java.util.function.*;
// import java.util.stream.*;

// public class Demo{
//   public static void main(String args[]){
//     List<Integer> nums=Arrays.asList(5,8,7,9,0);
//     // Predicate<Integer>p=new Predicate<Integer>(){
//     //   public boolean test(Integer n){
//     //    return n%2==0;
//     //   }

//     // };
//     // Predicate<Integer>  p==(n)->n%2==0;
//     // Function<Integer,Integer> fun=new Function<Integer,Integer>(){
//     //   public Integer apply(Integer n){
//     //     return n*2;
//     //   }

//     // };

//     Stream<Integer> sortedValues=nums.stream().filter(n->n%2==0).sorted();
//     sortedValues.forEach(n->System.out.println(n));






//     // int result=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);

//   }
// }






//Parallal stream
// import java.util.*;
// public class Demo{
//   public static void main(String args[]){
//     int size=10_000;
//     List<Integer> nums=new ArrayList<>(size);
//     Random ran=new Random();
//     for(int i=1;i<=10_000;i++){
//        nums.add(ran.nextInt(100));

//     }
//     // int sum=nums.stream().map(n->n*2).reduce(0,(c,e)->c+e);
//     // System.out.println(sum);

//     long startSeq=System.currentTimeMillis();
//     int sum2=nums.stream().map(i->{
//       try{
//         Thread.sleep(1);
//       }catch(Exception e){
//       }
//       return i*2;
//     }).mapToInt(i->i).sum();
//     System.out.println(sum2);
//     long endSeq=System.currentTimeMillis();


//     long startSeq1=System.currentTimeMillis();
//     int sum3=nums.parallelStream().map(i->{
//       try{
//         Thread.sleep(1);
//       }catch(Exception e){
//       }
//       return i*2;
//     }).mapToInt(i->i).sum();
//     long endSeq1=System.currentTimeMillis();
//     System.out.println(endSeq-startSeq);
//     System.out.println(endSeq1-startSeq1);
//   }
// }




//Optional Class
// import java.util.*;
// import java.util.Optional.*;
// public class Demo{
//   public static void main(String agrs[]){
//     List<String> names=Arrays.asList("Vanshika","Vansiha","Vijay","Vinita");
//    Optional <String >name=names.stream().filter(str->str.contains("x")).findFirst();
//    System.out.println(name.orElse("Not found"));

//   }
// }







//Method reference
// import java.util.*;
// public class Demo{
//     public static void main(String args[]){
//         List<String> names=Arrays.asList("Vanshika","Vanisha","Vinita","Vijay");
//         List<String> uNames=names.stream().map(String::toUpperCase).toList();
//         System.out.println(uNames);
//         uNames.forEach(System.out::println);
//     }
// }







//Construct referece
// import java.util.*;
// class Student{
//     private String name;
//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     }
//     private int age;

//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public Student(){

//     }
//     public Student(String name){
//         this.name=name;

//     }

// }
// public class Demo{
//     public static void main(String args[]){
//         List<String> names=Arrays.asList("Vanshika","Vanisha","Vinita","Vijay");
//         List<Student> students=new ArrayList<>();
//         // for(String name:names){
//         //     students.add(new Student(name));
//         // }
//         students=names.stream().map(Student::new).toList();
//         System.out.println(students);
//     }

// }






//IO
// class Student{
//     private int id;
//     private String name;
//     @Override
//     public String toString() {
//         return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
//     }
//     private int age;
//     public Student(int id, String name, int age) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//     }

    
// }
// public class Demo{
//     public static void main(String args[]){
//         Student s1=new Student(1,"Vanshika",22);
//         System.out.println(s1);
//         Student st2=new Student(2,"Vansiha",17);
//         System.out.println(st2);

//     }
//}


// import java.io.*;
// public class Demo{
//     public static void main(String args[]){
//         String filePath="D:\\notes\\java.txt";
//         String dirPath="D:\\notes\\dir";


//         try{
//         File file1=new File("D:\\notes\\java.txt");
//         System.out.println(file1.exists());
//         System.out.println(file1.createNewFile());
//         System.out.println(file1.getPath());
//         System.out.println(file1.isDirectory());
//         System.out.println(file1.isFile());


//         File dir=new File("D:\\notes\\dir");
//         System.out.println(dir.exists());
//         System.out.println(dir.mkdir());
//         File file2=new File("D:\\notes");
//         String str[]=file2.list();
//         for( String name:str){
//           System.out.println(name);
//         }

//         }
//         catch(Exception e){
//             System.out.println("Error!");
//         }
//     }
// }





//Wrtitng data into our files
// import java.io.*;
// public class Demo{
//     public static void main(String args[]) throws IOException{
//         String filepath="D:\\notes\\java.txt";
//         FileWriter writer=null;

//         try{
//             File file1=new File(filepath);
//             writer=new FileWriter(file1,true);

//             writer.write("java");
//             writer.write("\n");
//             writer.write(65);// corrosponding character will be stored
//             char ch[]={'a','b','c','d'};
//             writer.write(ch);

//         }
//         catch(Exception e){
//             System.out.println("Some problem");
//         }
//         finally{
//             writer.close();
//         }

//     }
// }









//Reading data from a new file
// import java.io.*;
// public class Demo{
//     public static void main(String args[]) throws IOException{
//         String filepath="D:\\notes";
//         FileReader reader=null;
//         try{
//             File file1=new File(filepath);
//             reader=new FileReader(file1);
//         //    int i= reader.read();
          
//         //    while(i!=-1){
//         //      System.out.println((char)i);
//         //      i=reader.read();

//            //}
//            char ch[]=new char[(int)file1.length()];
//            reader.read(ch);
//            for(char c:ch){
//             System.out.println(c);
//            }
//         }
//         catch(Exception e){
//             System.out.println("Some problem");

//         }
//         finally{
//             reader.close();

//         }
//     }
// }







//Buffered Writer
// import java.io.*;
// public class Demo{
//     public static void main(String []args) throws IOException{
//         String filePath="D:\\notes\\java.txt";
//         FileWriter writer=null;
//         BufferedWriter br=null;
//         try{
//             File file1=new File(filePath);
//             writer=new  FileWriter(file1);
//             br=new BufferedWriter(writer);
//             br.write("Alien");
//             br.newLine();
//             br.write(66);
//             char ch[]={'j','a','v','a'};
//             br.write(ch);
//         }
//         catch(Exception e){

//         }
//         finally{
//             br.flush();
//             br.close();
//         }
//     }
// }








//Buffered Reader
// import java.io.*;
// public class Demo{
//     public static void main(String args[]) throws IOException{
//         String filepath="D:\\notes";
//         FileReader reader=null;
//         BufferedReader br=null;
//         try{
//             File file1=new File(filepath);
//             reader=new FileReader(file1);
//             br=new BufferedReader(reader);
//             String str=br.readLine();
//             while(str!=null){
//                 System.out.println(str);
//                 str=br.readLine();
//             }

//         }
//         catch(Exception e){
//             System.out.println("Error");
//         }
//         finally{
//             br.close();
//         }

//     }
// }






//Write operation with print operator
// import java.io.*;
// public class Demo{
//     public static void main(String args[]){
//         String filepath="D:\\notes";
//         FileWriter writer=null;
//         PrintWriter print=null;
//         try{
//             File file1=new File("D:\\notes");
//             writer=new FileWriter(file1);
//             print=new PrintWriter(writer);
//             print.write(65);//A
//             print.println();
//             print.println(65);
//             print.println("JAVA");
//             print.println(true);

//         }
//         catch(Exception e){
//             System.out.println("Erroorrrr!!!");
//         }
//         finally{
//             print.close();
//         }

//     }
// }



//Serialisation
import java.io.*;
class Student implements Serializable{
    private int id;
    private String name;
   transient private int age;

    public Student(int id,String name,int age){
        super();
        this.id=id;
        this.name=name;
        this.age=age;


    }
    public void display(){
        System.out.println("id"+id);
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
}
public class Demo{
    public static void main(String args[]){
        // Student stu1=new Student(1,"Vanshika",22);
        // stu1.display();
         try{
        // FileOutputStream fos=new FileOutputStream("D:\\notes\\serial.txt");
        // BufferedOutputStream br=new BufferedOutputStream(fos);
        // ObjectOutputStream oos=new ObjectOutputStream(br);
        // oos.writeObject(stu1);
        // oos.close();
        // fos.close();
         FileInputStream fis=new FileInputStream("D:\\notes\\serial.txt");
         BufferedInputStream br=new BufferedInputStream(fis);
         ObjectInputStream ois=new ObjectInputStream(br);
         
         Student st=(Student)ois.readObject();
         st.display();
         ois.close();

        }
        catch(Exception e){

        }
        finally{
          
        }
    }
}





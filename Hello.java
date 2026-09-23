// class Calculator{
//     int a;
//     public int add(int a,int b,int c){
//         // int r=a+b;

//         return a+b+c;
//     }
//     public int add(int a,int b){
//         return a+b;
//     }
//     public double add(double a,int b){
//         return a+b;
//     }
// }

// class Computer{
//    public void playMusic(){
//     System.out.println("music is playing");

//     }
//     public String getMePen(int cost){
//         if(cost>=10)
//         return "Pen";
//     else
//         return "Give me more money!";
//     }
// }
// class Student{
//     String name;
//     int rollno;
//     int marks;
// }

// class Human{
//     private int age=22;
//    private String name="Vanshika";

//    public Human(){
//     System.out.println("In constructor");
//     age=12;
//     name="Smriti";
//    }
//    //everytime yiu create a object constructor is called
//    public Human(int age,String name){
//     this.age=age;
//     this.name=name;
//    }
// public Human(String name){
    
//     this.name=name;
//    }

//    public int getAge(){
//     return age;
//    }
//    public void setAge(int age){
//     this.age=age;
//    }
   
//    public String getName(){
//     return name;
//    }
//    public void setName(String name){
//     this.name=name;
//    }
// }

// class Mobile{
//     String brand;
//     int price;
//     String network;
//      static String name;//same copy shared by all objects 

//      static{
//         name="phone";
//         System.out.println("In static block");
//      }//static is called only once irrespective of how many times the constructor is called


//      public Mobile(){
//         brand="";
//         price=200;
//         System.out.println("In constructor");


//      }

//     public void show(){
//         System.out.println(brand+" : "+price+" : "+name);

//     }
    // public static void show1(Mobile obj){
    //     System.out.println(obj.brand+" : "+obj.price+" : "+name);
    // }
//}

class A{
    A(){
        System.out.println("In constructor ");
    }
    public void show(){
        System.out.println("in A show");
    }
}
public class Hello{
    public static void main(String args[]) throws ClassNotFoundException{
        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1500;
        // Mobile.name="Smart Phone";

        // Mobile obj2=new Mobile();
        // obj2.brand="Samsung";
        // obj2.price=1700;
        // Mobile.name="Smartphone";
        
        // obj1.show();
        // obj2.show();
        // Mobile.show1(obj1);

        // Class.forName("Mobile");

        // A obj=new A();
        // obj.show(); 
        new A().show();









        // Human obj=new Human(67,"Vanshika");
        // // obj.age=22;
        // // obj.name="Vanshika";
        // obj.setAge(30);
        // obj.setName("Vanshika");

        // System.out.println(obj.getAge()+" "+obj.getName());
        // System.out.println("Hello World");
        // int num=3;
        // int num2=5;
        // int result=num+num2;
        // System.out.println(result);

        // int num1=9;
        // // byte by=129;//error(out of range)
        // byte by=127;
        // short sh=558;
        // long l=3536l;
        // float f=5.8f;
        // double d=5.8;
        // char c='k';//literals
        // boolean b=true;

        //literals
        // int num1=0b101;
        // System.out.println(num1);

        // int num1=0x7E;
        // System.out.println(num1);

        // int num1=10_00_00_000;
        // System.out.println(num1);

        // double num1=12e10;
        // System.out.println(num1);

        // char c='a';
        // c++;
        // System.out.println(c); 

        //Type conversion

        // int  b=257;
        // byte a=(byte)b;

        // System.out.println(a);

        //Type promotions
        // byte a=10;
        // byte b=30;
        // int result=a*b;
        // System.out.println(result);
        
        //Arithmetic operators
        // int a=7;
        // int b=5;
        // int result=a+b;
        // int result=a*b;
        // int result=a/b;
        // int result=a-b;
        // int result=a%b;
       
        // a+=2;
        // a++; //Post increment
        // a--;
        // ++a;//pre increment
        // System.out.println(result);

        //Relational Operators

        // int x=6;
        // int y=5;
        // boolean result=x<y;
        // System.out.println(result);

        // boolean result1=x<=y;
        // System.out.println(result1);

        // boolean result2=x==y;
        // System.out.println(result2);

        //Logical operators

        // int x=7;
        // int y=5;
        // int a=5;
        // int b=9;
        // boolean result=x<y && a<b;
        // System.out.println(result);

        // boolean result1=x>y||a<b;
        // System.out.println(result1);

        // boolean result2=a>b;
        // System.out.println(!result2);

        //if else
        //     int x=8;
        // if(x>10 && x<=20)
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye");

        //Print the greatest number

        // int x=5;
        // int y=7;
        // if(x>y){
        //     System.out.println(x);
        //     System.out.println("Thankyou!");
        // }
        // else
        //     System.out.println(y);

        //Print the gratest of three values
        // int x=5;
        // int y=7;
        // int z=9;

        // if(x>y && x>z)
        //     System.out.println(x);
        // else if(y>x &&y>z)
        //     System.out.println(y);
        // else
        //     System.out.println(z);

        //Ternary opeartor
        // int n=4;
        // int result=0;
        // if(n%2==0)
        //     result=10;
        // else
        //     result=20;
        // System.out.println(result);

        // result=n%2==0?10:20;
        // System.out.println(result);


        //Switch case int n=1;
        // switch(n){
        //     case 1:System.out.println("Monday");
        //     break;
        //     case 2:System.out.println("Tuesday");
        //     break;
        //     case 3:System.out.println("Wednesday");
        //     break;
        //     case 4:System.out.println("Thursday");
        //     break;
        //     case 5:System.out.println("Friday");

        //     break;
        //     case 6:System.out.println("Sturday");
        //     break;
        //     case 7:System.out.println("Sunday");
        //     break;
        //     default:System.out.println("Enter a valid number");

        // }

        //while loop
        //  int i=1;
        //  while(i<=5)
        // {
        //     System.out.println("Hi"+ i);
        //     int j=1;
        //     while(j<=3){
        //         System.out.println("Hello"+j);
        //         j++;
        //     }
        //     i++;
        // }
        // System.out.println("Bye"+i);

        //do while
    //     int i=5;
    //    do{
    //         System.out.println("Sorry!Not available!");
    //     }while(i<=4);


    //For loop
    // for(int i=1;i<=4;i++){
    //     System.out.println(i);
    // }

    // for(int i=1;i<=5;i++){
    //     System.out.println("Day"+i);
    //     for(int j=9;j<=18;j++){
    //         System.out.println(j+"-"+(j+1));
    //     }
    // }

    //objects
    // Calculator ob=new Calculator();
    // System.out.println(ob.add(4,5));

// Computer obj=new Computer();
// obj.playMusic();
// String str=obj.getMePen(2);
// System.out.println(str);

// Calculator obj=new Calculator();
// int r1=obj.add(3,4);//obj-its not a object its just a referece variable
// double r2=obj.add(5.0,9);
// System.out.println(r1);
// System.out.println(r2);
//global variables are stored in heap and local varibales and functions in stacks

//Arrays
// int nums[]={3,4,6,7};
// nums[1]=6;
// System.out.println(nums[1]);

// int nums[]=new int[4];//default values are 0
// nums[0]=4;
// nums[1]=8;
// nums[2]=3;
// nums[3]=9;
// for(int i=0;i<4;i++){
//     System.out.println(nums[i]);
// }

//Multi dimnesional array
// int nums[][]=new int[3][4];
// for(int i=0;i<3;i++){
//     for(int j=0;j<4;j++){
//         nums[i][j]=(int)(Math.random()*100);
//         System.out.print(nums[i][j]+" ");
//     }
//     System.out.println();
// }
// for(int n[]:nums){
//     for(int m:n){
//         System.out.print(m+" ");
//     }
//     System.out.println();
// }

//Jagged Array
// int nums[][]=new int[3][]; //jagged
// nums[0]=new int[2];
// nums[1]=new int[4];
// nums[2]=new int[2];
// for(int n[]:nums){
//     for(int m:n){
//         System.out.print(m+" ");
//     }
//     System.out.println();
//}

//Array of objects
// Student s1=new Student();
// s1.rollno=273;
// s1.name="Vanshika";
// s1.marks=88;

// Student s2=new Student();
// s2.rollno=41;
// s2.name="Shreeya";
// s2.marks=82;

// Student s3=new Student();
// s3.rollno=243;
// s3.name="Shreya";
// s3.marks=84;

// Student students[]=new Student[3];
// students[0]=s1;
// students[1]=s2;
// students[2]=s3;

// for(Student stud:students){
//     System.out.println(stud.name+" "+ stud.marks);
//}


// for(int i=0;i<students.length;i++){
//     System.out.println(students[i].name+" "+students[i].marks);
// }

//Enhanced for loop
// int nums[]=new int[4];
// nums[0]=4;
// nums[1]=8;
// nums[2]=3;
// nums[3]=9;

// for(int n:nums){
//     System.out.println(n);
// }

//String

// String name=new String("Vanshika");
// System.out.println(name.hashCode());
// System.out.println("hello"+name);
// System.out.println(name.charAt(0));
// System.out.println(name.concat("Sinha"));
// String s1="Vanshika";
// String s2="Vanshika";
// System.out.println(s1==s2);

// StringBuffer sb=new StringBuffer("Vanshika");
// System.out.println(sb.capacity());
// sb.append("Sinha");
// sb.insert(0,"Java");
// System.out.println(sb);
// sb.deleteCharAt(2);
// System.out.println(sb);















 




    }
}
       
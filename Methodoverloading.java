class A{
    public void show(){
        System.out.println("In a show");
    }
    public void config(){
        System.out.println("in A config");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In show of B");
    }

}




public class Methodoverloading {
    public static void main(String args[]){
         B obj=new B();
         obj.show();
         obj.config();
    }
    
}

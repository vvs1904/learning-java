package vanshika.example1;

public class JavaCourse implements ICourse{
    @Override
    public Boolean getTheCourse(){
        System.out.println("Java course purchased");
        return true;
    }
    
}

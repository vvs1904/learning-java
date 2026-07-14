package vanshika.example1;

public class DevOpsCourse implements ICourse{
    @Override
    public Boolean getTheCourse(){
        System.out.println("Devops course purchased");
        return true;
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class studentinfo {

    private static  studentinfo instance= null;
   private List<student> student =new ArrayList<>();

   private studentinfo(){
       student student= new student();
       student.name="harshith";
       student.id=1;
       student.password="ram";
        this.student.add(student);


   }

   public static studentinfo getInstance(){
if (instance==null){
instance=new studentinfo();
}
return instance;

   }

public void addstudent(student student){ this.student.add(student);}

    public List<student> getStudent() {
        return this.student;
    }
}

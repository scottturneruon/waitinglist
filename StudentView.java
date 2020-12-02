   import java.util.LinkedList;
import java.util.Queue;
public class StudentView {
     public void printStudentDetails(Queue<Student> showIt){
        for(Student element : showIt) {
      System.out.println(element.getName());
    }


     }
}
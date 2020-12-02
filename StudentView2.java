   import java.util.LinkedList;
import java.util.Queue;
public class StudentView2 {
     public void printStudentDetails(Queue<Student> showIt){
       Student ex=showIt.peek();
        System.out.println("Head is "+ex.getName());


     }
}
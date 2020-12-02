// Import the LinkedList class
import java.util.LinkedList;
import java.util.Queue;

public class WaitingList {
  
  public Queue<Student> waitForIt = new LinkedList<Student>();
  public Student newone = new Student();

   //make the constructor private so that this class cannot be
   //instantiated
   public WaitingList(Student addit){
     this.newone=addit;
      addNewStudent(newone);
   }

   //Get the only object available

  public void addNewStudent(Student newone){
    waitForIt.add(newone);
  } 

  public Queue<Student> getIt(){
    return waitForIt;
  }

}
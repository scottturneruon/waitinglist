public class StudentController {
   private WaitingList model;
   private StudentView view;
   private StudentView2 view2;

   public StudentController(WaitingList model, StudentView view, StudentView2 view2){
      this.model = model;
      this.view = view;
      this.view2 = view2;
   }

   public void setStudent(Student nowthis){
      model.addNewStudent(nowthis);		
   }

   public void updateView(){				
      view.printStudentDetails(model.getIt());
      view2.printStudentDetails(model.getIt());
   }	
}
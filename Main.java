class Main  {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
  
      Student firstone = new Student();
      firstone.setName("Robert");
      firstone.setRollNo("10");

      WaitingList model = new WaitingList(firstone);

      //Create a view : to write student details on console
      StudentView view = new StudentView();
      StudentView2 view2 = new StudentView2();

      StudentController controller = new StudentController(model, view, view2);

      controller.updateView();

      controller.setStudent(new Student("John","100"));

      controller.updateView();
   }

}
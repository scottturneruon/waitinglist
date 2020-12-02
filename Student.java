public class Student {
   private String rollNo = " ";
   private String name=" ";

   public Student() {
     this.rollNo=rollNo;
     this.name=name;
   }   //show the message
   public Student(String name1, String roll1) {
     this.rollNo=roll1;
     this.name=name1;
   }
   
   public String getRollNo() {
      return rollNo;
   }
   
   public void setRollNo(String rollNo) {
      this.rollNo = rollNo;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
}
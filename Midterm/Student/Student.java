package Student;

class Student {
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   public String getFName(){
      return first_name;
   }
   
   public String getMidName(){
      return middle_name;
   }
   
   public String getLName(){
      return last_name;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public void setFName(String Fname){
      first_name = Fname;
   }
   
   public void setMidName(String Mname){
      middle_name = Mname;
   }

   public void setLName(String Lname){
      last_name = Lname;
   }
   
   public void setSuffix(String Suffix){
      suffix = Suffix;
   }

   public String getFullName(){
      return first_name + " " + middle_name + " " + last_name + " " + suffix; 
   }
}
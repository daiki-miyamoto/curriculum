package check;

import constants.Constants;
public class Main {
	 private static String firstName = "宮本";
	 private static String lastName = "大輝";
   
	 public static void main(String[] args) {
		 printName(firstName, lastName);
		 Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		 pet.introduce();
	  
	     RobotPet x = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
 	     x.introduce();
	 } 
 private static void printName(String firstName, String lastName) {
		    String a = firstName + lastName;
		    
		    System.out.println(a);
 }
}

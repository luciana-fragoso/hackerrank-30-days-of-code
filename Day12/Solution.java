import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

   public Student(String firtName,String lastName,int idNumber,int[] scores){
       super(firtName,lastName,idNumber);
       this.testScores = scores;
   }
   
   public char calculate(){
       char letter;
       int sum=0;
       for (int i=0;i<testScores.length;i++){
           sum+=testScores[i];
       }
       double avg = (double) sum/testScores.length; 
       
       if(avg <= 100 && avg >= 90.0){
            letter = 'O';
        }else if(avg < 90 && avg >= 80){
            letter = 'E';
        }else if(avg < 80 && avg >= 70){
            letter = 'A';
        }else if(avg < 70 && avg >= 55){
            letter = 'P';
        }else if(avg < 55 && avg >= 40){
            letter = 'D';
        }else{
            letter = 'T';
        }
        return letter;
   }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
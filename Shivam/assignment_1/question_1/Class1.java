package assignment1q1;

public class Class1 {

	public static void main(String[] args) {
		
		boolean isSnowing =false;
		boolean israining=true;
		Double temperature=60.0;
		
		if(isSnowing==true) {
			System.out.println("Let's stay home");
		}
		else if(israining==true){
			System.out.println("Let's stay home");	
		}
		else if(temperature>50){
			System.out.println("Let's stay home");	
		}
		else {
				System.out.println("Let's go out");	
		}
	}
}

package excption_practice_23_11_2021;

public class UserDefinedException extends Exception {
int age;
	public UserDefinedException(int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		System.out.println("Age "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void verifyAge(int age) { 
		
		if(age<18) {
			try { 
				throw new UserDefinedException(age);
			}
			catch(UserDefinedException ve) { 
				System.out.println("Please check your age:"+ve);
			}
		}
		else {
			System.out.println("Applied");
		}
				
		}
	@Override
	public String toString() {
		return ""+age ;
	}
	
	

}

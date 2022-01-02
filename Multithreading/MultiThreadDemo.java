package thread;

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hai");
		
		ThreadChild tc=new ThreadChild();
		tc.start();// multithread
		//tc.run(); //sequentical
		MultiThreadDemo md=new MultiThreadDemo();
		md.add();	 

	}

	private void add() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) { 
			System.out.println("MD"+i);
		}
	}

}

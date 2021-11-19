package generics_18_11_2021;

public class GameCaller2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameGEnString g=new GameGEnString("Santhiya");
		GameGEnString g1=new GameGEnString(123);
		g.display();
		g1.display();
	}

}
/* output :

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The constructor GameGEnString(int) is undefined

	at generics_18_11_2021.GameCaller2.main(GameCaller2.java:8)


*/
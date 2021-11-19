package generics_18_11_2021;

public class GameCallerGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameGen g=new GameGen("Santhiya");
		GameGen g1=new GameGen(123);
		g.display();
		g1.display();
	}

}
/* output :

Handle multiple type of ojects
Santhiya---->java.lang.String
Handle multiple type of ojects
123---->java.lang.Integer

*/
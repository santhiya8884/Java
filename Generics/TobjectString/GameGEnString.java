package generics_18_11_2021;

public class GameGEnString<T extends String> {

	T obj;
	GameGEnString(T obj){ 
		this.obj=obj;
	}
	
	public void display() { 
		System.out.println("Handle multiple type of ojects");
		System.out.println(obj+"---->"+obj.getClass().getName());
	}

}

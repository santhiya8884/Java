package generics_18_11_2021;

public class GameGen<T> {
T obj;
	GameGen(T obj){ 
		this.obj=obj;
	}
	
	public void display() { 
		System.out.println("Handle multiple type of ojects");
		System.out.println(obj+"---->"+obj.getClass().getName());
	}

}

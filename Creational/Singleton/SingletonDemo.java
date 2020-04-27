import java.lang.reflect.*;

public class SingletonDemo {
	public static void main(String args[]) throws Exception {

		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
	
		System.out.println("s1 : " + s1 + " s2 : " + s2);
		System.out.println("isSame() : " + (s1 == s2));

	}
}

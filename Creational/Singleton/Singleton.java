
class Singleton {
	
	private static volatile Singleton instance = null; // Eager Loading

	private Singleton() {
		if(instance != null)
			throw new RuntimeException("Use getInstance() method to create");
	}

	public static Singleton getInstance() {
		if(instance == null)			// Lazy Loading
			synchronized(Singleton.class) {
				if(instance == null)
					instance = new Singleton();
			}
		
		return instance;
	}
}

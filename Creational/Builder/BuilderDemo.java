public class BuilderDemo {
	public static void main(String args[]) {
		
		LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();
		
		builder.bread("wheat").dressing("mayo").meat("turkey").condiments("lettuce");
		
		LunchOrderBuilder lunchOrder = builder.build();

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}
}


public class Main {

	public static void main(String[] args) {
		
		Car car = new Car.Builder().color("Blue")
				.age(20)
				.build();
		System.out.println(car);

	}

}

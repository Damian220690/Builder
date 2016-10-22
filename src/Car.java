
public class Car {
	private String color;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}

	private Car(Builder builder){
		this.color = builder.color;
		this.age = builder.age;
	}

	public static class Builder{
		private String color;
		private int age;
		
		Builder(){} // gdy mamy pole ktore  jest wymagane w konstruktorze klasy Car to wykorzystujemy je takze w ty konstruktorze (Dodajemy jedynie przedrostek final)
		
		public Builder color(String color){
			this.color = color;
			return this;
		}
		
		public Builder age(int age){
			this.age = age;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}
	}
	public String toString(){
		return "Color = " + color + ", Age = "+ age;
	}
}

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.sex = "Male";
		wolf.name = "Bobik";
		wolf.weight = 11f;
		wolf.age = 2;
		wolf.color = "White";
		
		System.out.println("Пол - ".concat(wolf.sex));
		System.out.println("Кличка - ".concat(wolf.name));
		System.out.println("Вес - ".concat(Double.toString(wolf.weight)));
		System.out.println("Вазраст - ".concat(Integer.toString(wolf.age)));
		System.out.println("Окрас - ".concat(wolf.color));

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.hawl();
		wolf.hunt();
	}
}
public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setSex("Male");
		wolf.setName("Bobik");
		wolf.setWeight(11f);
		wolf.setAge(9);
		wolf.setColor("White");

		System.out.println("Пол - ".concat(wolf.getSex()));
		System.out.println("Кличка - ".concat(wolf.getName()));
		System.out.println("Вес - ".concat(Double.toString(wolf.getWeight())));
		System.out.println("Вазраст - ".concat(Integer.toString(wolf.getAge())));
		System.out.println("Окрас - ".concat(wolf.getColor()));

		wolf.walk();
		wolf.sit();
		wolf.run();
		wolf.hawl();
		wolf.hunt();
	}
}
package basic;

public class Zile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zi_a_saptamanii="Sambata";
		System.out.println("Incepere Program:");
		switch(zi_a_saptamanii)
		{
		case "Luni":
			System.out.println("Azi este luni");
			break;
		case "Marti":
			System.out.println("Azi este marti");
			break;
		case "Miercuri":
			System.out.println("Azi este miercuri");
			break;
		case "Joi":
			System.out.println("Azi este joi");
			break;
		case "Vineri":
			System.out.println("Azi este vineri");
			break;
		case "Sambata":
			System.out.println("Azi este sambata");
			break;
		case "Duminica":
			System.out.println("Azi este Duminica");
			break;
		default :
			System.out.println("Aceasta zi nu exista");
			break;
		}
		System.out.println("Terminare Program");
	}

}

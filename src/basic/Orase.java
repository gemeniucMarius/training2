package basic;

public class Orase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orase = { "Suceava", "Iasi", "Cluj", "Bucuresti" };
		String[] comune = new String[5];
		comune[0] = "Stroiesti";
		comune[1] = "Ilisesti";
		comune[2] = "Paltinoasa";
		comune[3] = "Burdujeni";
		comune[4] = "Zaharesti";
		System.out.println("**************");
		System.out.println(comune[0]);
		String[] tara;
		tara = new String[3];
		tara[0] = "Romania";
		tara[1] = "Serbia";
		tara[2] = "Grecia";
		System.out.println("**************");
		System.out.println(tara[1]);
		int i = 0;
		do {
			System.out.println(tara[i]);
			i = i + 1;
		} while (i < 3);
		int n = 0;
		boolean comunaGasita = false;
		System.out.println("**************");
		while (!comunaGasita) {
			String comuna = comune[n];
			System.out.println(comuna);
			n++;
			if (comuna == "Stroiesti") {
				System.out.println("Comuna gasita");
				comunaGasita = true;
			} else
				System.out.println("Comuna nu se gaseste");
		}
		System.out.println("**************");
		for (i = 0; i < 2; i++)
			System.out.println(orase[i]);
	}
}

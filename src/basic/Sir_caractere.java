package basic;

public class Sir_caractere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titlulCartii;
		String alegeCuvantul = "Game";
		titlulCartii = " Game of Thrones";
		if (titlulCartii.contains(alegeCuvantul)) {
			System.out.println("Cartea contine cuvantul" + alegeCuvantul);
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browserul este chrome");
		}

		String Prenume = "Marius";
		String Nume = "Gemeniuc";
		String CNP = "92182412094";
		System.out.println("Acesta are " + CNP.length() + " numere in CNP");
		System.out.print(Prenume.substring(0, 3));
		System.out.print(Nume.substring(1, 2));
		System.out.println(CNP.substring(5));

	}

}

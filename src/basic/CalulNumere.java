package basic;

public class CalulNumere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inceperea programului:");
		scriereNume();
		int num1 = 10;
		int num2 = 21;
		adunareNumere(num1, num2);
		int produs = inmultireNumere(num1, num2);
		System.out.println("Produsul dintre " + num1 + " si " + num2 + " este: " + produs);
	}

	public static void scriereNume() {
		System.out.println("Numele meu este Marius");
	}

	public static void adunareNumere(int primulNumar, int aldoileaNumar) {
		int suma = primulNumar + aldoileaNumar;
		System.out.println("Suma dintre " + primulNumar + " si " + aldoileaNumar + " este: " + suma);

	}

	public static int inmultireNumere(int primaValoare, int adouaValoare) {
		int produs = primaValoare * adouaValoare;
		adunareNumere(primaValoare + 50, adouaValoare + 20);
		return produs;
	}

}

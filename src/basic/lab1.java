package basic;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scrie o functie care ia valoarea n si returneaza suma de la 1 la n
		System.out.println(suma(5));
		// Scrie o functie care sa returneze n factorial folosind functie recursiva
		int n = 5;
		int fac = factorial(n);
		System.out.println("Factorialul lui " + n + " este: " + fac);
		// Scrie trei functii care sa returneze minimul, media aritmetica, maximul
		// folosint array
		int[] numar = { 5, 2, -4, -6, 2143, 123, 533, 445, -454, -324 };
		System.out.println("Minimul este: " + cautaMin(numar));
		System.out.println("Maximul este: " + cautaMax(numar));
		System.out.println("Media aritmetica este: " + media_aritmetica(numar));
	}

	public static int suma(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	// Factorial - recursiva(care se auto-apeleaza)

	public static int factorial(int n) {
		System.out.println("S-a apelat factorial de" + n + " ");
		if (n == 0) {
			System.out.println("Se returneaza 1");
			return 1;
		} else {
			System.out.println("Se returneaza " + n + " factorial de " + n + " ");
			return n * factorial(n - 1);
		}
	}

	public static int cautaMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int cautaMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int media_aritmetica(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Suma este: " + sum);
		return sum / arr.length;
	}

}

package basic;

public class Vremea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 25;
		String conditii_meteo = "Insorit";
		System.out.println("Inceperea programului:");
		if((temperatura>=30)&&(conditii_meteo=="Insorit"))
		{
			System.out.println("Purtati tricou si pantaloni scurti");
			System.out.println("Feritiva ochii de lumina soarelui");
		}
		else if((temperatura>=30)&&(conditii_meteo=="Innorat"))
		{
			System.out.println("Purtati tricou si pantaloni scurti, dar sa aveti umbrela la dumneavoastra");
		}
		else if((temperatura>=20)&&(conditii_meteo=="Insorit"))
		{
			System.out.println("Purtati tricou cu maneca lunga si pantaloni");
		}
		else if((temperatura>=20)&&(conditii_meteo=="Innorat"))
		{
			System.out.println("Purtati tricou cu manica lunga si pantaloni , dar sa aveti umbrela la dumneavoastra");
		}
		else
		{
			System.out.println("Imbracativa bine cu haine destul de groase deoarece este destul de rece afara");
		}
		System.out.println("Terminarea programului!");
	}

}

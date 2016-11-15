import java.sql.Date;

public class Hola_Mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola Mundo");
		
		// mostramos la hora actual
		
		Date ahora = new Date(0);
		System.out.printf("%s %tT" + "son las", ahora);
		
	}

}

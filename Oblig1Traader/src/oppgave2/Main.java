package oppgave2;

public class Main {
	public static void main(String args[]) {
		final String[] kokker = {"Anne", "Erik", "Knut"};
		final String[] servitorer = {"Mia", "Per"};
		final int KAPASITET = 4;
		
		skrivUtHeader(kokker, servitorer, KAPASITET);
		
		HamburgerBrett brett = new HamburgerBrett(KAPASITET);
		
		/*
		 * 
		 */
		for (String navn : kokker) {
			new Cook(navn, brett).start();
		}
		
		for (String navn : servitorer) {
			new Waiter(navn, brett).start();
		}
		
	}
	
	static void skrivUtHeader(String[] kokkene, String[] servitorene, int kapasiteten) {
		System.out.println("In this simulation we have:");
		System.out.print("	" + kokkene.length + " cooks: ");
		for (String navn : kokkene) {
			System.out.print(navn + ", ");
		}
		
		System.out.print("\n	" + servitorene.length + " servers: ");
		for (String navn : servitorene) {
			System.out.print(navn + ", ");
		}
		System.out.println("\n	The capacity og the board is: " + kapasiteten + " burgers");
		
		System.out.println("\n	Initializing...\n\n");
	}
}

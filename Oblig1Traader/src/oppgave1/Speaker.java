package oppgave1;

public class Speaker implements Runnable {
	private String tekst = "Hello World";
	
	
	@Override
	public void run() {
		
		System.out.println(tekst);
	}

	
	public void setTekst(String Tekst) {
		tekst = Tekst;
	}
}
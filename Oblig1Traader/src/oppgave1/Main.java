package oppgave1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String tekst = "";
		JFrame f = new JFrame();
		
		Speaker speaker = new Speaker();
		
		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(speaker, 0, 2, TimeUnit.SECONDS);
		
		while(!tekst.equals("quit")) {
			tekst = JOptionPane.showInputDialog(f,"Enter Some tekst");
			speaker.setTekst(tekst);
		}
		exec.shutdownNow();
		System.exit(0);
	}
}
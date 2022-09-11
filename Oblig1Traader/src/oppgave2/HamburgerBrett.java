package oppgave2;

import java.util.LinkedList;
import java.util.Queue;

public class HamburgerBrett {
	private Queue<Hamburger> burgerBrett;
    private int maxCap;
    private int burgerCount;

    public HamburgerBrett(int max){
        burgerBrett = new LinkedList<Hamburger>();
        this.maxCap = max;
        burgerCount = 1;
    }
    
    public void addBurger(Hamburger burger){
        if (burgerBrett.size() < maxCap || burgerBrett == null) {

            burgerBrett.add(burger);
            burgerCount++;
        }
    }
    
    public Hamburger getBurger(){
        return burgerBrett.poll();
    }
    
    public boolean isEmpty(){
        return burgerBrett.isEmpty();
    }
    
    public boolean isFull(){
        return burgerBrett.size() == maxCap;
    }
    
    public int getBurgerCount(){
        return burgerCount;
    }
    
    @Override
    public String toString(){
    	String tekst = "|";
    	int i = 0;
    	for (Hamburger h : burgerBrett) {
    		i++;
    		tekst += h.getBurgerId() + "|";
    	}
    	for (i = i; i < maxCap;i++) {
    		tekst += "-|";
    	}
    	tekst += "";
        return "	Counter: " + tekst;
    }
}

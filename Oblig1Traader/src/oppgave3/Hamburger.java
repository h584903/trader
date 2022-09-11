package oppgave3;

public class Hamburger {

	private int BurgerId;

    public Hamburger(int Id){
        this.BurgerId = Id;
    }

    public int getBurgerId() {
        return BurgerId;
    }

    public void setBurgerId(int burgerId) {
        BurgerId = burgerId;
    }

    @Override
    public String toString(){
        return "|" + BurgerId + "|";
    }
}

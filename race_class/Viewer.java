package race_class;

public class Viewer {

    private Bet Bet;
    
    public Bet getBet() {
        return Bet;
    }
    public void setBet(Bet bet) {
        Bet = bet;
    }
    private String name;
    
    public String getName() {
        return name;
    }
    private int Money;

    public int getMoney() {
        return Money;
    }
    public void setMoney(int money) {
        Money = money;
    }
    public Viewer(String name, int money, Bet bet) {
        this.name = name;
        Money = money;
        Bet = bet;
    }
    public String toString() {
        return String.format("My name is %s and I" + "'"+ "ve %d$", this.getName(), this.getMoney());
    }
    
}

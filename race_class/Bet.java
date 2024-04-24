package race_class;

public class Bet {
    private String PilotName;

    public Bet(String pilotName, int money) {
        PilotName = pilotName;
        Money = money;
    }

    public String getPilotName() {
        return PilotName;
    }

    private int Money;

    public int getMoney() {
        return Money;
    }

    public int Win(Vehicle[] vehicle){
        if (vehicle[1].getPilotName() != this.getPilotName() && vehicle[2].getPilotName() != this.getPilotName() && vehicle[3].getPilotName() != this.getPilotName()) {
            Money = Money - 1;
        }
        return Money;
    }

    public String toString(){
        return String.format("Bet %d€ on %s", this.getMoney(), this.getPilotName());
    }
}

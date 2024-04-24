package race_class;

public class Kart extends Vehicle {

    public Kart(String pilotName) {
        super((int)Math.floor(Math.random() * (10 - 1 + 1) + 1), (int)Math.floor(Math.random() * (10 - 1 + 1) + 1), pilotName);
    }

    public String Stringspeed() {
        String speedname = "";
        if (this.getSpeed() == 1 || this.getSpeed() == 2) {
            speedname = "slow";
        } else if (this.getSpeed() == 3 || this.getSpeed() == 4) {
            speedname = "rather slow";
        } else if (this.getSpeed() == 5 || this.getSpeed() == 6) {
            speedname = "rather fast";
        } else if (this.getSpeed() == 7 || this.getSpeed() == 8) {
            speedname = "fast";
        } else if (this.getSpeed() == 9 || this.getSpeed() == 10) {
            speedname = "very fast";
        }
        return speedname;
    }

    public String StringAdhesion() {
        String adhesionname ="";
        if (this.getAdhesion() == 1 || this.getAdhesion() == 2) {
            adhesionname = "barely sticks to the ground";
        } else if (this.getAdhesion() == 3 || this.getAdhesion() == 4) {
            adhesionname = "sticks to the ground";
        } else if (this.getAdhesion() == 5 || this.getAdhesion() == 6) {
            adhesionname = "grips the ground quite well";
        } else if (this.getAdhesion() == 7 || this.getAdhesion() == 8) {
            adhesionname = "adheres well to the ground";
        } else if (this.getAdhesion() == 9 || this.getAdhesion() == 10) {
            adhesionname = "adheres perfectly to the ground";
        }
        return adhesionname;
    }

    public String toString() {
        return String.format("This %s is %s, it has a %d speed value, and it %s with a %d value of adhesion", this.getClass().getName().toUpperCase(), Stringspeed(), this.getSpeed(), StringAdhesion(), this.getAdhesion());
    }
}

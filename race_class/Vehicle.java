package race_class;

public abstract class Vehicle {
    private int DistanceTraveled;

    public int getDistanceTraveled() {
        return DistanceTraveled;
    }


    public void setDistanceTraveled(int distanceTraveled) {
        DistanceTraveled = distanceTraveled;
    }

    private int Speed;
    
    public int getSpeed() {
        return Speed;
    }

    private int Adhesion;
    
    public int getAdhesion() {
        return Adhesion;
    }

    private int Out;
    
    public int getOut() {
        return Out;
    }


    public void setOut(int out) {
        Out = out;
    }

    private String PilotName;
    
    public String getPilotName() {
        return PilotName;
    }

    private boolean End;


    public boolean getEnd() {
        return End;
    }


    public void setEnd(boolean end) {
        End = end;
    }


public Vehicle(int speed, int adhesion, String pilotName) {
        Speed = speed;
        Adhesion = adhesion;
        PilotName = pilotName;
        this.Out = 0;
        this.End = false;
    }

    public void Forward() {
        Accident();
        if (getOut() == 0 ){
            DistanceTraveled = DistanceTraveled + Speed * (11 - Adhesion);
        }
    }

    public void Accident(){
        int min = 1;
        int max = 10;
        int n = (int)Math.floor(Math.random() * (max - min + 1) + min);
        if (n > Adhesion) {
            Out = n - Adhesion;
            System.out.println(String.format("%s had an accident he need to wait %d laps",this.getPilotName(), this.getOut()));
        }
    }
}
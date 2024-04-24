package race_class;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public int MinVehicle;
    public int MaxVehicle;
    public List<Vehicle> AllVehicles;
    public List<Viewer> AllViewers;

    public Race(int min, int max) {
        AllVehicles = new ArrayList<Vehicle>();
        AllViewers = new ArrayList<Viewer>();
        MinVehicle = min;
        MaxVehicle = max;
    }
    public void AddVehicle(Vehicle vehicule){
        AllVehicles.add(vehicule);
    }
    public void AddViewer(Viewer viewer){
        AllViewers.add(viewer);
    }

    public Vehicle[] StartRace() {
        Vehicle[] classement = new Vehicle[AllVehicles.size()];
        int distance = (int)Math.floor(Math.random() * (1000 - 100 + 1) + 100);
        int finish = 0;
        if (AllVehicles.size() >= MinVehicle && AllVehicles.size() <= MaxVehicle) {
            while (finish < AllVehicles.size()) {
                System.out.println("NEW LAP");
                for (Vehicle item : this.AllVehicles) {
                    if (!item.getEnd()) {
                        if (item.getOut() == 0 ) {
                            item.Forward();
                            if(item.getOut() == 0){
                                System.out.println(String.format("%s traveled %d ",item.getPilotName(), item.getDistanceTraveled()));
                            }
                        }else {
                            item.setOut(item.getOut()-1);
                        }
                        if (item.getDistanceTraveled() >= distance) {
                            item.setEnd(true);
                            classement[finish]= item ;
                            finish ++;
                            System.out.println(String.format("%s finish the race !", item.getPilotName()));
                        }
                    }
                }
            }
            System.out.println(String.format("Race finish ! %s won the race ", classement[0].getPilotName()));
            if (AllViewers != null){
                for (Viewer viewers : this.AllViewers){
                    viewers.setMoney(viewers.getMoney() + viewers.getBet().Win(classement));
                    if (viewers.getBet().Win(classement) < 0) {
                        System.out.println(String.format("%s doubled his bet",viewers.getName()));
                    } else {
                        System.out.println(String.format("%s lose his bet",viewers.getName()));
                    }
                }
            }            
        }
        return classement;
    }
}

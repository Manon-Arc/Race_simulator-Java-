import race_class.*;

public class Engine {
    public static void  main(String[] args) {
        Kart pilot1 = new Kart("Tom");
        Motorbike pilot2 = new Motorbike("Lola");
        Truck pilot3 = new Truck("Teo");
        Bike pilot4 = new Bike("Ana");
        Bike pilot5 = new Bike("Rachid");
        Viewer viewer1 = new Viewer("John", 15, new Bet("Rachid", 5) );
        Race race = new Race(2,4);
        race.AddVehicle(pilot4);
        race.AddVehicle(pilot3);
        race.AddVehicle(pilot1);
        race.AddVehicle(pilot5);
        race.AddViewer(viewer1);
        System.out.println("pilot 1");
        System.out.println(pilot1.toString());
        System.out.println("pilot 2");
        System.out.println(pilot2.toString());
        System.out.println("pilot 3");
        System.out.println(pilot3.toString());
        System.out.println("pilot 4");
        System.out.println(pilot4.toString());
        System.out.println("viewer1");
        System.out.println(viewer1.toString());
        System.out.println(viewer1.getMoney());
        System.out.println(race.StartRace());
        System.out.println(viewer1.getMoney());
    }
}

import java.util.function.DoubleToIntFunction;

public class Droid {

    int batteryLevel;
    String name;
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public String toString(){
       return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public static void main(String[] args){
        Droid droid1 = new Droid("Codey");
        System.out.println(droid1.name);
        System.out.println(droid1.batteryLevel);
        droid1.performTask("dancing");
        droid1.performTask("levitating");

        System.out.println(droid1.batteryLevel);

    }
}

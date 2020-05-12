
public class Program {

    public static void main(String[] args) {
        StorageFacility unit = new StorageFacility();
        unit.add("a111", "mouse");
        unit.remove("a111", "mouse");
        System.out.println(unit.storageUnits());
    }
}

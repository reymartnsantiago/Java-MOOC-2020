
public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("mon") || string.matches("tue") || string.matches("wed") || string.matches("thu") || string.matches("fri") || string.matches("sat") || string.matches("sun");

    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]+");
    }
    
    public boolean timeOfDay(String string){
        return string.matches("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
    }
}

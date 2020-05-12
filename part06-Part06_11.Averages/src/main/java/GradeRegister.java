
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
private ArrayList<Integer> scoreExam;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.scoreExam = new ArrayList<>();
        
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.scoreExam.add(points);
    }
    public double averageOfPoints(){
        double total=0;
       if(scoreExam.isEmpty()){
           return -1;
       }
       for(int x:scoreExam){
           total+=x;
       }
       return total/scoreExam.size()*1.0;
               
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades(){
        double total=0;
       if(grades.isEmpty()){
           return -1;
       }
        for(int x:grades){
            total+=x;
        }
        return total/grades.size()*1.0;
    }
}


package activity.cc3;
import java.text.DecimalFormat;

public class ShowStudent {
    static DecimalFormat df = new DecimalFormat(" "); 

    private double Student;
    
    public ShowStudent(double Student) {
        
        this.Student = Student;
        
    }
    
    public void setStudent(double Student) {
        
        this.Student = Student;
        
    }
    
    public double getStudent() {
        
        return Student;
        
    }
    
    public static void main(String[] args) {
        
        ShowStudent idnumber = new ShowStudent(165213232);
        ShowStudent credithour = new ShowStudent(4.0);
        ShowStudent pointsearned = new ShowStudent(30);
        
        System.out.println("ID number: " + df.format(idnumber.getStudent()) + 
                "\nCredit hours: " + credithour.getStudent() + 
                "\nPoints earned: " + pointsearned.getStudent() + 
                "\nGrade Point Average(GPA): " + 
                gradePointAverage(credithour.getStudent(), 
                pointsearned.getStudent()));
        
       
    }
    
    public static double gradePointAverage(double x, double y) {
        
        ShowStudent gpa = new ShowStudent(y / x);
        
        return gpa.getStudent();
        
    }
    
}

    


package week7.workshop.week8.week9.week10;


/**
 * Write a description of class Doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends person
{
    private String specialization;
    private double consultationFee;


    public Doctor(int id, String name, String specialization, double consultationFee) {
        super(id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + consultationFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Salary: " + calculateSalary();
    }
}

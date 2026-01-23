public class TemporaryEmployee extends  Employee{
    private String workingHours;

    public TemporaryEmployee(String name, String surname, String work, Double salary, String workingHours) {
        super(name, surname, work, salary);
        this.workingHours = workingHours;
    }

    public String getworkingHours() {
        return workingHours;
    }

    public void setworkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getDeteil(){
        return super.getDeteil()+" "+ workingHours;
    }
}

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

    @Override
    public String getEmployeeType() {
        return "Temporary";
    }

    @Override
    public Double getOneTimeBonus() {
        return 0.0;
    }

    @Override
    public Double getPensiya() {
        return 0.0;
    }

    @Override
    public Double getInsurance() {
        return 0.0;
    }
}

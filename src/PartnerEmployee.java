public class PartnerEmployee extends  Employee{
    private String companName;

    public PartnerEmployee(String name, String surname, String work, Double salary, String companName) {
        super(name, surname, work, salary);
        this.companName = companName;
    }

    public String getCompanName() {
        return companName;
    }

    public void setCompanName(String companName) {
        this.companName = companName;
    }

    @Override
    public Double getOneTimeBonus() {
        return super.getSalary()*0.75;
    }

    @Override
    public Double getPensiya() {
        return 0.0;
    }

    @Override
    public Double getInsurance() {
        return 0.0;
    }

    @Override
    public String getEmployeeType() {
        return "Partner";
    }
}

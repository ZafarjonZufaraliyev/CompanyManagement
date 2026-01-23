public class EarEmployee extends Employee{

    public EarEmployee(String name, String surname, String work, Double salary) {
        super(name, surname, work, salary);
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary()*0.01;
    }

    @Override
    public Double getPensiya() {
        return getSalary()*0.01;
    }

    @Override
    public Double getInsurance() {
        return getSalary()*0.01;
    }

    @Override
    public String getEmployeeType() {
        return "Quloq";
    }
}

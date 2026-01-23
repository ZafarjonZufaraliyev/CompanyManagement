public class Employee {
    private String name;
    private String surname;
    private String work;
    private Double salary;

    public Employee(String name, String surname, String work, Double salary) {
        this.name = name;
        this.surname = surname;
        this.work = work;
        this.salary = salary;
    }
    public String getDeteil(){
        return  name + " " +surname + " " +work + " " +salary;
    }
    public String getEmployeeType(){
        return "Employe";
    }
    public Double getPensiya(){
        return 0.0;
    }
    public Double getInsurance(){
        return 0.0;
    }
    public Double getOneTimeBonus(){
        return 0.0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work='" + work + '\'' +
                ", salary=" + salary +
                "";
    }
}

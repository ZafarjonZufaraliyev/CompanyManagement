public class SeasonalEmployee  extends  Employee{
    private String season;

    public SeasonalEmployee(String name, String surname, String work, Double salary, String season) {
        super(name, surname, work, salary);
        this.season = season;
    }

    public String getseason() {
        return season;
    }

    public void setseason(String season) {
        this.season = season;
    }

    public String getDeteil(){
        return super.getDeteil()+" "+season;
    }

    @Override
    public String getEmployeeType() {
        return "Seasonal";
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary()*0.2;
    }

    public Double getPensiya() {
        return getSalary() *0.065;
    }
}

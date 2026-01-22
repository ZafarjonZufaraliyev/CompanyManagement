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

    @Override
    public String toString() {
        return "SeasonalEmployee{ " +
                super.toString() +
                 "season='" + season + '\'' +
                '}';
    }
}

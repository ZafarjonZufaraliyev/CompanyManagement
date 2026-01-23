public class PermanentEmployee extends  Employee{
    private int room;

    public PermanentEmployee(String name, String surname, String work, Double salary, int room) {
        super(name, surname, work, salary);
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getDeteil(){
        return super.getDeteil()+" "+room;
    }
    @Override
    public String getEmployeeType() {
        return "Permanent";
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary()*0.5;
    }

    @Override
    public Double getPensiya() {
        return getSalary() *0.075;
    }
    public Double getInsurance(){
        return super.getSalary()*0.1;
    }


}


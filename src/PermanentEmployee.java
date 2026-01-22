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

    @Override
    public String toString() {
        return "PermanentEmployee{ " +
                super.toString() +
                "room=" + room +
                '}';
    }
}

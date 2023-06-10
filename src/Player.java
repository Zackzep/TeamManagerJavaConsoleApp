public class Player {
    private String _firstName;
    private String _lastName;
    private String _number;

    public Player(String firstName, String lastName, String number){
        _firstName = firstName;
        _lastName = lastName;
        _number = number;
    }

    public String getFirstName() { return _firstName; }
    public void setFirstName(String firstName) { _firstName = firstName; }
    public String getLastName() { return _lastName; }
    public void setLastName(String lastName) { _lastName = lastName; }
    public String getNumber() { return _number; }
    public void setNumber(String number) { _number = number; }

    public String toString() {
        return _firstName + " " + _lastName + " " + _number;
    }
}

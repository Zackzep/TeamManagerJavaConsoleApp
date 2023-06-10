import java.util.ArrayList;

public class Team {
    private String _city;
    private String _name;
    private ArrayList<Player> _players;

    public Team(String city, String name){
        _city = city;
        _name = name;
        _players = new ArrayList<>();
    }
    public String getCity() { return _city; }
    public void setCity(String city) { _city = city; }
    public String getName() { return _name; }
    public void setName(String name) { _name = name; }
    public ArrayList<Player> getPlayer() {
        return _players;
    }

    public void addPlayer(Player player){
        _players.add(player);
    }

    public String toString() {
        return _city + " " + _name;
    }

}

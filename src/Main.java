import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Team> teams = new ArrayList<>();
    public static void main(String[] args) {

        switchMethod();
    }
    public static void switchMethod(){
        boolean isRunning = true;
        do{
            System.out.println("Welcome to Team Manager");
            System.out.println("Select an Option");
            System.out.println("1 - List Teams and Players");
            System.out.println("2 - Add a Team");
            System.out.println("3 - Add a Player");

            String userInput = scanner.nextLine();
            switch (userInput){
                case "1":


                    for (Team team:
                         teams) {
                        System.out.println(team.toString());
                        System.out.println(team.getPlayer().toString());
                    }
                    break;
                case "2":
                    System.out.println("Please Enter Name");
                    String name = scanner.nextLine();
                    System.out.println("Please Enter City");
                    String city = scanner.nextLine();
                    Team newTeam = new Team(name, city);
                    teams.add(newTeam);

                    break;
                case "3":
                    System.out.println("Please Enter First Name");
                    String fName = scanner.nextLine();

                    System.out.println("Please Enter Last Name");
                    String lName = scanner.nextLine();

                    System.out.println("Please Enter Number");
                    String number = scanner.nextLine();

                    System.out.println("Please Select a Team");

                    for (int i = 0; i < teams.size(); i++) {
                        System.out.println(i + " " + teams.get(i));
                    }

                    int team = scanner.nextInt();
                    Team selectedTeam = teams.get(team);

                    Player player = new Player(fName, lName, number);
                    selectedTeam.addPlayer(player);

                    break;
                default:
                    System.out.println("Please select from the list of options");
                    break;
            }
        }
        while(isRunning);
    }
}

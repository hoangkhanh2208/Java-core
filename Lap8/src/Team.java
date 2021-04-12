import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player> listAllPlayers;
    ArrayList<Player> buildTeams;

    public List<Player> addListAllPlayer() {
        listAllPlayers = new ArrayList<Player>();

        listAllPlayers.add(new Player("Marc-André ter Stegen", Position.GK, 1));
        listAllPlayers.add(new Player("Sergiño Dest", Position.DF, 2));
        listAllPlayers.add(new Player("Gerard Piqué", Position.DF, 3));
        listAllPlayers.add(new Player("Ronald Araújo", Position.DF, 4));
        listAllPlayers.add(new Player("Sergio Busquets", Position.MF, 5));
        listAllPlayers.add(new Player("Antoine Griezmann", Position.FW, 6));
        listAllPlayers.add(new Player("Miralem Pjanić", Position.MF, 7));
        listAllPlayers.add(new Player("Martin Braithwaite", Position.FW, 8));
        listAllPlayers.add(new Player("Lionel Messi", Position.FW, 9));
        listAllPlayers.add(new Player("Ousmane Dembélé", Position.FW, 10));
        listAllPlayers.add(new Player("Riqui Puig", Position.MF, 11));
        listAllPlayers.add(new Player("Neto", Position.GK, 12));
        listAllPlayers.add(new Player("Clément Lenglet", Position.DF, 13));
        listAllPlayers.add(new Player("Pedri", Position.MF, 14));
        listAllPlayers.add(new Player("Francisco Trincão", Position.FW, 15));
        listAllPlayers.add(new Player("Jordi Alba", Position.DF, 16));
        listAllPlayers.add(new Player("Sergi Roberto", Position.MF, 17));
        listAllPlayers.add(new Player("Frenkie de Jong", Position.DF, 18));
        listAllPlayers.add(new Player("Ansu Fati", Position.MF, 19));
        listAllPlayers.add(new Player("Samuel Umtiti", Position.FW, 20));
        listAllPlayers.add(new Player("Junior Firpo", Position.DF, 21));
        listAllPlayers.add(new Player("Matheus Fernandes", Position.DF, 22));

        getList(listAllPlayers);
        return listAllPlayers;
    }
    
    public List<Player> buildTeam(int defender, int midField, int forwarder) {
        buildTeams = new ArrayList<Player>();
        Random random = new Random();
        
        final int GOAL_KEEPER = 1;
        int thuMon = 0;
        int hauVe = 0;
        int trungVe = 0;
        int tienDao = 0;

        System.out.println("\n\nDanh sách đội bóng: ");

        thuMon = extractPosition(GOAL_KEEPER, random, thuMon, Position.GK);

        hauVe = extractPosition(defender, random, hauVe, Position.DF);
        
        trungVe = extractPosition(midField, random, trungVe, Position.MF);

        tienDao = extractPosition(forwarder, random, tienDao, Position.FW);

        getList(buildTeams);
        return buildTeams;
    }

    private int extractPosition(int signPosition, Random random, int position , Position enumPosition) {
        while (position  < signPosition) {
            int rdPosition = random.nextInt(22);
            if (isPlayer(rdPosition, enumPosition)) {
                buildTeams.add(listAllPlayers.get(rdPosition));
                position++;
            }
        }
        return position;
    }

    private void getList(List <Player> players) {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    private boolean isPlayer(int rdPosition, Position position) {
        return listAllPlayers.get(rdPosition).getPosition().equals(position)
                && !buildTeams.contains(listAllPlayers.get(rdPosition));
    }
    
    
    
    
}

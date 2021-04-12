import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player> listAllPlayers;
    ArrayList<Player> buildTeams;

    public List<Player> getGetAllPlayer() {
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

        for (Player player : listAllPlayers) {
            System.out.println(player.toString());
        }
        return listAllPlayers;
    }
    
    public List<Player> buildTeam(int df, int mf, int fw) {
        buildTeams = new ArrayList<Player>();

        Random random = new Random();

        int thuMon = 0;
        int hauVe = 0;
        int trungVe = 0;
        int tienDao = 0;

        System.out.println("\n\nDanh sách đội bóng: ");

        while (thuMon < 1) {
            int rdThuMon = random.nextInt(22);
            if (listAllPlayers.get(rdThuMon).getPosition().equals(Position.GK)) {
                buildTeams.add(listAllPlayers.get(rdThuMon));
                thuMon++;
            }
        }

        while (hauVe < df) {
            int rdHauVe = random.nextInt(22);
            if (listAllPlayers.get(rdHauVe).getPosition().equals(Position.DF)
                    && !buildTeams.contains(listAllPlayers.get(rdHauVe))) {
                buildTeams.add(listAllPlayers.get(rdHauVe));
                hauVe++;
            }
        }

        while (trungVe < mf) {
            int rdTrungVe = random.nextInt(22);
            if (listAllPlayers.get(rdTrungVe).getPosition().equals(Position.MF)
                    && !buildTeams.contains(listAllPlayers.get(rdTrungVe))) {
                buildTeams.add(listAllPlayers.get(rdTrungVe));
                trungVe++;
            }
        }

        while (tienDao < fw) {
            int rdTienDao = random.nextInt(22);
            if (listAllPlayers.get(rdTienDao).getPosition().equals(Position.FW)
                    && !buildTeams.contains(listAllPlayers.get(rdTienDao))) {
                buildTeams.add(listAllPlayers.get(rdTienDao));
                tienDao++;
            }
        }

         for (Player player : buildTeams) {
            System.out.println(player);
        }
        return buildTeams;
    }
    
    
}

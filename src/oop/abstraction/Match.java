
public class Match{
    public static void main(string[] args){
        Sports sports = new Soccer();

        sports.materials();
		sports.teams();
		sports.players();
		sports.time();
		sports.tieRules();

        Referee referee = new Soccer();
        referee.referee();
    }
}
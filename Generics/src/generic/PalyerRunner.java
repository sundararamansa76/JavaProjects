package generic;

public class PalyerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootBallPlayer Krsna = new FootBallPlayer("Krsna");
		BaseBallPlayer Rama = new BaseBallPlayer("Balram");
		SockerPlayer Hare = new SockerPlayer("Hare");
		
		Team<FootBallPlayer> krsnasTeam = new Team<>("Hare Krsna");
		krsnasTeam.addPlayer(Krsna);
		//krsnasTeam.addPlayer(Rama);
		//krsnasTeam.addPlayer(Hare);
		
		Team<BaseBallPlayer> ramasTeam = new Team<> ("Hare Rama");
		ramasTeam.addPlayer(Rama);
		Team<SockerPlayer> haresTeam = new Team<> ("Hare Hare");
		haresTeam.addPlayer(Hare);
		System.out.println(krsnasTeam.numPlayers());
		
		Team<FootBallPlayer> foot1 = new Team<FootBallPlayer>("Foot1");
		Team<FootBallPlayer> foot2 = new Team<FootBallPlayer>("Foot2");
		Team<FootBallPlayer> foot3 = new Team<FootBallPlayer>("Foot3");
		foot1.matchResult(foot2, 1, 0);
		foot1.matchResult(foot3, 3, 8);
		krsnasTeam.matchResult(foot3, 2, 1);
	}

}

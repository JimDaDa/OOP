import java.util.*;
public class TestClub{
	public static void main (String[] args){
		Club s = new Club("Cao Nguyen Ky Duyen",5,3,2);
		
		System.out.println("Name:"+s.getName());
		System.out.println("Wins:"+s.getWins());
		System.out.println("Lose:"+s.getLosses());
		System.out.println("Draws:"+s.getDraws());
		System.out.println("number MatchesPlayed:"+s.numMatchesPlayed());
		System.out.println("Finish(1.Yes or 0.No )"+s.isFinish());
		System.out.println("Points:"+s.getPoint());
	}
}
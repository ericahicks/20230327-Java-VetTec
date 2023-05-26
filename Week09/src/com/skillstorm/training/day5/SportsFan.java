package com.skillstorm.training.day5;

import java.util.LinkedList;

public class SportsFan {
	String team;
	public SportsFan() { this.team = "Phillies";}
	public SportsFan(String team) { this.team = team; }
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	/*
	 * What does this code do?
	 */
	public static int countTeamFans(LinkedList<SportsFan> fans, String team) { 
		if (fans == null || fans.isEmpty())
			return 0;
		else {
			SportsFan fan = fans.remove();
			if (fan.getTeam().equals(team))
				return 1 + countTeamFans(fans, team);
			else
				return countTeamFans(fans, team);
		}
	}
	
	public static void main(String[] args) {
		SportsFan fanA = new SportsFan("Astros");
		SportsFan fan = new SportsFan();
		SportsFan fan1 = new SportsFan();
		SportsFan fanA0 = new SportsFan("Astros");
		SportsFan fan2 = new SportsFan();
		SportsFan fanA1 = new SportsFan("Astros");
		SportsFan fanA2 = new SportsFan("Astros");
		SportsFan fanA3 = new SportsFan("Astros");
		SportsFan fan3 = new SportsFan();
		SportsFan fanA4 = new SportsFan("Astros");
		SportsFan fanA5 = new SportsFan("Astros");
		SportsFan fan4 = new SportsFan();
		SportsFan fan5 = new SportsFan();
		SportsFan fan6 = new SportsFan();
		SportsFan fan7 = new SportsFan();
		LinkedList<SportsFan> fans = new LinkedList<>();
		fans.add(fanA);
		fans.add(fan);
		fans.add(fan1);
		fans.add(fan2);
		fans.add(fanA0);
		fans.add(fan3);
		fans.add(fanA1);
		fans.add(fanA2);
		fans.add(fanA3);
		fans.add(fan4);
		fans.add(fan5);
		fans.add(fan6);
		fans.add(fanA4);
		fans.add(fanA5);
		fans.add(fan7);
		System.out.println("Phillies fans: " + countTeamFans(new LinkedList<SportsFan>(fans), "Phillies"));
		System.out.println("Astros fans: " + countTeamFans(new LinkedList<SportsFan>(fans), "Astros"));
		
	}
}




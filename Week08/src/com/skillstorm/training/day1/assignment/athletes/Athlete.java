package com.skillstorm.training.day1.assignment.athletes;

import java.util.Objects;
// Make Athlete comparable
// Step 1: implment Comparable
// Step 2: override the method compareTo
public class Athlete implements Comparable<Athlete> {
	
	private String name;
	private int wins;
	private int losses;
	
	public Athlete(String name, int wins, int losses) {
		super();
		this.name = name;
		this.wins = wins;
		this.losses = losses;
	}
	// This is a javadoc comment
	// It starts with /** and lets me export just these comments for my user documentation
	// To generate the documentation in spring tool suite, use Project>Generate Javadocs 
	//    select which packages you want to generate user documentation for
	//    select if you only want public fields or also protected or also package private or also private
	//    select where you want the documentation to be saved (default is at the project root level)
	//    select Finish
	// To see the user documentation, you can go under the doc folder and right click the Athlete.html file
	//    to select Open with Browser
	// To update the doc just edit your /** */ comments and rerun the Project>Generate Javadocs command
	// Reopen the Athlete.html file or select Refresh in your browser to see the updates.
	/**
	 * this is a useful method. It is brilliant!
	 * this throws an null pointer if the athlete o is null
	 * @param o is an Athlete to compare to
	 * @return a negative integer if this Athlete has a higher win rate than the other
	 *          a positive integer if this Athlete has a lower win rate than the other
	 *          zero if this Athlete has the same win rate as the other athlete
	 */
	@Override
	public int compareTo(Athlete o) {
		// If either this player or the other player has not played 30 games, 
		if (!isVeteran() || !isVeteran())
			return wins - o.wins; // then compare # wins not winrate
		// only veteran players with >= 30 games played are compared with win rate
		return (int) ((o.winRate() - this.winRate()) * 100); // Ex: 0.9 and 0.5 becomes 40
	}
	
//	@Override
//	public int compareTo(Athlete o) {
//		if (winRate() == o.winRate())
//			return this.wins - o.wins;
//		return (int) ((this.winRate() - o.winRate()) * 100);
//	}
	
	// Helper method only used internally 
	private boolean isVeteran() {
		return wins + losses >= 30;
	}
	
	public double winRate() {                  // Make sure not to use int division
		return (double) wins / (wins + losses); // Ex: 1 / 2 = 0 or 1 / 1 = 1 or 0 / 0 = ArithmeticException etc. or 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}

	@Override
	public String toString() {
		return name + " has a win rate of " + winRate() + " with wins=" + wins + ", losses=" + losses;
	}
	@Override
	public int hashCode() {
		return Objects.hash(losses, name, wins);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Athlete other = (Athlete) obj;
		return losses == other.losses && Objects.equals(name, other.name)
				&& wins == other.wins;
	}
	

}

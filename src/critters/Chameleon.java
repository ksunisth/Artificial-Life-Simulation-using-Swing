package critters;

import java.awt.Color;

public class Chameleon extends Critter {

	private int count;
	public Chameleon () {
		this.count = -1;
	}
	public Action getMove (CritterInfo info) {
		return Action.HOP;
	}
	public Color getColor () {
		this.count++;
		if (this.count%2 == 0) {
			return Color.red;
		} else {
			return Color.black;
		}
		
	}
	public String toString () {
		return "@";
	}
	
}
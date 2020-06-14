package critters;

import java.awt.Color;

import critters.Critter.Neighbor;

public final class Husky extends Critter {

	private int count;
	public Husky () {
		this.count = -1;
	}
	public Action getMove (CritterInfo info) {
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return Action.LEFT;
		}
	}
	public Color getColor () {
		return Color.MAGENTA;
	}
	public String toString () {
		this.count++;
		if (this.count%2 == 0 ) {
			return "O.O";
		} else {
			return "-.-";
		}
			
	}
}
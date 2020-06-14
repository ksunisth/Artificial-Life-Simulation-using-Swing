package critters;

import java.awt.Color;

import critters.Critter.Neighbor;

public class Giant extends Critter {
	private int count;
	public Giant () {
		this.count = -1;
	}
	public Color getColor() {
		return Color.gray;
	}
	
	public Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;	
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return Action.RIGHT;
		}
	}
	public String toString () {
		this.count = this.count + 1;
		if (this.count%24 < 6) {
			return "fee";
			} else if (this.count%24 < 12) {
				return "fie";
			} else if (this.count%24 < 18) {
				return "foe";
			} else {
				return "fum";
			}
		
	}

}

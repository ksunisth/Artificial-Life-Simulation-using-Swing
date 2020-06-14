package critters;

import java.awt.Color;

import critters.Critter.Neighbor;

public class Lion extends Critter {
	private int count;
	private Color color;
	public Lion () {
		this.count = -1;
		
	}
	public String toString () {
		return "L";	
	}
	
	public Color getColor () {
		this.count = this.count + 1;
		if (this.count%3 == 0) {
			double temp = Math.random();
			if (temp < (0.333)) {
				this.color = color.red;
				return Color.red;
			} else if (temp >= (0.333) && temp < 0.666) {
				this.color = color.green;
				return Color.green;
			} else {
				this.color = color.blue;
				return Color.blue;
			}
		} 
		else return this.color;
	}
	
	public Action getMove (CritterInfo info) {
		
		if (info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
			return Action.LEFT;
		} else if (info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		} else {
			return Action.HOP;
		}
		
	}

}

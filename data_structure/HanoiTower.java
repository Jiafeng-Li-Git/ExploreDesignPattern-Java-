package data_structure;

public class HanoiTower {
	
	public int move(int n, String towerFrom, String towerTo, String towerMid, int steps) {
		
		if(n==1) {
			System.out.println("Move item 1 from " + towerFrom + " to " + towerTo);
			return 1;
		} else {
			steps = steps + move(n-1, towerFrom, towerMid, towerTo, 0);
			System.out.println("Move item " + n + " from " + towerFrom + " to " + towerTo);
			steps = steps + 1 + move(n-1, towerMid, towerTo, towerFrom, 0);
		}
		return steps;
	}
}

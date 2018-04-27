package com.gontuseries.studentadmissioncontroller;

public class matchOpposite implements Strategy {

	@Override
	public int[] matchteams() {
		int[] matches = {1,8,2,7,3,6,4,5};
		return matches;
	}

}

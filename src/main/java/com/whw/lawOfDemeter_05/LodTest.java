package com.whw.lawOfDemeter_05;

public class LodTest {

	public static void main(String[] args) {
		TeamLeader teamLeader = new TeamLeader();
		Employ employ = new Employ();
		teamLeader.commondCheckNumber(employ);
	}
	
}

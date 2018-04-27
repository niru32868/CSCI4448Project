package com.gontuseries.studentadmissioncontroller;

public class StrategyInterface {
	private Strategy strategic; 
    public void setStrategy(Strategy strategy) {
    	this.strategic = strategy;
    }
    public int[] executeStrategy() {
    	return strategic.matchteams();
    }
}

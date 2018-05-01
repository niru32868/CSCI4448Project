package com.gontuseries.studentadmissioncontroller;
// help from https://refactoring.guru/design-patterns/strategy
public class StrategyInterface {
	private Strategy strategic; 
    public void setStrategy(Strategy strategy) {
    	this.strategic = strategy;
    }
    public int[] executeStrategy() {
    	return strategic.matchteams();
    }
}

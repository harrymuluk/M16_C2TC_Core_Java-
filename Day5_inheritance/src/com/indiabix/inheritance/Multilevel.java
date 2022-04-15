package com.indiabix.inheritance;

class Game{
	
	void Action()
	{
		System.out.println("Start");
	}	
}
class biggame extends Game{
	
	void Action1() {
		
		System.out.println("Stop");
	}
}
class smallgame extends biggame{
	
	void Action2() {
		
		System.out.println("Closed");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		smallgame g = new smallgame();
		g.Action();
		g.Action1();
		g.Action2();
		
	}

}

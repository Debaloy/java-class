class Player {
	private int no_of_players;
	Player(int n) {
		no_of_players = n;
	}

	public int getN() {
		return no_of_players;
	}
}

class Cricket_Player extends Player {
	Cricket_Player(int n) {
		super(n);
		System.out.println("Cricket Class Players: " + getN());
	}
}

class Football_Player extends Player {
	Football_Player(int n) {
		super(n);
		System.out.println("Football Class Players: " + getN());
	}
}

class Hockey_Player extends Player {
	Hockey_Player(int n) {
		super(n);
		System.out.println("Hockey Class Players: " + getN());
	}
}

class PlayersMain {
	public static void main(String args[]) {
		Cricket_Player c1 = new Cricket_Player(11);
		Football_Player f1 = new Football_Player(12);
		Hockey_Player h1 = new Hockey_Player(10);
	}
}

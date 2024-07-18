package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	private List<Player> players = new ArrayList<>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	// Use iterator to look for existing game with same player name
	// if found, simply return the existing player
	public Player addPlayer(String name) {
		Player player = null;
		
		Iterator<Player> playerIterator = players.iterator();
		while(playerIterator.hasNext()) {
			Player p = playerIterator.next();
			if (p.getName().equalsIgnoreCase(name)){
				player = p;
				break;
			}
		}
		// if not found, make a new player instance and add to list of players
		if (player == null){
			player = new Player(GameService.getInstance().getNextPlayerId(), name);
			players.add(player);
		}
		
		// return the new/existing player instance to the caller
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", players=" + players + "]";
	}
}

package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	private List<Team> teams = new ArrayList<>();

	public Game(long id, String name) {
		super(id, name);
	}

	// Use iterator to look for existing game with same team name
	// if found, simply return the existing team
	public Team addTeam(String name) {
		Team team = null;
		
		Iterator<Team> teamIterator = teams.iterator();
		while(teamIterator.hasNext()) {
			Team t = teamIterator.next();
			if(t.getName().equalsIgnoreCase(name)) {
				team = t;
				break;
			}
		}
		// if not found, make a new team instance and add to list of teams
		if (team == null) {
			team = new Team(GameService.getInstance().getNextTeamId(), name);
			teams.add(team);
		}
		
		// return the new/existing team instance to the caller
		return team;
	}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", teams=" + teams + "]";
	}

}

package edu.ycp.cs.cs496.locations.controllers;

import edu.ycp.cs.cs496.locations.model.SoberFriend;
import edu.ycp.cs.cs496.locations.model.Location;
import edu.ycp.cs.cs496.locations.model.persist.Database;
import edu.ycp.cs.cs496.locations.model.persist.IDatabase;

public class GetSoberFriendByName {

	public SoberFriend getFriend(String friendName) {
		IDatabase db = Database.getInstance();
		return db.getSoberFriend(friendName);
	}
	
}

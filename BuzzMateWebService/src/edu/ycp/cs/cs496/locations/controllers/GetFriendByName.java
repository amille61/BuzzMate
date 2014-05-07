package edu.ycp.cs.cs496.locations.controllers;

import edu.ycp.cs.cs496.locations.model.Friend;
import edu.ycp.cs.cs496.locations.model.Location;
import edu.ycp.cs.cs496.locations.model.persist.Database;
import edu.ycp.cs.cs496.locations.model.persist.IDatabase;

public class GetFriendByName {

	public Friend getFriend(String friendName) {
		IDatabase db = Database.getInstance();
		return db.getFriend(friendName);
	}
	
}

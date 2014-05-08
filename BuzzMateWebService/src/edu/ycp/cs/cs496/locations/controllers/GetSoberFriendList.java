package edu.ycp.cs.cs496.locations.controllers;

import java.util.List;

import edu.ycp.cs.cs496.locations.model.SoberFriend;
import edu.ycp.cs.cs496.locations.model.persist.Database;
import edu.ycp.cs.cs496.locations.model.persist.IDatabase;

public class GetSoberFriendList {
	public List <SoberFriend> getFriendList(){
		IDatabase database = Database.getInstance();
		return database.getSoberFriend();
	}
}

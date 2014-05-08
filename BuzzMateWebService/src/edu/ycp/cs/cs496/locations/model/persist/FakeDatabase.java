package edu.ycp.cs.cs496.locations.model.persist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import edu.ycp.cs.cs496.locations.controllers.User;
import edu.ycp.cs.cs496.locations.model.Cab;
import edu.ycp.cs.cs496.locations.model.SoberFriend;
import edu.ycp.cs.cs496.locations.model.Location;

public class FakeDatabase  implements IDatabase{
	private List<Location> locations;
	private List<Cab> cabs;
	private List<SoberFriend> soberFriends;
	private Map<Integer, User> userMap; // map of user ids to users
	private List <User> userList;
	
	public FakeDatabase(){
		locations = new ArrayList<Location>();
		cabs = new ArrayList<Cab>();
		soberFriends = new ArrayList<SoberFriend>();
		userList = new 	ArrayList<User>();
		userMap = new TreeMap<Integer, User>();
		//Sample Locations
		locations.add(new Location("BarName", "Bar", "123 Street", "York", "PA", "17403", "717-123-1234"));
		locations.add(new Location("Pizza", "Food", "456 Street", "York", "PA", "17403", "717-987-9876"));
		
		cabs.add(new Cab("CabService", "717-789-7894", "Only excepts Cash"));

		soberFriends.add(new SoberFriend("Sally", "717-456-7894", 'n', 0, 'y'));
		
		
		User user = new User();
		user.setId(-1);
		user.setUsername("alana");
		user.setPassword("palmerini");
		userMap.put(user.getId(), user);
		
		soberFriends.add(new SoberFriend(user.getUsername(), "717-123-4567", 'y', user.getId(), 'y'));
	
	}
	
	public Location getLocation(String locationName){
		for (Location location : locations){
			if(location.getName().equals(locationName)){
				return new Location(location.getName(), location.getType(), location.getStreet1(), location.getCity(), location.getState(), location.getMailcode(), location.getPhonenumber());
			}
		}
		
		return null;
	}
	
	
	public Cab getCab(String cabName){
		for (Cab cab : cabs){
			if(cab.getName().equals(cabName)){
				return new Cab(cab.getName(), cab.getPhonenumber(), cab.getNotes());
			}
		}
		
		return null;
	}
	
	
	@Override
	public List<Cab> getCab() {
		// return a copy
		return new ArrayList<Cab>(cabs);
	}

	@Override
	public void addUserToDB(User user) {
		userList.add(user);
	}

	@Override
	public Map<Integer, User> getUsersFromDB() {
		return userMap;
	}


	@Override
	public void addLocationToDB(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Location> getLocationFromDB(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Location> getLocationListFromDB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Location> getLocationByTypeFromDB(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoberFriend getSoberFriend(String friendName) {
		for (SoberFriend friend : soberFriends){
			if(friend.getName().equals(friendName)){
				return new SoberFriend(friend.getName(), friend.getPhonenumber(), friend.getIsUser(), friend.getUserID(), friend.getIsAvail());
			}
		}
		return null;
	}

	@Override
	public List<SoberFriend> getSoberFriend() {
		// TODO Auto-generated method stub
		return new ArrayList<SoberFriend>(soberFriends);
	}
}


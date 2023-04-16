package backendLogSingDemo.dataAccess.concretes;

import java.util.List;

import backendLogSingDemo.dataAccess.abstracts.UserDao;
import backendLogSingDemo.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("Added to databace " + user.getFirstName());
		
	}

	@Override
	public void deletUser(User user) {
		System.out.println("Deleted " + user.getEmail());
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("Update " + user.getFirstName()+ " " + user.getUserId());
		
	}

	@Override
	public User get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

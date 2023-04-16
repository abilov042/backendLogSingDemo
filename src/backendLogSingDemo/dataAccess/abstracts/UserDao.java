package backendLogSingDemo.dataAccess.abstracts;

import java.util.List;

import backendLogSingDemo.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void deletUser(User user);
	void updateUser(User user);
	User get(int userId);
	List<User> getAll();
	

}

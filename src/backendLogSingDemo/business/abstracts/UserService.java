package backendLogSingDemo.business.abstracts;

import java.util.List;

import backendLogSingDemo.entities.concretes.User;

public interface UserService {
		void register(User user);
		void login(User user);
		void deleteAccaount(User user);
		User getId(int userId);
		List<User> getAll();
}

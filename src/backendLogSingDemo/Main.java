package backendLogSingDemo;

import java.net.ServerSocket;

import backendLogSingDemo.business.abstracts.UserService;
import backendLogSingDemo.business.concretes.UserCheckManager;
import backendLogSingDemo.business.concretes.UserManager;
import backendLogSingDemo.dataAccess.concretes.DatabaseUserDao;
import backendLogSingDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Shamil", "Abilov", "shamilabilov@gmail.com", "sam123456");
		UserService service = new UserManager(new UserCheckManager(), new DatabaseUserDao());
		
		service.register(user);
		service.deleteAccaount(user);

	}

}

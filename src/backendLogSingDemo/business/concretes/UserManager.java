package backendLogSingDemo.business.concretes;

import java.util.List;

import backendLogSingDemo.business.abstracts.UserCheckServise;
import backendLogSingDemo.business.abstracts.UserService;
import backendLogSingDemo.dataAccess.abstracts.UserDao;
import backendLogSingDemo.entities.concretes.User;

public class UserManager implements UserService {
	private UserCheckServise userCheckServise;
	private UserDao userDao;
	

	public UserManager(UserCheckManager userCheckServise, UserDao userDao) {
		super();
		this.userCheckServise = userCheckServise;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if(userCheckServise.checkUserEmail(user) && userCheckServise.checkUserFullname(user) && userCheckServise.checkUserPasswors(user)) {
			System.out.println("Qeydiyyatdan kecdiniz hormetli " + user.getFirstName() + " " + user.getLastName());
			userDao.addUser(user);
		}
		else {
			System.out.println("Qeydiyyatdan kece bilmediz :(");
		}
		
	}

	@Override
	public void login(User user) {
		if(userCheckServise.checkUserEmail(user) && userCheckServise.checkUserPasswors(user)) {
			System.out.println("Ugurla girildi " + user.getEmail());
			userDao.addUser(user);
		}
		else {
			System.out.println("Parol ve yoxud email yanlisdi");
		}
	}

	@Override
	public void deleteAccaount(User user) {
		if(userCheckServise.checkUserEmail(user) && userCheckServise.checkUserPasswors(user)) {
			System.out.println("Seyfe silindi" + user.getFirstName() + " " + user.getLastName());
			userDao.deletUser(user);
		}
		else {
			System.out.println("Parol ve yoxud email yanlisdi");
		}
	}

	@Override
	public User getId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

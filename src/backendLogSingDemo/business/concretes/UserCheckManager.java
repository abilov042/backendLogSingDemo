package backendLogSingDemo.business.concretes;

import backendLogSingDemo.business.abstracts.UserCheckServise;
import backendLogSingDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckServise {

	@Override
	public boolean checkUserEmail(User user) {
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if(user.getEmail().matches(emailPattern) == true) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean checkUserPasswors(User user) {
		if(user.getPassword().length() < 6) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean checkUserFullname(User user) {
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			return false;
		}
		else {
			return true;
		}
		
	}

}

package backendLogSingDemo.business.abstracts;

import backendLogSingDemo.entities.concretes.User;

public interface UserCheckServise {
		boolean checkUserEmail(User user);
		boolean checkUserPasswors(User user);
		boolean checkUserFullname(User user);
}

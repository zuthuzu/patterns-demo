package ua.kpi.tef.zu.creation.builder;

/**
 * Created by Anton Domin on 2020-03-18
 */
abstract class AbstractUserBuilder {
	User user;

	void createUser() {
		user = new User();
	}

	protected abstract void setLogin();
	protected abstract void setPassword();
	protected abstract void setRole();

	User build() {
		return user;
	}
}

class AdminBuilder extends AbstractUserBuilder {

	@Override
	protected void setLogin() {
		user.setLogin("admin");
	}

	@Override
	protected void setPassword() {
		user.setPassword("admin");
	}

	@Override
	protected void setRole() {
		user.setRole(UserRoles.ADMIN);
	}
}

class DummyBuilder extends AbstractUserBuilder {

	@Override
	protected void setLogin() {
		user.setLogin("dummy");
	}

	@Override
	protected void setPassword() {
		user.setPassword("qwerty");
	}

	@Override
	protected void setRole() {
		user.setRole(UserRoles.USER);
	}
}
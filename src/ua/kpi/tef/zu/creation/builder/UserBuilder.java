package ua.kpi.tef.zu.creation.builder;

/**
 * Created by Anton Domin on 2020-03-18
 */
class UserBuilder {
	String login;
	String password;
	UserRoles role;

	public UserBuilder setLogin(String login) {
		this.login = login;
		return this;
	}

	public UserBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public UserBuilder setRole(UserRoles role) {
		this.role = role;
		return this;
	}

	public User build() {
		User newUser = new User();
		newUser.setLogin(login);
		newUser.setPassword(password);
		newUser.setRole(role);
		return newUser;
	}
}

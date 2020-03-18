package ua.kpi.tef.zu.creation.builder;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class User {
	private String login;
	private String password;
	private UserRoles role;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRoles getRole() {
		return role;
	}

	public void setRole(UserRoles role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", password='" + password + '\'' +
				", role=" + role +
				'}';
	}
}

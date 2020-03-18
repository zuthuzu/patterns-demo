package ua.kpi.tef.zu.creation.builder;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class UserDirector {
	AbstractUserBuilder builder;

	public void setBuilder(AbstractUserBuilder builder) {
		this.builder = builder;
	}

	User buildUser() {
		builder.createUser();
		builder.setLogin();
		builder.setPassword();
		builder.setRole();
		return builder.build();
	}
}

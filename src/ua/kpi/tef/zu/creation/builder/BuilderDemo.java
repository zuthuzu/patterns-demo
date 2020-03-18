package ua.kpi.tef.zu.creation.builder;

/**
 * Created by Anton Domin on 2020-03-18
 */
public class BuilderDemo {

	public static void main(String[] args) {
		User user = new UserBuilder().setLogin("admin").setPassword("123").setRole(UserRoles.ADMIN).build();
		System.out.println(user);

		UserDirector builder = new UserDirector();
		builder.setBuilder(new DummyBuilder());
		user = builder.buildUser();
		System.out.println(user);
	}
}

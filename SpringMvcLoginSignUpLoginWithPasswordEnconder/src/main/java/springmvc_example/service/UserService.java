package springmvc_example.service;

import java.util.List;

import springmvc_example.model.UserInfo;

public interface UserService {


	public List<UserInfo> list();

	public UserInfo findUserByUsername(String username);

	public void update(String username, String paassword);

	public void add(String username, String password);

	public boolean userExists(String username);
}

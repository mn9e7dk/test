
public class test {
	public static void main(String[] args){
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro","123");
		dao.selectAll();
		dao.selectByName("taro");
		dao.selectByPassword("123");
		dao.updateUserNameByUserName("taro","suburo");
		dao.insert(4, "shiro","012");
		dao.delete("jiro");
	}

}

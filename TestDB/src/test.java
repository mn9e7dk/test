
public class test {
	public static void main(String[] args){
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro","123");
		dao.selectAll();
		dao.selectByName("taro");
	}

}

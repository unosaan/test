
public class CheckLoadJDBC {

	
	public static void main(String[] args) throws
	InstantiationException,IllegalAccessException{
		String msg="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバーのロードに失敗しました";
		}catch(ClassNotFoundException e){
			msg="ドライバーのロードに成功しました";
		}
		
		System.out.println(msg);
		

	}

}

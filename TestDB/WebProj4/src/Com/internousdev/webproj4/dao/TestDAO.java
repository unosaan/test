package Com.internousdev.webproj4.dao;

import Com.internousdev.webproj4.dto.LoginDTO;
import Com.internousdev.webproj4.util.DBConnector;

public class TestDAO {

	public List<LoginDTO> loginDTOList=new ArrayList<LoginDTO>();

	public int insert(String username,String password){
		int ret=0;
		DBConnector db=new DBConnector();
		Connectiom con=db.getConnection();

		String sql="insert into users(user_name,password)value(?,?)";
	try{PreparedStatemsnt ps=con.prepareStatement(sql);
	ps.setString(1,username);
	ps.setString(2,password);
	int i=ps.executeUpdate();
	if(i>0){
		System.out.println(i+"件登録されました");
		ret=i;
	}
	}catch (SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return ret;
	}

	public  List<LoginDTO>select(String username,String password){

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select * from users where user_name=? and password=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();

			while (rs.next()){
				LoginDTO dto=new LoginDTO();

				dto.setUsername(rs.getDtring("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}
		}
	}

}
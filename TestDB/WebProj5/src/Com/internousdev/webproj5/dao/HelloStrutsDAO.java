package Com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Com.internousdev.webproj5.dto.HelloStrutsDTO;
import Com.internousdev.webproj5.util.DBConnector;

public class HelloStrutsDAO {
	List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();
	
	public List<HelloStrutsDTO> select(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		
		String sql="select * from users";
		
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			
		}
	}

}

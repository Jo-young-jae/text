package kh.web.beans;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kh.web.dbutils.DBUtils;

public class PersonDAO {
	public int insertNewMember(String name, String email) throws Exception{
		Connection con = DBUtils.getConnection();
		String sql = "insert into person values(person_id_seq,?,?)";
		PreparedStatement pstat = con.prepareStatement(sql);
		pstat.setString(1, name);
		pstat.setString(2, email);
		int result = pstat.executeUpdate();
		
		pstat.close();
		con.commit();
		con.close();
		return result;
	}
	public List<PersonDTO> selectData() throws Exception {
		Connection con = DBUtils.getConnection();
		String sql = "select * from person";
		PreparedStatement pstat = con.prepareStatement(sql);
		
		
		ResultSet rs = pstat.executeQuery();

		List<PersonDTO> result = new ArrayList<>();
		while(rs.next()) {
			PersonDTO dto = new PersonDTO();
			dto.setId(rs.getInt("id"));
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			result.add(dto);
		}
		rs.close();
		pstat.close();
		con.close();
		return result;
	}
}

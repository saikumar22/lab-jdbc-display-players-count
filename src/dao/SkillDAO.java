package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public TreeMap<Integer,Skill> skillCount() throws Exception{
		Connection con = ConnectionManager.getConnection();
		Statement st=  con.createStatement();
		TreeMap<Integer,Skill>map = new TreeMap<Integer,Skill>();
		
		String sql="select * from player";
		ResultSet rs = st.executeQuery(sql);
		
		int english = 0;
		int telugu = 0;
		int hindi = 0;
		
		while(rs.next()) {
			
			if(rs.getLong(4)==1) {
				System.out.println("t1"+rs.getLong(4));
				hindi++;
			}
			else if(rs.getLong(4)==2) {
				System.out.println("t2"+rs.getLong(4));
				telugu++;
			}
			else if(rs.getLong(4)==3) {
				System.out.println("t3"+rs.getLong(4));
				english++;
			}
		}
		Skill s1= new Skill(1,"english");
		Skill s2= new Skill(2,"telugu");
		Skill s3= new Skill(3,"hindi");
		
		map.put(english, s1);
		map.put(telugu, s2);
		map.put(hindi, s3);	
		return map;
	}
}

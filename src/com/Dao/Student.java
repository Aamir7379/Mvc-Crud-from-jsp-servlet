package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Bean.User;
import com.Connection.DbConnection;

public class Student {
public void Insert(User user) {
	Connection con=null;
	try {
		con=DbConnection.get_Connection();
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?,?,?,?,(select SYSDATE() from dual))");
		ps.setInt(1,0);
		ps.setString(2,user.getName());
		ps.setString(3,user.getAddress());
		ps.setString(4,user.getDob());
		ps.setString(5,user.getCourse());
		ps.executeUpdate();
	}
	catch (Exception e) {
	e.printStackTrace();
	}
}
}

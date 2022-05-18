package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.Visitor;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {

	
public Visitor saveVisitor(Visitor visitor) {
	
	
	Connection connection=ConnectionObject.getConnection();
	String sql="INSERT INTO visitor VALUES(?,?,?,?,?,?)";
	
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, visitor.getId());
		preparedStatement.setString(2, visitor.getName());
		preparedStatement.setString(3, visitor.getEmail());
		preparedStatement.setString(5,visitor.getGender());
		preparedStatement.setString(4,visitor.getPhone());
		preparedStatement.setInt(6,visitor.getAge());

		
		preparedStatement.execute();
		connection.close();
		System.out.println("All good");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	return null;
}
}

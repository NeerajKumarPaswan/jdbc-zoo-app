package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.zoo.dto.User;
import com.ty.zoo.util.ConnectionObject;

public class UserDao {
	
	public User saveUser(User user) {
		String sql="INSERT INTO user VALUES(?,?,?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
	
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
			preparedStatement.setInt(1,user.getId());
			preparedStatement.setString(2,user.getName());
			preparedStatement.setString(3,user.getEmail());
            preparedStatement.setString(4,user.getPassword());
			preparedStatement.setString(5,user.getRole());
			preparedStatement.setString(6,user.getPhone());
			
			preparedStatement.execute();
			
			connection.close();
			System.out.println("All good");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}

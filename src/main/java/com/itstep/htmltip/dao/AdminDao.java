package com.itstep.htmltip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itstep.htmltip.entity.Admin;
import com.itstep.htmltip.utils.ConnectionUtil;

public class AdminDao {
	public static int save(Admin admin) {
		Connection connect = ConnectionUtil.getConnection();
		int status = 0;
		if (connect != null) {
			String sql = "INSERT INTO tbl_admin(username, password) VALUES(?, ?)";
			PreparedStatement statement;
			try {
				statement = connect.prepareStatement(sql);
				statement.setString(1, admin.getUsername());
				statement.setString(2, admin.getPassword());
				
				status = statement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return status;
	}
	
	public static Admin auth(Admin admin) {
		Connection connect = ConnectionUtil.getConnection();
		Admin found = null;
		if (connect != null) {
			String sql = "SELECT * FROM tbl_admin WHERE username=? AND password=?";
			PreparedStatement statement;
			
			try {
				statement = connect.prepareStatement(sql);
				statement.setString(1, admin.getUsername());
				statement.setString(2, admin.getPassword());
				
				ResultSet rs = statement.executeQuery();
				if (rs.next()) {
					found = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return found;
	}
	
	public static boolean adminExist() {
		Connection connect = ConnectionUtil.getConnection();
		Admin found = null;
		if (connect != null) {
			String sql = "SELECT * FROM tbl_admin";
			PreparedStatement statement;
			
			try {
				statement = connect.prepareStatement(sql);
				ResultSet rs = statement.executeQuery();
				if (rs.next()) {
					found = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return found != null;
	}
}

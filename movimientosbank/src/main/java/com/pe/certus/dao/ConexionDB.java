package com.pe.certus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionDB {

	private static final String usuario = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/eurekabank";
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	public static Connection getConexion() {
		Connection conn = null;
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexión establecida con éxito.");
		} catch (Exception e) {
			System.out.println("Error al establecer conexión: " + e.getMessage());
			e.printStackTrace();
			conn = null;
		}
		return conn;
	}
	
	public static void closeConexion(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void closePreparedStatement(PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	public static void closeCallableStatement(CallableStatement cs) {
		try {
			if (cs != null) {
				cs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

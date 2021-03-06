package ejemplo_preparedSt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion= DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso?useSSL=false","alumnos","java123");
		Statement st =conexion.createStatement();
		
		
		PreparedStatement preStInsert= conexion.prepareStatement("INSERT INTO alumnos(idalumno,nombre,apellido,apellidoMaterno)"
				+ "VALUES(?,?,?,?)");
		
		preStInsert.setInt(1, 29);
		preStInsert.setString(2, "james");
		preStInsert.setString(3, "Gosling");
		preStInsert.setString(4, "lion");
		int resultpInsert=preStInsert.executeUpdate();
		System.out.println(resultpInsert);
		
		PreparedStatement preStSelect=conexion.prepareStatement("SELECT * FROM alumnos");
		
		ResultSet rs=preStSelect.executeQuery();
		
		
	}
	
}

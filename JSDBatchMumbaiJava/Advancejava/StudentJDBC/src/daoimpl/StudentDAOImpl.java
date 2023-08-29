package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Helpher;
import com.dao.StudentDAO;
import com.entity.Student;

public class StudentDAOImpl implements StudentDAO{

	Scanner sc = new Scanner(System.in);
	@Override
	public boolean addStudent(Student student) {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			String s = "insert into Student(sid,sname,semail,saddress,sedu,sphone) values (?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(s);
		stmt.setInt(1,student.getSid());
		stmt.setString(2, student.getSname());
		stmt.setString(3, student.getSemail());
		stmt.setString(4, student.getSaddr());
		stmt.setString(5, student.getSeduc());
		stmt.setLong(6, student.getSphone());
		
		stmt.execute();
		result = true;
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean updateStudent() {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			System.out.println("Enter id");
			 int sid = sc.nextInt();
			 System.out.println("Enter phone");
			 long sphone = sc.nextLong();
			String s2= "Update Student set sphone='"+sphone+"' "+" where sid='"+sid+"' ";
			PreparedStatement stmt = connection.prepareStatement(s2);
			stmt.executeUpdate();
			
			result = true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean deleteStudent() {
		boolean result = false;
		try {
			Connection connection = Helpher.createConnection();
			System.out.println("Enter id");
			int sid = sc.nextInt();
			String s3 = "delete from Student where sid = '" +sid+ "'";
			PreparedStatement stmt = connection.prepareStatement(s3);
			stmt.executeUpdate();
			return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public void fetchStudentDetails() {
		try {
			Connection connection = Helpher.createConnection();
			Statement stmt = connection.createStatement();
			String s = "Select * from ecart.Student";
			ResultSet rs = stmt.executeQuery(s);
			
			while(rs.next()) {
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				String saddress = rs.getString(3);
				String semail = rs.getString(4);
				long sphone = rs.getLong(6);
				String sedu = rs.getString(5);
				System.out.println();
				
				System.out.println(sid + " " + sname + " " + semail + " " + saddress + " " + sphone + " " + sedu);
				}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
}

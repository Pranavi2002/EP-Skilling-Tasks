import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
public int studentInsert(StudentBean sb) throws SQLException, ClassNotFoundException {
	Connection con = DBUtil.DBConnection();;
	int reg = 0;
	String name = "";
	PreparedStatement ps = con.prepareStatement("insert into student_details values(?,?)");
	reg = sb.getRegno();
	name = sb.getName();
	ps.setInt(1,reg);
	ps.setString(2,name);
	if(name == "") 
		return -13;
	int i = ps.executeUpdate(); // returns number of inserted rows
	return i;
}
}

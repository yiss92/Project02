import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DayDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;

	private static final String DVN = "com.mysql.jdbc.Driver";
	private static final String DBU = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=euckr"";
	private static final String DB_ID = "root";
	private static final String DB_PW = "hanbit";

	public DayDao() {

		try {
			Class.forName(DVN);

			con = DriverManager.getConnection(DBU, DB_ID, DB_PW);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DayDao(Connection con, Statement stmt, PreparedStatement pstmt, ResultSet rs, String sql) {
		super();
		this.con = con;
		this.stmt = stmt;
		this.pstmt = pstmt;
		this.rs = rs;
		this.sql = sql;
	}

	public void insert(Today account) {

		// insert into todo(title, todo,location,described,year,month,
		// week,day,time,either)
		// values('abc','abcdefg','gfg','giw','2015','08','wed','27','12','am');
		try {
			System.out.println("test");
			String sql = "insert into todo(title, todo,location,described,year,month,"
					+ " week,day,time,either) values(?,?,?,?,?,?,?,?,?,?)";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, account.getTitle());
			pstmt.setString(2, account.getToDo());
			pstmt.setString(3, account.getLocation());
			pstmt.setString(4, account.getDescribed());
			pstmt.setString(5, account.getYear());
			pstmt.setString(6, account.getMonth());
			pstmt.setString(7, account.getWeek());
			pstmt.setString(8, account.getDay());
			pstmt.setString(9, account.getHours());
			pstmt.setString(10, account.getEither());
			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateTitle(Today account) {
		try {
			// update todo set title=? and todo=? location=? described=? year=?
			// month=? week=? day=? time=? eigher=? where acount=?
			sql = "update todo set title=?,todo=?,location=?,described=?,"
					+ "year=?,month=?,week=?,day=? where count=?";
			// "update todo set ?=? where ?=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, account.getTitle());
			pstmt.setString(2, account.getToDo());
			pstmt.setString(3, account.getLocation());
			pstmt.setString(4, account.getDescribed());
			pstmt.setString(5, account.getYear());
			pstmt.setString(6, account.getMonth());
			pstmt.setString(7, account.getWeek());
			pstmt.setString(8, account.getDay());
			pstmt.setInt(9, account.getCount());

			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// public void insert(Today account, int temp) {
	//
	// try {
	// String sql = "insert into todo(title)"
	// + " values(?)";
	//
	// pstmt = con.prepareStatement(sql);
	//
	// pstmt.setString(1, account.getTitle());
	//// pstmt.setString(2, account.getToDo());
	//// pstmt.setString(3, account.getLocation());
	//// pstmt.setString(4, account.getDescribed());
	//// pstmt.setString(5, account.getYear());
	//// pstmt.setString(6, account.getWeek());
	//// pstmt.setString(7, account.getDay());
	//// pstmt.setString(8, account.getHours());
	// int result = pstmt.executeUpdate();
	// System.out.println("update result: " + result);
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	public void update(Today account) {
		try {
			// update todo set title='1',todo='1',location='1',described='1',
			// year='1',month='1',week='1',day='1',time='1',either='1' where
			// count=3;
			// update todo set title=? and todo=? location=? described=? year=?
			// month=? week=? day=? time=? eigher=? where acount=?
			sql = "update todo set title=?,todo=?,location=?,described=?,"
					+ "year=?,month=?,week=?,day=?,time=? ,either=? where count=?";
			// "update todo set ?=? where ?=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, account.getTitle());
			pstmt.setString(2, account.getToDo());
			pstmt.setString(3, account.getLocation());
			pstmt.setString(4, account.getDescribed());
			pstmt.setString(5, account.getYear());
			pstmt.setString(6, account.getMonth());
			pstmt.setString(7, account.getWeek());
			pstmt.setString(8, account.getDay());
			pstmt.setString(9, account.getHours());
			pstmt.setString(10, account.getEither());
			pstmt.setInt(11, account.getCount());

			int result = pstmt.executeUpdate();
			System.out.println("update result: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(String accountNum) {
		try {
			sql = "delete from todo where count=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			int result = pstmt.executeUpdate();
			System.out.println("delete result:" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Today select(String temp, String temp1) {
		Today result = null;
		try {
			sql = "select * from todo "
					+ "WHERE year = YEAR(CURDATE()) AND month = MONTH(CURDATE()) and day = DAY(CURDATE()) and time=? and either=?";
			// sql = "select * from todo where year=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, temp);
			pstmt.setString(2, temp1);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new Today();
				result.setTitle(rs.getString(1));
				result.setToDo(rs.getString(2));
				result.setLocation(rs.getString(3));
				result.setDescribed(rs.getString(4));
				result.setYear(rs.getString(5));
				result.setMonth(rs.getString(6));
				result.setWeek(rs.getString(7));
				result.setDay(rs.getString(8));
				result.setHours(rs.getString(9));
				result.setEither(rs.getString(10));
				result.setCount(rs.getInt(11));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//
	// public Today selecteither() {
	// Today result = null;
	// try {
	//
	// sql = "SELECT * FROM todo WHERE either IS NULL OR either = '';";
	// pstmt = con.prepareStatement(sql);
	// //pstmt.setString(1, accountNum);
	//
	// rs = pstmt.executeQuery();
	// if (rs.next()) {
	// result = new Today();
	// result.setTitle(rs.getString(1));
	// result.setToDo(rs.getString(2));
	// result.setLocation(rs.getString(3));
	// result.setDescribed(rs.getString(4));
	// result.setYear(rs.getString(5));
	// result.setMonth(rs.getString(6));
	// result.setWeek(rs.getString(7));
	// result.setDay(rs.getString(8));
	// result.setHours(rs.getString(9));
	// result.setEither(rs.getString(10));
	//
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	// }
	//
	// public Today selectyear(){
	// Today result = null;
	// try {
	//
	// sql = "select * from todo WHERE YEAR = YEAR(CURDATE())";
	// pstmt = con.prepareStatement(sql);
	// //pstmt.setString(1, accountNum);
	//
	// rs = pstmt.executeQuery();
	// if (rs.next()) {
	// result = new Today();
	// result.setTitle(rs.getString(1));
	// result.setToDo(rs.getString(2));
	// result.setLocation(rs.getString(3));
	// result.setDescribed(rs.getString(4));
	// result.setYear(rs.getString(5));
	// result.setWeek(rs.getString(6));
	// result.setDay(rs.getString(7));
	// result.setHours(rs.getString(8));
	//
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	// }
	//
	// public Today selectmonth(){
	// Today result = null;
	// try {
	//
	// sql = "select * from todo WHERE YEAR ="
	// + " YEAR(CURDATE()) and month = MONTH(CURDATE());";
	// pstmt = con.prepareStatement(sql);
	// //pstmt.setString(1, accountNum);
	//
	// rs = pstmt.executeQuery();
	// if (rs.next()) {
	// result = new Today();
	// result.setTitle(rs.getString(1));
	// result.setToDo(rs.getString(2));
	// result.setLocation(rs.getString(3));
	// result.setDescribed(rs.getString(4));
	// result.setYear(rs.getString(5));
	// result.setWeek(rs.getString(6));
	// result.setDay(rs.getString(7));
	// result.setHours(rs.getString(8));
	//
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	// }
	//
     //month
	public String selectMonth() {
		String result = null;

		sql = "Select Month(CURDATE())";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getString(1);
			// result = rs.getString(1).toString();
			//System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pstmt.setString(1, accountNum);
		return result;
	}
	
	//day
	
	public String selectDay() {
		String result = null;

		sql = "Select Day(CURDATE())";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getString(1);
			// result = rs.getString(1).toString();
			//System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pstmt.setString(1, accountNum);
		return result;
	}
	
	//week
	public String selectDayName() {
		String result = null;

		sql = "Select DAYNAME(CURDATE())";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getString(1);
			// result = rs.getString(1).toString();
			//System.out.println(rs.getString(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pstmt.setString(1, accountNum);
		return result;
	}

	public Today select(String accountNum) {
		Today result = null;
		try {
			// select * from todo
			// where year = YEAR(CURDATE()) AND month = MONTH(CURDATE()) and day
			// = DAY(CURDATE()) and either='ti';
			sql = "select * from todo " + "where year = YEAR(CURDATE()) AND " + "month = MONTH(CURDATE()) and "
					+ "day = DAY(CURDATE()) and either=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new Today();
				result.setTitle(rs.getString(1));
				result.setToDo(rs.getString(2));
				result.setLocation(rs.getString(3));
				result.setDescribed(rs.getString(4));
				result.setYear(rs.getString(5));
				result.setMonth(rs.getString(6));
				result.setWeek(rs.getString(7));
				result.setDay(rs.getString(8));
				result.setHours(rs.getString(9));
				result.setEither(rs.getString(10));
				result.setCount(rs.getInt(11));
				// result.setHours(rs.getString(9));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	//
	// public Today selectToday() {
	// Today result = null;
	// try {
	//
	// sql = "select * from todo WHERE"
	// + " YEAR = YEAR(CURDATE()) and month = MONTH(CURDATE()) and Day =
	// DAY(CURDATE());";
	// pstmt = con.prepareStatement(sql);
	// //pstmt.setString(1, accountNum);
	//
	// rs = pstmt.executeQuery();
	// if (rs.next()) {
	// result = new Today();
	// result.setTitle(rs.getString(1));
	// result.setToDo(rs.getString(2));
	// result.setLocation(rs.getString(3));
	// result.setDescribed(rs.getString(4));
	// result.setYear(rs.getString(5));
	// result.setWeek(rs.getString(6));
	// result.setDay(rs.getString(7));
	// result.setHours(rs.getString(8));
	//
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	//
	// }
	//
	// public Today selectTodayTime(String accountNum, String temp) {
	// Today result = null;
	// try {
	//
	// sql =" select * from todo WHERE YEAR = YEAR(CURDATE()) and month =
	// MONTH(CURDATE()) and Day = DAY(CURDATE()) "
	// +" and time=? and either=?";
	//
	// pstmt = con.prepareStatement(sql);
	// pstmt.setString(1, accountNum);
	// pstmt.setString(2, temp);
	//
	// rs = pstmt.executeQuery();
	// if (rs.next()) {
	// result = new Today();
	// result.setTitle(rs.getString(1));
	// result.setToDo(rs.getString(2));
	// result.setLocation(rs.getString(3));
	// result.setDescribed(rs.getString(4));
	// result.setYear(rs.getString(5));
	// result.setWeek(rs.getString(6));
	// result.setDay(rs.getString(7));
	// result.setHours(rs.getString(8));
	//
	// }
	// //System.out.println(result.getTitle());
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	//
	// }
	//
	// public List<Today> selectList(){
	// List<Today> result = new ArrayList<>();
	//
	// try {
	// sql = "select * from todo";
	// stmt = con.createStatement();
	//
	// rs = stmt.executeQuery(sql);
	// while(rs.next()){
	// Today account = new Today();
	// account.setTitle(rs.getString(1));
	// account.setToDo(rs.getString(2));
	// account.setLocation(rs.getString(3));
	// account.setDescribed(rs.getString(4));
	// account.setYear(rs.getString(5));
	// account.setWeek(rs.getString(6));
	// account.setDay(rs.getString(7));
	// account.setHours(rs.getString(8));
	//
	// result.add(account);
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return result;
	// }
	//
	public void finalize() {
		if (rs != null) {

			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (pstmt != null) {

			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

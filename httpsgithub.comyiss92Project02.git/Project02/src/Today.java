import java.util.Calendar;

public class Today {
	private String title;
	protected String toDo;
	private String location;
	private String described;
	private String year;
	private String month;
	private String week;
	private String day;
	private String hours;
	private String either;
	private int count;
	private Calendar calendar;
	private final int scedulNumber = 24;

	public Today() {
		super();
	}
	
	public Today(String title, String toDo, String location, String described, String year, String month, String week,
			String day, String hours, String either) {
		super();
		this.title = title;
		this.toDo = toDo;
		this.location = location;
		this.described = described;
		this.year = year;
		this.month = month;
		this.week = week;
		this.day = day;
		this.hours = hours;
		this.either = either;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getToDo() {
		return toDo;
	}

	public void setToDo(String toDo) {
		this.toDo = toDo;
	}

	public int getScedulNumber() {
		return scedulNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescribed() {
		return described;
	}

	public void setDescribed(String described) {
		this.described = described;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getWeek() {
		return week;
	}


	public void setWeek(String week) {
		this.week = week;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getEither() {
		return either;
	}

	public void setEither(String either) {
		this.either = either;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}	
}

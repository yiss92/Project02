
public class WeekDay {
	private Today today;
	private int firstDay;
	private String dayOftheWeek;
	private int last_day;
	private String lastDayOftheWeek;

	public WeekDay() {
		super();
	}

	public WeekDay(Today today, int firstDay, String dayOftheWeek, int last_day, String lastDayOftheWeek) {
		super();
		this.today = today;
		this.firstDay = firstDay;
		this.dayOftheWeek = dayOftheWeek;
		this.last_day = last_day;
		this.lastDayOftheWeek = lastDayOftheWeek;
	}

	public Today getToday() {
		return today;
	}

	public void setToday(Today today) {
		this.today = today;
	}

	public int getFirstDay() {
		return firstDay;
	}

	public void setFirstDay(int firstDay) {
		this.firstDay = firstDay;
	}

	public String getDayOftheWeek() {
		return dayOftheWeek;
	}

	public void setDayOftheWeek(String dayOftheWeek) {
		this.dayOftheWeek = dayOftheWeek;
	}

	public int getLast_day() {
		return last_day;
	}

	public void setLast_day(int last_day) {
		this.last_day = last_day;
	}

	public String getLastDayOftheWeek() {
		return lastDayOftheWeek;
	}

	public void setLastDayOftheWeek(String lastDayOftheWeek) {
		this.lastDayOftheWeek = lastDayOftheWeek;
	}	

}

/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendar of an inputed year; 
	 * If its a Sunday - prints 'Sunday' as well.
	 */
	public static void main(String args[]) {
		// get user input
		int user_year = Integer.parseInt(args[0]);
		boolean verbose = (user_year == year);
	 	while (year <= user_year) {
			if(verbose){
				System.out.print(dayOfMonth + "/" + month + "/" + year);
				if(dayOfWeek == 1){
					System.out.print(" Sunday");
				}
				System.out.println();
			} 

	 		advance();
			verbose = (user_year == year);
        }
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		//advance day of week
		dayOfWeek = (dayOfWeek == 7) ? 1 : dayOfWeek + 1;
		//advance day of month
		if(dayOfMonth != nDaysInMonth){
			dayOfMonth++;
		} else {
			// advance month
			dayOfMonth = 1;
			month = (month == 12) ? 1 : month + 1;
			if(month == 1){
				// needs to advance year
				year++;
			}
			// update nDaysInMonth
			nDaysInMonth = nDaysInMonth(month, year);
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if(year % 4 != 0)
		return false;
		if(year % 100 != 0)
			return true;
		if(year % 400 == 0)
			return true;
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		boolean is_leap = isLeapYear(year);

		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return is_leap ? 29 : 28;
			default:
				break;
		}
		return 31;
	}
}
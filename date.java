import java.util.Comparator;

public interface Incrementable;
public interface Comparable;
    public class date implements Comparable<date>
    {
        private int day, month, year;

        public date(int day, int month, int year) {
//        to do- fix the errors in the future such as when days go over the amount for the month
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) return true;

            if (year % 100 == 0) return false;

            return (year % 4 == 0);
        }

        public static int daysInMonth(int month, int year) {
            if (month == 2) {
                return isLeapYear(year) ? 29 : 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            }
            return 31;
        }

        public static int daysInYear(int year) {
            return isLeapYear(year) ? 366 : 365;
        }

        private void incrementMonth() {
            day = 1;

            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }

        public date add(int days) {
            date date = new date(day, month, year);

            if (days > daysInMonth(date.month, date.year) - date.day) {
                days -= daysInMonth(date.month, date.year) - date.day;

                date.incrementMonth();

            } else {
                date.day += days;

                return date;
            }
            while (days > daysInYear(date.year)) {
                days -= daysInYear(date.year);

                date.year++;
            }
            while (days > daysInMonth(date.month, date.year)) {
                days -= daysInMonth(date.month, date.year);

                date.incrementMonth();

            }
            date.day += days - 1;

            return date;
        }
//      public void increment()
//        {
//            date next = add(1);
//            day=next.day;
//            month=next.month;
//            year=next.year;
//        }
        public int compareTo(date date){
            return getDay()-date.getDay();
        }
    }

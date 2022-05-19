public class Date {
    int year;
    int month;
    int day;

    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }

    public Date(int month,int day,int year){
        if (isValidDate(month,day,year)){
            this.month = month;
            this.day = day;
            this.year = year;
        }else
            System.out.println("invalid date");
    }
    public Date(String s){
        String[] inputString = s.split("/");
        int month = Integer.parseInt(inputString[0]);
        int day = Integer.parseInt(inputString[1]);
        int year = Integer.parseInt(inputString[2]);
        if (isValidDate(month,day,year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        }else
            System.out.println("Invalid input");
    }
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if(year % 400 == 0)
                return true;
        }
        return false;
    }
    public static int daysInMonth(int month,int year){
        if(month>0&&month<=12){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            }
        }
        return -1;
    }
    public static boolean isValidDate(int month,int day,int year){
        if((day>daysInMonth(month,year))||year<1||day<=0||month>12||month<1){
            return false;
        }else return true;
    }
    public boolean isBefore(Date d) {
        if (isValidDate(d.month, d.day, d.year)) {
            if (this.year < d.year) {
                if (this.month < d.month) {
                    return this.day < d.day;
                }
                return false;
            }
            return false;
        }return false;
    }
    public boolean isAfter(Date d){
        if (isValidDate(d.month, d.day, d.year)) {
            if (this.year > d.year) {
                if (this.month > d.month) {
                    return this.day > d.day;
                }
                return false;
            }
            return false;
        }return false;
    }
    public int dayInYear(){
        int dayInYear = 0;
        for(int i = 1;i!=this.month;i++){
            dayInYear += daysInMonth(i,this.year);
        }return dayInYear+this.day;
    }

    public int difference(Date d){
        return (d.dayInYear()-this.dayInYear());
    }

    public static void main(String[] args){
        Date d2 = new Date("12/4/2022");
        System.out.println(d2.month);
        System.out.println(new Date(12,32,2003));
        System.out.println(new Date(1,24,2003).isAfter(
                new Date(2,17,2004)
        ));
        System.out.println(new Date(2,17,2004).dayInYear());
    }
}

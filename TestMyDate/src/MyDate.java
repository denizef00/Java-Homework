public class MyDate {
    int day, month,year;

    int[] maxDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month - 1;
        this.year = year;
    }

    public void incrementDay(int d){
        while(d > 0){
            this.incrementDay();
            d--;
        }
    }

    public void incrementDay(){
        int newDay = this.day + 1;

        if (newDay > this.maxDays[this.month]){
            this.day = 1;
            this.incrementMonth();
        } else if (this.month == 1 && newDay == 29 && inLeapYear()) {
            this.day = 1;
            this.incrementMonth();
        }else{
            this.day = newDay;
        }
    }

    public void decrementDay(int d){
        while(d > 0){
            this.decrementDay();
            d--;
        }
    }

    public void decrementDay(){
        int newDay = this.day - 1;

        if(newDay == 0){
            this.day = 31;
            this.decrementMonth();
        }else{
            this.day = newDay;
        }
    }



    public void incrementMonth(int m){
        int newMonth = (this.month + m) % 12;
        int yearDif = 0;
        //for decrementing month
        if (newMonth < 0){
            newMonth += 12;
            yearDif = -1;
        }
    }

    public void incrementMonth(){
        this.month++;
    }
    public  void decrementMonth(int m){
        int new_month = (this.month - m) % 12;
        int yearDiff = 0;

        if (new_month < 0){
            new_month += 12;
            yearDiff = -1;
        }
    }
    public void decrementMonth() {
        this.month--;
    }

    public void incrementYear(int y){
        this.year = this.year + y;
    }

    public boolean inLeapYear(){
        return this.year % 4 != 0;
    }


    @Override
    public String toString() {
        return this.year + "-" +
                (this.month < 10 ? "0" + (this.month + 1) : (this.month + 1)) + "-" +
                (this.day < 10 ? "0" + this.day: this.day);
    }
}

package Ejercicios.Ejer6;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day,int month, int year){
        this.day =day;
        this.month=month;
        this.year=year;
        if (!check()){
            this.day =1;
            this.month=1;
            this.year=1970;
        }
    }
    public void setDay(int day){
        this.day=day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month){
        this.month=month;
    }
    public String toString(){
        return day+"-"+month+"-"+year;
    }

    public boolean check(){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return (day<=31 && day>0)?true:false;
            case 4: case 6: case 9: case 11:
                return (day<=30 && day>0)?true:false;
            case 2:
                if (!esBisiesto())
                    return (day<=28 && day>=1)?true:false;
                else
                    return (day<=29 && day>=1)?true:false;
            default:return false;
        }
    }
    public void next(){
        day++;
        if(!check()){
            day=1;
            month++;
        }
        if (!check()){
            month=1;
            year++;

        }
    }

    private boolean esBisiesto() {
        return (year%4==0 && year%100!=0 || year%400==0);
    }
}

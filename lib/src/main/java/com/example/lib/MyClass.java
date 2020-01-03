package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int Year=0,Month=0,Day=0,TotalDay=0;
        int MonthDay[]={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean LeapYear=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year,mouth,day");
        Year = scanner.nextInt();
        Month = scanner.nextInt();
        Day = scanner.nextInt();
        if(Year%4!=0)
            LeapYear=false;
        else if(Year%100!=0)
            LeapYear=true;
        else if(Year%400!=0)
            LeapYear=false;
        else
            LeapYear=true;
        if(LeapYear==true)
            MonthDay[1]=29;
        if(Month>12)
            System.out.println("error");
        else if(MonthDay[Month-1]<Day)
            System.out.printf("error!!%d year%d mouth just %d day\n",Year,Month,MonthDay[Month-1]);
        else {
            for(int i=Month-2;i>=0;--i){
                TotalDay+=MonthDay[i];
            }
            TotalDay+=Day;
            System.out.printf("This day is the %d day of the year\n",TotalDay);
        }
    }
}
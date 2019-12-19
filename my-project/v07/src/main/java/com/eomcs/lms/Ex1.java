package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

public class Ex1 {
  // 주차장 입차 출차 시스템

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Car {

      int no;
      String CarType;
      String CarNumber;
      String parking;
      Date TodayDate;
      String Departure;
      //String EnteringAvehicle;
      String response;
    }

    final int SIZE = 100;

    Car[] cars = new Car[SIZE]; 

    int count = 0;

    for (int i = 0; i < SIZE; i++ ) {

      Car car = new Car();

      System.out.printf("번호? ");
      car.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.printf("차종? ");
      car.CarType = keyboard.nextLine();

      System.out.printf("차량번호? ");
      car.CarNumber = keyboard.nextLine();

      System.out.printf("차량 위치? ");
      car.parking = keyboard.nextLine();

      //System.out.printf("차량 입차 날짜? ");

      car.TodayDate = new Date(System.currentTimeMillis());

      System.out.printf("차량 출차 날짜? ");
      car.Departure = keyboard.nextLine();

      cars[i] = car;
      count ++;

      System.out.println();

      cars[i] = car;
      String response;

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      keyboard.close();
    }

    System.out.println();
    for (int i = 0; i < count; i++) {

      Car car = cars[i];
      System.out.printf("번호:%s, 차종:%s\n차량 번호 :%s, 차량 위치:%s\n입차 날짜:%s,출차날짜:%s\n",
          car.no, car.CarType, car.CarNumber, car.parking, 
          car.Departure,car.TodayDate,car.Departure);
    }



  }
}












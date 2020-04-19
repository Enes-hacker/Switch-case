package com.enes;

public class Main {

    public static void main(String[] args) {
	// write your code here

              int FloorNumber = 9 ;
      String FloorNo = "Default Value";
      System.out.println ("Floor No is:"+ FloorNo);

      switch (FloorNumber) {
          case 8:
              FloorNo = "Hello Мими";
              break;
          case 7:
              FloorNo = "Hello Пепи";
              break;
          case 6:
              FloorNo = "Hello Ваня";
              break;
          case 5:
              FloorNo = "Hello Мишо";
              break;
          case 4:
              FloorNo = "Hello Коце";
              break;
          case 3:
              FloorNo = "Hello Комши";
              break;
          case 2:
              FloorNo = "Hello Наборе";
              break;
          case 1:
              FloorNo = "Hello World";
              break;
          case 0:
              FloorNo = "Ауч";
              break;
          default:
              FloorNo = "Invalid floor";
              break;
        }

    }
}

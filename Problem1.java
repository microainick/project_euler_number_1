import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Problem1 {
  public int getSum(){
      int mySum = 0;
      for (int i = 0; i < 1000; i += 3){
          mySum += i;
      }
      for (int j = 0; j < 1000; j += 5){
          mySum += j;
      }
      for (int k = 0; k < 1000; k += 15){
          mySum = mySum - k;
      }
      NumberFormat myFormat = NumberFormat.getInstance();
      myFormat.setGroupingUsed(true);
      System.out.println("\n\n");
      System.out.print("The sum of all the multiples of 3 or 5 below 1000 is:  ");
      System.out.println(myFormat.format(mySum));
      System.out.println("\n\n");
    return mySum;
  }

  public static void main(String[] args) {
      Problem1 robot = new Problem1();
      robot.getSum();
  }

}

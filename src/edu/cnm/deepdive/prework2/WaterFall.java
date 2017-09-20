package edu.cnm.deepdive.prework2;

public class WaterFall {

  public static void main(String[] args) {
      fall((args.length > 0) ? args[0] : "water fall");
    }
  private static void fall(String target) {
    System.out.println("Beautiful " + target + "!");
  }
}

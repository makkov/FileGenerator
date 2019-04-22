package util;

public class Util {

  /**
   * @return a random number in the range [min..max]
   */
  public static int getRandomNumber (int min, int max) {
    max -= min;
    return (int) (Math.random() * ++max) + min;
  }
}

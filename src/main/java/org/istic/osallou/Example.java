package org.istic.osallou;
/**
 *  Example base class tutorial
 * 
 *  @author Olivier Sallou
 */
public class Example {
  
  /**
   * My contrusctor no parameter
   *
   */
  public Example() {
    
  }
  
  /**
   * My super method so complex.... ;-)
   * 
   * @param a one integer
   * @param b an other integer
   * @return sum of a and b
   */
  public int add(int a, int b) {
    return a + b;
  }
  
  public static void main(String [] args)
	{
		Example ex = new Example();
    	System.out.println("Running Example");
      System.out.println("Res: "+ ex.add(1,2));
	}
  
}
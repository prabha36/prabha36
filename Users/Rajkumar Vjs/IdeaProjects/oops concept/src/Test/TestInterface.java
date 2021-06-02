package Test;

interface TestInterface {
 public void test();
}
abstract class Base {
 public void testBase() {
  System.out.println("This is extends class");

 }
}
 class RealTest extends Base implements TestInterface {

  @Override
  public void test() {
   System.out.println("This is implementation class");
  }
  public static void main(String args[]) {
   RealTest realTest = new RealTest();
   realTest.test();
   realTest.testBase();
  }
 }
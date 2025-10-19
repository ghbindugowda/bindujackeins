public class Demo {
public static int add(int a, int b) {
 return a + b;
}
public static void main(String[] args) {
 System.out.println("Running build and test...");
 if (add(2, 3) == 5 && add(-1, 1) == 0) {
 System.out.println("✅All tests passed!");
 } else {
 System.out.println("❌Test failed!");
 }
}
}

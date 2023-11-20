public class continue1{
public static void main(String[]args){
int[] numbers = {3, -2, 8, -5, 7};
for (int num : numbers) {
    if (num < 0) {
        // Skip negative numbers
        continue;
    }
    System.out.println(num);
}
}
}
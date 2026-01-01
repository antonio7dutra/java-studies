public class Main {
    public static void main(String[] args) {

        System.out.println(add(1, 2, 3));
    }

    static int add(int... nums){
        int total = 0;

        for (int i = 0; i < nums.length; i++){

            total += nums[i];
        }
        return total;
    }
}

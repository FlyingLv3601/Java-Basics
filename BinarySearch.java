
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            nums.add(i);
        }

        System.out.println(nums.size());

        int result = BinarySearch(nums, 123467);
        System.out.println(result);
    }

    public static int BinarySearch(ArrayList<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = list.get(mid);

            if (guess == target) {
                return mid;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

package other;

public class BinarySearch {

    public static int RecursiveSort(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target){
            return RecursiveSort(array, target, start, mid - 1);
        } else {
            return RecursiveSort(array, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {

        int n = 10;
        int target = 7;
        int[] array = {1,3,5,7,9,11,13,15,17,19};

        int result = RecursiveSort(array, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println("Target 인덱스 위치 " + result);
        }
    }
}

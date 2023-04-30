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

    public static int LoopSort(int[] array, int target, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 10;
        int target = 7;
        int[] array = {1,3,5,7,9,11,13,15,17,19};

        int recursive = RecursiveSort(array, target, 0, n - 1);
        if (recursive == -1) {
            System.out.println("찾는 원소가 존재하지 않습니다.");
        } else {
            System.out.println("찾는 원소 인덱스 위치 " + recursive);
        }

        System.out.println();

        int loop = LoopSort(array, target, 0, n - 1);
        if (loop == - 1) {
            System.out.println("찾는 원소가 존재하지 않습니다.");
        } else {
            System.out.println("찾는 원소 인덱스 위치 " + loop);
        }




    }
}

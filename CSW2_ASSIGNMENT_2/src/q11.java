import java.util.*;

public class q11 {
    static void rccper(int index, int arr[], List<List<Integer>> ans) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            rccper(index + 1, arr, ans);
            swap(i, index, arr);
        }
    }

    static void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    static List<List<Integer>> permutation(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        rccper(0, arr, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(permutation(arr));
    }
}

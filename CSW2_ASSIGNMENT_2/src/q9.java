public class q9 {
    static void TowerOfHanoi(int n, char from, char to, char adj) {
        if (n == 0) {
            return;
        }
        TowerOfHanoi(n - 1, from, adj, to);
        System.out.println("Move disk from " + from + " to " + to);
        TowerOfHanoi(n - 1, adj, to, to);
    }

    public static void main(String args[]) {
        int n = 2;
        TowerOfHanoi(n, 'A', 'B', 'C');
    }
}

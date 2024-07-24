public class P69Sqrt {
    public int mySqrt(int x) {
        int result = 0;
        for (int i = 0; i <= x; i++) {
            if (x <= 0) {
                break;
            }
            if (i % 2 == 1) {
                x -= i;
                result++;
            }
        }

        return result;
    }
}

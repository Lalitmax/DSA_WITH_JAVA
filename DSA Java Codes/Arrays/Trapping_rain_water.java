public class Trapping_rain_water {
    public static void trapwater(int arr[]) {
        int n = arr.length;
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
        }

        int rightmax[] = new int[arr.length];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }

        int trapRainWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            int trapwater = waterlevel - arr[i];
            trapRainWater += trapwater;
        }

        System.out.println(trapRainWater);

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        trapwater(height);

    }
}

class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 5, 6};

        int n = 6;
        int sum = n * (n + 1) / 2;

        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }

        int missing = sum - total;

        System.out.println("Missing Number = " + missing);
    }
}

class Main {
    public static void main(String[] args) {

        int[] a = {0, 1, 0, 3, 12};

        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        while (j < a.length) {
            a[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeros:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 1, 2, 4};

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            if (a[i] == -1)
                continue;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count++;
                    if (j > i) {
                        a[j] = -1;
                    }
                }
            }

            System.out.println(a[i] + " = " + count + " times");
        }
    }
}

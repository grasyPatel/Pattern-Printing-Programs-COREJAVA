package in.learningPattern;

public class namePattern {
    public static void main(String[] arg) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= 1 && j >= 1 && j < n || j <= 1 && i >= 1 && i < n - 1 || i == n - 1 && j >= 1 && j <= ((n - 1) / 2) + 1 || j == ((n - 1) / 2 + 2) &&
                        i >= ((n - 1) / 2 + 2) && i < n - 1 || i == ((n - 1) / 2 + 1) && j >= ((n - 1) / 2 + 1) && j <= (n - 3) || j == n - 2 && i > ((n - 1) / 2 + 1) && i <= n - 1
                        || j == n - 1 && i > ((n - 1) / 2 + 1) && i <= n - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j <= 1 || i == 0 && j < n - 1 || j == n - 1 && i >= 1 && i < (n - 1) / 2 || i == (n - 1) / 2 && j < n - 1 || i - j == (n - 1) / 2 && i >= (n) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 || j <= 1 | j >= n - 2 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 && j >= 1 && j < n || j <= 1 && i >= 1 && i < n - 1 || i >= n - 2 && j >= 1 && j < n) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 || j <= 1 || i == (n - 1) / 2 || i >= n - 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("            ");
            for (int j = 0; j < n; j++) {
                if (j <= 1 || j == n - 1 && i >= 1 && i <= ((n - 1) / 2 - 1) || i == 0 && j < n - 1 || i == (n - 1) / 2 && j < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 || j <= 1 | j >= n - 2 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 || j == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i <= 1 || j <= 1 || i == (n - 1) / 2 || i >= n - 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j <= 1 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();


        }
    }
}



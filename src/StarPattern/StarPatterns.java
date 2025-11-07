package StarPattern;


public class StarPatterns {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    class T {
        public static void main(String[] args) {
            int n = 5;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }

    class B {
        public static void main(String[] args) {
            int n = 6;
            //left stars
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                //spaces
                for (int j = i; j < n; j++) {
                    System.out.print("  ");
                }
                //right starts
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //bottom
            for (int i = 0; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                //spaces
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ");
                }
                //right starts
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    class nepal {
        public static void main(String[] args) {
            int n = 10;
            for (int i = 0; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }

                for (int j = i; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                for (int j = i; j < n; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    class C {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (j == 0 || i == 0 || i == 5 || j == 5 || i == j || i + j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

//        * * * * * *
//        *         *
//        *         *
//        *         *
//        *         *
//        * * * * * *

    class D {

        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i <= n; i++) {
                //left
                for (int j = 0; j <= i; j++) {
                    if (i == j || i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

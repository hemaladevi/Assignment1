package pattern;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int m = num;
        for (int i = 1; i <= num; i++) {
            for (int j = m; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int k = m; k <= num; k++) {
                if (num % 2 == 0) {
                    if (i % 2 != 0) {
                        if (k % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    } else {
                        if (k % 2 != 0) {
                            System.out.print(i);
                        } else {
                            System.out.print("*");
                        }
                    }
                } else {
                    if (i % 2 != 0) {
                        if (k % 2 != 0) {
                            System.out.print(i);
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if (k % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    }
                }
            }
            for (int l = 2; l <= i; l++) {
                if (i % 2 != 0) {
                    if (l % 2 != 0) {
                        System.out.print(i);
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (l % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(i);
                    }
                }
            }
            m--;
            System.out.println();
        }
        // ...................................................
        m = 1;
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            for (int k = m; k <= num - 1; k++) {
                if (num % 2 == 0) {
                    if (i % 2 != 0) {
                        if (k % 2 != 0) {
                            System.out.print(i);
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if (k % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    }
                } else {
                    if (i % 2 != 0) {
                        if (k % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    } else {
                        if (k % 2 != 0) {
                            System.out.print(i);
                        } else {
                            System.out.print("*");
                        }
                    }

                }
            }
            for (int l = i; l >= 2; l--) {
                if (num % 2 == 0) {
                    if (i % 2 != 0) {
                        if (l % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    } else {
                        if (l % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    }
                } else {
                    if (i % 2 != 0) {
                        if (l % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    } else {
                        if (l % 2 != 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(i);
                        }
                    }
                }
            }
            System.out.println();
            m++;
        }

        sc.close();
    }

}
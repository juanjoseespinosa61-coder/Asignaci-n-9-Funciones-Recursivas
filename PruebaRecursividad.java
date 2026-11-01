import java.util.Arrays;

public class PruebaRecursividad {
    public static void main(String[] args) {
            System.out.println(Recursividad.fibonacci(5));
                    System.out.println(Recursividad.fibonacci(40));
                            System.out.println(Recursividad.mcd(45, 75));
                                    System.out.println(Recursividad.mcd(47, 91));

                                            Integer[] arrInt1 = {1, 2, 3, 3, 2, 3, 1};
                                                    System.out.println(Recursividad.count(arrInt1, arrInt1.length, 3));
                                                            System.out.println(Recursividad.count(arrInt1, arrInt1.length, 1));

                                                                    Character[] arrChar1 = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
                                                                            System.out.println(Recursividad.count(arrChar1, arrChar1.length, 'C'));
                                                                                    System.out.println(Recursividad.count(arrChar1, arrChar1.length, 'E'));

                                                                                            Integer[] arrInt2 = {1, 2, 3, 4, 5};
                                                                                                    Recursividad.reverse(arrInt2, 0, arrInt2.length - 1);
                                                                                                            System.out.println(Arrays.toString(arrInt2));

                                                                                                                    Character[] arrChar2 = {'A', 'B', 'C', 'D'};
                                                                                                                            Recursividad.reverse(arrChar2, 0, arrChar2.length - 1);
                                                                                                                                    System.out.println(Arrays.toString(arrChar2));
                                                                                                                                        }
                                                                                                                                        }
                                                                                                                                        
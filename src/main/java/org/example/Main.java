package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите последовательность чисел (0 - окончание ввода):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("Уникальные числа в последовательности: " + numbers);
        scanner.close();
    }
}
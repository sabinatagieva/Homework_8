package org.example;
// В файле A.java
public class A {
    public static class B {
        // Внутренний статический класс B
    }

    public static void main(String[] args) {
        // Создание объекта класса B
        B bObject = new B();

        // Пример использования enum Time
        Time mealTime = Time.BREAKFAST;

        // Вывод на экран в зависимости от времени приема пищи
        switch (mealTime) {
            case BREAKFAST:
                System.out.println("Time to breakfast");
                break;
            case LUNCH:
                System.out.println("Time to lunch");
                break;
            case DINNER:
                System.out.println("Time to dinner");
                break;
            default:
                System.out.println("Not a valid meal time");
        }

        // Пример использования enum Calc
        Calc operation = Calc.ADDITION;
        double operand1 = 10;
        double operand2 = 5;

        // Выполнение операции в зависимости от выбранного значения enum
        switch (operation) {
            case ADDITION:
                System.out.println("Result: " + (operand1 + operand2));
                break;
            case SUBTRACTION:
                System.out.println("Result: " + (operand1 - operand2));
                break;
            case MULTIPLICATION:
                System.out.println("Result: " + (operand1 * operand2));
                break;
            case DIVISION:
                if (operand2 != 0) {
                    System.out.println("Result: " + (operand1 / operand2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case POWER:
                System.out.println("Result: " + Math.pow(operand1, operand2));
                break;
            default:
                System.out.println("Not a valid operation");
        }
    }
}

// Enum для представления времени приема пищи
enum Time {
    BREAKFAST,
    LUNCH,
    DINNER
}

// Enum для простых арифметических операций
enum Calc {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    POWER
}

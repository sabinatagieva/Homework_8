public class Main {
    public static void main(String[] args) {
        //1е
        Car myCar = new Car();
        try {
            myCar.setBrand("Mazda");
            myCar.setYear(10);

            System.out.println("brand " + myCar.getBrand());
            System.out.println("year " + myCar.getYear());
        } catch (CarBrandException | CarYearException e) {
            System.out.println("Exception " + e.getMessage());
        }

        //2e
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }
        System.out.println(numbers);

        numbers.remove(2);
        numbers.remove(6);

        System.out.println("После удаления " + numbers);

        int newValue = 99;
        numbers.set(1, newValue);

        System.out.println("После изменения " + numbers);


        //3е
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Java");
        originalList.add("Python");
        originalList.add("Perl");
        originalList.add("C++");
        originalList.add("Java");
        originalList.add("C++");
        originalList.add("C#");

        List<String> uniqueList = new ArrayList<>();

        for (String language : originalList) {
            if (!uniqueList.contains(language)) {
                uniqueList.add(language);
            }
        }
        System.out.println("Список: " + originalList);
        System.out.println("Коллекция с уникальными значениями " + uniqueList);

        //**
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(5);
        numberList.add(4);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(5);

        int count = counterCatch(numberList, 2);
        System.out.println("Количество повторений " + count);
    }
    public static int counterCatch(List<Integer> list, int numberToCount) {
        int count = 0;

        for (int num : list) {
            if (num == numberToCount) {
                count++;
            }
        }
        return count;
    }
}
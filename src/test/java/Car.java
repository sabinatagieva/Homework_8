public class Car {
    private String brand;
    private int year;
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    //сеттеры и проброс ошибки
    public void setBrand(String brand) throws CarBrandException {
        if (brand == null || brand.trim().isEmpty()) {
            throw new CarBrandException("не может быть пустым или null");
        }
        this.brand = brand;
    }

    public void setYear(int year) throws CarYearException {
        if (year < 1900 || year > 2023) {
            throw new CarYearException("некорректный год выпуска автомобиля");
        }
        this.year = year;
    }
}

class CarBrandException extends Exception {
    public CarBrandException(String message) {
        super(message);
    }
}
class CarYearException extends Exception {
    public CarYearException(String message) {
        super(message);
    }
}
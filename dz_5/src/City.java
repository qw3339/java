import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class City {

    private String cityName;
    private String countryName;
    private int population;
    private String cityCode;
    private List<String> districts;


    public City(String cityName, String countryName, int population, String cityCode, List<String> districts) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
        this.cityCode = cityCode;
        this.districts = districts;
    }


    public City() {
        this.districts = new ArrayList<>();
    }


    public void inputData(Scanner scanner) {
        System.out.print("Введите название города: ");
        this.cityName = scanner.nextLine();

        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();

        System.out.print("Введите количество жителей: ");
        this.population = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите телефонный код города: ");
        this.cityCode = scanner.nextLine();

        System.out.print("Введите количество районов: ");
        int numDistricts = Integer.parseInt(scanner.nextLine());
        this.districts = new ArrayList<>();

        for (int i = 0; i < numDistricts; i++) {
            System.out.print("Введите название района " + (i + 1) + ": ");
            this.districts.add(scanner.nextLine());
        }
    }


    public void displayData() {
        System.out.println("Название города: " + this.cityName);
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Телефонный код: " + this.cityCode);
        System.out.println("Районы: " + this.districts);
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public List<String> getDistricts() {
        return districts;
    }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        City city = new City();

        System.out.println("Введите данные о городе");
        city.inputData(scanner);

        System.out.println("\nИнформация о городе");
        city.displayData();


    }
}

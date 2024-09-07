package constants;

import java.util.List;

public class Constants {
    public static final String MALE = "Самец";
    public static final String FEMALE = "Самка";
    public static final String PREDATOR = "Хищник";
    public static final String HERBIVORE = "Травоядное";

    public static final List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");
    public static final List<String> HERBIVORE_FOOD = List.of("Трава", "Различные растения");

    public static final List<String> ALEX_FRIENDS = List.of("Марти", "Глория", "Мелман");

    public static final String ALEX_PLACE_OF_LIVING = "Нью-Йоркский зоопарк";

    public static final int DEFAULT_KITTENS_COUNT = 1;
    public static final String FELINE_FAMILY_NAME = "Кошачьи";
    public static final String CAT_SOUND= "Мяу";

    public static final String WRONG_ANIMAL_TYPE_EXCEPTION_MESSAGE = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    public static final String WRONG_SEX_TYPE_EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самей или самка";

    public static final String FAMILY_NAMES_MESSAGE = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
}

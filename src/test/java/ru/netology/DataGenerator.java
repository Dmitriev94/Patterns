package ru.netology;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    public DataGenerator() {

    }

    public static class Registration {
        private Registration() {

        }

        public static RegByPhoneAndNameInfo generateByPhoneName(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new RegByPhoneAndNameInfo(faker.name().fullName(), faker.phoneNumber().phoneNumber());
        }
    }

    public String shouldReturnARandomElement() {
        List<String> givenList = Arrays.asList("Уфа", "Кемерово", "Майкоп","Москва", "Симферополь", "Смоленск", "Тамбов");
        Random rand = new Random();
        String randomElement = givenList.get(rand.nextInt(givenList.size()));
        return randomElement;
    }
}





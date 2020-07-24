package ru.netology;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {

    }

    public static class Registration {
        private Registration() {

        }

        public static RegByPhoneAndNameInfo generateByPhoneName(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new RegByPhoneAndNameInfo(faker.name().fullName(), faker.phoneNumber().phoneNumber());
        }
    }
}





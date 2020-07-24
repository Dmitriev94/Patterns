package ru.netology;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.netology.DataGenerator.Registration.generateByPhoneName;

public class CardDeliveryTest {
    RegByPhoneAndNameInfo regData = generateByPhoneName("ru");
    CurrentLocalDate currentLocalDate = new CurrentLocalDate();
    public String date = currentLocalDate.localDateTime();

    @Test
    void shouldInputValid(){
        open("http://localhost:9999");
        $("[data-test-id=city] .input__control").setValue("Уфа");
        $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
        $("[placeholder='Дата встречи']").setValue(date);
        $("[data-test-id=name] .input__control").setValue(regData.getFullName());
        $("[name=phone]").setValue(regData.getPhoneNumber());
        $("[data-test-id=agreement]").click();
        $(byText("Запланировать")).click();
        $("[data-test-id=success-notification]").shouldHave(text("Встреча запланирована на")).shouldHave(text(date));
        $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.DELETE);
        $("[placeholder='Дата встречи']").setValue(date+1);
        $(byText("Запланировать")).click();
        $("[data-test-id=replan-notification]").shouldHave(text("У вас уже запланирована встреча на другую дату. Перепланировать?"));
        $(byText("Перепланировать")).click();
        $("[data-test-id=success-notification]").shouldHave(text("Встреча запланирована на")).shouldHave(text(date+1));

    }


}





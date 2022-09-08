package com.co.qvision.questions;

import com.co.qvision.userinterfaces.ShoesPage;
import com.co.qvision.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ComparePrice implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.TXT_PRICE).viewedBy(actor).asString();
    }


    public static ComparePrice compare() {
        return new ComparePrice();

    }
}

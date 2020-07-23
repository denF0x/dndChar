package com.babkin.dndChar.models.enums;

import com.babkin.dndChar.config.Utils;
import lombok.Getter;

@Getter
public enum Alignment implements CustomEnum {
    LAWFULGOOD("Lawful Good", "Законопослушный добрый"),
    LAWFULNEUTRAL("Lawful Neutral", "Законопослушный нейтральный"),
    LAWFULEVIL("Lawful Evil", "Законопослушный злой"),
    NEUTRALGOOD("Neutral Good", "Нейтральный добрый"),
    TRUENEUTRAL("True Neutral", "Истинно нейтральный"),
    NEUTRALEVIL("Neutral Evil", "Нейтральный злой"),
    CHAOTICGOOD("Chaotic Good", "Хаотичный добрый"),
    CHAOTICNEUTRAL("Chaotic Neutral", "Хаотичный нейтральный"),
    CHAOTICEVIL("Chaotic Evil", "Хаотичный злой");

    private final String name;
    private final String russianName;

    Alignment(String name, String russianName) {
        this.name = name;
        this.russianName = russianName;
    }

    @Override
    public String getDisplayValue() {
        return Utils.getRealName(this);
    }
}

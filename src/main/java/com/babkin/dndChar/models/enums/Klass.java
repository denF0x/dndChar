package com.babkin.dndChar.models.enums;

import com.babkin.dndChar.config.Utils;
import lombok.Getter;

@Getter
public enum Klass implements CustomEnum {

    BARBARIAN("Barbarian", "Варвар"),
    BARD("Bard", "Бард"),
    CLERIC("Cleric", "Жрец"),
    DRUID("Druid", "Друид"),
    FIGHTER("Fighter", "Воин"),
    MONK("Monk", "Монах"),
    PALADIN("Paladin", "Паладин"),
    RANGER("Ranger", "Следопыт"),
    ROGUE("Rogue", "Плут"),
    SORCERER("Sorcerer", "Чародей"),
    WARLOCK("Warlock", "Колдун"),
    WIZARD("Wizard", "Волшебник");

    private final String name;
    private final String russianName;

    Klass(String name, String russianName) {
        this.name = name;
        this.russianName = russianName;
    }

    @Override
    public String getDisplayValue() {
        return Utils.getRealName(this);
    }
}

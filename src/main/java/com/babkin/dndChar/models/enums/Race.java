package com.babkin.dndChar.models.enums;

import com.babkin.dndChar.config.Utils;
import lombok.Getter;


@Getter
public enum Race implements CustomEnum {

    HUMAN("Human", "Человек"),
    DWARF("Dwarf", "Дворф"),
    GNOME("Gnome", "Гном"),
    ELF("Elf", "Эльф"),
    ORC("Orc", "Орк"),
    HALFLING("Halfling", "Полурослик"),
    HALFELF("Half-Elf", "Полуэльф"),
    HALFORC("Half-Orc", "Полуорк");

    private final String name;
    private final String russianName;

    private Race(String name, String russianName) {
        this.name = name;
        this.russianName = russianName;
    }

    @Override
    public String getDisplayValue() {
        return Utils.getRealName(this);
    }
}
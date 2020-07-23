package com.babkin.dndChar.models;

import com.babkin.dndChar.models.enums.Alignment;
import com.babkin.dndChar.models.enums.Klass;
import com.babkin.dndChar.models.enums.Race;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


import javax.persistence.*;

@Data
@Entity
@Table(name="Charakter")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer level = 1;
    @NotBlank(message = "Name of the character is required")
    private String name;

    @NotBlank(message = "Race of the character is  required")
    @Enumerated(EnumType.STRING)
    private Race race;

    @NotBlank(message = "Class of the character is required")
    @Enumerated(EnumType.STRING)
    private Klass klass;


    @NotBlank(message = "Alignment of the character is required")
    @Enumerated(EnumType.STRING)
    private Alignment alignment;



    @ManyToOne
    private User user;

}
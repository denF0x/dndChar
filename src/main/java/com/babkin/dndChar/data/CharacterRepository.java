package com.babkin.dndChar.data;

import com.babkin.dndChar.models.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}

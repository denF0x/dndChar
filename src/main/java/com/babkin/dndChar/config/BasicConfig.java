package com.babkin.dndChar.config;

import com.babkin.dndChar.data.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfig {

    @Bean
    public CommandLineRunner dataLoader(CharacterRepository charRepo){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                charRepo.save(new Character(4L, "Саеджима", Character.Race.ORC,
//                        Character.Class.FIGHTER, Character.Alignment.CHAOTICGOOD));
            }
        };
    }
}

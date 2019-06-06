package nl.brianvermeer.nl.demo.saver.textsaver;

import nl.brianvermeer.nl.demo.saver.textsaver.domain.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import nl.brianvermeer.nl.demo.saver.textsaver.repo.ItemRepo;

@SpringBootApplication
public class TextsaverApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextsaverApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(ItemRepo repository) {
        return (args) -> {
            repository.save(new Item("fooTest"));
        };
    }



}

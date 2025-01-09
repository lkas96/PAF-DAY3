package vttp.batch5.paf.day3.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Setup implements CommandLineRunner {
    @Override
    public void run(String...args){
        System.out.printf("Number of elements: %d%n", args.length);

        for(int i = 0; i <= args.length; i++){
            System.out.printf("Element %d%n : Value - %s%n", i, args[i]);
        }
    }
}

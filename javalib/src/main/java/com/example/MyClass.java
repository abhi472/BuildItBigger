package com.example;

import java.util.ArrayList;
import java.util.Random;

public class MyClass {

    private String jokes;
     ArrayList<String> jokesList = new ArrayList<>();
    Random random = new Random();

    public MyClass() {
        jokesList.add("Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n");
        jokesList.add("Optimist: The glass is half full.\n" +
                "\n" +
                "Pessimist: The glass is half empty.\n" +
                "\n" +
                "Mother: Why didn’t you use a coaster!\n");
        jokesList.add("Mother: \"How was school today, Patrick?\"\n" +
                "\n" +
                "Patrick: \"It was really great mum! Today we made explosives!\"\n" +
                "\n" +
                "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                "\n" +
                "Patrick: \"What school?\"\n");
        jokesList.add("Harry prays to God: Dear Lord, please make me win the lottery. \n" +
                "\n" +
                "The next day Harry begs the Lord again: Please make it so I win the lottery, Lord! \n" +
                "\n" +
                "The next day, Harry again prays: Please, please, dear Lord, make me win the lottery! \n" +
                "\n" +
                "Suddenly he hears a voice from above: Harry, would you kindly go and buy a lottery ticket. \n");
    }
    public String getJokes() {
        return jokesList.get(random.nextInt(4));
    }
}

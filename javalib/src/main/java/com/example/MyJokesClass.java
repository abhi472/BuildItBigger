package com.example;

import java.util.ArrayList;
import java.util.Random;

public class MyJokesClass {
    private ArrayList<String> jokeList;

    public MyJokesClass() {
        jokeList = new ArrayList<>();
        jokeList.add("Knock, knock!\n" +
                "\n" +
                "Who\'s there?\n" +
                "\n" +
                "Opportunity!\n" +
                "\n" +
                "That is impossible. Opportunity doesn\'t come knocking twice!");
        jokeList.add("Knock, knock!\n" +
                "\n" +
                "Who\'s there?\n" +
                "\n" +
                "Yah!\n" +
                "\n" +
                "Yah who?\n" +
                "\n" +
                "Well, no thanks, I\'m more of a Google person.");
        jokeList.add("What do you get when you cross-breed a shark and a cow? \n" +
                "\n" +
                "I have no idea but I wouldn\'t try milking it.");
        jokeList.add("9 out of 10 voices in my head are telling me that I am too fat. " +
                "\nThe last one is calmly preparing a bowl of chips.");
        jokeList.add("Teacher: \"Kids, what does the fluffy chicken give you?\"\n" +
                "\n" +
                "Students: \"Eggs!\"\n" +
                "\n" +
                "Teacher: \"Very good! Now what does the pink pig give you?\"\n" +
                "\n" +
                "Students: \"Bacon!\"\n" +
                "\n" +
                "Teacher: \"Great! And what does the fat cow give you?\"\n" +
                "\n" +
                "Students: \"Homework!\"");
        jokeList.add("Doctor: \"I\'m sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "\n" +
                "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                "\n" +
                "Doctor: \"Nine.\"");
        jokeList.add("Mother, \"How was school today, Patrick?\"\n" +
                "\n" +
                "Patrick, \"It was really great mum! Today we made explosives!\"\n" +
                "\n" +
                "Mother, \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                "\n" +
                "Patrick, \"What school?\"");
        jokeList.add("\"How much do the potatoes cost?\"\n" +
                "-\n" +
                "\"2.50.\"\n" +
                "-\n" +
                "\"And the bag?\"\n" +
                "-\n" +
                "\"The bag is free.\"\n" +
                "-\n" +
                "\"Ok, give me the bag.\"");
        jokeList.add("Secretary: \"Doctor the invisible man has come. He says he has an appointment.\"\n" +
                " \n" +
                "Doctor: \"Tell him I cant see him.\"");
        jokeList.add("Dentist: \"You need a crown.\"\n" +
                "-\n" +
                "Patient: \"Finally someone who understands me\"");
        jokeList.add("\"Grandpa, why don\'t you have any life insurance?\"\n" +
                " \n" +
                "\"So you can all be really sad when I die.\"\n");
    }

    public String getJoke() {
        Random r = new Random();
        return jokeList.get(r.nextInt(jokeList.size()));
    }
}


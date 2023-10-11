package ru.sberbank.edu;

public class GreetingImpl implements Greeting {
    public void main(String[] args) {
        System.out.println(getBestHobby());
    }

    @Override
    public String getBestHobby() {
        String hobby = "Водный туризм";
        return hobby;
    }
}

package ru.sberbank.edu;


public class GCD implements CommonDivisor {
    @Override
    public int getDivisor(int firstNumber, int secondNumber) {

        if (firstNumber < secondNumber){
                firstNumber = secondNumber * firstNumber;
                secondNumber = firstNumber / secondNumber;
                firstNumber = firstNumber / secondNumber;
        }

        if (secondNumber == 0) {
            return firstNumber;
        }
        return getDivisor(secondNumber, firstNumber % secondNumber);
    }
}

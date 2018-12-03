package ru.itis;

public class Main {

    public static void main(String[] args) {
	    char letterA = 'A';
	    char letterARussian = 'А';

	    int codeOfLetterA = letterA;
	    int codeOfLetterARussian = letterARussian;
        System.out.println(codeOfLetterA);
        System.out.println(codeOfLetterARussian);

        char letterБ = (char) (letterARussian + 1);
        System.out.println(letterБ);
    }
}

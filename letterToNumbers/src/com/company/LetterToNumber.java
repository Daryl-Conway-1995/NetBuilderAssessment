package com.company;

public class LetterToNumber {

    public String convert(String inputString)
    {
        String outputString = "\"";
        for(int i =0;i<inputString.length();i++)
        {
            char currentChar = Character.toUpperCase(inputString.charAt(i));
            if (Character.isLetter(currentChar))
            {
                int altered = (currentChar - 'A' + 1);
                outputString = outputString + altered;
            }
            if(i!=outputString.length())
            {
                outputString = outputString + " ";
            }
            else
            {
                outputString = outputString + "\"";
            }
        }
        return outputString;
    }
}

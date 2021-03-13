package org.example;

public class PalindromCheck {
    public boolean chekStr(String strForChecking)
    {
        return strForChecking.equals(new StringBuilder(strForChecking).reverse().toString());
    }
}

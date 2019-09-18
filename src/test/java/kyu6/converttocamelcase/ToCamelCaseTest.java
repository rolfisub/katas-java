package kyu6.converttocamelcase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testLowerCaseDash() {
        String input = "the-stealth-warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testLowerCaseUnderscore() {
        String input = "the_stealth_warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testFirstUpperDash() {
        String input = "The_stealth_warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testEmptyString() {
        String input = "";
        System.out.println("input: "+input);
        assertEquals("", ToCamelCase.toCamelCase(input));
    }
}

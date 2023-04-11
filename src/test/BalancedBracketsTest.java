package test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.BalancedBrackets;

import org.junit.Before;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
//Test 1 True
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
 //Test 2
    @Test
    public void balancedBracketsOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
 //Test 3
    @Test
    public void balancedBracketsSingleWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
 //Test 4
    @Test
    public void balancedBracketsBeforeReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
 //Test 5
    @Test
    public void balancedBracketsNoneReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
//Test 6 False
    @Test
    public void noClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
  //Test 7
    @Test
    public void opposingNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
 //Test 8
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
 //Test 9
    @Test
    public void opposingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
  //Test 10
    @Test
    public void duplicateOpenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
 //Test 11
    @Test
    public void duplicateClosingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
 //Test 12
    @Test
    public void duplicateNestedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code]"));
    }
}
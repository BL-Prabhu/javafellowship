import org.junit.jupiter.api.Test;
import vendingmachine.VendingMachine;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    @Test
    void testChangeForLargeAmount() {
        VendingMachine vm = new VendingMachine();

        int amount = 2897;
        List<Integer> change = vm.getChange(amount);

        // Check total sum equals original amount
        int sum = change.stream().mapToInt(Integer::intValue).sum();
        assertEquals(amount, sum, "Sum of notes should equal the original amount");

        // Check minimum number of notes
        assertEquals(8, vm.getMinimumAmount(amount), "Minimum notes should be 8");
    }

    @Test
    void testExactNote() {
        VendingMachine vm = new VendingMachine();

        int amount = 500;
        List<Integer> change = vm.getChange(amount);

        assertEquals(1, change.size(), "Should return only one note");
        assertEquals(500, change.get(0), "The note should be 500");
    }

    @Test
    void testSmallAmount() {
        VendingMachine vm = new VendingMachine();

        int amount = 7;
        List<Integer> change = vm.getChange(amount);

        // Sum must equal original amount
        int sum = change.stream().mapToInt(Integer::intValue).sum();
        assertEquals(amount, sum, "Sum of notes should equal 7");

        // Check minimum number of notes
        assertEquals(3, vm.getMinimumAmount(amount), "Minimum notes should be 3 (5+2)");
    }
}

package ru.netology.services;

import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelancerServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")
    public void testCalculateMonths(int income, int expenses, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        int months = service.calculateMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, months); // Ожидаемый результат
    }
}
/* public class FreelancerServiceTest {
    @Test
    public void testCalculateMonthsLowIncome() {
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 4;
        int actual = service.calculateMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthsHighIncome() {
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 3;
        int actual = service.calculateMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
 */
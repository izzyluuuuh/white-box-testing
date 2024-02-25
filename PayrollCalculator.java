public class PayrollCalculatorTest {
    
    @Test
    public void testPayrollCalculator() {
        System.out.println("PayrollCalculator method");
        
        PayrollCalculator instance = new PayrollCalculator();
        double hourlyRate = 5;
        double hours = 5;
        double overtime =  2;
        double expectedResult = 40.0;
        double result = instance.getTotalSalary(hourlyRate, hours, overtime);
        
        assertEquals(expectedResult, result, 0.0);
    }
}

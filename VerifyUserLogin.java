public class VerifyUserLoginTest {

    @Test
    public void VerifyUserLoginTest() {
        System.out.println("VerifyUserLoginCredentials method");
        VerifyUserLogin instance = new VerifyUserLogin();
        String inputUsername = "Administrator01";
        String inputPassword = "administrator";
        boolean expectedResults = true;
        boolean results = instance.verifyUserLoginCredentials(inputUsername, inputPassword);
        assertEquals(expectedResults, results);
    }
}
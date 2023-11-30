public class CodeWordCheckerTester
{
    public static void main(String[] args)
    {
        CodeWordChecker sc1 = new CodeWordChecker(5, 8, "$");

        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + sc1.isValid("happy"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc1.isValid("happy$"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc1.isValid("Code"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc1.isValid("happyCode"));

        CodeWordChecker sc2 = new CodeWordChecker("pass");

        System.out.println("EXPECTED RESULT : true");
        System.out.println("ACTUAL RESULT   : " + sc2.isValid("MyPass"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc2.isValid("Mypassport"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc2.isValid("happy"));

        System.out.println("EXPECTED RESULT : false");
        System.out.println("ACTUAL RESULT   : " + sc2.isValid("1,000,000,000,000,000"));
    }
}
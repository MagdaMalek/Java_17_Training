package classesObjectMethods;

import classesObjectMethods.business.Company;

public class Person {
    private final double PI = 3.14;
    private final String MY_BIG_CONSTANT = "Hi, this is my constant message";
    private String firstName;
    private int age;
    private long id;
    private char middleInitial;
    private byte myByte;
    static private Company company = new Company();
    private NewsAgency agency;

    public static void main(String[] args) {
        System.out.println(company);
    }
}

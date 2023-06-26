package sem6.z1;

public class Salary {
    private int baseSalary;

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.346 + baseSalary * 0.13);
        return baseSalary - tax;
    }
}

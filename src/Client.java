public class Client {
    private String fullName;
    private int age;
    private int balance;

    public Client(String fullName, int age, int balance) {
        this.fullName = fullName;
        this.age = age;
        this.balance = balance;
    }

    public Client() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client: " +
                "fullName='" + fullName + '\n' +
                "age=" + age + '\n' +
                "balance=" + balance ;
    }
}

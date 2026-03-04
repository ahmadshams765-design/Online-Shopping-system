public abstract class Person {

    private String name;
    private String phoneNum;

    public Person(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;

    }

    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("phone number: " + phoneNum);
    }
}

class Customer extends Person {

    private int orders;
    private double total;

    public Customer(String name, String phoneNum, int orders, double total) {
        super(name, phoneNum);
        this.orders = orders;
        this.total = total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("number of orders: " + orders);
        System.out.println("total sum: " + total);
    }

}

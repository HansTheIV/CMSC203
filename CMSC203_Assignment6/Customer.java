public class Customer{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return (name + ", aged " + String.valueOf(age) + ": ");
    }

    public void setName(String kim) {
        name = kim;
    }

    public void setAge(int i) {
        age = i;
    }
}

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private Personal subPersonal = new Personal();
    
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(Personal subPersonal, String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.subPersonal = subPersonal;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

    @Override
    public int compareTo(User o) {
        String flName = this.lastName + " " + this.firstName;
        String flNameO = o.lastName + " " + o.firstName;
        if (flName.equals(flNameO)) {return this.age - o.age;}
        return flName.compareTo(flNameO);
    }

    public Personal getSubPersonal() {
        return subPersonal;
    }

    

    

}

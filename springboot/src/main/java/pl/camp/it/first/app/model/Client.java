package pl.camp.it.first.app.model;

public class Client {
    private String name;
    private String surname;
    private String login;
    private String password;
    private String password2;
    private String street;
    private String postalCode;
    private String city;
    private int age;
    private String phone;

    public Client(String name, String surname, String login, String password,
                  String password2, String street, String postalCode,
                  String city, int age, String phone) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.password2 = password2;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.age = age;
        this.phone = phone;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

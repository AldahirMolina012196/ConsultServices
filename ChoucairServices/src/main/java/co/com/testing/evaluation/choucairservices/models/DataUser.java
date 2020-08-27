package co.com.testing.evaluation.choucairservices.models;

public class DataUser {
    private String name;
    private String lastName;
    private String city;
    private String numberPhone;
    private String email;
    private String business;
    private String message;

    public DataUser(String name, String lastName, String city, String numberPhone, String email, String business, String message) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.numberPhone = numberPhone;
        this.email = email;
        this.business = business;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getBusiness() {
        return business;
    }

    public String getMessage() {
        return message;
    }
}

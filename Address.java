public class Address {
    private String postalCode, street, city, country;

    public Address(String postalCode, String street, String city, String country) {
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address: " + this.postalCode + ", " + this.street + ", " + this.city + ", " + this.country;
    }
}

    
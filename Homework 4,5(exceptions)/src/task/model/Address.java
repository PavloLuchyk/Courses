package task.model;

/**
 * The class represents address with post index, homeTown, street, house number, flat number
 */
public class Address {
    private String index;
    private String homeTown;
    private String street;
    private String houseNumber;
    private String flatNumber;

    public Address() {

    }

    public String getIndex() {
        return index;
    }

    public Address setIndex(String index) {
        this.index = index;
        return this;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Address setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public Address setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public Address setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(index);
        sb.append(index).append(", ")
                .append(homeTown).append(", ")
                .append(street).append(", ")
                .append(houseNumber).append(", ")
                .append(flatNumber);
        return sb.toString();
    }
}

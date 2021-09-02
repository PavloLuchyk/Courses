package task.model;

import java.time.LocalDateTime;

public class Record {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String nickName;
    private String comment;

    private Group group;

    private String homePhone;
    private String primaryNumber;
    private String secondaryNumber;

    private String email;
    private String skype;
    private Address address;

    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;

    public Record() {

    }

    public String getFirstName() {
        return firstName;
    }

    public Record setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Record setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Record setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public Record setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Record setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Record setGroup(String groupName) {
        this.group = Group.valueOf(groupName);
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public Record setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public Record setPrimaryNumber(String primaryNumber) {
        this.primaryNumber = primaryNumber;
        return this;
    }

    public String getSecondaryNumber() {
        return secondaryNumber;
    }

    public Record setSecondaryNumber(String secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Record setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSkype() {
        return skype;
    }

    public Record setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Record setAddress(Address address) {
        this.address = address;
        return this;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Record setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Record setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    public String getName() {
        return lastName + " " + firstName.substring(0,1) + ".";
    }
}

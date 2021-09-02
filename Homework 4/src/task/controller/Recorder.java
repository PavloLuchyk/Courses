package task.controller;

import task.model.Address;
import task.model.Group;
import task.model.Record;
import task.view.MessageKeys;
import task.view.View;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * The util class that validates input data and creates an entity
 */
public class Recorder {
    private View view;
    private Record record;
    private String language;

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


    /**
     * @param view View used to produce the output
     * @param record Record is model
     */
    public Recorder(View view, Record record) {
        this.view = view;
        this.record = record;
        this.language =view.getResourceBundle().getLocale().getLanguage();
    }

    /**
     * The method takes scanner object and returns the valid entity
     * @param scanner Scanner object
     * @return the valid entity
     */
    public Record makeRecord(Scanner scanner) {
        UtilController utilController = new UtilController(view, scanner);
        this.firstName = utilController.getCorrectString(MessageKeys.FIRST_NAME.messageKey, getNameRegex());
        this.lastName = utilController.getCorrectString(MessageKeys.LAST_NAME.messageKey, getNameRegex());
        this.fatherName = utilController.getCorrectString(MessageKeys.FATHER_NAME.messageKey, getNameRegex());
        this.nickName = utilController.getCorrectString(MessageKeys.NICKNAME.messageKey, Regexes.nicknameRegex);
        this.comment =utilController.getCorrectString(MessageKeys.COMMENT.messageKey, getCommentRegex());
        this.group = Group.valueOf(getLocaleIndependentGroup(
                utilController.getCorrectString(
                        MessageKeys.GROUP.messageKey, getGroupRegex())
                )
        );
        this.homePhone = utilController.getCorrectString(MessageKeys.HOME_PHONE.messageKey, Regexes.HOME_PHONE_REGEX);
        this.primaryNumber =utilController.getCorrectString(MessageKeys.PRIMARY_PHONE.messageKey, Regexes.MOBILE_PHONE_REGEX);
        this.secondaryNumber = utilController.getCorrectString(MessageKeys.SECONDARY_PHONE.messageKey,
                "[-]{1}|" + Regexes.MOBILE_PHONE_REGEX);
        this.email = utilController.getCorrectString(MessageKeys.EMAIL.messageKey, Regexes.EMAIL_REGEX);
        this.skype = utilController.getCorrectString(MessageKeys.SKYPE.messageKey, Regexes.nicknameRegex);
        Address address = new Address();
        address.setIndex(utilController.getCorrectString(MessageKeys.INDEX.messageKey, Regexes.INDEX_REGEX))
                .setHomeTown(utilController.getCorrectString(MessageKeys.TOWN.messageKey, getNameRegex()))
                .setStreet(utilController.getCorrectString(MessageKeys.STREET.messageKey, getNameRegex()))
                .setHouseNumber(utilController.getCorrectString(MessageKeys.HOUSE_NUMBER.messageKey, getHomeNumberRegex()))
                .setFlatNumber(utilController.getCorrectString(MessageKeys.FLAT_NUMBER.messageKey, getHomeNumberRegex()));
        this.address = address;
        this.creationDate = LocalDateTime.parse(
                utilController.getCorrectString(MessageKeys.CREATION_DATE.messageKey, Regexes.DATE_REGEX)
                );
        this.lastUpdateDate = LocalDateTime.parse(
                utilController.getCorrectString(MessageKeys.LAST_UPDATE_DATE.messageKey, Regexes.DATE_REGEX)
        );
        return new Record(this.firstName,this.lastName, this.fatherName, this.nickName, this.comment,
                        this.group, this.homePhone, this.primaryNumber, this.secondaryNumber, this.email, this.skype,
                        this.address, this.creationDate, this.lastUpdateDate);
    }

    /**
     * The method takes group name in localized name and makes it valid to read
     * @param groupName group name in any language
     * @return the value that can be read by Group enum
     */
    public String getLocaleIndependentGroup(String groupName) {
        if (groupName.equals("ДІМ")) {
            return "HOME";
        }
        if (groupName.equals("РОБОТА")) {
            return "WORK";
        }
        if (groupName.equals("ДРУЗІ")) {
            return "FRiENDS";
        }
        return groupName;
    }

    /**
     * The method gives the name regular expression according to the language
     * @return name regular expression according to the locale
     */
    public String getNameRegex() {
        return language.equals("ua")? Regexes.NAME_REGEX_UKR:Regexes.NAME_REGEX_ENG;
    }

    /**
     * The method gives the comment regular expression according to the language
     * @return comment regular expression according to the locale
     */
    public String getCommentRegex() {
        return language.equals("ua")? Regexes.COMMENT_REGEX_UKR:Regexes.COMMENT_REGEX_ENG;
    }

    /**
     * The method gives the group regular expression according to the language
     * @return group regular expression according to the locale
     */
    public String getGroupRegex() {
        return language.equals("ua")? Regexes.GROUP_REGEX_UKR : Regexes.GROUP_REGEX_ENG;
    }

    /**
     * The method gives the home number regular expression according to the language
     * @return home number regular expression according to the locale
     */
    public String getHomeNumberRegex() {
        return language.equals("ua")? Regexes.HOME_NUMBER_REGEX_UKR : Regexes.HOME_NUMBER_REGEX_ENG;
    }
}

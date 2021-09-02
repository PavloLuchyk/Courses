package task.controller;

import task.model.Address;
import task.model.Record;
import task.view.MessageKeys;
import task.view.View;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Recorder {
    private View view;
    private Record record;

    private String language;

    public Recorder(View view, Record record) {
        this.view = view;
        this.record = record;
        this.language =view.getResourceBundle().getLocale().getLanguage();
    }

    public Record makeRecord(Scanner scanner) {
        UtilController utilController = new UtilController(view, scanner);
        record.setFirstName(utilController.getCorrectString(MessageKeys.FIRST_NAME.messageKey, getNameRegex()))
                .setLastName(utilController.getCorrectString(MessageKeys.LAST_NAME.messageKey, getNameRegex()))
                .setFatherName(utilController.getCorrectString(MessageKeys.FATHER_NAME.messageKey, getNameRegex()))
                .setNickName(utilController.getCorrectString(MessageKeys.NICKNAME.messageKey, Regexes.nicknameRegex))
                .setComment(utilController.getCorrectString(MessageKeys.COMMENT.messageKey, getCommentRegex()))
                .setGroup(getLocaleIndependentGroup(
                        utilController.getCorrectString(
                                MessageKeys.GROUP.messageKey, getGroupRegex())
                        )
                )
                .setHomePhone(utilController.getCorrectString(MessageKeys.HOME_PHONE.messageKey, Regexes.homePhoneRegex))
                .setPrimaryNumber(utilController.getCorrectString(MessageKeys.PRIMARY_PHONE.messageKey, Regexes.mobilePhoneRegex))
                .setSecondaryNumber(utilController.getCorrectString(MessageKeys.SECONDARY_PHONE.messageKey,
                        "[-]{1}|" + Regexes.mobilePhoneRegex))
                .setEmail(utilController.getCorrectString(MessageKeys.EMAIL.messageKey, Regexes.emailRegex))
                .setSkype(utilController.getCorrectString(MessageKeys.SKYPE.messageKey, Regexes.nicknameRegex));
        Address address = new Address();
        address.setIndex(utilController.getCorrectString(MessageKeys.INDEX.messageKey, Regexes.indexRegex))
                .setHomeTown(utilController.getCorrectString(MessageKeys.TOWN.messageKey, getNameRegex()))
                .setStreet(utilController.getCorrectString(MessageKeys.STREET.messageKey, getNameRegex()))
                .setHouseNumber(utilController.getCorrectString(MessageKeys.HOUSE_NUMBER.messageKey, getHomeNumberRegex()))
                .setFlatNumber(utilController.getCorrectString(MessageKeys.FLAT_NUMBER.messageKey, getHomeNumberRegex()));
        record.setAddress(address)
                .setCreationDate(
                        LocalDateTime.parse(
                                utilController.getCorrectString(MessageKeys.CREATION_DATE.messageKey, Regexes.dateRegex))
                )
                .setLastUpdateDate(
                        LocalDateTime.parse(
                                utilController.getCorrectString(MessageKeys.LAST_UPDATE_DATE.messageKey, Regexes.dateRegex)
                        )
                );
        return record;
    }

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

    public String getNameRegex() {
        return language.equals("ua")? Regexes.NAME_REGEX_UKR:Regexes.NAME_REGEX_ENG;
    }

    public String getCommentRegex() {
        return language.equals("ua")? Regexes.COMMENT_REGEX_UKR:Regexes.COMMENT_REGEX_ENG;
    }

    public String getGroupRegex() {
        return language.equals("ua")? Regexes.groupRegexUkr: Regexes.groupRegexEng;
    }

    public String getHomeNumberRegex() {
        return language.equals("ua")? Regexes.homeNumberRegexUkr: Regexes.homeNumberRegex;
    }
}

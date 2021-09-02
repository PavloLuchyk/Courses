package task.controller;

/**
 * The interface contains regular expression to needed to match in the entity(The Record class)
 */
public interface Regexes {

    /**
     * Regular expression that used to check the correctness of the names, surnames in English
     */
    String NAME_REGEX_ENG = "^[A-Z][a-z]{1,20}([-][A-Z][a-z]{1,20})?";
    /**
     * Regular expression that used to check the correctness of the names, surnames in Ukrainian
     */
    String NAME_REGEX_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьяюґіїє]{1,20}([-][А-ЩЬЮЯҐІЇЄ][а-щьяюґіїє]{1,20})?";
    /**
     * Regular expression that used to check nickname correctness
     */
    String nicknameRegex = "[\\w]{3,20}";

    /**
     * Regular expression that used to check comments in English
     */
    String COMMENT_REGEX_ENG = "[\\w\\s]{1,100}";
    /**
     * Regular expression that used to check comments in Ukrainian
     */
    String COMMENT_REGEX_UKR = "[А-ЩЬЮЯҐІЇЄа-щьяюґіїє\\s]{1,100}";

    /**
     * Regular expression that used to check email's correctness
     */
    String EMAIL_REGEX ="[\\w.-]{4,25}[@]([a-z]{1,10}[.])+?[a-z]{2,10}";
    /**
     * Regular expression that checks group name correctness in English
     */
    String GROUP_REGEX_ENG = "[A-Z]{2,8}";
    /**
     * Regular expression that checks group name correctness in Ukrainian
     */
    String GROUP_REGEX_UKR = "[А-ЩЬЮЯҐІЇЄ]{2,8}";

    /**
     * Regular expression that checks home phone number correctness
     */
    String HOME_PHONE_REGEX = "([\\d]{6})|(([\\d]{2}([-]|[\\h])){2}[\\d]{2}$)|([\\d]{3}([-]|[\\h])[\\d]{3})";
    /**
     * Regular expression that checks mobile phone number correctness
     */
    String MOBILE_PHONE_REGEX = "((^[0][\\d]{2})|(^[\\+]?[\\d]{1,3}[\\d]{2}))" +
            "[-]?[\\d]{3}[-]?[\\d]{2}[-]?[\\d]{2}";

    /**
     * Regular expression that checks post index correctness
     */
    String INDEX_REGEX = "[\\d]{5}";
    /**
     * Regular expression that checks house number correctness in English
     */
    String HOME_NUMBER_REGEX_ENG = "[\\d/]{1,4}([A-Za-z]{1})?";
    /**
     * Regular expression that checks house number correctness in Ukrainian
     */
    String HOME_NUMBER_REGEX_UKR = "[\\d/]{1,4}([А-ЩЬЮЯҐІЇЄа-щьяюґіїє]{1})?";

    /**
     * Regular expression that checks date correctness
     */
    String DATE_REGEX = "[\\d]{4}[-](0[1-9]|1[0-2])[-](0[1-9]|[1-2][0-9]|3[0-1])[T]([0-1][0-9]|2[0-3])([:][0-5][0-9]){2}";
}

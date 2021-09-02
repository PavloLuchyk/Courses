package task.controller;

public interface Regexes {

    String NAME_REGEX_ENG = "^[A-Z][a-z]{1,20}([-][A-Z][a-z]{1,20})?";
    String NAME_REGEX_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьяюґіїє]{1,20}([-][А-ЩЬЮЯҐІЇЄ][а-щьяюґіїє]{1,20})?";
    String nicknameRegex = "[\\w]{3,20}";

    String COMMENT_REGEX_ENG = "[\\w\\s]{1,100}";
    String COMMENT_REGEX_UKR = "[А-ЩЬЮЯҐІЇЄа-щьяюґіїє\\s]{1,100}";

    String emailRegex ="[\\w.-]{4,25}[@]([a-z]{1,10}[.])+?[a-z]{2,10}";
    String groupRegexEng = "[A-Z]{2,8}";
    String groupRegexUkr = "[А-ЩЬЮЯҐІЇЄ]{2,8}";

    String homePhoneRegex = "([\\d]{6})|(([\\d]{2}([-]|[\\h])){2}[\\d]{2}$)|([\\d]{3}([-]|[\\h])[\\d]{3})";
    String mobilePhoneRegex = "((^[0][\\d]{2})|(^[\\+]?[\\d]{1,3}[\\d]{2}))" +
            "[-]?[\\d]{3}[-]?[\\d]{2}[-]?[\\d]{2}";

    String indexRegex = "[\\d]{5}";
    String homeNumberRegex = "[\\d/]{1,4}([A-Za-z]{1})?";
    String homeNumberRegexUkr = "[\\d/]{1,4}([А-ЩЬЮЯҐІЇЄа-щьяюґіїє]{1})?";

    String dateRegex = "[\\d]{4}[-](0[1-9]|1[0-2])[-](0[1-9]|[1-2][0-9]|3[0-1])[T]([0-1][0-9]|2[0-3])([:][0-5][0-9]){2}";
}

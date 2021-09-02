package task.view;

public enum MessageKeys {
    INPUT("data.input"),
    WRONG("data.wrong.input"),
    FIRST_NAME("data.first.name"),
    LAST_NAME("data.last.name"),
    FATHER_NAME("data.father.name"),
    NICKNAME("data.nickname"),
    COMMENT("data.comment"),
    GROUP("data.group"),
    HOME_PHONE("data.phone.home"),
    PRIMARY_PHONE("data.phone.primary"),
    SECONDARY_PHONE("data.phone.secondary"),
    EMAIL("data.email"),
    SKYPE("data.skype"),
    INDEX("data.index"),
    TOWN("data.town"),
    STREET("data.street"),
    HOUSE_NUMBER("data.house.number"),
    FLAT_NUMBER("data.flat.number"),
    CREATION_DATE("data.date.creation"),
    LAST_UPDATE_DATE("data.date.update");

    public final String messageKey;

    private MessageKeys(String messageKey){
        this.messageKey = messageKey;
    }
}

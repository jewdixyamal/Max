package defpackage;

/* renamed from: ux6  reason: default package */
public enum ux6 {
    SEND_5_MESSAGES("messageSent"),
    CREATE_FOLDER("folderCreated"),
    SEND_AUDIO_MESSAGE("voiceMessageSent"),
    ADD_2_REACTIONS("reactionSet"),
    SEND_3_STICKERS("stickerSent"),
    CREATE_2_GROUP_CHATS("groupChatCreated"),
    MADE_2_PIN("pinMade"),
    PARTICIPATED_IN_CALL("callMade");
    
    public final String a;

    static {
        ux6[] ux6Arr;
        v0 = new v25(ux6Arr);
    }

    /* access modifiers changed from: public */
    ux6(String str) {
        this.a = str;
    }
}

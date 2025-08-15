package defpackage;

/* renamed from: ne5  reason: default package */
public enum ne5 {
    MESSAGE("Message"),
    CHAT_MESSAGE("ChatMessage"),
    CHANNEL_MESSAGE("ChatMessage-channel"),
    CHAT_SYSTEM_MESSAGE("ChatSystemMessage"),
    CHAT_REPLY("ChatReply"),
    GROUP_CHAT("GroupChat"),
    SCHEDULED("Scheduled"),
    UNKNOWN("Unknown");
    
    public static final ne5[] b = null;
    public final String a;

    static {
        b = values();
    }

    /* access modifiers changed from: public */
    ne5(String str) {
        this.a = str;
    }
}

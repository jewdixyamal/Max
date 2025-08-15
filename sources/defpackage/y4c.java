package defpackage;

/* renamed from: y4c  reason: default package */
public enum y4c {
    AUDIO_FREEZES("AUDIO_FREEZES"),
    AUDIO_CALL_INTERRUPTION("AUDIO_CALL_INTERRUPTION"),
    VOICE_COMMUNICATION_PROBLEM("VOICE_COMMUNICATION_PROBLEM"),
    AUDIO_QUALITY("AUDIO_QUALITY"),
    AUDIO_ECHO("AUDIO_ECHO"),
    VIDEO_FREEZES("VIDEO_FREEZES"),
    VIDEO_QUALITY("VIDEO_QUALITY"),
    VIDEO_SYNC("VIDEO_SYNC"),
    VIDEO_CALL_INTERRUPTION("VIDEO_CALL_INTERRUPTION"),
    USERS_FREEZES("USERS_FREEZES"),
    OTHER((String) null);
    
    public static final qq9 b = null;
    public final String a;

    /* JADX WARNING: type inference failed for: r0v2, types: [qq9, java.lang.Object] */
    static {
        y4c[] y4cArr;
        z0 = new v25(y4cArr);
        b = new Object();
    }

    /* access modifiers changed from: public */
    y4c(String str) {
        this.a = str;
    }
}

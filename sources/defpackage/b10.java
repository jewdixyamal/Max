package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b10  reason: default package */
public enum b10 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD"),
    VIDEO_MSG("VIDEO_MSG"),
    WIDGET("WIDGET");
    
    public static final HashSet D0 = null;
    public static final HashSet E0 = null;
    public static final HashSet F0 = null;
    public static final HashSet G0 = null;
    public static final HashSet H0 = null;
    public static final HashSet I0 = null;
    public static final HashSet J0 = null;
    public final String a;

    static {
        b10 b10;
        b10 b102;
        b10 b103;
        b10 b104;
        b10 b105;
        b10 b106;
        b10 b107 = b105;
        b10 b108 = b104;
        b10 b109 = b103;
        b10 b1010 = b102;
        b10 b1011 = b10;
        D0 = new HashSet(Arrays.asList(new b10[]{b1011, b1010, b109, b108, b107}));
        E0 = new HashSet(Arrays.asList(new b10[]{b1011, b1010}));
        F0 = new HashSet(Collections.singletonList(b108));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{b107}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G0 = new HashSet(Collections.unmodifiableList(arrayList));
        H0 = new HashSet(Collections.singletonList(b109));
        I0 = new HashSet(Collections.singletonList(b107));
        J0 = new HashSet(Collections.singletonList(b106));
    }

    /* access modifiers changed from: public */
    b10(String str) {
        this.a = str;
    }

    public static b10 a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1734717884:
                if (str.equals("WIDGET")) {
                    c = 0;
                    break;
                }
                break;
            case -1611296843:
                if (str.equals("LOCATION")) {
                    c = 1;
                    break;
                }
                break;
            case -1172269795:
                if (str.equals("STICKER")) {
                    c = 2;
                    break;
                }
                break;
            case -174141059:
                if (str.equals("VIDEO_MSG")) {
                    c = 3;
                    break;
                }
                break;
            case -113354035:
                if (str.equals("INLINE_KEYBOARD")) {
                    c = 4;
                    break;
                }
                break;
            case 65025:
                if (str.equals("APP")) {
                    c = 5;
                    break;
                }
                break;
            case 2060894:
                if (str.equals("CALL")) {
                    c = 6;
                    break;
                }
                break;
            case 2157948:
                if (str.equals("FILE")) {
                    c = 7;
                    break;
                }
                break;
            case 62628790:
                if (str.equals("AUDIO")) {
                    c = 8;
                    break;
                }
                break;
            case 76105234:
                if (str.equals("PHOTO")) {
                    c = 9;
                    break;
                }
                break;
            case 78862271:
                if (str.equals("SHARE")) {
                    c = 10;
                    break;
                }
                break;
            case 81665115:
                if (str.equals("VIDEO")) {
                    c = 11;
                    break;
                }
                break;
            case 399705243:
                if (str.equals("PRESENT")) {
                    c = 12;
                    break;
                }
                break;
            case 1669509120:
                if (str.equals("CONTACT")) {
                    c = 13;
                    break;
                }
                break;
            case 1669525821:
                if (str.equals("CONTROL")) {
                    c = 14;
                    break;
                }
                break;
            case 2103311804:
                if (str.equals("REPLY_KEYBOARD")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return WIDGET;
            case 1:
                return LOCATION;
            case 2:
                return STICKER;
            case 3:
                return VIDEO_MSG;
            case 4:
                return INLINE_KEYBOARD;
            case 5:
                return APP;
            case 6:
                return CALL;
            case 7:
                return FILE;
            case 8:
                return AUDIO;
            case 9:
                return PHOTO;
            case 10:
                return SHARE;
            case 11:
                return VIDEO;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return PRESENT;
            case 13:
                return CONTACT;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return CONTROL;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}

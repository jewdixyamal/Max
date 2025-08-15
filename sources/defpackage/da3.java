package defpackage;

/* renamed from: da3  reason: default package */
public enum da3 {
    SPAM("SPAM"),
    PORNO("PORNO"),
    EXTREMISM("EXTREMISM"),
    FAKE("FAKE"),
    THREAT("THREAT"),
    OTHER("OTHER");
    
    public final String a;

    /* access modifiers changed from: public */
    da3(String str) {
        this.a = str;
    }

    public static da3 a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1821113830:
                if (str.equals("THREAT")) {
                    c = 0;
                    break;
                }
                break;
            case -1757241622:
                if (str.equals("EXTREMISM")) {
                    c = 1;
                    break;
                }
                break;
            case 2150229:
                if (str.equals("FAKE")) {
                    c = 2;
                    break;
                }
                break;
            case 2551625:
                if (str.equals("SPAM")) {
                    c = 3;
                    break;
                }
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    c = 4;
                    break;
                }
                break;
            case 76316468:
                if (str.equals("PORNO")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return THREAT;
            case 1:
                return EXTREMISM;
            case 2:
                return FAKE;
            case 3:
                return SPAM;
            case 4:
                return OTHER;
            case 5:
                return PORNO;
            default:
                throw new IllegalArgumentException(zr6.i("No such value ", str, " for Complaint"));
        }
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}

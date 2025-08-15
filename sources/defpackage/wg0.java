package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: wg0  reason: default package */
public abstract /* synthetic */ class wg0 {
    public static int a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2332679:
                if (str.equals("LEFT")) {
                    c = 0;
                    break;
                }
                break;
            case 269808705:
                if (str.equals("REMOVING")) {
                    c = 1;
                    break;
                }
                break;
            case 1809818688:
                if (str.equals("REMOVED")) {
                    c = 2;
                    break;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    c = 3;
                    break;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    c = 4;
                    break;
                }
                break;
            case 2130809258:
                if (str.equals("HIDDEN")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException(zr6.i("No such value ", str, " for ChatStatus"));
        }
    }

    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return 'u';
        }
        if (i == 2) {
            return 'g';
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "remove";
        }
        throw null;
    }

    public static int d(float f, float f2, int i, int i2) {
        return tu0.G(f * f2) + i + i2;
    }

    public static lg3 e(int i, int i2, Bundle bundle) {
        return od2.a(new eqe(i), bundle, i2);
    }

    public static Object f(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder j(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void k(String str, s35 s35) {
        pnf.o(s35, new c64(str));
    }

    public static void l(boolean z, coc coc, boolean z2, String str) {
        coc.c(new gqd(z));
        coc.a(new gqd(z2));
        coc.d(str);
    }

    public static int m(float f, float f2, int i, int i2) {
        return i2 - (tu0.G(f * f2) * i);
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "AUDIO" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "BACK" : "FRONT";
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }
}

package defpackage;

import java.util.regex.Pattern;

/* renamed from: d4g  reason: default package */
public final class d4g {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final wpa a = new wpa();
    public final StringBuilder b = new StringBuilder();

    public static String a(wpa wpa, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = wpa.b;
        int i2 = wpa.c;
        while (i < i2 && !z) {
            char c2 = (char) wpa.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        wpa.H(i - wpa.b);
        return sb.toString();
    }

    public static String b(wpa wpa, StringBuilder sb) {
        c(wpa);
        if (wpa.a() == 0) {
            return null;
        }
        String a2 = a(wpa, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) wpa.u());
    }

    public static void c(wpa wpa) {
        while (true) {
            boolean z = true;
            while (wpa.a() > 0 && z) {
                int i = wpa.b;
                byte[] bArr = wpa.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    wpa.H(1);
                } else {
                    int i2 = wpa.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b2 == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            wpa.H(i2 - wpa.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}

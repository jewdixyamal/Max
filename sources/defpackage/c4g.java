package defpackage;

import java.util.regex.Pattern;

/* renamed from: c4g  reason: default package */
public final class c4g {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final yaf a = new yaf(3, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(yaf yaf, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = yaf.b;
        int i2 = yaf.c;
        while (i < i2 && !z) {
            char c2 = (char) yaf.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        yaf.I(i - yaf.b);
        return sb.toString();
    }

    public static String b(yaf yaf, StringBuilder sb) {
        c(yaf);
        if (yaf.c() == 0) {
            return null;
        }
        String a2 = a(yaf, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) yaf.v());
        return sb2.toString();
    }

    public static void c(yaf yaf) {
        while (true) {
            boolean z = true;
            while (yaf.c() > 0 && z) {
                int i = yaf.b;
                byte[] bArr = yaf.a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                    yaf.I(1);
                } else {
                    int i2 = yaf.c;
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
                            yaf.I(i2 - yaf.b);
                        }
                    }
                    z = false;
                }
            }
            return;
        }
    }
}

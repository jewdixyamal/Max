package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: da6  reason: default package */
public final class da6 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = maf.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(e99 e99) {
        int i = 0;
        while (true) {
            c99[] c99Arr = e99.a;
            if (i < c99Arr.length) {
                c99 c99 = c99Arr[i];
                if (c99 instanceof g73) {
                    g73 g73 = (g73) c99;
                    if ("iTunSMPB".equals(g73.c) && a(g73.o)) {
                        return;
                    }
                } else if (c99 instanceof u37) {
                    u37 u37 = (u37) c99;
                    if ("com.apple.iTunes".equals(u37.b) && "iTunSMPB".equals(u37.c) && a(u37.o)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}

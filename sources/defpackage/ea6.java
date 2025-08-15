package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ea6  reason: default package */
public final class ea6 {
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
            int i = oaf.a;
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

    public final void b(f99 f99) {
        int i = 0;
        while (true) {
            d99[] d99Arr = f99.a;
            if (i < d99Arr.length) {
                d99 d99 = d99Arr[i];
                if (d99 instanceof h73) {
                    h73 h73 = (h73) d99;
                    if ("iTunSMPB".equals(h73.c) && a(h73.o)) {
                        return;
                    }
                } else if (d99 instanceof v37) {
                    v37 v37 = (v37) d99;
                    if ("com.apple.iTunes".equals(v37.b) && "iTunSMPB".equals(v37.c) && a(v37.o)) {
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

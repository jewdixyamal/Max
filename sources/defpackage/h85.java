package defpackage;

import java.util.HashSet;

/* renamed from: h85  reason: default package */
public abstract class h85 {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (h85.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }
}

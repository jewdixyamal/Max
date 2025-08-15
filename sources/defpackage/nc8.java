package defpackage;

import java.util.HashSet;

/* renamed from: nc8  reason: default package */
public abstract class nc8 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (nc8.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (nc8.class) {
            str = b;
        }
        return str;
    }
}

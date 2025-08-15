package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: af7  reason: default package */
public final class af7 {
    public static String a(Date date) {
        String format;
        synchronized (ay7.v) {
            if (ay7.u == null) {
                ay7.u = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH);
            }
            format = ay7.u.format(date);
        }
        return format;
    }
}

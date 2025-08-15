package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: pe3  reason: default package */
public abstract class pe3 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, yq7 yq7) {
        configuration.setLocales(yq7.a.a);
    }
}

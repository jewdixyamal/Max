package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: qaf  reason: default package */
public final class qaf {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static qaf d;
    public final mq9 a;

    public qaf(mq9 mq9) {
        this.a = mq9;
    }

    public final boolean a(hb0 hb0) {
        if (TextUtils.isEmpty(hb0.c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return hb0.f + hb0.e < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}

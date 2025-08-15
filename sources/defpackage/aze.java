package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.tracer.minidump.Minidump;

/* renamed from: aze  reason: default package */
public abstract class aze {
    public static boolean a() {
        if (tpa.f((Object) null, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            tpa.f((Object) null, Boolean.TRUE);
            return false;
        }
    }

    public static void b(Context context) {
        String str;
        try {
            String q = c37.q();
            if (q.equals(context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(q.replace(':', '-'));
            }
            File J = lk5.J(new File(context.getCacheDir(), str), "minidump");
            m6d.y(J);
            Minidump.getInstance().installMinidumpWriter(J.getPath());
        } catch (Throwable unused) {
        }
    }
}

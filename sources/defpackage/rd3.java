package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.lang.Thread;
import org.json.JSONObject;

/* renamed from: rd3  reason: default package */
public final /* synthetic */ class rd3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ rd3(int i) {
        this.a = i;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                ((cba) jyc.a.i()).c(th, false);
                return;
        }
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause != null && cause != th) {
                th = cause;
            } else {
                return;
            }
        }
        jj6 jj6 = jj6.a;
        if (!kye.b && (context = jj6.c) != null && jj6.b.getAndSet(false)) {
            qi8 qi8 = kye.c;
            if (qi8 == null) {
                qi8 = null;
            }
            String str2 = (String) qi8.c;
            String q = c37.q();
            if (q.equals(context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(q.replace(':', '-'));
            }
            File file = new File(context.getCacheDir(), str);
            File J = lk5.J(file, "dump-tmp.hprof");
            File J2 = lk5.J(file, "dump-tmp-meta.json");
            try {
                m6d.y(file);
                Debug.dumpHprofData(J.getAbsolutePath());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("buildUuid", (Object) str2);
                jSONObject.put("tag", (Object) null);
                lk5.K(J2, jSONObject.toString());
            } catch (Exception unused) {
                jj6.a(J);
                jj6.a(J2);
            }
            File J3 = lk5.J(file, "dump.hprof");
            File J4 = lk5.J(file, "dump-meta.json");
            try {
                if (J3.exists()) {
                    m6d.k(J3);
                }
                if (J4.exists()) {
                    m6d.k(J4);
                }
                m6d.K(J, J3);
                m6d.K(J2, J4);
            } catch (Exception unused2) {
                jj6.a(J3);
                jj6.a(J4);
            }
        }
    }
}

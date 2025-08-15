package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kye  reason: default package */
public final class kye {
    public static final kye a = new Object();
    public static volatile boolean b;
    public static qi8 c;
    public static Context d;
    public static kbd e;
    public static pje f;
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final khe h = new khe(h8.X);
    public static final khe i = new khe(h8.o);
    public static volatile Map j = oz4.a;

    public static String a() {
        if (b) {
            return null;
        }
        Object obj = c().get(ote.b);
        if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
            new ph4(14).f();
        }
        Context context = d;
        if (context == null) {
            context = null;
        }
        String L = j47.L(context, "tracer_app_token");
        if (L == null) {
            throw new IllegalStateException("Could not find Tracer's appToken. Is Tracer plugin configured properly?");
        } else if (L.equals("0000000000000000000000000000000000000000000")) {
            return null;
        } else {
            return L;
        }
    }

    public static js4 b() {
        return (js4) i.getValue();
    }

    public static Map c() {
        if (g.get()) {
            return j;
        }
        throw new IllegalStateException("Tracer is not initialized");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [sp3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, y8] */
    public static List d(ri6 ri6) {
        ph4 ph4 = new ph4(14);
        ph4.b = 2147482647;
        Object gx3 = new gx3(ph4);
        Object sy3 = new sy3(new Object());
        qqd qqd = new qqd(8, (byte) 0);
        Boolean bool = Boolean.TRUE;
        qqd.b = bool;
        Object ry3 = new ry3(qqd);
        ? obj = new Object();
        obj.a = bool;
        Object fj6 = new fj6(obj);
        sy4 sy4 = new sy4(13, false);
        sy4.b = bool;
        Object fl4 = new fl4(sy4);
        Object obj2 = new Object();
        sh0 sh0 = new sh0(14, (byte) 0);
        sh0.c = bool;
        sh0.b = 1000;
        return y53.M(gx3, sy3, ry3, fj6, fl4, obj2, new hta(sh0));
    }
}

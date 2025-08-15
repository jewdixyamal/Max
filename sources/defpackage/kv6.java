package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.Executors;

/* renamed from: kv6  reason: default package */
public final class kv6 {
    public final m84 a;
    public final oz7 b;
    public final o84 c;
    public final Context d;
    public final bp4 e;
    public final cl4 f;
    public final la4 g;
    public final o55 h;
    public final pq9 i;
    public final nde j;
    public final uk4 k;
    public final qq9 l;
    public final mr0 m;
    public final m5b n;
    public final ey1 o;
    public final Set p;
    public final wz4 q;
    public final wz4 r;
    public final boolean s;
    public final uk4 t;
    public final va8 u;
    public final ho9 v;
    public final boolean w;
    public final yxc x;
    public final nd2 y;

    /* JADX WARNING: type inference failed for: r1v0, types: [ho9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, oz7] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, la4] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object, jc6] */
    /* JADX WARNING: type inference failed for: r1v18, types: [pq9, java.lang.Object] */
    public kv6(jv6 jv6) {
        pq9 pq9;
        f46.I();
        jn jnVar = jv6.k;
        jnVar.getClass();
        ? obj = new Object();
        jnVar.getClass();
        obj.a = jnVar.b;
        obj.b = new Object();
        obj.c = (x24) jnVar.c;
        obj.d = (oq0) jnVar.o;
        this.v = obj;
        Object systemService = jv6.b.getSystemService("activity");
        if (systemService != null) {
            this.a = new m84((ActivityManager) systemService);
            this.b = new Object();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            o84 o84 = jv6.a;
            this.c = o84 == null ? o84.g() : o84;
            Context context = jv6.b;
            if (context != null) {
                this.d = context;
                this.e = jv6.c;
                this.g = new Object();
                synchronized (pq9.class) {
                    try {
                        if (pq9.a == null) {
                            pq9.a = new Object();
                        }
                        pq9 = pq9.a;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                this.i = pq9;
                this.j = fp3.d;
                uk4 uk4 = jv6.e;
                if (uk4 == null) {
                    Context context2 = jv6.b;
                    f46.I();
                    uk4 = new uk4(new tk4(context2));
                }
                this.k = uk4;
                this.l = qq9.j();
                f46.I();
                mr0 mr0 = jv6.f;
                this.m = mr0 == null ? new zq6() : mr0;
                m5b m5b = jv6.g;
                m5b = m5b == null ? new m5b(new bg7(new h7b(29, false))) : m5b;
                this.n = m5b;
                this.o = new ey1(28);
                Set set = jv6.h;
                this.p = set == null ? wz4.a : set;
                wz4 wz4 = wz4.a;
                this.q = wz4;
                this.r = wz4;
                this.s = true;
                uk4 uk42 = jv6.i;
                this.t = uk42 != null ? uk42 : uk4;
                this.u = jv6.j;
                int i2 = ((n5b) m5b.a.d).d;
                o55 o55 = jv6.d;
                o55 o552 = o55;
                if (o55 == null) {
                    ? obj2 = new Object();
                    obj2.a = Executors.newFixedThreadPool(2, new cm9("FrescoIoBoundExecutor", 1));
                    obj2.b = Executors.newFixedThreadPool(i2, new cm9("FrescoDecodeExecutor", 1));
                    obj2.c = Executors.newFixedThreadPool(i2, new cm9("FrescoBackgroundExecutor", 1));
                    obj2.o = Executors.newFixedThreadPool(1, new cm9("FrescoLightWeightBackgroundExecutor", 1));
                    obj2.X = Executors.newScheduledThreadPool(i2, new cm9("FrescoBackgroundExecutor", 1));
                    o552 = obj2;
                }
                this.h = o552;
                this.w = true;
                this.x = jv6.l;
                this.y = new nd2(9);
                o84 o842 = new o84(10);
                ey1 ey1 = new ey1(13);
                ey1.b = o842;
                this.f = new cl4(ey1, this);
                f46.I();
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}

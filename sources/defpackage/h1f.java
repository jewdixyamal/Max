package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: h1f  reason: default package */
public final class h1f {
    public final Context a;
    public final f1f b;
    public final boolean c = false;
    public final boolean d = false;
    public final long e;
    public final pm7 f;
    public final vt g;
    public final yb9 h;
    public final zff i;
    public final v43 j;
    public final cj9 k;
    public final Looper l;
    public final xw0 m;
    public final she n;
    public final bie o;
    public final ece p;
    public final t85 q;
    public l1f r;
    public hj9 s;
    public dd3 t;
    public String u;
    public int v;
    public zd9 w;

    static {
        nc8.a("media3.transformer");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [t85, java.lang.Object] */
    public h1f(Context context, f1f f1f, long j2, pm7 pm7, yb9 yb9, qf4 qf4, na4 na4, rxd rxd, Looper looper) {
        xw0 xw0 = xw0.o;
        she she = she.a;
        this.a = context;
        this.b = f1f;
        this.e = j2;
        this.f = pm7;
        this.g = null;
        this.h = yb9;
        this.i = qf4;
        this.j = na4;
        this.k = rxd;
        this.l = looper;
        this.m = xw0;
        this.n = she;
        this.v = 0;
        this.o = she.a(looper, (Handler.Callback) null);
        this.p = new ece(this);
        ? obj = new Object();
        obj.b();
        this.q = obj;
    }

    public static void a(h1f h1f) {
        h1f.v = 0;
        dd3 dd3 = h1f.t;
        dd3.getClass();
        String str = h1f.u;
        str.getClass();
        h1f h1f2 = h1f;
        h1f2.f(dd3, new hj9(str, h1f.k, h1f.p, 0, false, (qy5) null, h1f.e), h1f.p, 0);
    }

    public static void b(h1f h1f) {
        h1f.getClass();
        gte gte = new gte(2, (Object) h1f);
        pm7 pm7 = h1f.f;
        pm7.c(-1, gte);
        pm7.b();
        h1f.v = 0;
    }

    public final void c() {
        g();
        l1f l1f = this.r;
        if (l1f != null) {
            try {
                if (!l1f.z) {
                    l1f.g();
                    l1f.j.b((Object) null, 4, 1, 0).b();
                    l1f.g.getClass();
                    l1f.p.b();
                    l1f.p.c();
                    RuntimeException runtimeException = l1f.w;
                    if (runtimeException != null) {
                        throw runtimeException;
                    }
                }
            } finally {
                this.r = null;
            }
        }
    }

    public final int d(fm5 fm5) {
        int e2;
        g();
        int i2 = this.v;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return 3;
        }
        if (i2 == 5 || i2 == 6) {
            if (this.w != null) {
                dd3 dd3 = this.t;
                fm9.h(dd3);
                long j2 = ((lv4) ((mv4) dd3.a.get(0)).a.get(0)).a.e.b;
                zd9 zd9 = this.w;
                float f2 = ((float) (zd9.b - j2)) / ((float) zd9.a);
                if (this.v == 5) {
                    l1f l1f = this.r;
                    if (!(l1f == null || (e2 = l1f.e(fm5)) == 0 || e2 == 1)) {
                        if (e2 == 2) {
                            fm5.b = Math.round(((float) fm5.b) * f2);
                        } else if (e2 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    float f3 = 100.0f * f2;
                    l1f l1f2 = this.r;
                    if (l1f2 == null) {
                        fm5.b = Math.round(f3);
                    } else {
                        int e3 = l1f2.e(fm5);
                        if (e3 == 0 || e3 == 1) {
                            fm5.b = Math.round(f3);
                        } else if (e3 == 2) {
                            fm5.b = Math.round(((1.0f - f2) * ((float) fm5.b)) + f3);
                        } else if (e3 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                return 2;
            }
            return 1;
        }
        l1f l1f3 = this.r;
        if (l1f3 == null) {
            return 0;
        }
        return l1f3.e(fm5);
    }

    public final void e(dd3 dd3, String str) {
        g();
        this.t = dd3;
        this.u = str;
        this.q.b();
        if (this.c) {
            dd3 dd32 = this.t;
            fm9.h(dd32);
            if (dd32.a.size() <= 1 && ((mv4) this.t.a.get(0)).a.size() <= 1) {
                this.v = 5;
                dd3 dd33 = this.t;
                fm9.h(dd33);
                lv4 lv4 = (lv4) ((mv4) dd33.a.get(0)).a.get(0);
                tb8 tb8 = lv4.a;
                db8 db8 = tb8.e;
                long j2 = db8.b;
                ib8 ib8 = tb8.b;
                fm9.h(ib8);
                ccd t2 = tpa.t(this.a, j2, ib8.a.toString());
                qy qyVar = new qy(this, db8.d, j2, lv4);
                bie bie = this.o;
                Objects.requireNonNull(bie);
                fm9.b(t2, qyVar, new wc3(bie, 1));
                return;
            }
        }
        String str2 = str;
        dd3 dd34 = dd3;
        f(dd34, new hj9(str2, this.k, this.p, 0, this.d, (qy5) null, this.e), this.p, 0);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [xe5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, pkg] */
    public final void f(dd3 dd3, hj9 hj9, ece ece, long j2) {
        BitmapFactory.Options options;
        qm7 qm7;
        dd3 dd32 = dd3;
        fm9.j("There is already an export in progress.", this.r == null);
        f1f f1f = this.b;
        if (dd32.g != 0) {
            ty a2 = f1f.a();
            a2.b = dd32.g;
            f1f = a2.a();
        }
        f1f f1f2 = f1f;
        x99 x99 = new x99(dd32, this.f, this.o, f1f2);
        vt vtVar = this.g;
        vt vtVar2 = vtVar;
        if (vtVar == null) {
            Context context = this.a;
            Context applicationContext = context.getApplicationContext();
            Object obj = new Object();
            xw0 xw0 = xw0.Z;
            ? obj2 = new Object();
            obj2.a = applicationContext;
            obj2.c = obj;
            obj2.b = -2000;
            obj2.o = xw0;
            she she = this.n;
            ? obj3 = new Object();
            obj3.a = context.getApplicationContext();
            obj3.b = obj2;
            obj3.c = she;
            if (oaf.a >= 26) {
                options = new BitmapFactory.Options();
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options = null;
            }
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            if (newSingleThreadExecutor instanceof qm7) {
                qm7 = (qm7) newSingleThreadExecutor;
            } else {
                qm7 = newSingleThreadExecutor instanceof ScheduledExecutorService ? new pc9((ScheduledExecutorService) newSingleThreadExecutor) : new mc9(newSingleThreadExecutor);
            }
            obj3.o = new v24(qm7, new h94(context), options);
            vtVar2 = obj3;
        }
        vt vtVar3 = vtVar2;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
            d54.a.clear();
            SystemClock.elapsedRealtime();
        }
        l1f l1f = r1;
        l1f l1f2 = new l1f(this.a, dd3, f1f2, vtVar3, this.h, this.i, this.j, hj9, ece, x99, this.o, this.m, this.n, j2);
        l1f l1f3 = l1f;
        this.r = l1f3;
        l1f3.g();
        l1f3.j.f(1);
        synchronized (l1f3.r) {
            l1f3.x = 1;
            l1f3.y = 0;
        }
    }

    public final void g() {
        if (Looper.myLooper() != this.l) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }
}

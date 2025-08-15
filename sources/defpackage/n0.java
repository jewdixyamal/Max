package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: n0  reason: default package */
public abstract class n0 {
    public static final l0 m = new Object();
    public static final NullPointerException n = new NullPointerException("No image request was specified!");
    public static final AtomicLong o = new AtomicLong();
    public final Context a;
    public final Set b;
    public final Set c;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public ide g;
    public ev3 h = null;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public mq4 l = null;

    public n0(Context context, Set set, Set set2) {
        this.a = context;
        this.b = set;
        this.c = set2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, zs6] */
    public final d2b a() {
        d2b d2b;
        Object obj;
        if (this.g == null || (this.e == null && this.f == null)) {
            if (this.e == null && (obj = this.f) != null) {
                this.e = obj;
                this.f = null;
            }
            f46.I();
            e2b e2b = (e2b) this;
            f46.I();
            try {
                mq4 mq4 = e2b.l;
                String valueOf = String.valueOf(o.getAndIncrement());
                if (mq4 instanceof d2b) {
                    d2b = (d2b) mq4;
                } else {
                    ty2 ty2 = e2b.q;
                    d2b d2b2 = new d2b((Resources) ty2.a, (bg4) ty2.b, (j84) ((cq4) ty2.c), (ExecutorService) ((Executor) ty2.o), (y7g) ((lq8) ty2.X), (wz) ty2.Y);
                    ide ide = (ide) ty2.Z;
                    if (ide != null) {
                        d2b2.D = ((Boolean) ide.get()).booleanValue();
                    }
                    d2b = d2b2;
                }
                ide b2 = e2b.b(d2b, valueOf);
                wv6 wv6 = (wv6) e2b.e;
                o84 o84 = e2b.p.h;
                do0 j2 = (o84 == null || wv6 == null) ? null : wv6.q != null ? o84.j(wv6, e2b.d) : o84.b(wv6, e2b.d);
                Object obj2 = e2b.d;
                d2b.getClass();
                f46.I();
                d2b.g(obj2, valueOf);
                d2b.s = false;
                d2b.t = false;
                d2b.C = b2;
                d2b.v((l43) null);
                d2b.B = j2;
                d2b.E = null;
                d2b.v((l43) null);
                f46.I();
                d2b.t(e2b.r, e2b);
                f46.I();
                d2b.t = false;
                d2b.o = this.k;
                d2b.p = null;
                boolean z = this.i;
                if (z) {
                    if (d2b.d == null) {
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = 4;
                        obj3.c = 0;
                        d2b.d = obj3;
                    }
                    d2b.d.b = z;
                    if (d2b.e == null) {
                        ta6 ta6 = new ta6(this.a);
                        d2b.e = ta6;
                        ta6.a = d2b;
                    }
                }
                Set<ev3> set = this.b;
                if (set != null) {
                    for (ev3 a2 : set) {
                        d2b.a(a2);
                    }
                }
                Set<ControllerListener2> set2 = this.c;
                if (set2 != null) {
                    for (ControllerListener2 addListener : set2) {
                        d2b.g.addListener(addListener);
                    }
                }
                ev3 ev3 = this.h;
                if (ev3 != null) {
                    d2b.a(ev3);
                }
                if (this.j) {
                    d2b.a(m);
                }
                f46.I();
                return d2b;
            } catch (Throwable th) {
                f46.I();
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ide b(defpackage.d2b r14, java.lang.String r15) {
        /*
            r13 = this;
            ide r0 = r13.g
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.Object r5 = r13.e
            r12 = 1
            if (r5 == 0) goto L_0x0017
            java.lang.Object r6 = r13.d
            m0 r0 = new m0
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r13.f
            if (r1 == 0) goto L_0x003d
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r1.add(r0)
            java.lang.Object r10 = r13.f
            java.lang.Object r11 = r13.d
            m0 r0 = new m0
            r6 = r0
            r7 = r13
            r8 = r14
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.add(r0)
            rz6 r0 = new rz6
            r13 = 0
            r0.<init>(r1, r13)
        L_0x003d:
            if (r0 != 0) goto L_0x0044
            x24 r0 = new x24
            r0.<init>()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0.b(d2b, java.lang.String):ide");
    }
}

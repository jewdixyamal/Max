package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: lv6  reason: default package */
public final class lv6 {
    public static lv6 p;
    public static iv6 q;
    public final aab a;
    public final kv6 b;
    public final wd6 c;
    public final cl4 d;
    public nw7 e;
    public y7g f;
    public nw7 g;
    public y7g h;
    public ob4 i;
    public uf9 j;
    public gab k;
    public kab l;
    public ct m;
    public ana n;
    public AnimatedFactoryV2Impl o;

    /* JADX WARNING: type inference failed for: r1v0, types: [aab, java.lang.Object] */
    public lv6(kv6 kv6) {
        f46.I();
        kv6.getClass();
        this.b = kv6;
        ho9 ho9 = kv6.v;
        ho9.getClass();
        ExecutorService c2 = kv6.h.c();
        ? obj = new Object();
        obj.a = c2;
        obj.b = new ArrayDeque();
        this.a = obj;
        this.c = new wd6(kv6.x);
        f46.I();
        this.d = kv6.f;
        ho9.getClass();
    }

    public static lv6 g() {
        lv6 lv6 = p;
        od2.o(lv6, "ImagePipelineFactory was not initialized!");
        return lv6;
    }

    public final j84 a() {
        AnimatedFactoryV2Impl b2 = b();
        if (b2 == null) {
            return null;
        }
        if (b2.h == null) {
            xe xeVar = new xe(0);
            v6d v6d = b2.i;
            if (v6d == null) {
                v6d = new md4(b2.b.a());
            }
            v6d v6d2 = v6d;
            xe xeVar2 = new xe(1);
            if (b2.f == null) {
                b2.f = new gaa((Object) b2);
            }
            gaa gaa = b2.f;
            if (v4f.b == null) {
                v4f.b = new v4f(new Handler(Looper.getMainLooper()));
            }
            b2.h = new j84(gaa, v4f.b, v6d2, RealtimeSinceBootClock.get(), b2.a, b2.c, xeVar, xeVar2, new x24(3, Boolean.valueOf(b2.k)), new x24(3, Boolean.valueOf(b2.d)), new x24(3, Integer.valueOf(b2.j)), new x24(3, Integer.valueOf(b2.l)));
        }
        return b2.h;
    }

    public final AnimatedFactoryV2Impl b() {
        if (this.o == null) {
            s2b h2 = h();
            kv6 kv6 = this.b;
            o55 o55 = kv6.h;
            jy3 c2 = c();
            kv6.v.getClass();
            kv6.v.getClass();
            kv6.v.getClass();
            kv6.v.getClass();
            kv6.getClass();
            if (!xfg.h) {
                Class<AnimatedFactoryV2Impl> cls = AnimatedFactoryV2Impl.class;
                Class<s2b> cls2 = s2b.class;
                Class<o55> cls3 = o55.class;
                Class<jy3> cls4 = jy3.class;
                try {
                    Class cls5 = Boolean.TYPE;
                    Class cls6 = Integer.TYPE;
                    Constructor<AnimatedFactoryV2Impl> constructor = cls.getConstructor(new Class[]{cls2, cls3, cls4, cls5, cls5, cls6, cls6, v6d.class});
                    Boolean bool = Boolean.FALSE;
                    xfg.i = constructor.newInstance(new Object[]{h2, o55, c2, bool, bool, 30, 1000, null});
                } catch (Throwable unused) {
                }
                if (xfg.i != null) {
                    xfg.h = true;
                }
            }
            this.o = xfg.i;
        }
        return this.o;
    }

    public final jy3 c() {
        if (this.e == null) {
            kv6 kv6 = this.b;
            nd2 nd2 = kv6.y;
            m84 m84 = kv6.a;
            qq9 qq9 = kv6.l;
            oz7 oz7 = kv6.b;
            kv6.v.getClass();
            kv6.v.getClass();
            kv6.getClass();
            nd2.getClass();
            nw7 nw7 = new nw7(new c32(9, (byte) 0), m84);
            qq9.getClass();
            this.e = nw7;
        }
        return this.e;
    }

    public final y7g d() {
        if (this.f == null) {
            jy3 c2 = c();
            pq9 pq9 = this.b.i;
            pq9.getClass();
            this.f = new y7g((Object) c2, 21, (Object) new wd6(18, (Object) pq9));
        }
        return this.f;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, vaf] */
    public final y7g e() {
        if (this.h == null) {
            kv6 kv6 = this.b;
            kv6.getClass();
            if (this.g == null) {
                nw7 nw7 = new nw7(new Object(), kv6.g);
                kv6.l.getClass();
                this.g = nw7;
            }
            nw7 nw72 = this.g;
            pq9 pq9 = kv6.i;
            pq9.getClass();
            this.h = new y7g((Object) nw72, 21, (Object) new sy4(14, (Object) pq9));
        }
        return this.h;
    }

    public final iv6 f() {
        iv6 iv6;
        iv6 iv62;
        ContentResolver contentResolver;
        we weVar;
        ye yeVar;
        if (q == null) {
            kv6 kv6 = this.b;
            kv6.v.getClass();
            kab kab = this.l;
            ho9 ho9 = kv6.v;
            if (kab == null) {
                ContentResolver contentResolver2 = kv6.d.getApplicationContext().getContentResolver();
                if (this.k == null) {
                    b46 b46 = (b46) ho9.b;
                    m5b m5b = kv6.n;
                    if (m5b.i == null) {
                        bg7 bg7 = m5b.a;
                        m5b.i = new ja6((qq9) bg7.e, (n5b) bg7.h, (rq9) bg7.i);
                    }
                    ja6 ja6 = m5b.i;
                    if (this.i == null) {
                        kv6.getClass();
                        AnimatedFactoryV2Impl b2 = b();
                        if (b2 != null) {
                            yeVar = new ye(0, b2);
                            weVar = new we(b2);
                        } else {
                            yeVar = null;
                            weVar = null;
                        }
                        kv6.v.getClass();
                        va8 va8 = kv6.u;
                        if (va8 == null) {
                            this.i = new ob4(yeVar, weVar, i(), (Map) null);
                        } else {
                            this.i = new ob4(yeVar, weVar, i(), (HashMap) va8.b);
                            je7 je7 = pu6.d;
                            pu6 p2 = i24.p();
                            p2.b = (ArrayList) va8.c;
                            p2.a();
                        }
                    }
                    ob4 ob4 = this.i;
                    y7g c2 = m5b.c(0);
                    m5b.d();
                    y7g d2 = d();
                    y7g e2 = e();
                    s2b h2 = h();
                    b46.getClass();
                    int i2 = ho9.a;
                    wd6 wd6 = this.c;
                    Context context = kv6.d;
                    ey1 ey1 = kv6.o;
                    bp4 bp4 = kv6.e;
                    iv62 = iv6;
                    contentResolver = contentResolver2;
                    this.k = new gab(context, ja6, ob4, ey1, bp4, kv6.s, kv6.h, c2, d2, e2, this.d, kv6.c, h2, i2, wd6);
                } else {
                    iv62 = iv6;
                    contentResolver = contentResolver2;
                }
                gab gab = this.k;
                ho9.getClass();
                if (this.j == null) {
                    kv6.getClass();
                    ho9 ho92 = kv6.v;
                    ho92.getClass();
                    this.j = new uf9(ho92.a);
                }
                ContentResolver contentResolver3 = contentResolver;
                this.l = new kab(contentResolver3, gab, kv6.m, kv6.s, this.a, kv6.e, kv6.w, this.j, kv6.r);
            } else {
                iv62 = iv6;
            }
            kv6.getClass();
            new iv6(this.l, kv6.p, kv6.q, kv6.j, d(), e(), this.d, kv6.c, (x24) ho9.c, this.b);
            q = iv62;
        }
        return q;
    }

    public final s2b h() {
        if (this.m == null) {
            m5b m5b = this.b.n;
            i();
            this.m = new ct(m5b.a(), this.c);
        }
        return this.m;
    }

    public final t2b i() {
        if (this.n == null) {
            kv6 kv6 = this.b;
            m5b m5b = kv6.n;
            kv6.v.getClass();
            kv6.v.getClass();
            oq0 oq0 = (oq0) kv6.v.d;
            go0 a2 = m5b.a();
            int i2 = ((n5b) m5b.a.d).d;
            v5b v5b = new v5b(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                yu0 yu0 = f54.a;
                v5b.e(ByteBuffer.allocate(16384));
            }
            this.n = new ana(a2, v5b, oq0);
        }
        return this.n;
    }
}

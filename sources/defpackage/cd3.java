package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: cd3  reason: default package */
public final class cd3 implements pgf {
    public static final cs A0 = new cs(1);
    public final t8b X;
    public final she Y;
    public final CopyOnWriteArraySet Z;
    public final Context a;
    public final bd3 b;
    public final cgf c;
    public final lgf o;
    public qy5 s0;
    public q75 t0;
    public bie u0;
    public s8b v0;
    public Pair w0;
    public int x0;
    public int y0 = 0;
    public long z0;

    public cd3(od odVar) {
        Context context = (Context) odVar.b;
        this.a = context;
        bd3 bd3 = new bd3(this, context);
        this.b = bd3;
        she she = (she) odVar.Y;
        this.Y = she;
        cgf cgf = (cgf) odVar.c;
        this.c = cgf;
        cgf.l = she;
        this.o = new lgf(new o9g(10, (Object) this), cgf);
        zc3 zc3 = (zc3) odVar.X;
        fm9.l(zc3);
        this.X = zc3;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Z = copyOnWriteArraySet;
        copyOnWriteArraySet.add(bd3);
    }

    public final void F(long j) {
        if (this.x0 <= 0) {
            long j2 = j - this.z0;
            lgf lgf = this.o;
            jlf jlf = lgf.g;
            if (jlf != null) {
                lgf.d.a(j2, jlf);
                lgf.g = null;
            }
            lgf.f.e(j2);
        }
    }

    public final void a(Surface surface, int i, int i2) {
        if (this.v0 != null) {
            this.v0.m(surface != null ? new jee(surface, i, i2, 0) : null);
            this.c.h(surface);
        }
    }

    public final void b(long j, long j2) {
        cd3 cd3 = this;
        if (cd3.x0 == 0) {
            while (true) {
                lgf lgf = cd3.o;
                uy uyVar = lgf.f;
                if (uyVar.o != 0) {
                    long f = uyVar.f();
                    Long l = (Long) lgf.e.f(f);
                    cgf cgf = lgf.b;
                    if (!(l == null || l.longValue() == lgf.i)) {
                        lgf.i = l.longValue();
                        cgf.d(2);
                    }
                    cgf cgf2 = cgf;
                    uy uyVar2 = uyVar;
                    long j3 = f;
                    int a2 = lgf.b.a(f, j, j2, lgf.i, false, lgf.c);
                    o9g o9g = lgf.a;
                    if (a2 == 0 || a2 == 1) {
                        lgf.j = j3;
                        boolean z = false;
                        boolean z2 = a2 == 0;
                        long h = uyVar2.h();
                        jlf jlf = (jlf) lgf.d.f(h);
                        if (jlf != null && !jlf.equals(jlf.e) && !jlf.equals(lgf.h)) {
                            lgf.h = jlf;
                            o9g.getClass();
                            ny5 ny5 = new ny5();
                            ny5.s = jlf.a;
                            ny5.t = jlf.b;
                            ny5.m = ia9.l("video/raw");
                            qy5 qy5 = new qy5(ny5);
                            cd3 cd32 = (cd3) o9g.b;
                            cd32.s0 = qy5;
                            Iterator it = cd32.Z.iterator();
                            while (it.hasNext()) {
                                bd3 bd3 = (bd3) it.next();
                                bd3.p.execute(new ad3(bd3, bd3.o, jlf));
                            }
                        }
                        long j4 = z2 ? -1 : lgf.c.c;
                        if (cgf2.e != 3) {
                            z = true;
                        }
                        cgf2.e = 3;
                        cgf2.l.getClass();
                        cgf2.g = oaf.S(SystemClock.elapsedRealtime());
                        cd3 cd33 = (cd3) o9g.b;
                        if (z && cd33.w0 != null) {
                            Iterator it2 = cd33.Z.iterator();
                            while (it2.hasNext()) {
                                bd3 bd32 = (bd3) it2.next();
                                bd32.p.execute(new ad3(bd32, bd32.o, 2));
                            }
                        }
                        if (cd33.t0 != null) {
                            if (cd33.s0 == null) {
                                new ny5().a();
                            }
                            q75 q75 = cd33.t0;
                            cd33.Y.getClass();
                            q75.d(h, System.nanoTime());
                        }
                        s8b s8b = cd33.v0;
                        fm9.l(s8b);
                        rf4 rf4 = (rf4) s8b.b(s8b.z0);
                        fm9.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rf4.h);
                        rf4.e.w(new gf4(rf4, j4, 1));
                    } else if (a2 == 2 || a2 == 3 || a2 == 4) {
                        lgf.j = j3;
                        uyVar2.h();
                        cd3 cd34 = (cd3) o9g.b;
                        Iterator it3 = cd34.Z.iterator();
                        while (it3.hasNext()) {
                            bd3 bd33 = (bd3) it3.next();
                            bd33.p.execute(new ad3(bd33, bd33.o, 1));
                        }
                        s8b s8b2 = cd34.v0;
                        fm9.l(s8b2);
                        rf4 rf42 = (rf4) s8b2.b(s8b2.z0);
                        fm9.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rf42.h);
                        rf42.e.w(new gf4(rf42, -2, 1));
                    } else if (a2 != 5) {
                        throw new IllegalStateException(String.valueOf(a2));
                    } else {
                        return;
                    }
                    cd3 = this;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            bd3 bd3 = (bd3) it.next();
            bd3.p.execute(new f5((Object) bd3, (Object) bd3.o, (Object) videoFrameProcessingException, 16));
        }
    }

    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    public final void o(int i, int i2) {
        lgf lgf = this.o;
        lgf.getClass();
        jlf jlf = new jlf(i, i2);
        if (!oaf.a(lgf.g, jlf)) {
            lgf.g = jlf;
        }
    }
}

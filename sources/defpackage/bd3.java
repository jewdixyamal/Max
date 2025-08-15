package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: bd3  reason: default package */
public final class bd3 {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public z18 d;
    public bgf e;
    public qy5 f;
    public int g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public hlf o;
    public Executor p;
    public final /* synthetic */ cd3 q;

    public bd3(cd3 cd3, Context context) {
        this.q = cd3;
        this.a = context;
        this.b = oaf.M(context) ? 1 : 5;
        this.c = new ArrayList();
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = hlf.r0;
        this.p = cd3.A0;
    }

    public final void a(boolean z) {
        if (c()) {
            rf4 rf4 = (rf4) this.e;
            nx0 nx0 = rf4.e;
            s27 s27 = rf4.d;
            if (s27.k != null) {
                try {
                    nx0.b();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    v2 v2Var = s27.k;
                    fm9.l(v2Var);
                    v2Var.u();
                    nf4 nf4 = new nf4(0, countDownLatch);
                    synchronized (v2Var.b) {
                        v2Var.c = nf4;
                    }
                    rk5 rk5 = rf4.i;
                    Objects.requireNonNull(rk5);
                    nx0.v(new nf4(1, rk5));
                    countDownLatch.await();
                    synchronized (v2Var.b) {
                        v2Var.c = null;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.m = false;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        cd3 cd3 = this.q;
        if (cd3.y0 == 1) {
            cd3.x0++;
            cd3.o.a();
            bie bie = cd3.u0;
            fm9.l(bie);
            bie.d(new cu1(17, cd3));
        }
        if (z) {
            cgf cgf = cd3.c;
            kgf kgf = cgf.b;
            kgf.k = 0;
            kgf.n = -1;
            kgf.l = -1;
            cgf.h = -9223372036854775807L;
            cgf.f = -9223372036854775807L;
            cgf.d(1);
            cgf.i = -9223372036854775807L;
        }
    }

    public final void b(qy5 qy5) {
        i63 i63;
        qy5 qy52 = qy5;
        fm9.k(!c());
        cd3 cd3 = this.q;
        fm9.k(cd3.y0 == 0);
        i63 i632 = qy52.A;
        if (i632 == null || !i632.e()) {
            i632 = i63.h;
        }
        if (i632.c != 7 || oaf.a >= 34) {
            i63 = i632;
        } else {
            g63 a2 = i632.a();
            a2.c = 6;
            i63 = new i63(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        }
        Looper myLooper = Looper.myLooper();
        fm9.l(myLooper);
        bie a3 = cd3.Y.a(myLooper, (Handler.Callback) null);
        cd3.u0 = a3;
        try {
            cd3.v0 = cd3.X.a(cd3.a, i63, cd3, new wc3(a3, 0), ffc.X);
            Pair pair = cd3.w0;
            if (pair != null) {
                lsd lsd = (lsd) pair.second;
                cd3.a((Surface) pair.first, lsd.a, lsd.b);
            }
            cd3.v0.c(0);
            cd3.y0 = 1;
            this.e = cd3.v0.b(0);
        } catch (VideoFrameProcessingException e2) {
            throw new VideoSink$VideoSinkException(e2, qy52);
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d() {
        if (this.f != null) {
            ArrayList arrayList = new ArrayList();
            z18 z18 = this.d;
            if (z18 != null) {
                arrayList.add(z18);
            }
            arrayList.addAll(this.c);
            qy5 qy5 = this.f;
            qy5.getClass();
            bgf bgf = this.e;
            fm9.l(bgf);
            int i2 = this.g;
            i63 i63 = qy5.A;
            if (i63 == null || !i63.e()) {
                i63 = i63.h;
            }
            i63 i632 = i63;
            rf4 rf4 = (rf4) bgf;
            rf4.c(i2, arrayList, new t26(i632, qy5.t, qy5.u, qy5.x, 0));
            this.k = -9223372036854775807L;
        }
    }

    public final void e(long j2, long j3) {
        try {
            this.q.b(j2, j3);
        } catch (ExoPlaybackException e2) {
            qy5 qy5 = this.f;
            if (qy5 == null) {
                qy5 = new ny5().a();
            }
            throw new VideoSink$VideoSinkException(e2, qy5);
        }
    }

    public final void f(Surface surface, lsd lsd) {
        cd3 cd3 = this.q;
        Pair pair = cd3.w0;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((lsd) cd3.w0.second).equals(lsd)) {
            cd3.w0 = Pair.create(surface, lsd);
            cd3.a(surface, lsd.a, lsd.b);
        }
    }
}

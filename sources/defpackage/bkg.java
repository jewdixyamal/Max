package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: bkg  reason: default package */
public final class bkg implements nr8, ah9, y2a, qj3, b18, bn4, a76, m87, o1d, w2e, h7 {
    public static bkg c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ bkg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static synchronized bkg y(Context context) {
        bkg bkg;
        synchronized (bkg.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (bkg.class) {
                bkg = c;
                if (bkg == null) {
                    bkg = new bkg(0);
                    l8e a2 = l8e.a(applicationContext);
                    bkg.b = a2;
                    a2.b();
                    a2.c();
                    c = bkg;
                }
            }
        }
        return bkg;
    }

    public x6g P(View view, x6g x6g) {
        ir0 ir0 = (ir0) this.b;
        hr0 hr0 = ir0.y0;
        if (hr0 != null) {
            ir0.Y.W.remove(hr0);
        }
        hr0 hr02 = new hr0(ir0.t0, x6g);
        ir0.y0 = hr02;
        hr02.e(ir0.getWindow());
        BottomSheetBehavior bottomSheetBehavior = ir0.Y;
        hr0 hr03 = ir0.y0;
        ArrayList arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(hr03)) {
            arrayList.add(hr03);
        }
        return x6g;
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        String.format("Released audio source successfully: 0x%x", new Object[]{Integer.valueOf(((e70) this.b).hashCode())});
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 7:
                Throwable th = (Throwable) obj;
                s12 s12 = (s12) this.b;
                hm9.p(s12.Z, "onUploadFailed: failed", th);
                eoe s = s12.s();
                long j = s12.b;
                s.d(j);
                s12.z();
                s12.y();
                s12.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), (String) null)));
                return;
            case 18:
                hm9.p(((k29) this.b).b, "postProcessText: failed", (Throwable) obj);
                return;
            case 27:
                Integer num = (Integer) obj;
                hm9.m(((cge) this.b).b, "Connection restored", new Object[0]);
                return;
            default:
                ((t4f) this.b).a.setValue((Float) obj);
                return;
        }
    }

    public void b() {
        wk9 wk9 = ((oj9) this.b).u0;
        if (wk9 != null) {
            wk9.n(new fj0(18));
        }
    }

    public void c(wq8 wq8, boolean z) {
        ((dn) this.b).o(wq8);
    }

    public void d(Throwable th) {
        String.format("An error occurred while attempting to release audio source: 0x%x", new Object[]{Integer.valueOf(((e70) this.b).hashCode())});
    }

    public void e(g05 g05, int i) {
        v84 o0;
        g05 g052;
        dx6 dx6 = null;
        hic hic = (hic) this.b;
        if (g05 != null) {
            zv6 zv6 = hic.d;
            g05.o0();
            yv6 createImageTranscoder = zv6.createImageTranscoder(g05.c, hic.c);
            createImageTranscoder.getClass();
            fi0 fi0 = hic.b;
            eab eab = hic.e;
            oj0 oj0 = (oj0) eab;
            oj0.c.j(eab, "ResizeAndRotateProducer");
            wv6 wv6 = oj0.a;
            y7g y7g = hic.h.b;
            y7g.getClass();
            rq8 rq8 = new rq8((pq8) y7g.b);
            try {
                anc anc = wv6.j;
                jic jic = wv6.i;
                g05.o0();
                fm5 b2 = createImageTranscoder.b(g05, rq8, anc, jic, g05.u0);
                int i2 = b2.b;
                if (i2 != 2) {
                    dx6 = hic.m(g05, wv6.i, b2, createImageTranscoder.a());
                    o0 = o43.o0(rq8.n());
                    g052 = new g05(o0);
                    g052.c = qb4.a;
                    g052.S();
                    ((oj0) eab).c.a(eab, "ResizeAndRotateProducer", dx6);
                    if (i2 != 1) {
                        i |= 16;
                    }
                    fi0.g(i, g052);
                    g05.d(g052);
                    o43.S(o0);
                    rq8.close();
                    return;
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e) {
                ((oj0) eab).c.d(eab, "ResizeAndRotateProducer", e, dx6);
                if (fi0.a(i)) {
                    fi0.e(e);
                }
            } catch (Throwable th) {
                rq8.close();
                throw th;
            }
        } else {
            hic.b.g(i, (Object) null);
        }
    }

    public void f(int i) {
        oj9 oj9 = (oj9) this.b;
        oj9.c.c = 0;
        oj9.Z1(oj9, true, i * 10);
    }

    public void g(z2e z2e) {
    }

    public void h() {
        ((k56) this.b).invoke();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int i(int r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.b
            one.me.sdk.sections.SectionRecyclerWidget r6 = (one.me.sdk.sections.SectionRecyclerWidget) r6
            r6.getClass()
            bc7[] r0 = one.me.sdk.sections.SectionRecyclerWidget.c
            r1 = 0
            r0 = r0[r1]
            q7c r2 = r6.a
            java.lang.Object r0 = r2.T0(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            hdc r0 = r0.getAdapter()
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            int r2 = r0.j()
            if (r7 < r2) goto L_0x0022
            return r1
        L_0x0022:
            if (r7 >= 0) goto L_0x0025
            return r1
        L_0x0025:
            boolean r2 = r0 instanceof defpackage.nd3
            r3 = 0
            if (r2 == 0) goto L_0x002e
            r2 = r0
            nd3 r2 = (defpackage.nd3) r2
            goto L_0x002f
        L_0x002e:
            r2 = r3
        L_0x002f:
            if (r2 == 0) goto L_0x0050
            android.util.Pair r2 = r2.D(r7)
            java.lang.Object r4 = r2.first
            mfd r5 = r6.n0()
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0050
            int r7 = r2.intValue()
            goto L_0x005a
        L_0x0050:
            mfd r2 = r6.n0()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00db
        L_0x005a:
            if (r7 > 0) goto L_0x005e
            r0 = r3
            goto L_0x0076
        L_0x005e:
            mfd r0 = r6.n0()
            iv r0 = r0.o
            java.util.List r0 = r0.f
            int r1 = r7 + -1
            java.lang.Object r0 = r0.get(r1)
            kfd r0 = (defpackage.kfd) r0
            int r0 = r0.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0076:
            mfd r1 = r6.n0()
            iv r1 = r1.o
            java.util.List r1 = r1.f
            java.lang.Object r1 = r1.get(r7)
            kfd r1 = (defpackage.kfd) r1
            int r1 = r1.u()
            mfd r2 = r6.n0()
            iv r2 = r2.o
            java.util.List r2 = r2.f
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 - r4
            if (r7 != r2) goto L_0x0099
            goto L_0x00b0
        L_0x0099:
            mfd r6 = r6.n0()
            iv r6 = r6.o
            java.util.List r6 = r6.f
            int r7 = r7 + r4
            java.lang.Object r6 = r6.get(r7)
            kfd r6 = (defpackage.kfd) r6
            int r6 = r6.u()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
        L_0x00b0:
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            int r6 = r0.intValue()
            if (r6 == r1) goto L_0x00c4
        L_0x00b9:
            if (r3 != 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r6 = r3.intValue()
            if (r1 == r6) goto L_0x00c4
        L_0x00c2:
            r4 = 4
            goto L_0x00da
        L_0x00c4:
            if (r0 != 0) goto L_0x00c7
            goto L_0x00da
        L_0x00c7:
            int r6 = r0.intValue()
            if (r6 == r1) goto L_0x00ce
            goto L_0x00da
        L_0x00ce:
            if (r3 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r6 = r3.intValue()
            if (r1 == r6) goto L_0x00d9
        L_0x00d7:
            r4 = 3
            goto L_0x00da
        L_0x00d9:
            r4 = 2
        L_0x00da:
            return r4
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkg.i(int):int");
    }

    public void j() {
        ((k56) this.b).invoke();
    }

    public void k(z2e z2e) {
        bc7[] bc7Arr = StickersScreen.v0;
        StickersScreen stickersScreen = (StickersScreen) this.b;
        boolean z = ((xf9) stickersScreen.o0().r().e.a.getValue()).a;
        long j = z2e.a;
        if (z) {
            dg9 r = stickersScreen.o0().r();
            vxd S = j47.S(r.a, ((w9a) r.b).a(), vx3.b, new bg9(r, j, (Continuation) null));
            r.f.o1(r, dg9.g[0], S);
            return;
        }
        f64 P1 = l6e.c.P1();
        P1.b(":stickers/preview?sticker_id=" + j, (Bundle) null);
    }

    public void l() {
        ((k56) this.b).invoke();
    }

    public yld m() {
        yld yld = (yld) this.b;
        int i = yld.e;
        int[] iArr = yld.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = yld.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = yld.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return yld;
    }

    public synchronized void n() {
        l8e l8e = (l8e) this.b;
        ReentrantLock reentrantLock = l8e.a;
        reentrantLock.lock();
        try {
            l8e.b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean o(wq8 wq8) {
        Window.Callback callback = ((dn) this.b).w0.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, wq8);
        return true;
    }

    public void p() {
        long j;
        y14 y14 = (y14) this.b;
        synchronized (tu0.i) {
            try {
                j = tu0.j ? tu0.k : -9223372036854775807L;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        y14.L = j;
        y14.y(true);
    }

    public void q() {
        ((k56) this.b).invoke();
    }

    public void r() {
        ((k56) this.b).invoke();
    }

    public void s() {
        ((k56) this.b).invoke();
    }

    public void t() {
        ((k56) this.b).invoke();
    }

    public void u() {
        yld yld = (yld) this.b;
        yld.e = (((int) (Math.min(1.0f, Math.max(0.0f, 1.0f)) * 255.0f)) << 24) | (yld.e & 16777215);
    }

    public void v(int i) {
        yld yld = (yld) this.b;
        yld.e = (i & 16777215) | (yld.e & -16777216);
    }

    public void w(long j) {
        if (j >= 0) {
            ((yld) this.b).o = j;
            return;
        }
        throw new IllegalArgumentException(ey8.h(j, "Given a negative duration: ").toString());
    }

    public void x(int i) {
        if (i >= 0) {
            ((yld) this.b).f = i;
            return;
        }
        throw new IllegalArgumentException(zr6.h(i, "Given invalid width: ").toString());
    }

    public bkg(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new g8c(foe.h, TimeUnit.MINUTES);
                return;
            case 13:
                this.b = new i56(5, 0, (byte) 0);
                return;
            case LangUtils.HASH_SEED /*17*/:
                this.b = new CopyOnWriteArraySet();
                return;
            case 25:
                yld yld = new yld();
                this.b = yld;
                yld.l = false;
                return;
            default:
                return;
        }
    }
}

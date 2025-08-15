package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: hk9  reason: default package */
public final class hk9 extends u2 implements ve8, ue8, slf {
    public final String X;
    public final we8 Y;
    public final long Z;
    public final FrgTrimVideo c;
    public final ad o;
    public long s0;
    public long t0;
    public long u0;
    public final xpb v0 = new xpb();
    public sd7 w0;
    public sd7 x0;
    public boolean y0 = true;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hk9(defpackage.nl9 r17, ru.ok.messages.media.trim.FrgTrimVideo r18, defpackage.ad r19, java.lang.String r20, defpackage.we8 r21, long r22, long r24, boolean r26) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            r3 = r21
            r4 = 0
            r0.<init>((int) r4, (java.lang.Object) r1)
            xpb r4 = new xpb
            r4.<init>()
            r0.v0 = r4
            r4 = 1
            r0.y0 = r4
            r4 = r18
            r0.c = r4
            r5 = r19
            r0.o = r5
            r0.X = r2
            r0.Y = r3
            r9 = r22
            r0.s0 = r9
            r11 = r24
            r0.t0 = r11
            r1.r(r0)
            r13 = r3
            bq7 r13 = (defpackage.bq7) r13
            r13.e = r0
            android.content.Context r3 = r18.d0()
            android.net.Uri r4 = android.net.Uri.parse(r20)
            long r14 = defpackage.s36.s(r3, r4)
            r0.Z = r14
            ee9 r8 = new ee9
            ce9 r3 = new ce9
            r4 = 0
            r3.<init>(r4, r2, r4, r4)
            java.util.List r7 = java.util.Collections.singletonList(r3)
            r2 = r8
            r3 = r22
            r5 = r14
            r1 = r8
            r8 = r26
            r2.<init>(r3, r5, r7, r8)
            r13.s(r1, r0)
            r1 = r17
            r2 = r22
            r4 = r22
            r6 = r24
            r8 = r14
            r1.A(r2, r4, r6, r8)
            r16.c2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk9.<init>(nl9, ru.ok.messages.media.trim.FrgTrimVideo, ad, java.lang.String, we8, long, long, boolean):void");
    }

    public final void D1(Throwable th) {
        int i = jpc.j3;
        FrgTrimVideo frgTrimVideo = this.c;
        Context d0 = frgTrimVideo.d0();
        if (d0 != null) {
            a14.N(0, d0, frgTrimVideo.h0(i));
        }
    }

    public final void G(Surface surface) {
        ((bq7) this.Y).r(surface);
    }

    public final int M0() {
        return ((bq7) this.Y).h();
    }

    public final void P(int i, int i2, int i3) {
        ((nl9) ((kk9) this.b)).t0.d();
    }

    public final int R() {
        return ((bq7) this.Y).j();
    }

    public final void W0() {
        hm9.k("hk9", "onMediaPlayerControllerDetach");
    }

    public final void Z1() {
        if (this.w0 == null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ztc a = ce.a();
            xpb xpb = this.v0;
            xpb.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            r0a n = new o1a(xpb, 300, timeUnit, a, false).n(ce.a());
            we8 we8 = this.Y;
            Objects.requireNonNull(we8);
            yt8 yt8 = new yt8(8, (Object) we8);
            kj6 kj6 = ft.e;
            r66 r66 = ft.d;
            sd7 sd7 = new sd7(kj6, ft.f, r66);
            Objects.requireNonNull(sd7, "observer is null");
            try {
                n.a(new nz9(sd7, yt8, kj6, r66));
                this.w0 = sd7;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void a2() {
        pause();
        ((bq7) this.Y).q(this.s0);
        ((nl9) ((kk9) this.b)).y0.setPointerPosition(this.s0);
    }

    public final void b2() {
        cqc.b(this.w0);
        this.w0 = null;
    }

    public final void c1() {
    }

    public final void c2() {
        int i = (this.s0 > 0 ? 1 : (this.s0 == 0 ? 0 : -1));
        kk9 kk9 = (kk9) this.b;
        if (i == 0 && this.t0 == this.Z) {
            ((nl9) kk9).B(false);
        } else {
            ((nl9) kk9).B(true);
        }
    }

    public final void f1() {
    }

    public final void h() {
        nl9 nl9 = (nl9) ((kk9) this.b);
        ((View) nl9.c).setKeepScreenOn(false);
        cqc.b(this.x0);
        this.x0 = null;
        nl9.u0.setVisibility(0);
        nl9.v0.setVisibility(4);
        nl9.C(true, ((bq7) this.Y).k());
    }

    public final void i() {
        nl9 nl9 = (nl9) ((kk9) this.b);
        ((View) nl9.c).setKeepScreenOn(true);
        nl9.v0.setVisibility(0);
        nl9.u0.setVisibility(4);
    }

    public final int i1() {
        return ((bq7) this.Y).i();
    }

    public final int j() {
        fef fef = ((bq7) this.Y).f;
        if (fef == null) {
            return 0;
        }
        return fef.j();
    }

    public final void o() {
        a2();
    }

    public final void pause() {
        cqc.b(this.x0);
        this.x0 = null;
        ((bq7) this.Y).n();
    }
}

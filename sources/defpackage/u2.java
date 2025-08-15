package defpackage;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* renamed from: u2  reason: default package */
public abstract class u2 implements jo, q3b, s7c {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public long A() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            return -9223372036854775807L;
        }
        return oaf.h0(x0.n(u75.p0(), (kue) this.b, 0).m);
    }

    public void A0(int i, tb8 tb8) {
        u75 u75 = (u75) this;
        u75.s0(zw6.n(tb8), i, i + 1);
    }

    public abstract int B();

    public void C0(tb8 tb8) {
        ((u75) this).O0(zw6.n(tb8));
    }

    public void D() {
        Y1(6);
    }

    public void E() {
        V1(((u75) this).p0(), -9223372036854775807L, false);
    }

    public void G1(int i, float f) {
    }

    public void J0() {
        int i;
        u75 u75 = (u75) this;
        if (u75.x0().q() || u75.n()) {
            S1();
        } else if (j0()) {
            mue x0 = u75.x0();
            if (x0.q()) {
                i = -1;
            } else {
                int p0 = u75.p0();
                u75.w2();
                int i2 = u75.R0;
                if (i2 == 1) {
                    i2 = 0;
                }
                u75.w2();
                i = x0.e(p0, i2, u75.S0);
            }
            if (i == -1) {
                S1();
            } else if (i == u75.p0()) {
                V1(u75.p0(), -9223372036854775807L, true);
            } else {
                V1(i, -9223372036854775807L, false);
            }
        } else if (!K1() || !y1()) {
            S1();
        } else {
            V1(u75.p0(), -9223372036854775807L, false);
        }
    }

    public void K0() {
        u75 u75 = (u75) this;
        u75.w2();
        X1(12, u75.H0);
    }

    public boolean K1() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        return !x0.q() && x0.n(u75.p0(), (kue) this.b, 0).a();
    }

    public void L0() {
        u75 u75 = (u75) this;
        u75.w2();
        X1(11, -u75.G0);
    }

    public abstract void L1(Object obj, Object obj2);

    public boolean M() {
        int i;
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = u75.p0();
            u75.w2();
            int i2 = u75.R0;
            if (i2 == 1) {
                i2 = 0;
            }
            u75.w2();
            i = x0.l(p0, i2, u75.S0);
        }
        return i != -1;
    }

    public void M1(u2 u2Var) {
        ((BitSet) this.b).or((BitSet) u2Var.b);
    }

    public abstract boolean N1();

    public abstract int O();

    public abstract lue O1();

    public f64 P1() {
        return (f64) ((je7) this.b).getValue();
    }

    public abstract void Q1();

    public tb8 R0() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            return null;
        }
        return x0.n(u75.p0(), (kue) this.b, 0).c;
    }

    public void R1(c64 c64) {
        P1().b(c64.b, (Bundle) null);
    }

    public void S(int i) {
        ((u75) this).U(i, i + 1);
    }

    public void S1() {
        ((u75) this).w2();
    }

    public Object T0(Object obj, bc7 bc7) {
        return this.b;
    }

    public boolean T1(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        yoe yoe = (yoe) this.b;
        if (yoe == null) {
            return N1();
        }
        int b2 = yoe.b(i, charSequence);
        if (b2 == 0) {
            return true;
        }
        if (b2 != 1) {
            return N1();
        }
        return false;
    }

    public boolean U1() {
        int i;
        ovd ovd = (ovd) this.b;
        View view = ovd.c.U0;
        if (view != null) {
            i = 4;
            if (!(view.getAlpha() == 0.0f && view.getVisibility() == 0)) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility == 8) {
                        i = 3;
                    } else {
                        throw new IllegalArgumentException(zr6.h(visibility, "Unknown visibility "));
                    }
                }
            }
        } else {
            i = 0;
        }
        int i2 = ovd.a;
        return i == i2 || !(i == 2 || i2 == 2);
    }

    public void V() {
        u75 u75 = (u75) this;
        if (u75.x0().q() || u75.n()) {
            S1();
            return;
        }
        boolean M = M();
        if (!K1() || n1()) {
            if (M) {
                long k = u75.k();
                u75.w2();
                if (k <= u75.I0) {
                    Y1(7);
                    return;
                }
            }
            W1(7, 0);
        } else if (M) {
            Y1(7);
        } else {
            S1();
        }
    }

    public abstract void V1(int i, long j, boolean z);

    public void W1(int i, long j) {
        V1(((u75) this).p0(), j, false);
    }

    public void X1(int i, long j) {
        u75 u75 = (u75) this;
        long k = u75.k() + j;
        long c = u75.c();
        if (c != -9223372036854775807L) {
            k = Math.min(k, c);
        }
        W1(i, Math.max(k, 0));
    }

    public void Y1(int i) {
        int i2;
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            i2 = -1;
        } else {
            int p0 = u75.p0();
            u75.w2();
            int i3 = u75.R0;
            if (i3 == 1) {
                i3 = 0;
            }
            u75.w2();
            i2 = x0.l(p0, i3, u75.S0);
        }
        if (i2 == -1) {
            S1();
        } else if (i2 == u75.p0()) {
            V1(u75.p0(), -9223372036854775807L, true);
        } else {
            V1(i2, -9223372036854775807L, false);
        }
    }

    public void Z(int i) {
        V1(i, -9223372036854775807L, false);
    }

    public boolean b() {
        u75 u75 = (u75) this;
        return u75.getPlaybackState() == 3 && u75.u() && u75.v0() == 0;
    }

    public abstract long b0();

    public void f0() {
        int i;
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = u75.p0();
            u75.w2();
            int i2 = u75.R0;
            if (i2 == 1) {
                i2 = 0;
            }
            u75.w2();
            i = x0.e(p0, i2, u75.S0);
        }
        if (i == -1) {
            S1();
        } else if (i == u75.p0()) {
            V1(u75.p0(), -9223372036854775807L, true);
        } else {
            V1(i, -9223372036854775807L, false);
        }
    }

    public abstract int getRepeatMode();

    public boolean j0() {
        int i;
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            i = -1;
        } else {
            int p0 = u75.p0();
            u75.w2();
            int i2 = u75.R0;
            if (i2 == 1) {
                i2 = 0;
            }
            u75.w2();
            i = x0.e(p0, i2, u75.S0);
        }
        return i != -1;
    }

    public abstract long k();

    public abstract boolean n();

    public boolean n1() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        return !x0.q() && x0.n(u75.p0(), (kue) this.b, 0).h;
    }

    public abstract int o0();

    public void o1(Object obj, bc7 bc7, Object obj2) {
        Object obj3 = this.b;
        this.b = obj2;
        L1(obj3, obj2);
    }

    public long p() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        if (x0.q()) {
            return -9223372036854775807L;
        }
        int p0 = u75.p0();
        kue kue = (kue) this.b;
        if (x0.n(p0, kue, 0).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (oaf.B(kue.g) - kue.f) - u75.b0();
    }

    public abstract int p0();

    public void pause() {
        ((u75) this).Y(false);
    }

    public void play() {
        ((u75) this).Y(true);
    }

    public abstract long q();

    public void r(int i, long j) {
        V1(i, j, false);
    }

    public void seekTo(long j) {
        W1(5, j);
    }

    public void setPlaybackSpeed(float f) {
        u75 u75 = (u75) this;
        u75.f(new c3b(f, u75.d().b));
    }

    public void t(tb8 tb8, long j) {
        ((u75) this).H0(0, j, zw6.n(tb8));
    }

    public void t0(int i, int i2) {
        if (i != i2) {
            ((u75) this).u0(i, i + 1, i2);
        }
    }

    public boolean t1(int i) {
        u75 u75 = (u75) this;
        u75.w2();
        return u75.X0.a(i);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public void v() {
        ((u75) this).U(0, Integer.MAX_VALUE);
    }

    public void w0(List list) {
        ((u75) this).d0(Integer.MAX_VALUE, list);
    }

    public int x() {
        u75 u75 = (u75) this;
        long e0 = u75.e0();
        long c = u75.c();
        if (e0 == -9223372036854775807L || c == -9223372036854775807L) {
            return 0;
        }
        if (c == 0) {
            return 100;
        }
        return oaf.j((int) ((e0 * 100) / c), 0, 100);
    }

    public boolean y1() {
        u75 u75 = (u75) this;
        mue x0 = u75.x0();
        return !x0.q() && x0.n(u75.p0(), (kue) this.b, 0).i;
    }

    public u2(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new kue();
                return;
            case 6:
                this.b = new ArrayList();
                return;
            case 7:
                this.b = new BitSet(20);
                return;
            case 8:
                this.b = g64.a.getAccessor().d(f64.class);
                return;
            default:
                this.b = new jue();
                return;
        }
    }

    public u2(MediaCodecInfo mediaCodecInfo, String str) {
        this.a = 5;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new Exception(wg0.i("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* renamed from: u75  reason: default package */
public final class u75 extends u2 {
    public final ArrayList A0;
    public final boolean B0;
    public final wj8 C0;
    public final i74 D0;
    public final Looper E0;
    public final hg0 F0;
    public final long G0;
    public final long H0;
    public final long I0;
    public final she J0;
    public final o75 K0;
    public final q75 L0;
    public final td M0;
    public final n40 N0;
    public final crd O0;
    public final ae3 P0;
    public final long Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public boolean V0;
    public dod W0;
    public final ae3 X;
    public k3b X0;
    public final Context Y;
    public gd8 Y0;
    public final q3b Z;
    public gd8 Z0;
    public AudioTrack a1;
    public Object b1;
    public final l0f c;
    public Surface c1;
    public final int d1;
    public lsd e1;
    public final int f1;
    public h30 g1;
    public float h1;
    public boolean i1;
    public zz3 j1;
    public final boolean k1;
    public boolean l1;
    public final int m1;
    public boolean n1;
    public final k3b o;
    public final ui4 o1;
    public jlf p1;
    public gd8 q1;
    public a3b r1;
    public final vj0[] s0;
    public int s1;
    public final hz7 t0;
    public long t1;
    public final bie u0;
    public final i75 v0;
    public final g85 w0;
    public final pm7 x0;
    public final CopyOnWriteArraySet y0;
    public final hue z0;

    static {
        nc8.a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [q3b, u75, u2] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, q75] */
    /* JADX WARNING: type inference failed for: r2v11, types: [crd, java.lang.Object] */
    public u75(x65 x65) {
        u75 u75;
        u75 u752;
        j4b j4b;
        x65 x652 = x65;
        ? u2Var = new u2(3);
        u2Var.X = new ae3(false, 1);
        try {
            u752 = u2Var;
            z04.J("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "]");
            Context context = x652.a;
            Context applicationContext = context.getApplicationContext();
            u2Var.Y = applicationContext;
            i74 i74 = (i74) x652.h.apply(x652.b);
            u2Var.D0 = i74;
            u2Var.m1 = x652.j;
            u2Var.g1 = x652.k;
            u2Var.d1 = x652.l;
            u2Var.i1 = false;
            u2Var.Q0 = x652.t;
            o75 o75 = new o75(u2Var);
            u2Var.K0 = o75;
            u2Var.L0 = new Object();
            Handler handler = new Handler(x652.i);
            vj0[] a = ((mgc) x652.c.get()).a(handler, o75, o75, o75, o75);
            u2Var.s0 = a;
            fm9.k(a.length > 0);
            hz7 hz7 = (hz7) x652.e.get();
            u2Var.t0 = hz7;
            u2Var.C0 = (wj8) x652.d.get();
            hg0 hg0 = (hg0) x652.g.get();
            u2Var.F0 = hg0;
            u2Var.B0 = x652.m;
            x1d x1d = x652.n;
            hg0 hg02 = hg0;
            u2Var.G0 = x652.o;
            u2Var.H0 = x652.p;
            u2Var.I0 = x652.q;
            Looper looper = x652.i;
            u2Var.E0 = looper;
            she she = x652.b;
            u2Var.J0 = she;
            u2Var.Z = u2Var;
            u2Var.x0 = new pm7(looper, she, new i75(u2Var, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            u2Var.y0 = copyOnWriteArraySet;
            u2Var.A0 = new ArrayList();
            u2Var.W0 = new dod();
            Context context2 = context;
            l0f l0f = new l0f(new lgc[a.length], new n85[a.length], p0f.b, (fz7) null);
            u2Var.c = l0f;
            u2Var.z0 = new hue();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = iArr[i];
                fm9.k(!false);
                sparseBooleanArray.append(i3, true);
                i++;
                length = i2;
                iArr = iArr;
            }
            hz7.getClass();
            fm9.k(!false);
            sparseBooleanArray.append(29, true);
            fm9.k(!false);
            tm5 tm5 = new tm5(sparseBooleanArray);
            u2Var.o = new k3b(tm5);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i4 = 0;
            while (i4 < tm5.a.size()) {
                int b = tm5.b(i4);
                fm9.k(!false);
                sparseBooleanArray2.append(b, true);
                i4++;
                tm5 = tm5;
            }
            fm9.k(!false);
            sparseBooleanArray2.append(4, true);
            fm9.k(!false);
            sparseBooleanArray2.append(10, true);
            fm9.k(!false);
            u2Var.X0 = new k3b(new tm5(sparseBooleanArray2));
            u2Var.u0 = she.a(looper, (Handler.Callback) null);
            i75 i75 = new i75(u2Var, 3);
            u2Var.v0 = i75;
            u2Var.r1 = a3b.i(l0f);
            i74.J(u2Var, looper);
            int i5 = oaf.a;
            String str = x652.w;
            if (i5 < 31) {
                u752 = u2Var;
                j4b = new j4b(str);
            } else {
                j4b = m75.a(applicationContext, u2Var, x652.u, str);
            }
            pn7 pn7 = (pn7) x652.f.get();
            int i6 = u2Var.R0;
            boolean z = u2Var.S0;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            try {
                Handler handler2 = handler;
                u75 u753 = this;
                u752 = u753;
                u753.w0 = new g85(a, hz7, l0f, pn7, hg02, i6, z, i74, x1d, x652.r, x652.s, looper, she, i75, j4b);
                u753.h1 = 1.0f;
                u753.R0 = 0;
                gd8 gd8 = gd8.J;
                u753.Y0 = gd8;
                u753.Z0 = gd8;
                u753.q1 = gd8;
                u753.s1 = -1;
                if (i5 < 21) {
                    AudioTrack audioTrack = u753.a1;
                    if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                        u753.a1.release();
                        u753.a1 = null;
                    }
                    if (u753.a1 == null) {
                        u753.a1 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    u753.f1 = u753.a1.getAudioSessionId();
                } else {
                    AudioManager audioManager = (AudioManager) u753.Y.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    u753.f1 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
                }
                u753.j1 = zz3.c;
                u753.k1 = true;
                u753.z(u753.D0);
                Handler handler3 = new Handler(looper);
                i74 i742 = u753.D0;
                i84 i84 = (i84) hg02;
                i84.getClass();
                i742.getClass();
                re6 re6 = i84.b;
                re6.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) re6.b;
                u752 = u753;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    fg0 fg0 = (fg0) it.next();
                    if (fg0.b == i742) {
                        fg0.c = true;
                        copyOnWriteArrayList.remove(fg0);
                    }
                }
                copyOnWriteArrayList.add(new fg0(handler3, i742));
                copyOnWriteArraySet2.add(u753.K0);
                Context context3 = context2;
                Handler handler4 = handler2;
                td tdVar = new td(context3, handler4, u753.K0);
                u753.M0 = tdVar;
                tdVar.v();
                n40 n40 = new n40(context3, handler4, u753.K0);
                u753.N0 = n40;
                n40.b((h30) null);
                ? obj = new Object();
                context3.getApplicationContext();
                u753.O0 = obj;
                ae3 ae3 = new ae3(context3);
                u753.P0 = ae3;
                ae3.h();
                sv0 sv0 = new sv0(0);
                sv0.c = 0;
                sv0.d = 0;
                u753.o1 = sv0.b();
                u753.p1 = jlf.e;
                u753.e1 = lsd.c;
                u753.t0.a(u753.g1);
                u753.n2(1, 10, Integer.valueOf(u753.f1));
                u753.n2(2, 10, Integer.valueOf(u753.f1));
                u753.n2(1, 3, u753.g1);
                u753.n2(2, 4, Integer.valueOf(u753.d1));
                u753.n2(2, 5, 0);
                u753.n2(1, 9, Boolean.valueOf(u753.i1));
                u753.n2(2, 7, u753.L0);
                u753.n2(6, 8, u753.L0);
                u753.n2(-1, 16, Integer.valueOf(u753.m1));
                u753.X.g();
            } catch (Throwable th) {
                th = th;
                u75 = this;
                u75.X.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            u75 = u752;
            u75.X.g();
            throw th;
        }
    }

    public static long h2(a3b a3b) {
        kue kue = new kue();
        hue hue = new hue();
        a3b.a.h(a3b.b.a, hue);
        long j = a3b.c;
        if (j != -9223372036854775807L) {
            return hue.e + j;
        }
        return a3b.a.n(hue.c, kue, 0).l;
    }

    public final int B() {
        w2();
        if (this.r1.a.q()) {
            return 0;
        }
        a3b a3b = this.r1;
        return a3b.a.b(a3b.b.a);
    }

    public final jlf C() {
        w2();
        return this.p1;
    }

    public final void D0() {
        w2();
    }

    public final boolean E0() {
        w2();
        return this.S0;
    }

    public final h30 F() {
        w2();
        return this.g1;
    }

    public final j0f F0() {
        w2();
        return ((cf4) this.t0).f();
    }

    public final long G0() {
        w2();
        if (this.r1.a.q()) {
            return this.t1;
        }
        a3b a3b = this.r1;
        if (a3b.k.d != a3b.b.d) {
            return oaf.h0(a3b.a.n(p0(), (kue) this.b, 0).m);
        }
        long j = a3b.q;
        if (this.r1.k.b()) {
            a3b a3b2 = this.r1;
            hue h = a3b2.a.h(a3b2.k.a, this.z0);
            long d = h.d(this.r1.k.b);
            j = d == Long.MIN_VALUE ? h.d : d;
        }
        a3b a3b3 = this.r1;
        mue mue = a3b3.a;
        Object obj = a3b3.k.a;
        hue hue = this.z0;
        mue.h(obj, hue);
        return oaf.h0(j + hue.e);
    }

    public final void H(int i, boolean z) {
        w2();
    }

    public final void H0(int i, long j, List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        o2(c2, i, j, false);
    }

    public final ui4 I() {
        w2();
        return this.o1;
    }

    public final void I0(int i) {
        w2();
    }

    public final void J() {
        w2();
    }

    public final void L(int i, int i2) {
        w2();
    }

    public final void N(int i) {
        w2();
    }

    public final gd8 N0() {
        w2();
        return this.Y0;
    }

    public final int O() {
        w2();
        if (n()) {
            return this.r1.b.c;
        }
        return -1;
    }

    public final void O0(List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        o2(c2, -1, -9223372036854775807L, true);
    }

    public final long P0() {
        w2();
        return this.G0;
    }

    public final void Q(j0f j0f) {
        w2();
        hz7 hz7 = this.t0;
        hz7.getClass();
        if (!j0f.equals(((cf4) hz7).f())) {
            hz7.b(j0f);
            this.x0.f(19, new k75(j0f, 0));
        }
    }

    public final void U(int i, int i2) {
        w2();
        fm9.f(i >= 0 && i2 >= i);
        int size = this.A0.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            a3b l2 = l2(this.r1, i, min);
            t2(l2, 0, !l2.b.a.equals(this.r1.b.a), 4, e2(l2), -1, false);
        }
    }

    public final void V1(int i, long j, boolean z) {
        w2();
        if (i != -1) {
            fm9.f(i >= 0);
            mue mue = this.r1.a;
            if (mue.q() || i < mue.p()) {
                i74 i74 = this.D0;
                if (!i74.t0) {
                    fd b = i74.b();
                    i74.t0 = true;
                    i74.I(b, -1, new v64(13));
                }
                this.T0++;
                if (n()) {
                    z04.c0("seekTo ignored because an ad is playing");
                    b85 b85 = new b85(this.r1);
                    b85.d(1);
                    u75 u75 = this.v0.b;
                    u75.u0.d(new kl4((Object) u75, 18, (Object) b85));
                    return;
                }
                a3b a3b = this.r1;
                int i2 = a3b.e;
                if (i2 == 3 || (i2 == 4 && !mue.q())) {
                    a3b = this.r1.g(2);
                }
                int p0 = p0();
                a3b i22 = i2(a3b, mue, j2(mue, i, j));
                this.w0.s0.a(3, new e85(mue, i, oaf.S(j))).b();
                t2(i22, 0, true, 1, e2(i22), p0, z);
            }
        }
    }

    public final PlaybackException X() {
        w2();
        return this.r1.f;
    }

    public final void Y(boolean z) {
        w2();
        int d = this.N0.d(getPlaybackState(), z);
        s2(d, d == -1 ? 2 : 1, z);
    }

    public final ArrayList Z1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            tk8 tk8 = new tk8((ej0) list.get(i2), this.B0);
            arrayList.add(tk8);
            this.A0.add(i2 + i, new s75(tk8.b, tk8.a));
        }
        this.W0 = this.W0.a(i, arrayList.size());
        return arrayList;
    }

    public final boolean a() {
        w2();
        return this.r1.g;
    }

    public final long a0() {
        w2();
        return this.H0;
    }

    public final a3b a2(a3b a3b, int i, ArrayList arrayList) {
        mue mue = a3b.a;
        this.T0++;
        ArrayList Z1 = Z1(i, arrayList);
        b5b b5b = new b5b(this.A0, this.W0);
        a3b i2 = i2(a3b, b5b, g2(mue, b5b, f2(a3b), d2(a3b)));
        this.w0.s0.b(new y75(Z1, this.W0, -1, -9223372036854775807L), 18, i, 0).b();
        return i2;
    }

    public final long b0() {
        w2();
        return d2(this.r1);
    }

    public final gd8 b2() {
        mue x02 = x0();
        if (x02.q()) {
            return this.q1;
        }
        tb8 tb8 = x02.n(p0(), (kue) this.b, 0).c;
        ed8 a = this.q1.a();
        gd8 gd8 = tb8.d;
        if (gd8 != null) {
            CharSequence charSequence = gd8.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = gd8.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = gd8.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = gd8.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = gd8.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = gd8.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = gd8.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = gd8.h;
            if (l != null) {
                a.i(l);
            }
            e5c e5c = gd8.i;
            if (e5c != null) {
                a.i = e5c;
            }
            e5c e5c2 = gd8.j;
            if (e5c2 != null) {
                a.j = e5c2;
            }
            byte[] bArr = gd8.k;
            Uri uri = gd8.m;
            if (!(uri == null && bArr == null)) {
                a.m = uri;
                a.f(bArr, gd8.l);
            }
            Integer num = gd8.n;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = gd8.o;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = gd8.p;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = gd8.q;
            if (bool != null) {
                a.q = bool;
            }
            Boolean bool2 = gd8.r;
            if (bool2 != null) {
                a.r = bool2;
            }
            Integer num4 = gd8.s;
            if (num4 != null) {
                a.s = num4;
            }
            Integer num5 = gd8.t;
            if (num5 != null) {
                a.s = num5;
            }
            Integer num6 = gd8.u;
            if (num6 != null) {
                a.t = num6;
            }
            Integer num7 = gd8.v;
            if (num7 != null) {
                a.u = num7;
            }
            Integer num8 = gd8.w;
            if (num8 != null) {
                a.v = num8;
            }
            Integer num9 = gd8.x;
            if (num9 != null) {
                a.w = num9;
            }
            Integer num10 = gd8.y;
            if (num10 != null) {
                a.x = num10;
            }
            CharSequence charSequence8 = gd8.z;
            if (charSequence8 != null) {
                a.y = charSequence8;
            }
            CharSequence charSequence9 = gd8.A;
            if (charSequence9 != null) {
                a.z = charSequence9;
            }
            CharSequence charSequence10 = gd8.B;
            if (charSequence10 != null) {
                a.A = charSequence10;
            }
            Integer num11 = gd8.C;
            if (num11 != null) {
                a.B = num11;
            }
            Integer num12 = gd8.D;
            if (num12 != null) {
                a.C = num12;
            }
            CharSequence charSequence11 = gd8.E;
            if (charSequence11 != null) {
                a.D = charSequence11;
            }
            CharSequence charSequence12 = gd8.F;
            if (charSequence12 != null) {
                a.E = charSequence12;
            }
            CharSequence charSequence13 = gd8.G;
            if (charSequence13 != null) {
                a.F = charSequence13;
            }
            Integer num13 = gd8.H;
            if (num13 != null) {
                a.G = num13;
            }
            Bundle bundle = gd8.I;
            if (bundle != null) {
                a.H = bundle;
            }
        }
        return new gd8(a);
    }

    public final long c() {
        w2();
        if (!n()) {
            return A();
        }
        a3b a3b = this.r1;
        yj8 yj8 = a3b.b;
        mue mue = a3b.a;
        Object obj = yj8.a;
        hue hue = this.z0;
        mue.h(obj, hue);
        return oaf.h0(hue.a(yj8.b, yj8.c));
    }

    public final ArrayList c2(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.C0.e((tb8) list.get(i)));
        }
        return arrayList;
    }

    public final c3b d() {
        w2();
        return this.r1.o;
    }

    public final void d0(int i, List list) {
        w2();
        ArrayList c2 = c2(list);
        w2();
        fm9.f(i >= 0);
        ArrayList arrayList = this.A0;
        int min = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            boolean z = this.s1 == -1;
            w2();
            o2(c2, -1, -9223372036854775807L, z);
            return;
        }
        t2(a2(this.r1, min, c2), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final long d2(a3b a3b) {
        if (!a3b.b.b()) {
            return oaf.h0(e2(a3b));
        }
        Object obj = a3b.b.a;
        mue mue = a3b.a;
        hue hue = this.z0;
        mue.h(obj, hue);
        long j = a3b.c;
        return j == -9223372036854775807L ? oaf.h0(mue.n(f2(a3b), (kue) this.b, 0).l) : oaf.h0(hue.e) + oaf.h0(j);
    }

    public final float e() {
        w2();
        return this.h1;
    }

    public final long e0() {
        w2();
        if (!n()) {
            return G0();
        }
        a3b a3b = this.r1;
        return a3b.k.equals(a3b.b) ? oaf.h0(this.r1.q) : c();
    }

    public final long e2(a3b a3b) {
        if (a3b.a.q()) {
            return oaf.S(this.t1);
        }
        long j = a3b.p ? a3b.j() : a3b.s;
        if (a3b.b.b()) {
            return j;
        }
        mue mue = a3b.a;
        Object obj = a3b.b.a;
        hue hue = this.z0;
        mue.h(obj, hue);
        return j + hue.e;
    }

    public final void f(c3b c3b) {
        w2();
        if (!this.r1.o.equals(c3b)) {
            a3b f = this.r1.f(c3b);
            this.T0++;
            this.w0.s0.a(4, c3b).b();
            t2(f, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final int f2(a3b a3b) {
        if (a3b.a.q()) {
            return this.s1;
        }
        return a3b.a.h(a3b.b.a, this.z0).c;
    }

    public final void g(float f) {
        w2();
        float i = oaf.i(f, 0.0f, 1.0f);
        if (this.h1 != i) {
            this.h1 = i;
            n2(1, 2, Float.valueOf(this.N0.e * i));
            this.x0.f(22, new b75(1, i));
        }
    }

    public final void g0(int i) {
        w2();
    }

    public final Pair g2(mue mue, b5b b5b, int i, long j) {
        b5b b5b2 = b5b;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (mue.q() || b5b.q()) {
            boolean z = !mue.q() && b5b.q();
            if (!z) {
                i2 = i;
            }
            if (!z) {
                j2 = j;
            }
            return j2(b5b, i2, j2);
        }
        Pair j3 = mue.j((kue) this.b, this.z0, i, oaf.S(j));
        Object obj = j3.first;
        if (b5b.b(obj) != -1) {
            return j3;
        }
        int G = g85.G((kue) this.b, this.z0, this.R0, this.S0, obj, mue, b5b);
        if (G == -1) {
            return j2(b5b, -1, -9223372036854775807L);
        }
        kue kue = (kue) this.b;
        b5b.n(G, kue, 0);
        return j2(b5b, G, oaf.h0(kue.l));
    }

    public final int getPlaybackState() {
        w2();
        return this.r1.e;
    }

    public final int getRepeatMode() {
        w2();
        return this.R0;
    }

    public final p0f h0() {
        w2();
        return (p0f) this.r1.i.Y;
    }

    public final a3b i2(a3b a3b, mue mue, Pair pair) {
        List list;
        int i;
        mue mue2 = mue;
        Pair pair2 = pair;
        fm9.f(mue.q() || pair2 != null);
        mue mue3 = a3b.a;
        long d2 = d2(a3b);
        a3b h = a3b.h(mue);
        if (mue.q()) {
            yj8 yj8 = a3b.u;
            long S = oaf.S(this.t1);
            a3b b = h.c(yj8, S, S, S, 0, tze.d, this.c, ffc.X).b(yj8);
            b.q = b.s;
            return b;
        }
        Object obj = h.b.a;
        int i2 = oaf.a;
        boolean z = !obj.equals(pair2.first);
        yj8 yj82 = z ? new yj8(pair2.first) : h.b;
        long longValue = ((Long) pair2.second).longValue();
        long S2 = oaf.S(d2);
        if (!mue3.q()) {
            S2 -= mue3.h(obj, this.z0).e;
        }
        if (z || longValue < S2) {
            long j = longValue;
            yj8 yj83 = yj82;
            fm9.k(!yj83.b());
            tze tze = z ? tze.d : h.h;
            l0f l0f = z ? this.c : h.i;
            if (z) {
                ls5 ls5 = zw6.b;
                list = ffc.X;
            } else {
                list = h.j;
            }
            a3b b2 = h.c(yj83, j, j, j, 0, tze, l0f, list).b(yj83);
            b2.q = j;
            return b2;
        } else if (i == 0) {
            int b3 = mue2.b(h.k.a);
            if (b3 != -1 && mue2.g(b3, this.z0, false).c == mue2.h(yj82.a, this.z0).c) {
                return h;
            }
            mue2.h(yj82.a, this.z0);
            long a = yj82.b() ? this.z0.a(yj82.b, yj82.c) : this.z0.d;
            a3b b4 = h.c(yj82, h.s, h.s, h.d, a - h.s, h.h, h.i, h.j).b(yj82);
            b4.q = a;
            return b4;
        } else {
            yj8 yj84 = yj82;
            fm9.k(!yj84.b());
            long max = Math.max(0, h.r - (longValue - S2));
            long j2 = h.q;
            if (h.k.equals(h.b)) {
                j2 = longValue + max;
            }
            a3b c2 = h.c(yj84, longValue, longValue, longValue, max, h.h, h.i, h.j);
            c2.q = j2;
            return c2;
        }
    }

    public final Pair j2(mue mue, int i, long j) {
        if (mue.q()) {
            this.s1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.t1 = j;
            return null;
        }
        if (i == -1 || i >= mue.p()) {
            i = mue.a(this.S0);
            j = oaf.h0(mue.n(i, (kue) this.b, 0).l);
        }
        return mue.j((kue) this.b, this.z0, i, oaf.S(j));
    }

    public final long k() {
        w2();
        return oaf.h0(e2(this.r1));
    }

    public final gd8 k0() {
        w2();
        return this.Z0;
    }

    public final void k2(int i, int i2) {
        lsd lsd = this.e1;
        if (i != lsd.a || i2 != lsd.b) {
            this.e1 = new lsd(i, i2);
            this.x0.f(24, new h75(i, i2, 0));
            n2(2, 14, new lsd(i, i2));
        }
    }

    public final int l() {
        w2();
        return 0;
    }

    public final zz3 l0() {
        w2();
        return this.j1;
    }

    public final a3b l2(a3b a3b, int i, int i2) {
        int f2 = f2(a3b);
        long d2 = d2(a3b);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        this.T0++;
        m2(i, i2);
        b5b b5b = new b5b(arrayList, this.W0);
        a3b i22 = i2(a3b, b5b, g2(a3b.a, b5b, f2, d2));
        int i3 = i22.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && f2 >= i22.a.p()) {
            i22 = i22.g(4);
        }
        this.w0.s0.b(this.W0, 20, i, i2).b();
        return i22;
    }

    public final void m(Surface surface) {
        w2();
        p2(surface);
        int i = surface == null ? 0 : -1;
        k2(i, i);
    }

    public final void m0(h30 h30, boolean z) {
        w2();
        if (!this.n1) {
            boolean a = oaf.a(this.g1, h30);
            int i = 1;
            pm7 pm7 = this.x0;
            if (!a) {
                this.g1 = h30;
                n2(1, 3, h30);
                pm7.c(20, new j75(h30, 0));
            }
            h30 h302 = z ? h30 : null;
            n40 n40 = this.N0;
            n40.b(h302);
            this.t0.a(h30);
            boolean u = u();
            int d = n40.d(getPlaybackState(), u);
            if (d == -1) {
                i = 2;
            }
            s2(d, i, u);
            pm7.b();
        }
    }

    public final void m2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.A0.remove(i3);
        }
        dod dod = this.W0;
        int i4 = i2 - i;
        int[] iArr = dod.b;
        int[] iArr2 = new int[(iArr.length - i4)];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.W0 = new dod(iArr2, new Random(dod.a.nextLong()));
    }

    public final boolean n() {
        w2();
        return this.r1.b.b();
    }

    public final void n0(gd8 gd8) {
        w2();
        if (!gd8.equals(this.Z0)) {
            this.Z0 = gd8;
            this.x0.f(15, new i75(this, 1));
        }
    }

    public final void n2(int i, int i2, Object obj) {
        for (vj0 vj0 : this.s0) {
            if (i == -1 || vj0.b == i) {
                int f2 = f2(this.r1);
                mue mue = this.r1.a;
                int i3 = f2 == -1 ? 0 : f2;
                g85 g85 = this.w0;
                s4b s4b = new s4b(g85, vj0, mue, i3, this.J0, g85.u0);
                fm9.k(!s4b.g);
                s4b.d = i2;
                fm9.k(!s4b.g);
                s4b.e = obj;
                s4b.c();
            }
        }
    }

    public final int o0() {
        w2();
        if (n()) {
            return this.r1.b.b;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o2(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            a3b r2 = r0.r1
            int r2 = r15.f2(r2)
            long r3 = r15.k()
            int r5 = r0.T0
            r6 = 1
            int r5 = r5 + r6
            r0.T0 = r5
            java.util.ArrayList r5 = r0.A0
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L_0x0023
            int r7 = r5.size()
            r15.m2(r8, r7)
        L_0x0023:
            r7 = r16
            java.util.ArrayList r10 = r15.Z1(r8, r7)
            b5b r7 = new b5b
            dod r9 = r0.W0
            r7.<init>(r5, r9)
            boolean r5 = r7.q()
            int r9 = r7.g
            if (r5 != 0) goto L_0x0041
            if (r1 >= r9) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0041:
            r5 = -1
            if (r20 == 0) goto L_0x0051
            boolean r1 = r0.S0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004f:
            r12 = r1
            goto L_0x0059
        L_0x0051:
            if (r1 != r5) goto L_0x0056
            r12 = r2
            r2 = r3
            goto L_0x0059
        L_0x0056:
            r2 = r18
            goto L_0x004f
        L_0x0059:
            a3b r1 = r0.r1
            android.util.Pair r4 = r15.j2(r7, r12, r2)
            a3b r1 = r15.i2(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L_0x0075
            if (r4 == r6) goto L_0x0075
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x0074
            if (r12 < r9) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 2
            goto L_0x0075
        L_0x0074:
            r4 = 4
        L_0x0075:
            a3b r1 = r1.g(r4)
            long r13 = defpackage.oaf.S(r2)
            dod r11 = r0.W0
            g85 r2 = r0.w0
            bie r2 = r2.s0
            y75 r3 = new y75
            r9 = r3
            r9.<init>(r10, r11, r12, r13)
            r4 = 17
            zhe r2 = r2.a(r4, r3)
            r2.b()
            a3b r2 = r0.r1
            yj8 r2 = r2.b
            java.lang.Object r2 = r2.a
            yj8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00ae
            a3b r2 = r0.r1
            mue r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00ae
            r3 = r6
            goto L_0x00af
        L_0x00ae:
            r3 = r8
        L_0x00af:
            long r5 = r15.e2(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.t2(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.o2(java.util.List, int, long, boolean):void");
    }

    public final int p0() {
        w2();
        int f2 = f2(this.r1);
        if (f2 == -1) {
            return 0;
        }
        return f2;
    }

    public final void p2(Object obj) {
        boolean z;
        Object obj2 = obj;
        ArrayList arrayList = new ArrayList();
        for (vj0 vj0 : this.s0) {
            if (vj0.b == 2) {
                int f2 = f2(this.r1);
                mue mue = this.r1.a;
                int i = f2 == -1 ? 0 : f2;
                g85 g85 = this.w0;
                s4b s4b = r9;
                s4b s4b2 = new s4b(g85, vj0, mue, i, this.J0, g85.u0);
                fm9.k(!s4b.g);
                s4b.d = 1;
                fm9.k(!s4b.g);
                s4b.e = obj2;
                s4b.c();
                arrayList.add(s4b);
            }
        }
        Object obj3 = this.b1;
        if (obj3 == null || obj3 == obj2) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((s4b) it.next()).a(this.Q0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            z = false;
            Object obj4 = this.b1;
            Surface surface = this.c1;
            if (obj4 == surface) {
                surface.release();
                this.c1 = null;
            }
        }
        this.b1 = obj2;
        if (z) {
            q2(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void prepare() {
        w2();
        boolean u = u();
        int i = 2;
        int d = this.N0.d(2, u);
        s2(d, d == -1 ? 2 : 1, u);
        a3b a3b = this.r1;
        if (a3b.e == 1) {
            a3b e = a3b.e((ExoPlaybackException) null);
            if (e.a.q()) {
                i = 4;
            }
            a3b g = e.g(i);
            this.T0++;
            bie bie = this.w0.s0;
            bie.getClass();
            zhe c2 = bie.c();
            c2.a = bie.a.obtainMessage(29);
            c2.b();
            t2(g, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final long q() {
        w2();
        return oaf.h0(this.r1.r);
    }

    public final void q0(boolean z) {
        w2();
    }

    public final void q2(ExoPlaybackException exoPlaybackException) {
        a3b a3b = this.r1;
        a3b b = a3b.b(a3b.b);
        b.q = b.s;
        b.r = 0;
        a3b g = b.g(1);
        if (exoPlaybackException != null) {
            g = g.e(exoPlaybackException);
        }
        a3b a3b2 = g;
        this.T0++;
        bie bie = this.w0.s0;
        bie.getClass();
        zhe c2 = bie.c();
        c2.a = bie.a.obtainMessage(6);
        c2.b();
        t2(a3b2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void r0(n3b n3b) {
        w2();
        n3b.getClass();
        this.x0.e(n3b);
    }

    public final void r2() {
        boolean z = true;
        k3b k3b = this.X0;
        int i = oaf.a;
        q3b q3b = this.Z;
        boolean n = q3b.n();
        boolean n12 = q3b.n1();
        boolean M = q3b.M();
        boolean j0 = q3b.j0();
        boolean K1 = q3b.K1();
        boolean y1 = q3b.y1();
        boolean q = q3b.x0().q();
        wd6 wd6 = new wd6(1);
        tm5 tm5 = this.o.a;
        rm5 rm5 = (rm5) wd6.b;
        rm5.b(tm5);
        boolean z2 = !n;
        wd6.s(4, z2);
        wd6.s(5, n12 && !n);
        wd6.s(6, M && !n);
        wd6.s(7, !q && (M || !K1 || n12) && !n);
        wd6.s(8, j0 && !n);
        wd6.s(9, !q && (j0 || (K1 && y1)) && !n);
        wd6.s(10, z2);
        wd6.s(11, n12 && !n);
        if (!n12 || n) {
            z = false;
        }
        wd6.s(12, z);
        k3b k3b2 = new k3b(rm5.e());
        this.X0 = k3b2;
        if (!k3b2.equals(k3b)) {
            this.x0.c(13, new i75(this, 2));
        }
    }

    public final void release() {
        boolean z;
        re4 re4;
        AudioTrack audioTrack;
        z04.J("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + oaf.e + "] [" + nc8.b() + "]");
        w2();
        int i = oaf.a;
        if (i < 21 && (audioTrack = this.a1) != null) {
            audioTrack.release();
            this.a1 = null;
        }
        this.M0.v();
        this.O0.getClass();
        ae3 ae3 = this.P0;
        ae3.getClass();
        ae3.getClass();
        n40 n40 = this.N0;
        n40.h = null;
        n40.a();
        n40.c(0);
        g85 g85 = this.w0;
        synchronized (g85) {
            if (!g85.L0) {
                if (g85.u0.getThread().isAlive()) {
                    g85.s0.f(7);
                    g85.h0(new lc4(8, g85), g85.G0);
                    z = g85.L0;
                }
            }
            z = true;
        }
        if (!z) {
            this.x0.f(10, new ta4(17));
        }
        this.x0.d();
        this.u0.a.removeCallbacksAndMessages((Object) null);
        hg0 hg0 = this.F0;
        i74 i74 = this.D0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((i84) hg0).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fg0 fg0 = (fg0) it.next();
            if (fg0.b == i74) {
                fg0.c = true;
                copyOnWriteArrayList.remove(fg0);
            }
        }
        a3b a3b = this.r1;
        if (a3b.p) {
            this.r1 = a3b.a();
        }
        a3b g = this.r1.g(1);
        this.r1 = g;
        a3b b = g.b(g.b);
        this.r1 = b;
        b.q = b.s;
        this.r1.r = 0;
        i74 i742 = this.D0;
        bie bie = i742.s0;
        fm9.l(bie);
        bie.d(new cu1(24, i742));
        cf4 cf4 = (cf4) this.t0;
        synchronized (cf4.c) {
            if (i >= 32) {
                try {
                    w36 w36 = cf4.h;
                    if (!(w36 == null || (re4 = (re4) w36.o) == null)) {
                        if (((Handler) w36.c) != null) {
                            ((Spatializer) w36.b).removeOnSpatializerStateChangedListener(re4);
                            ((Handler) w36.c).removeCallbacksAndMessages((Object) null);
                            w36.c = null;
                            w36.o = null;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        cf4.a = null;
        cf4.b = null;
        Surface surface = this.c1;
        if (surface != null) {
            surface.release();
            this.c1 = null;
        }
        this.j1 = zz3.c;
        this.n1 = true;
    }

    public final k3b s() {
        w2();
        return this.X0;
    }

    public final void s0(List list, int i, int i2) {
        w2();
        fm9.f(i >= 0 && i2 >= i);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        if (i <= size) {
            int min = Math.min(i2, size);
            if (min - i == list.size()) {
                int i3 = i;
                while (i3 < min) {
                    if (((s75) arrayList.get(i3)).b.k.a((tb8) list.get(i3 - i))) {
                        i3++;
                    }
                }
                this.T0++;
                this.w0.s0.b(list, 27, i, min).b();
                for (int i4 = i; i4 < min; i4++) {
                    s75 s75 = (s75) arrayList.get(i4);
                    s75.c = new z4b(s75.c, (tb8) list.get(i4 - i));
                }
                t2(this.r1.h(new b5b(arrayList, this.W0)), 0, false, 4, -9223372036854775807L, -1, false);
                return;
            }
            ArrayList c2 = c2(list);
            if (arrayList.isEmpty()) {
                boolean z = this.s1 == -1;
                w2();
                o2(c2, -1, -9223372036854775807L, z);
                return;
            }
            a3b l2 = l2(a2(this.r1, min, c2), i, min);
            t2(l2, 0, !l2.b.a.equals(this.r1.b.a), 4, e2(l2), -1, false);
        }
    }

    public final void s2(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (i == 0) {
            i3 = 1;
        }
        a3b a3b = this.r1;
        if (a3b.l != z2 || a3b.n != i3 || a3b.m != i2) {
            u2(i2, i3, z2);
        }
    }

    public final void setRepeatMode(int i) {
        w2();
        if (this.R0 != i) {
            this.R0 = i;
            bie bie = this.w0.s0;
            bie.getClass();
            zhe c2 = bie.c();
            c2.a = bie.a.obtainMessage(11, i, 0);
            c2.b();
            z64 z64 = new z64(i, 2);
            pm7 pm7 = this.x0;
            pm7.c(8, z64);
            r2();
            pm7.b();
        }
    }

    public final void stop() {
        w2();
        this.N0.d(1, u());
        q2((ExoPlaybackException) null);
        this.j1 = new zz3(this.r1.s, ffc.X);
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0299  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t2(defpackage.a3b r41, int r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r44
            a3b r3 = r0.r1
            r0.r1 = r1
            mue r4 = r3.a
            mue r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            mue r6 = r3.a
            mue r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
            goto L_0x00cd
        L_0x0035:
            boolean r8 = r7.q()
            boolean r9 = r6.q()
            if (r8 == r9) goto L_0x004c
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r6.<init>(r7, r8)
            goto L_0x00cd
        L_0x004c:
            yj8 r8 = r3.b
            java.lang.Object r9 = r8.a
            hue r12 = r0.z0
            hue r9 = r6.h(r9, r12)
            int r9 = r9.c
            java.lang.Object r11 = r0.b
            kue r11 = (defpackage.kue) r11
            kue r6 = r6.n(r9, r11, r13)
            java.lang.Object r6 = r6.a
            yj8 r9 = r1.b
            java.lang.Object r15 = r9.a
            hue r12 = r7.h(r15, r12)
            int r12 = r12.c
            kue r7 = r7.n(r12, r11, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r43 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r6 = r5
            goto L_0x0087
        L_0x007e:
            if (r43 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r6 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r6 = 3
        L_0x0087:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r8, r6)
            r6 = r7
            goto L_0x00cd
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r43 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r9.d
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b3
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00b3:
            if (r43 == 0) goto L_0x00c6
            if (r2 != r5) goto L_0x00c6
            if (r48 == 0) goto L_0x00c6
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00c6:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
        L_0x00cd:
            java.lang.Object r7 = r6.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r7 == 0) goto L_0x0108
            mue r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x0102
            mue r9 = r1.a
            yj8 r10 = r1.b
            java.lang.Object r10 = r10.a
            hue r11 = r0.z0
            hue r9 = r9.h(r10, r11)
            int r9 = r9.c
            mue r10 = r1.a
            java.lang.Object r11 = r0.b
            kue r11 = (defpackage.kue) r11
            kue r9 = r10.n(r9, r11, r13)
            tb8 r9 = r9.c
            goto L_0x0103
        L_0x0102:
            r9 = 0
        L_0x0103:
            gd8 r10 = defpackage.gd8.J
            r0.q1 = r10
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            if (r7 != 0) goto L_0x0115
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0144
        L_0x0115:
            gd8 r10 = r0.q1
            ed8 r10 = r10.a()
            java.util.List r11 = r1.j
            r12 = 0
        L_0x011e:
            int r15 = r11.size()
            if (r12 >= r15) goto L_0x013d
            java.lang.Object r15 = r11.get(r12)
            f99 r15 = (defpackage.f99) r15
            r8 = 0
        L_0x012b:
            d99[] r13 = r15.a
            int r14 = r13.length
            if (r8 >= r14) goto L_0x0138
            r13 = r13[r8]
            r13.w(r10)
            int r8 = r8 + 1
            goto L_0x012b
        L_0x0138:
            int r12 = r12 + 1
            r13 = 0
            goto L_0x011e
        L_0x013d:
            gd8 r8 = new gd8
            r8.<init>(r10)
            r0.q1 = r8
        L_0x0144:
            gd8 r8 = r40.b2()
            gd8 r10 = r0.Y0
            boolean r10 = r8.equals(r10)
            r10 = r10 ^ r5
            r0.Y0 = r8
            boolean r8 = r3.l
            boolean r11 = r1.l
            if (r8 == r11) goto L_0x0159
            r8 = r5
            goto L_0x015a
        L_0x0159:
            r8 = 0
        L_0x015a:
            int r11 = r3.e
            int r12 = r1.e
            if (r11 == r12) goto L_0x0162
            r11 = r5
            goto L_0x0163
        L_0x0162:
            r11 = 0
        L_0x0163:
            if (r11 != 0) goto L_0x0167
            if (r8 == 0) goto L_0x016a
        L_0x0167:
            r40.v2()
        L_0x016a:
            boolean r12 = r3.g
            boolean r13 = r1.g
            if (r12 == r13) goto L_0x0172
            r12 = r5
            goto L_0x0173
        L_0x0172:
            r12 = 0
        L_0x0173:
            if (r4 == 0) goto L_0x0183
            pm7 r4 = r0.x0
            hd0 r13 = new hd0
            r14 = 4
            r15 = r42
            r13.<init>(r15, r14, r1)
            r14 = 0
            r4.c(r14, r13)
        L_0x0183:
            if (r43 == 0) goto L_0x02bc
            hue r4 = new hue
            r4.<init>()
            mue r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c8
            yj8 r13 = r3.b
            java.lang.Object r13 = r13.a
            mue r14 = r3.a
            r14.h(r13, r4)
            int r14 = r4.c
            mue r15 = r3.a
            int r15 = r15.b(r13)
            mue r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.b
            kue r13 = (defpackage.kue) r13
            r16 = r11
            r17 = r12
            r11 = 0
            kue r5 = r5.n(r14, r13, r11)
            java.lang.Object r5 = r5.a
            java.lang.Object r11 = r0.b
            kue r11 = (defpackage.kue) r11
            tb8 r11 = r11.c
            r22 = r42
            r19 = r5
            r21 = r11
            r20 = r14
            r23 = r15
            goto L_0x01d6
        L_0x01c8:
            r16 = r11
            r17 = r12
            r20 = r47
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01d6:
            if (r2 != 0) goto L_0x0204
            yj8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x01ef
            yj8 r5 = r3.b
            int r11 = r5.b
            int r5 = r5.c
            long r4 = r4.a(r11, r5)
            long r11 = h2(r3)
            goto L_0x0219
        L_0x01ef:
            yj8 r5 = r3.b
            int r5 = r5.e
            r11 = -1
            if (r5 == r11) goto L_0x01fe
            a3b r4 = r0.r1
            long r4 = h2(r4)
        L_0x01fc:
            r11 = r4
            goto L_0x0219
        L_0x01fe:
            long r11 = r4.e
            long r4 = r4.d
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0204:
            yj8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x0213
            long r4 = r3.s
            long r11 = h2(r3)
            goto L_0x0219
        L_0x0213:
            long r4 = r4.e
            long r11 = r3.s
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0219:
            p3b r13 = new p3b
            long r24 = defpackage.oaf.h0(r4)
            long r26 = defpackage.oaf.h0(r11)
            yj8 r4 = r3.b
            int r5 = r4.b
            int r4 = r4.c
            r18 = r13
            r28 = r5
            r29 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r4 = r40.p0()
            a3b r5 = r0.r1
            mue r5 = r5.a
            boolean r5 = r5.q()
            if (r5 != 0) goto L_0x0273
            a3b r5 = r0.r1
            yj8 r11 = r5.b
            java.lang.Object r11 = r11.a
            mue r5 = r5.a
            hue r12 = r0.z0
            r5.h(r11, r12)
            a3b r5 = r0.r1
            mue r5 = r5.a
            int r5 = r5.b(r11)
            a3b r12 = r0.r1
            mue r12 = r12.a
            java.lang.Object r14 = r0.b
            kue r14 = (defpackage.kue) r14
            r15 = r10
            r18 = r11
            r10 = 0
            kue r10 = r12.n(r4, r14, r10)
            java.lang.Object r10 = r10.a
            tb8 r11 = r14.c
            r33 = r5
            r29 = r10
            r31 = r11
            r32 = r18
            goto L_0x027c
        L_0x0273:
            r15 = r10
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x027c:
            long r34 = defpackage.oaf.h0(r45)
            p3b r5 = new p3b
            a3b r10 = r0.r1
            yj8 r10 = r10.b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x0299
            a3b r10 = r0.r1
            long r10 = h2(r10)
            long r10 = defpackage.oaf.h0(r10)
            r36 = r10
            goto L_0x029b
        L_0x0299:
            r36 = r34
        L_0x029b:
            a3b r10 = r0.r1
            yj8 r10 = r10.b
            int r11 = r10.b
            int r10 = r10.c
            r28 = r5
            r30 = r4
            r38 = r11
            r39 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            pm7 r4 = r0.x0
            ui0 r10 = new ui0
            r11 = 6
            r10.<init>((int) r2, (java.lang.Object) r13, (java.lang.Object) r5, (int) r11)
            r2 = 11
            r4.c(r2, r10)
            goto L_0x02c1
        L_0x02bc:
            r15 = r10
            r16 = r11
            r17 = r12
        L_0x02c1:
            if (r7 == 0) goto L_0x02cf
            pm7 r2 = r0.x0
            hd0 r4 = new hd0
            r5 = 6
            r4.<init>(r6, r5, r9)
            r5 = 1
            r2.c(r5, r4)
        L_0x02cf:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r3.f
            androidx.media3.exoplayer.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02f1
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.c(r5, r4)
            androidx.media3.exoplayer.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02f1
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r6 = 1
            r4.<init>(r1, r6)
            r2.c(r5, r4)
        L_0x02f1:
            l0f r2 = r3.i
            l0f r4 = r1.i
            if (r2 == r4) goto L_0x030c
            hz7 r2 = r0.t0
            java.lang.Object r4 = r4.c
            r2.getClass()
            fz7 r4 = (defpackage.fz7) r4
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 2
            r4.<init>(r1, r5)
            r5 = 2
            r2.c(r5, r4)
        L_0x030c:
            if (r15 == 0) goto L_0x031d
            gd8 r2 = r0.Y0
            pm7 r4 = r0.x0
            f75 r5 = new f75
            r6 = 0
            r5.<init>(r2, r6)
            r2 = 14
            r4.c(r2, r5)
        L_0x031d:
            if (r17 == 0) goto L_0x032b
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.c(r5, r4)
        L_0x032b:
            if (r16 != 0) goto L_0x032f
            if (r8 == 0) goto L_0x033b
        L_0x032f:
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.c(r5, r4)
        L_0x033b:
            if (r16 == 0) goto L_0x0349
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.c(r5, r4)
        L_0x0349:
            if (r8 != 0) goto L_0x0351
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x035d
        L_0x0351:
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 6
            r4.<init>(r1, r5)
            r5 = 5
            r2.c(r5, r4)
        L_0x035d:
            int r2 = r3.n
            int r4 = r1.n
            if (r2 == r4) goto L_0x036f
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 7
            r4.<init>(r1, r5)
            r5 = 6
            r2.c(r5, r4)
        L_0x036f:
            boolean r2 = r3.k()
            boolean r4 = r41.k()
            if (r2 == r4) goto L_0x0386
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 7
            r2.c(r5, r4)
        L_0x0386:
            c3b r2 = r3.o
            c3b r4 = r1.o
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x039e
            pm7 r2 = r0.x0
            d75 r4 = new d75
            r5 = 9
            r4.<init>(r1, r5)
            r5 = 12
            r2.c(r5, r4)
        L_0x039e:
            r40.r2()
            pm7 r2 = r0.x0
            r2.b()
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03c4
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.y0
            java.util.Iterator r0 = r0.iterator()
        L_0x03b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03c4
            java.lang.Object r1 = r0.next()
            o75 r1 = (defpackage.o75) r1
            u75 r1 = r1.a
            r1.v2()
            goto L_0x03b2
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.t2(a3b, int, boolean, int, long, int, boolean):void");
    }

    public final boolean u() {
        w2();
        return this.r1.l;
    }

    public final void u0(int i, int i2, int i3) {
        w2();
        fm9.f(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            mue x02 = x0();
            this.T0++;
            oaf.R(arrayList, i, min, min2);
            b5b b5b = new b5b(arrayList, this.W0);
            a3b a3b = this.r1;
            a3b i22 = i2(a3b, b5b, g2(x02, b5b, f2(a3b), d2(this.r1)));
            dod dod = this.W0;
            g85 g85 = this.w0;
            g85.getClass();
            g85.s0.a(19, new z75(i, min, min2, dod)).b();
            t2(i22, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void u2(int i, int i2, boolean z) {
        this.T0++;
        a3b a3b = this.r1;
        if (a3b.p) {
            a3b = a3b.a();
        }
        a3b d = a3b.d(i, i2, z);
        int i3 = i | (i2 << 4);
        bie bie = this.w0.s0;
        bie.getClass();
        zhe c2 = bie.c();
        c2.a = bie.a.obtainMessage(1, z ? 1 : 0, i3);
        c2.b();
        t2(d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final int v0() {
        w2();
        return this.r1.n;
    }

    public final void v2() {
        int playbackState = getPlaybackState();
        ae3 ae3 = this.P0;
        crd crd = this.O0;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                w2();
                boolean z = this.r1.p;
                boolean u = u();
                crd.getClass();
                u();
                ae3.getClass();
                ae3.getClass();
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        crd.getClass();
        ae3.getClass();
        ae3.getClass();
    }

    public final void w(boolean z) {
        w2();
        if (this.S0 != z) {
            this.S0 = z;
            bie bie = this.w0.s0;
            bie.getClass();
            zhe c2 = bie.c();
            c2.a = bie.a.obtainMessage(12, z ? 1 : 0, 0);
            c2.b();
            l01 l01 = new l01(z, 2);
            pm7 pm7 = this.x0;
            pm7.c(9, l01);
            r2();
            pm7.b();
        }
    }

    public final void w2() {
        this.X.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.E0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = oaf.a;
            Locale locale = Locale.US;
            String j = k7d.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.k1) {
                z04.d0(j, this.l1 ? null : new IllegalStateException());
                this.l1 = true;
                return;
            }
            throw new IllegalStateException(j);
        }
    }

    public final mue x0() {
        w2();
        return this.r1.a;
    }

    public final long y() {
        w2();
        return this.I0;
    }

    public final void z(n3b n3b) {
        n3b.getClass();
        this.x0.a(n3b);
    }

    public final boolean z0() {
        w2();
        return false;
    }

    public final Looper z1() {
        return this.E0;
    }
}

package defpackage;

import android.net.Uri;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: e52  reason: default package */
public final class e52 implements Comparable {
    public final d8a A0;
    public final kr2 B0;
    public mpa C0 = null;
    public final es8 X;
    public final long Y;
    public final ArrayList Z = new ArrayList();
    public final long a;
    public final k92 b;
    public final es8 c;
    public final es8 o;
    public volatile String s0;
    public volatile CharSequence t0;
    public volatile CharSequence u0;
    public volatile CharSequence v0;
    public final AtomicReference w0 = new AtomicReference((Object) null);
    public volatile CharSequence x0;
    public volatile v5c y0;
    public volatile String z0;

    public e52(d8a d8a, kr2 kr2, long j, long j2, k92 k92, es8 es8, es8 es82, es8 es83) {
        this.A0 = d8a;
        this.B0 = kr2;
        this.a = j;
        this.Y = j2;
        this.b = k92;
        this.c = es8;
        this.o = es82;
        this.X = es83;
    }

    public final boolean A() {
        return v() && this.o.a.q(this.Y);
    }

    public final boolean B() {
        bw8 bw8;
        es8 es8;
        uj3 uj3;
        if (!A()) {
            if (v()) {
                es8 es82 = this.o;
                long j = es82.a.Y;
                long j2 = this.Y;
                if (j == j2 || (bw8 = es82.c) == null || (es8 = bw8.c) == null || (uj3 = es8.b) == null || uj3.n() != j2) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean C() {
        k92 k92 = this.b;
        return k92 != null && k92.c == i92.a;
    }

    public final boolean D() {
        return C() && e0();
    }

    public final boolean E(long j) {
        return this.b.R.containsKey(Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F() {
        /*
            r0 = this;
            k92 r0 = r0.b
            if (r0 == 0) goto L_0x000e
            f92 r0 = r0.K
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.F():boolean");
    }

    public final boolean G() {
        boolean z;
        synchronized (this.Z) {
            try {
                z = false;
                if (M() && !this.Z.isEmpty() && ((uj3) this.Z.get(0)).s()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean H() {
        uj3 l = l();
        return M() && l != null && l.t();
    }

    public final boolean I() {
        return this.b.b == j92.c;
    }

    public final boolean J() {
        return this.b.b == j92.b;
    }

    public final boolean K() {
        return r() != null && r().f == 2;
    }

    public final boolean L() {
        return this.b.c == i92.Y;
    }

    public final boolean M() {
        return this.b.b == j92.a;
    }

    public final boolean N() {
        return this.b.a().e != 0;
    }

    public final boolean O(q33 q33, hp hpVar) {
        if (V(q33)) {
            return true;
        }
        kxc kxc = (kxc) hpVar;
        return (M() ? kxc.p() : kxc.o()) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P() {
        /*
            r6 = this;
            boolean r0 = r6.D()
            k92 r1 = r6.b
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r6 = r3
            goto L_0x0030
        L_0x000c:
            boolean r0 = r6.I()
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            boolean r0 = r6.d0()
            if (r0 == 0) goto L_0x001b
        L_0x0019:
            r6 = r2
            goto L_0x0030
        L_0x001b:
            z82 r0 = r1.H
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            long r4 = r6.Y
            int r6 = r6.e(r4)
            r0 = 64
            boolean r6 = defpackage.oag.s(r6, r0)
        L_0x0030:
            if (r6 == 0) goto L_0x0039
            int r6 = r1.c()
            if (r6 <= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.P():boolean");
    }

    public final boolean Q() {
        return this.b.b == j92.o;
    }

    public final boolean R() {
        k92 k92 = this.b;
        return k92 != null && k92.c == i92.Z;
    }

    public final boolean S() {
        return J() && a0() && C() && !e0();
    }

    public final boolean T() {
        return !M() && this.b.c == i92.b;
    }

    public final boolean U(qe5 qe5) {
        if (this.b.J.b(64)) {
            return false;
        }
        if (!M()) {
            return I() ? ((se5) qe5).t() ? y() : x() : C() && e0();
        }
        if (H()) {
            return !g0();
        }
        uj3 l = l();
        if (l == null) {
            return false;
        }
        return !l.s();
    }

    public final boolean V(q33 q33) {
        k92 k92 = this.b;
        return k92.a().a == -1 || k92.a().a > ((hyc) q33).n();
    }

    public final boolean W() {
        if (H()) {
            k92 k92 = this.b;
            if (k92.e0.b || this.c == null || k92.a == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean X() {
        return this.b.H.c;
    }

    public final boolean Y(long j) {
        return j == this.b.d && C();
    }

    public final boolean Z() {
        return this.b.r0 == 2;
    }

    public final boolean a() {
        z82 z82;
        if (K() || M() || !D()) {
            return false;
        }
        k92 k92 = this.b;
        if (k92.J.b(2)) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean u = u();
        if (!I() && (z82 = k92.H) != null && !z82.b) {
            return true;
        }
        return u;
    }

    public final boolean a0() {
        return this.b.r0 == 1;
    }

    public final boolean b() {
        return I() && a0() && !c0();
    }

    public final boolean b0() {
        return C() && E(this.Y);
    }

    public final boolean c() {
        if (d0()) {
            if (I()) {
                return true;
            }
            k92 k92 = this.b;
            if ((!oag.t(k92.I)) || k92.c() > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c0() {
        return b0() || this.b.e.containsKey(Long.valueOf(this.Y));
    }

    public final int compareTo(Object obj) {
        return np8.j(((e52) obj).o(), o());
    }

    public final Long d(long j) {
        if (C() && E(j)) {
            return Long.valueOf(((t82) this.b.R.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean d0() {
        return this.Y == this.b.d && C();
    }

    public final int e(long j) {
        if (!C()) {
            return 0;
        }
        k92 k92 = this.b;
        if (j == k92.d) {
            return 2047;
        }
        if (k92.R.containsKey(Long.valueOf(j))) {
            return ((t82) k92.R.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean e0() {
        return this.b.e.containsKey(Long.valueOf(this.Y)) || F();
    }

    public final long f() {
        k92 k92 = this.b;
        if (k92.f(this.Y)) {
            return 0;
        }
        uj3 l = l();
        return l != null ? l.n() : k92.a;
    }

    public final boolean f0() {
        boolean z = this.b.H.h;
        if (z) {
            return true;
        }
        uj3 l = l();
        return l != null ? l.v() : z;
    }

    public final String g(kk0 kk0, jk0 jk0) {
        k92 k92 = this.b;
        d8a d8a = this.A0;
        if (d8a != null) {
            String str = k92.f(((wxc) d8a.a.getValue()).a()) ? (String) d8a.b.getValue() : null;
            if (str != null) {
                return str;
            }
        }
        uj3 l = l();
        if (l == null) {
            return k92.b(kk0, jk0);
        }
        Uri N = j47.N(ju0.t(l.a.c.c, kk0, jk0));
        if (N == null) {
            return null;
        }
        return N.toString();
    }

    public final boolean g0() {
        return this.b.e0.b;
    }

    public final List h() {
        String b2;
        kl7 kl7 = null;
        k92 k92 = this.b;
        d8a d8a = this.A0;
        if (d8a != null) {
            List list = k92.f(((wxc) d8a.a.getValue()).a()) ? (List) d8a.c.getValue() : null;
            if (list != null) {
                return list;
            }
        }
        uj3 l = l();
        if (l != null) {
            return l.r();
        }
        String str = k92.h;
        mpa mpa = this.C0;
        if (mpa == null || !c37.k(mpa.a, str)) {
            kk0 kk0 = kk0.b;
            kk0 kk02 = kk0.o;
            kl7 l2 = j1e.l();
            Iterator it = new r08((List) nk0.a).iterator();
            while (true) {
                ListIterator listIterator = ((fkc) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                kk0 kk03 = (kk0) listIterator.previous();
                if (kk03.compareTo(kk0) >= 0 && kk03.compareTo(kk02) <= 0 && (b2 = k92.b(kk03, jk0.a)) != null) {
                    l2.add(b2);
                }
            }
            kl7 d = j1e.d(l2);
            if (!d.isEmpty()) {
                kl7 = d;
            }
            this.C0 = new mpa(str, kl7);
        }
        return (List) this.C0.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1.R.containsKey(java.lang.Long.valueOf(r3)) != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h0() {
        /*
            r10 = this;
            r0 = 0
            k92 r1 = r10.b
            if (r1 == 0) goto L_0x0089
            j92 r2 = defpackage.j92.c
            long r3 = r10.Y
            i92 r10 = defpackage.i92.Y
            i92 r5 = r1.c
            j92 r6 = r1.b
            r7 = 1
            java.util.Map r8 = r1.e
            if (r6 != r2) goto L_0x003a
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0088
            if (r5 != r10) goto L_0x0089
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x002f
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            java.util.Map r1 = r1.R
            boolean r10 = r1.containsKey(r10)
            if (r10 == 0) goto L_0x002f
            goto L_0x0088
        L_0x002f:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 == 0) goto L_0x0089
            goto L_0x0088
        L_0x003a:
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x0048
            boolean r2 = r1.d()
            if (r2 == 0) goto L_0x0048
            r2 = r7
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            boolean r6 = r1.e()
            if (r6 != 0) goto L_0x0072
            if (r5 != r10) goto L_0x0072
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 != 0) goto L_0x0063
            f92 r10 = r1.K
            if (r10 == 0) goto L_0x0072
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0072
        L_0x0063:
            long r8 = r1.d
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0070
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r10 = r7
            goto L_0x0073
        L_0x0072:
            r10 = r0
        L_0x0073:
            if (r2 != 0) goto L_0x0088
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0088
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0086
            i92 r1 = defpackage.i92.b
            if (r5 != r1) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            if (r10 == 0) goto L_0x0089
        L_0x0088:
            r0 = r7
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.h0():boolean");
    }

    public final long i(long j, mg4 mg4) {
        d92 v = hm9.v(j, this.b.n.d(mg4));
        if (v != null) {
            long j2 = v.a;
            long j3 = v.b;
            if (j2 == j3) {
                return 0;
            }
            return j3;
        }
        return 0;
    }

    public final boolean i0() {
        es8 es8 = this.c;
        return es8 != null && es8.a.x() && es8.a.f().a == p10.o && es8.a.f().b == this.Y;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.Z) {
            arrayList.addAll(this.Z);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0() {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            java.lang.CharSequence r2 = r0.v0
            if (r2 == 0) goto L_0x0008
            return
        L_0x0008:
            kr2 r2 = r0.B0
            r2.getClass()
            es8 r3 = r0.c
            if (r3 == 0) goto L_0x0091
            rm4 r2 = r2.b
            java.lang.Object r2 = r2.get()
            r8 = r2
            ida r8 = (defpackage.ida) r8
            cu8 r2 = r3.a
            boolean r5 = r2.x()
            uj3 r7 = r3.b
            r6 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0038
            q10 r5 = r2.f()
            p10 r5 = r5.a
            p10 r9 = defpackage.p10.s0
            if (r5 != r9) goto L_0x0038
            q10 r3 = r2.f()
            java.lang.String r3 = r3.j
            goto L_0x00cb
        L_0x0038:
            boolean r5 = r2.x()
            if (r5 == 0) goto L_0x005e
            q10 r5 = r2.f()
            p10 r5 = r5.a
            p10 r9 = defpackage.p10.u0
            if (r5 != r9) goto L_0x005e
            es8 r5 = r3.o
            if (r5 == 0) goto L_0x005e
            lr2 r2 = r5.s0
            ld2 r2 = (defpackage.ld2) r2
            r2.getClass()
            es8 r3 = r0.X
            if (r3 != 0) goto L_0x0058
            goto L_0x0091
        L_0x0058:
            android.text.SpannableString r1 = r2.e(r0, r3, r1, false)
            goto L_0x01c3
        L_0x005e:
            boolean r5 = r2.s()
            if (r5 == 0) goto L_0x007c
            boolean r1 = r7.Y
            if (r1 == 0) goto L_0x0072
            android.content.Context r1 = r8.a
            int r2 = defpackage.c2c.tt_you_send_message
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01c3
        L_0x0072:
            android.content.Context r1 = r8.a
            int r2 = defpackage.c2c.tt_new_message
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01c3
        L_0x007c:
            u6b r3 = r3.X
            r3.f = r0
            ida r5 = r3.a
            int r9 = r5.f()
            int r5 = r5.e()
            r3.i(r0, r9, r5)
            java.lang.CharSequence r3 = r3.g
            if (r3 != 0) goto L_0x0094
        L_0x0091:
            r1 = 0
            goto L_0x01c3
        L_0x0094:
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r5 = defpackage.bre.a
            int r5 = r3.length()
            r9 = 200(0xc8, float:2.8E-43)
            if (r5 > r9) goto L_0x00a3
            goto L_0x00cb
        L_0x00a3:
            java.lang.String r3 = r3.substring(r6, r9)
            int r5 = r3.length()
            int r5 = r5 - r10
            char r5 = r3.charAt(r5)
            boolean r5 = java.lang.Character.isHighSurrogate(r5)
            if (r5 == 0) goto L_0x00c5
            int r5 = r3.length()
            if (r5 <= r10) goto L_0x00c5
            int r5 = r3.length()
            int r5 = r5 - r10
            java.lang.String r3 = r3.substring(r6, r5)
        L_0x00c5:
            java.lang.String r5 = "…"
            java.lang.String r3 = defpackage.au1.g(r3, r5)
        L_0x00cb:
            r8.getClass()
            r5 = 18
            int r9 = defpackage.fk4.b(r5)
            tx4 r11 = r8.j
            java.lang.CharSequence r3 = r11.b(r9, r3)
            java.lang.CharSequence r3 = defpackage.kp.z(r3)
            java.util.List r9 = r2.R0
            int r5 = defpackage.fk4.b(r5)
            java.lang.CharSequence r3 = r8.j(r3, r9, r5)
            qec r5 = defpackage.ee.a
            if (r3 == 0) goto L_0x0188
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00f4
            goto L_0x0188
        L_0x00f4:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            r9 = r6
            r11 = r9
        L_0x00fb:
            int r12 = r3.length()
            if (r9 >= r12) goto L_0x0132
            char r12 = r3.charAt(r9)
            r13 = 10
            if (r12 == r13) goto L_0x0110
            r13 = 13
            if (r12 != r13) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r13 = r6
            goto L_0x0111
        L_0x0110:
            r13 = r10
        L_0x0111:
            boolean r14 = defpackage.nd7.E(r12)
            if (r13 != 0) goto L_0x011f
            if (r14 == 0) goto L_0x011a
            goto L_0x011f
        L_0x011a:
            r5.append(r12)
            r11 = r6
            goto L_0x0130
        L_0x011f:
            if (r11 != 0) goto L_0x012f
            if (r9 <= 0) goto L_0x012f
            int r11 = r3.length()
            int r11 = r11 - r10
            if (r9 >= r11) goto L_0x012f
            r11 = 32
            r5.append(r11)
        L_0x012f:
            r11 = r10
        L_0x0130:
            int r9 = r9 + r1
            goto L_0x00fb
        L_0x0132:
            boolean r9 = r3 instanceof android.text.Spanned
            if (r9 != 0) goto L_0x013b
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r5)
            goto L_0x0188
        L_0x013b:
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r9 = r3.length()
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Object[] r9 = r3.getSpans(r6, r9, r11)
            int r11 = r9.length
            r12 = r6
            r13 = r12
        L_0x014a:
            if (r12 >= r11) goto L_0x0184
            r14 = r9[r12]
            int r15 = r3.getSpanStart(r14)
            int r4 = r3.getSpanEnd(r14)
            int r10 = r3.getSpanFlags(r14)
            java.lang.CharSequence r4 = r3.subSequence(r15, r4)
            java.lang.String r4 = r4.toString()
            qec r15 = defpackage.ee.a
            java.lang.String r1 = " "
            java.lang.String r4 = r15.b(r1, r4)
            qec r15 = defpackage.ee.b
            java.lang.String r1 = r15.b(r1, r4)
            r4 = 4
            int r4 = defpackage.w9e.A0(r5, r1, r13, r6, r4)
            if (r4 < 0) goto L_0x0180
            int r1 = r1.length()
            int r13 = r1 + r4
            r5.setSpan(r14, r4, r13, r10)
        L_0x0180:
            r1 = 1
            int r12 = r12 + r1
            r10 = 1
            goto L_0x014a
        L_0x0184:
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r5)
        L_0x0188:
            boolean r1 = r2.x()
            if (r1 == 0) goto L_0x01c2
            boolean r1 = defpackage.oag.t(r3)
            if (r1 != 0) goto L_0x01c2
            if (r7 == 0) goto L_0x01c2
            java.lang.String r5 = r3.toString()
            q10 r6 = r2.f()
            r8.getClass()
            p10 r1 = r6.a
            int r1 = r1.ordinal()
            switch(r1) {
                case 1: goto L_0x01bb;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01bb;
                case 7: goto L_0x01aa;
                case 8: goto L_0x01bb;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            goto L_0x01c0
        L_0x01ab:
            je7 r1 = r8.d
            java.lang.Object r1 = r1.getValue()
            r9 = r1
            el3 r9 = (defpackage.el3) r9
            r1 = 1
            r10 = r1
            android.text.SpannableStringBuilder r5 = defpackage.are.b(r5, r6, r7, r8, r9, r10)
            goto L_0x01c0
        L_0x01bb:
            r1 = 1
            java.lang.CharSequence r5 = defpackage.are.a(r5, r7, r8, r1)
        L_0x01c0:
            r1 = r5
            goto L_0x01c3
        L_0x01c2:
            r1 = r3
        L_0x01c3:
            r0.v0 = r1
            k92 r1 = r0.b
            uaa r1 = r1.f0
            if (r1 == 0) goto L_0x0229
            java.lang.String r1 = r1.c()
            boolean r1 = defpackage.oag.u(r1)
            if (r1 == 0) goto L_0x0229
            kr2 r1 = r0.B0
            k92 r0 = r0.b
            uaa r0 = r0.f0
            java.lang.String r0 = r0.c()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            fj r2 = defpackage.qh.c
            if (r2 != 0) goto L_0x01ec
            goto L_0x0229
        L_0x01ec:
            rm4 r3 = r1.e
            java.lang.Object r3 = r3.get()
            y7d r3 = (defpackage.y7d) r3
            r3.getClass()
            java.util.Set r3 = java.util.Collections.emptySet()
            r4 = 5
            boolean r3 = defpackage.fp3.t(r4, r3)
            if (r3 != 0) goto L_0x0203
            goto L_0x0229
        L_0x0203:
            rm4 r1 = r1.b
            java.lang.Object r1 = r1.get()
            ida r1 = (defpackage.ida) r1
            tx4 r1 = r1.j
            java.lang.CharSequence r0 = r1.e(r0)
            java.util.List r0 = r2.a(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0220
            goto L_0x0229
        L_0x0220:
            java.lang.Object r0 = r0.next()
            defpackage.au1.r(r0)
            r0 = 0
            throw r0
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.j0():void");
    }

    public final String k() {
        if (M() && l() != null) {
            return l().a.c.o;
        }
        if (J() || I()) {
            return this.b.E;
        }
        return null;
    }

    public final void k0() {
        if (this.u0 == null) {
            if (this.b.f(this.Y)) {
                this.u0 = q();
                return;
            }
            kr2 kr2 = this.B0;
            String q = q();
            rm4 rm4 = kr2.b;
            ida ida = (ida) rm4.get();
            ida.getClass();
            float e = fk4.e(((p7b) ida.i).c.g.getFloat("app.extra.text.size.sp", 0.0f));
            this.u0 = ((ida) rm4.get()).j.b((int) (e + ((float) tu0.G(TypedValue.applyDimension(2, (float) 16, fk4.d().getDisplayMetrics())))), q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uj3 l() {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.Z
            monitor-enter(r0)
            boolean r1 = r2.M()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001e
            java.util.ArrayList r1 = r2.Z     // Catch:{ all -> 0x001c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r2 = r2.Z     // Catch:{ all -> 0x001c }
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x001c }
            uj3 r2 = (defpackage.uj3) r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x001c:
            r2 = move-exception
            goto L_0x0021
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            r2 = 0
            return r2
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.l():uj3");
    }

    public final void l0() {
        if (this.x0 == null) {
            d8a d8a = this.A0;
            if (d8a != null) {
                if (this.b.f(((wxc) d8a.a.getValue()).a())) {
                    this.x0 = "";
                    return;
                }
            }
            uj3 l = l();
            if (l != null) {
                this.x0 = l.m();
                return;
            }
            kr2 kr2 = this.B0;
            String q = q();
            rm4 rm4 = kr2.b;
            Pattern pattern = fca.a;
            this.x0 = ((ida) rm4.get()).j.e(fca.a(q, (ida) rm4.get()));
        }
    }

    public final long m() {
        es8 es8 = this.c;
        if (es8 != null) {
            return es8.a.k();
        }
        return 0;
    }

    public final void m0() {
        String str;
        kr2 kr2 = this.B0;
        long j = this.Y;
        boolean f = this.b.f(((wxc) kr2.g.get()).a());
        rm4 rm4 = kr2.b;
        if (f) {
            str = ((ida) rm4.get()).a.getString(c2c.saved_messages);
        } else {
            String str2 = null;
            if (M()) {
                uj3 l = l();
                if (l != null) {
                    str2 = l.d();
                }
            } else {
                k92 k92 = this.b;
                if (!oag.t(k92.g)) {
                    str2 = k92.g;
                } else {
                    ArrayList j2 = j();
                    if (!I() && !j2.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        Iterator it = j2.iterator();
                        while (it.hasNext()) {
                            uj3 uj3 = (uj3) it.next();
                            if (!uj3.w() && j != uj3.n()) {
                                sb.append(uj3.d().trim());
                                sb.append(", ");
                            }
                        }
                        if (sb.length() > 0) {
                            sb.delete(sb.length() - 2, sb.length());
                        }
                        str2 = sb.toString().trim();
                    } else if (I()) {
                        str2 = "";
                    }
                }
            }
            str = str2 == null ? ((ida) rm4.get()).a.getString(c2c.tt_chat_participants_empty__title) : str2;
        }
        this.s0 = str;
    }

    public final long n() {
        boolean I = I();
        es8 es8 = this.c;
        if (!I || !L()) {
            k92 k92 = this.b;
            Map map = k92.e;
            long j = this.Y;
            Long l = (Long) map.get(Long.valueOf(j));
            if (l != null && l.longValue() != 0) {
                return l.longValue();
            }
            if (es8 == null) {
                return 0;
            }
            if (!e0() || es8.a.Y == j || ((I() && !c0()) || F())) {
                return es8.a.o;
            }
            long j2 = es8.a.o;
            long j3 = k92.P;
            return j2 <= j3 ? j2 - 1 : j3;
        } else if (es8 != null) {
            return es8.a.o;
        } else {
            return 0;
        }
    }

    public final boolean n0() {
        return this.b.e0.a || H();
    }

    public final long o() {
        return lz7.k(m(), this.b);
    }

    public final void o0(el3 el3) {
        el3.b();
        synchronized (this.Z) {
            try {
                this.Z.clear();
                for (Long longValue : this.b.e.keySet()) {
                    uj3 i = el3.i(longValue.longValue(), true);
                    long n = i.n();
                    long j = this.Y;
                    if (n != j || this.b.f(j)) {
                        this.Z.add(i);
                    }
                }
                m0();
            } finally {
                while (true) {
                }
            }
        }
        this.u0 = null;
        this.v0 = null;
        this.x0 = null;
        this.w0.set((Object) null);
    }

    public final CharSequence p() {
        this.t0 = this.B0.a(this);
        return this.t0;
    }

    public final String q() {
        if (this.s0 == null) {
            m0();
        }
        return this.s0;
    }

    public final k10 r() {
        k92 k92 = this.b;
        if (k92 == null) {
            return null;
        }
        return k92.T;
    }

    public final boolean s() {
        if (!D()) {
            return false;
        }
        return d0() || oag.s(e(this.Y), 4);
    }

    public final boolean t() {
        z82 z82;
        if (K()) {
            return false;
        }
        k92 k92 = this.b;
        if (k92.J.b(1) || !D()) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean s = oag.s(e(this.Y), 2);
        if (!I() && (z82 = k92.H) != null && !z82.d) {
            return true;
        }
        return s;
    }

    public final String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final boolean u() {
        if (!D()) {
            return false;
        }
        return d0() || oag.s(e(this.Y), 8);
    }

    public final boolean v() {
        es8 es8 = this.o;
        return (es8 == null || es8.a.v0 == vx8.DELETED || n() >= es8.a.o) ? false : true;
    }

    public final boolean w() {
        z82 z82;
        if (M() || Q()) {
            return false;
        }
        k92 k92 = this.b;
        if (k92.J.b(16) || !D() || k92.J.b(16)) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean s = oag.s(e(this.Y), 16);
        if (!I() && (z82 = k92.H) != null && z82.e) {
            return true;
        }
        return s;
    }

    public final boolean x() {
        return d0() || oag.s(e(this.Y), 1);
    }

    public final boolean y() {
        return d0() || oag.s(e(this.Y), 256);
    }

    public final boolean z() {
        if (!D() || I()) {
            return false;
        }
        z82 z82 = this.b.H;
        if (z82 == null || !z82.i) {
            return oag.s(e(this.Y), 128);
        }
        return true;
    }
}

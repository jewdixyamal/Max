package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: u6b  reason: default package */
public final class u6b {
    public final ida a;
    public final el3 b;
    public final m7b c;
    public final cu8 d;
    public final rj e;
    public e52 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public String m;
    public n34 n;
    public boolean o;
    public boolean p;
    public boolean q;

    public u6b(ida ida, el3 el3, m7b m7b, cu8 cu8, e52 e52, rj rjVar) {
        this.a = ida;
        this.b = el3;
        this.c = m7b;
        this.d = cu8;
        this.e = rjVar;
        if (e52 != null) {
            h(e52);
            return;
        }
        d();
        f();
        e();
        c(ida.g());
    }

    public final String a(e52 e52, cu8 cu8) {
        boolean z = ((p7b) this.c).c.g.getBoolean("audio.transcription.enabled", true);
        boolean n2 = cu8.n();
        String str = cu8.s0;
        if (!n2) {
            return str;
        }
        if (!cu8.D() && !oag.t(str)) {
            return str;
        }
        ida ida = this.a;
        if (e52 == null || e52.I() || e52.M() || e52.Q()) {
            return ida.e.f(ida.a, ida, cu8, false, false, false, z, ida.c.t(), true);
        }
        String f2 = ida.e.f(ida.a, ida, cu8, false, false, false, z, ida.c.t(), true);
        ida.e.f(ida.a, ida, cu8, false, false, false, z, ida.c.t(), true);
        return f2;
    }

    public final CharSequence b(e52 e52) {
        this.f = e52;
        ida ida = this.a;
        i(e52, ida.f(), ida.e());
        return this.i;
    }

    public final void c(int i2) {
        uj3 i3 = this.b.i(this.d.Y, true);
        if (this.h == null) {
            this.h = this.a.j.b(i2, i3.d());
        }
    }

    public final void d() {
        if (this.n == null) {
            cu8 cu8 = this.d;
            this.n = n34.g(cu8.o() ? cu8.T0.a : cu8.k(), TimeZone.getDefault());
        }
    }

    public final void e() {
        String str;
        if (this.l == null) {
            d();
            n34 n34 = this.n;
            ida ida = this.a;
            Locale v = ida.c.v();
            n34 g2 = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
            boolean A = ay7.A(g2, n34);
            Context context = ida.a;
            if (A) {
                str = context.getString(c2c.tt_dates_today);
            } else {
                n34.f();
                Integer num = n34.c;
                n34.f();
                n34 l2 = new n34(n34.a, n34.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
                g2.f();
                Integer num2 = g2.c;
                g2.f();
                if (l2.equals(new n34(g2.a, g2.b, num2, (Integer) null, (Integer) null, (Integer) null, 0))) {
                    str = context.getString(c2c.tt_dates_yesterday);
                } else {
                    long h2 = n34.h(TimeZone.getDefault());
                    str = g2.a.equals(n34.a) ? ay7.q(v, h2, false) : ay7.q(v, h2, true);
                }
            }
            this.l = str;
        }
    }

    public final void f() {
        if (this.k == null) {
            cu8 cu8 = this.d;
            long k2 = cu8.o() ? cu8.T0.a : cu8.k();
            ida ida = this.a;
            this.k = ay7.k(ida.a, k2, ida.c.v());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.e52 r17) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r0.p
            if (r1 != 0) goto L_0x006c
            cu8 r1 = r0.d
            boolean r2 = r1.x()
            m7b r3 = r0.c
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x001d
            r6 = r3
            p7b r6 = (defpackage.p7b) r6
            t33 r6 = r6.a
            r6.getClass()
            goto L_0x001f
        L_0x001d:
            r6 = r4
            goto L_0x0020
        L_0x001f:
            r6 = r5
        L_0x0020:
            java.lang.CharSequence r7 = r0.g
            boolean r7 = defpackage.oag.t(r7)
            if (r7 != 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            java.lang.CharSequence r9 = r0.g
            if (r17 == 0) goto L_0x003c
            boolean r6 = r17.J()
            if (r6 != 0) goto L_0x003a
            boolean r6 = r17.Q()
            if (r6 == 0) goto L_0x003c
        L_0x003a:
            r10 = r5
            goto L_0x003d
        L_0x003c:
            r10 = r4
        L_0x003d:
            if (r17 == 0) goto L_0x0047
            boolean r6 = r17.n0()
            if (r6 == 0) goto L_0x0047
            r12 = r5
            goto L_0x0048
        L_0x0047:
            r12 = r4
        L_0x0048:
            r13 = r2 ^ 1
            java.util.List r14 = r1.R0
            long r1 = r1.Y
            p7b r3 = (defpackage.p7b) r3
            t33 r3 = r3.a
            long r6 = r3.t()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x005c
            r15 = r5
            goto L_0x005d
        L_0x005c:
            r15 = r4
        L_0x005d:
            ida r8 = r0.a
            r11 = 1
            java.lang.CharSequence r1 = r8.a(r9, r10, r11, r12, r13, r14, r15)
            java.lang.CharSequence r1 = defpackage.kp.y(r1)
            r0.g = r1
        L_0x006a:
            r0.p = r5
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6b.g(e52):void");
    }

    public final void h(e52 e52) {
        this.f = e52;
        ida ida = this.a;
        i(e52, ida.f(), ida.e());
        g(e52);
        d();
        f();
        e();
        c(ida.g());
    }

    public final void i(e52 e52, int i2, int i3) {
        ida ida;
        long j2;
        CharSequence charSequence;
        ida ida2;
        boolean z;
        boolean z2;
        boolean z3;
        e52 e522 = e52;
        if (!this.o) {
            cu8 cu8 = this.d;
            boolean x = cu8.x();
            el3 el3 = this.b;
            ida ida3 = this.a;
            long j3 = cu8.Y;
            if (!x) {
                j2 = j3;
                ida = ida3;
                charSequence = a(e522, cu8);
            } else if (e522 != null) {
                j2 = j3;
                ida = ida3;
                charSequence = are.k(ida3.a, ida3, (el3) ida3.d.getValue(), e52.I(), cu8, el3.i(j3, true), false, false, ida3.c.t());
            } else {
                j2 = j3;
                ida = ida3;
                charSequence = null;
            }
            if (cu8.x() && !oag.t(charSequence)) {
                String charSequence2 = charSequence.toString();
                q10 f2 = cu8.f();
                uj3 i4 = el3.i(j2, false);
                ida.getClass();
                switch (f2.a.ordinal()) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        ida2 = ida;
                        charSequence = are.a(charSequence2, i4, ida2, false);
                        break;
                    case 2:
                    case 3:
                        ida2 = ida;
                        charSequence = are.b(charSequence2, f2, i4, ida2, (el3) ida2.d.getValue(), false);
                        break;
                    default:
                        charSequence = charSequence2;
                        break;
                }
            }
            ida2 = ida;
            if (!oag.t(charSequence)) {
                cu8.x();
                this.g = kp.z(ida2.j.b(i2, charSequence));
                if (!cu8.n()) {
                    List c2 = ida2.j.c(this.g);
                    if (!c2.isEmpty() && c2.size() <= 3) {
                        if (ida2.j.g(this.g)) {
                            z3 = true;
                            z2 = z3;
                        }
                    }
                    z3 = false;
                    z2 = z3;
                } else {
                    z2 = false;
                }
                this.g = kp.z(ida2.k(this.g, cu8.R0, j2 != ((p7b) this.c).a.t(), i2, this.e.a()));
                if (cu8.n()) {
                    this.i = null;
                } else if (z2) {
                    this.i = kp.z(ida2.j(charSequence, cu8.R0, i3));
                } else {
                    this.i = null;
                }
            } else {
                this.g = "";
                this.i = null;
            }
            CharSequence charSequence3 = this.g;
            if (e522 == null || !e52.n0() || oag.t(charSequence3)) {
                z = true;
            } else {
                Pattern pattern = e52.M() ? bre.c : bre.e;
                ida2.getClass();
                Pattern pattern2 = ura.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3);
                Matcher matcher = pattern.matcher(spannableStringBuilder);
                int i5 = 0;
                while (matcher.find(i5)) {
                    Matcher matcher2 = pattern2.matcher(spannableStringBuilder);
                    boolean z4 = false;
                    while (matcher2.find() && matcher2.start() <= matcher.end()) {
                        if (matcher2.group().contains(matcher.group())) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        i5 = matcher.end();
                    } else {
                        if (!matcher.group().contains("/﻿")) {
                            spannableStringBuilder.replace(matcher.start(), matcher.end(), matcher.group().replace(String.valueOf('/'), "/﻿"));
                        }
                        i5 = matcher.end();
                    }
                }
                int i6 = gvd.a;
                z = true;
                charSequence3 = crd.l(spannableStringBuilder, true);
            }
            this.g = charSequence3;
            this.o = z;
        }
    }
}

package defpackage;

import android.content.Context;
import android.text.Layout;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: k29  reason: default package */
public final class k29 {
    public final Context a;
    public final String b = k29.class.getName();
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final khe f;
    public final ConcurrentHashMap g;
    public final ContextScope h;
    public final khe i;

    public k29(kke kke, oe3 oe3, je7 je7, je7 je72, je7 je73, Context context) {
        this.a = context;
        this.c = je7;
        this.d = je72;
        this.e = je73;
        this.f = new khe(new b29(100, 0));
        this.g = new ConcurrentHashMap();
        this.h = j1e.a(((w9a) kke).a());
        this.i = new khe(new ga5(6, je7));
        oe3.a(oe3.c | oe3.d, new c29(0, this));
    }

    public static by8 c(k29 k29, e52 e52, es8 es8, boolean z) {
        k29.getClass();
        e29 e29 = new e29(e52, es8, false);
        mw7 e2 = k29.e();
        Object c2 = e2.c(e29);
        if (c2 == null) {
            c2 = k29.a(e52, es8, (CharSequence) null, false);
            e2.d(e29, c2);
        }
        ie7 ie7 = (ie7) c2;
        return z ? ie7.a : ie7.b;
    }

    public final ie7 a(e52 e52, es8 es8, CharSequence charSequence, boolean z) {
        Iterable<es8> iterable;
        khe khe;
        e52 e522 = e52;
        es8 es82 = es8;
        e29 e29 = new e29(e522, es82, z);
        ((eka) ((mqe) this.d.getValue())).getClass();
        bw8 bw8 = es82.c;
        if (bw8 == null || bw8.a != 1) {
            iterable = nz4.a;
        } else {
            es8 es83 = bw8.c;
            if (es83.a() != null) {
                es83 = es83.a();
            }
            iterable = Collections.singletonList(new es8(es83.a, es83.b, es83.c, es83.o, es83.X, es83.Y, es83.Z, es83.s0));
        }
        for (es8 es84 : iterable) {
            if (es84 != es82) {
                a(e522, es84, (CharSequence) null, true);
            }
        }
        ie7 ie7 = (ie7) e().c(e29);
        int b2 = ((w6a) d()).b();
        d29 d29 = r0;
        int b3 = ((w6a) d()).b();
        int i2 = b2;
        d29 d292 = new d29(this, e52, es8, b2, charSequence, z, 0);
        khe khe2 = new khe(d29);
        boolean z2 = i2 == b3;
        if (z2) {
            khe = khe2;
        } else {
            d29 d293 = r0;
            khe = khe2;
            d29 d294 = new d29(this, e52, es8, b3, charSequence, z, 1);
            khe2 = new khe(d293);
        }
        boolean z3 = this.a.getResources().getConfiguration().orientation == 1;
        ContextScope contextScope = this.h;
        if (ie7 != null) {
            by8 by8 = ie7.b;
            if (z2 || z3) {
                by8 by82 = ie7.a;
                by82.b((Layout) khe.getValue());
                if (by82 != by8) {
                    j47.T(contextScope, (lx3) null, (vx3) null, new f29(ie7, khe2, (Continuation) null), 3);
                }
            } else {
                by8.b((Layout) khe2.getValue());
                j47.T(contextScope, (lx3) null, (vx3) null, new g29(ie7, khe, (Continuation) null), 3);
            }
        } else {
            by8 by83 = new by8(e522, es82, khe);
            by8 by84 = z2 ? by83 : new by8(e522, es82, khe2);
            ie7 = new ie7(by83, by84);
            e().d(e29, ie7);
            if (z2 || z3) {
                by83.b((Layout) khe.getValue());
                if (by83 != by84) {
                    j47.T(contextScope, (lx3) null, (vx3) null, new h29(ie7, khe2, (Continuation) null), 3);
                }
            } else {
                by84.b((Layout) khe2.getValue());
                j47.T(contextScope, (lx3) null, (vx3) null, new i29(ie7, khe, (Continuation) null), 3);
            }
        }
        return ie7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Object, upe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout b(defpackage.e52 r32, defpackage.es8 r33, int r34, java.lang.CharSequence r35, boolean r36) {
        /*
            r31 = this;
            r6 = r31
            r3 = r32
            r5 = r33
            r0 = r35
            r4 = r36
            r15 = 2
            r14 = 1
            je7 r13 = r6.d
            java.lang.Object r7 = r13.getValue()
            mqe r7 = (defpackage.mqe) r7
            eka r7 = (defpackage.eka) r7
            r7.getClass()
            boolean r8 = r5 instanceof defpackage.dka
            cu8 r9 = r5.a
            pq9 r12 = defpackage.qp4.u0
            u6b r11 = r5.X
            android.content.Context r1 = r7.a
            if (r8 == 0) goto L_0x01cd
            p7b r8 = r7.b
            jp r2 = r8.c
            ne7 r2 = r2.g
            java.lang.String r10 = "audio.transcription.enabled"
            boolean r2 = r2.getBoolean(r10, r14)
            java.lang.String r10 = r9.s0
            if (r10 == 0) goto L_0x0048
            int r10 = r10.length()
            if (r10 != 0) goto L_0x003c
            goto L_0x0048
        L_0x003c:
            boolean r10 = r9.D()
            if (r10 != 0) goto L_0x0048
            java.lang.CharSequence r1 = r5.b(r3)
            goto L_0x0108
        L_0x0048:
            boolean r10 = r9.u()
            if (r10 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x006b
            i10 r2 = r9.c()
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r2.f
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x006b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            i10 r1 = r9.c()
            java.lang.String r1 = r1.f
            goto L_0x0108
        L_0x006b:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            int r7 = defpackage.dpc.s
            java.lang.String r1 = r1.getString(r7)
            i10 r7 = r9.c()
            long r7 = r7.c
            java.lang.String[] r10 = defpackage.are.b
            java.lang.String r7 = defpackage.tfg.c(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r7}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r15)
            java.lang.String r7 = "%s %s"
            java.lang.String r1 = java.lang.String.format(r2, r7, r1)
            goto L_0x0108
        L_0x008f:
            boolean r2 = r9.y()
            if (r2 == 0) goto L_0x009e
            s10 r1 = r9.g()
            if (r1 == 0) goto L_0x0107
            java.lang.String r1 = r1.c
            goto L_0x0108
        L_0x009e:
            boolean r2 = r9.w()
            if (r2 == 0) goto L_0x00dd
            n10 r2 = r9.e()
            ed3 r7 = defpackage.vl.b()
            y8a r7 = (defpackage.y8a) r7
            v4 r7 = r7.getAccessor()
            java.lang.Class<ak3> r8 = defpackage.ak3.class
            java.lang.Object r7 = r7.c(r8)
            ak3 r7 = (defpackage.ak3) r7
            uj3 r7 = r7.b(r2)
            int r10 = defpackage.jpc.d
            ed3 r17 = defpackage.vl.b()
            y8a r17 = (defpackage.y8a) r17
            v4 r15 = r17.getAccessor()
            java.lang.Object r8 = r15.c(r8)
            ak3 r8 = (defpackage.ak3) r8
            java.lang.String r2 = defpackage.z04.y(r7, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r1.getString(r10, r2)
            goto L_0x0108
        L_0x00dd:
            boolean r2 = r9.z()
            if (r2 == 0) goto L_0x00ea
            int r2 = defpackage.dpc.x
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0108
        L_0x00ea:
            boolean r1 = r9.v()
            if (r1 == 0) goto L_0x0107
            t33 r1 = r8.a
            long r23 = r1.t()
            android.content.Context r1 = r7.a
            r22 = 0
            cu8 r2 = r5.a
            r21 = 0
            r19 = r1
            r20 = r2
            java.lang.String r1 = defpackage.are.h(r19, r20, r21, r22, r23)
            goto L_0x0108
        L_0x0107:
            r1 = 0
        L_0x0108:
            if (r1 == 0) goto L_0x016d
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0111
            goto L_0x016d
        L_0x0111:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            int r7 = r1.length()
            r8 = 3
            if (r7 != 0) goto L_0x011d
        L_0x011a:
            r9 = r1
            r1 = r8
            goto L_0x0165
        L_0x011d:
            boolean r7 = r9.u()
            if (r7 == 0) goto L_0x0125
            r8 = r14
            goto L_0x012c
        L_0x0125:
            boolean r7 = r9.w()
            if (r7 == 0) goto L_0x012c
            r8 = 2
        L_0x012c:
            boolean r7 = r1 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x011a
            int r7 = r1.length()
            r10 = 0
            java.lang.CharSequence r1 = r1.subSequence(r10, r7)
            boolean r7 = r1 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x0141
            r7 = r1
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            if (r7 == 0) goto L_0x0160
            int r9 = r7.length()
            java.lang.Class<yz7> r15 = defpackage.yz7.class
            java.lang.Object[] r9 = r7.getSpans(r10, r9, r15)
            int r15 = r9.length
        L_0x014f:
            if (r10 >= r15) goto L_0x0160
            r17 = r9[r10]
            r19 = r1
            r1 = r17
            yz7 r1 = (defpackage.yz7) r1
            r7.removeSpan(r1)
            int r10 = r10 + r14
            r1 = r19
            goto L_0x014f
        L_0x0160:
            r19 = r1
            r1 = r8
            r9 = r19
        L_0x0165:
            if (r9 == 0) goto L_0x016d
            int r7 = r9.length()
            if (r7 != 0) goto L_0x0173
        L_0x016d:
            r6 = r12
            r20 = r13
            r2 = r14
            r1 = 2
            goto L_0x01c9
        L_0x0173:
            lqe r17 = new lqe
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r8 = 1096810496(0x41600000, float:14.0)
            r15 = 2
            float r8 = android.util.TypedValue.applyDimension(r15, r8, r7)
            r11.getClass()
            java.util.List r7 = java.util.Collections.emptyList()
            boolean r7 = r7.isEmpty()
            r10 = r7 ^ 1
            r7 = 10
            float r11 = (float) r7
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r11
            int r18 = defpackage.tu0.G(r7)
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r11 = r11 * r7
            int r19 = defpackage.tu0.G(r11)
            r11 = 0
            r7 = r17
            r6 = 0
            r6 = r12
            r12 = r1
            r20 = r13
            r13 = r2
            r2 = r14
            r14 = r33
            r1 = r15
            r15 = r18
            r16 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r11 = r17
            goto L_0x01ca
        L_0x01c9:
            r11 = 0
        L_0x01ca:
            r8 = r1
            goto L_0x02f1
        L_0x01cd:
            r6 = r12
            r20 = r13
            r2 = r14
            r8 = r15
            java.lang.String r10 = r9.s0
            if (r10 == 0) goto L_0x02f0
            int r10 = r10.length()
            if (r10 != 0) goto L_0x01de
            goto L_0x02f0
        L_0x01de:
            boolean r10 = r9.D()
            if (r10 == 0) goto L_0x01e6
            goto L_0x02f0
        L_0x01e6:
            java.lang.CharSequence r10 = r11.b(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0268
            cu8 r10 = r5.a
            int r12 = r10.b()
            if (r12 != 0) goto L_0x0268
            lqe r12 = new lqe
            kqe r13 = defpackage.os2.b
            je7 r7 = r7.d
            java.lang.Object r7 = r7.getValue()
            zaa r7 = (defpackage.zaa) r7
            j0e r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            du4 r7 = (defpackage.du4) r7
            long r13 = r13.g(r7)
            float r26 = defpackage.ck4.c(r13, r1)
            r11.f = r3
            ida r1 = r11.a
            int r7 = r1.f()
            int r1 = r1.e()
            r11.i(r3, r7, r1)
            r11.g(r3)
            java.lang.CharSequence r1 = r11.i
            if (r1 != 0) goto L_0x022c
            java.lang.String r1 = ""
        L_0x022c:
            r27 = r1
            boolean r1 = r9.D()
            if (r1 != 0) goto L_0x0244
            java.lang.CharSequence r1 = r11.b(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x025a
            int r1 = r10.b()
            if (r1 != 0) goto L_0x025a
        L_0x0244:
            bw8 r1 = r5.c
            if (r1 != 0) goto L_0x025a
            r11.getClass()
            java.util.List r1 = java.util.Collections.emptyList()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0257
            goto L_0x025a
        L_0x0257:
            r28 = 0
            goto L_0x025c
        L_0x025a:
            r28 = r2
        L_0x025c:
            r29 = 0
            r30 = 504(0x1f8, float:7.06E-43)
            r25 = r12
            r25.<init>(r26, r27, r28, r29, r30)
            r11 = r12
            goto L_0x02f1
        L_0x0268:
            java.lang.CharSequence r10 = r5.b(r3)
            qp4 r11 = r6.b(r1)
            fka r11 = r11.i()
            nr2 r11 = r11.a()
            boolean r12 = r33.d()
            is0 r11 = r11.d(r12)
            ls0 r11 = r11.d
            int r11 = r11.b
            r12 = 28
            android.text.Spannable r11 = defpackage.qx7.l(r10, r11, r12)
            if (r11 != 0) goto L_0x028f
            r27 = r10
            goto L_0x0291
        L_0x028f:
            r27 = r11
        L_0x0291:
            je7 r7 = r7.e
            java.lang.Object r7 = r7.getValue()
            os0 r7 = (defpackage.os0) r7
            r33.d()
            w6a r7 = (defpackage.w6a) r7
            float r7 = r7.c()
            es8 r10 = r33.a()
            if (r10 == 0) goto L_0x02af
            cu8 r10 = r10.a
            if (r10 == 0) goto L_0x02af
            int r9 = r10.O0
            goto L_0x02b1
        L_0x02af:
            int r9 = r9.O0
        L_0x02b1:
            float r10 = (float) r9
            r11 = 1120403456(0x42c80000, float:100.0)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x02c4
            r10 = 300(0x12c, float:4.2E-43)
            int r9 = java.lang.Math.min(r9, r10)
            float r9 = (float) r9
            float r9 = r9 / r11
            float r7 = r7 * r9
            r29 = 0
            goto L_0x02c6
        L_0x02c4:
            r29 = r2
        L_0x02c6:
            t4f r1 = defpackage.c54.a(r1)
            q0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r8, r1, r9)
            float r26 = r1 + r7
            lqe r11 = new lqe
            r28 = 1
            r30 = 496(0x1f0, float:6.95E-43)
            r25 = r11
            r25.<init>(r26, r27, r28, r29, r30)
            goto L_0x02f1
        L_0x02f0:
            r11 = 0
        L_0x02f1:
            if (r11 != 0) goto L_0x0311
            lqe r11 = new lqe
            os0 r1 = r31.d()
            r33.d()
            w6a r1 = (defpackage.w6a) r1
            float r26 = r1.c()
            java.lang.CharSequence r27 = r5.b(r3)
            r28 = 1
            r29 = 0
            r30 = 504(0x1f8, float:7.06E-43)
            r25 = r11
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x0311:
            if (r0 == 0) goto L_0x031a
            r1 = 501(0x1f5, float:7.02E-43)
            r7 = 0
            lqe r11 = defpackage.lqe.a(r11, r0, r7, r1)
        L_0x031a:
            java.lang.Object r0 = r20.getValue()
            mqe r0 = (defpackage.mqe) r0
            eka r0 = (defpackage.eka) r0
            java.lang.String r0 = r0.c
            java.lang.CharSequence r1 = r11.b
            if (r4 != 0) goto L_0x0329
            goto L_0x0369
        L_0x0329:
            boolean r7 = r1 instanceof android.text.Spannable
            if (r7 != 0) goto L_0x032e
            goto L_0x0369
        L_0x032e:
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r1)
            int r9 = r7.length()
            java.lang.Class<ozc> r10 = defpackage.ozc.class
            r12 = 0
            java.lang.Object[] r9 = r7.getSpans(r12, r9, r10)
            ozc[] r9 = (defpackage.ozc[]) r9
            int r10 = r9.length
            if (r10 != 0) goto L_0x0344
            goto L_0x0369
        L_0x0344:
            int r1 = r9.length
            r10 = 0
        L_0x0346:
            if (r10 >= r1) goto L_0x0368
            r12 = r9[r10]
            android.text.style.ForegroundColorSpan r13 = r12.a     // Catch:{ all -> 0x0361 }
            if (r13 == 0) goto L_0x0351
            r7.removeSpan(r13)     // Catch:{ all -> 0x0361 }
        L_0x0351:
            android.text.style.BackgroundColorSpan r13 = r12.b     // Catch:{ all -> 0x0361 }
            if (r13 == 0) goto L_0x0358
            r7.removeSpan(r13)     // Catch:{ all -> 0x0361 }
        L_0x0358:
            r7.removeSpan(r12)     // Catch:{ all -> 0x0361 }
            java.lang.String r12 = "reformatText: remove search span"
            defpackage.hm9.h0(r0, r12, new java.lang.Object[0])     // Catch:{ all -> 0x0361 }
            goto L_0x0366
        L_0x0361:
            java.lang.String r12 = "reformatText: could not remove search spans"
            defpackage.hm9.m0(r0, r12, new java.lang.Object[0])
        L_0x0366:
            int r10 = r10 + r2
            goto L_0x0346
        L_0x0368:
            r1 = r7
        L_0x0369:
            r0 = 509(0x1fd, float:7.13E-43)
            r7 = 0
            lqe r9 = defpackage.lqe.a(r11, r1, r7, r0)
            boolean r0 = r9.d
            java.lang.CharSequence r11 = r9.b
            if (r0 == 0) goto L_0x043e
            e29 r10 = new e29
            r10.<init>(r3, r5, r4)
            r0 = r7
            r7 = r31
            java.util.concurrent.ConcurrentHashMap r12 = r7.g
            boolean r1 = r12.containsKey(r10)
            if (r1 == 0) goto L_0x0397
            java.lang.Object r1 = r12.get(r10)
            zl4 r1 = (defpackage.zl4) r1
            if (r1 == 0) goto L_0x0397
            boolean r1 = r1.h()
            if (r1 != 0) goto L_0x0397
            r14 = r2
            goto L_0x042e
        L_0x0397:
            java.lang.Object r1 = r12.get(r10)
            zl4 r1 = (defpackage.zl4) r1
            if (r1 == 0) goto L_0x03a2
            r1.g()
        L_0x03a2:
            java.lang.Object r1 = r20.getValue()
            mqe r1 = (defpackage.mqe) r1
            eka r1 = (defpackage.eka) r1
            khe r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            vpe r1 = (defpackage.vpe) r1
            r1.getClass()
            u24 r13 = new u24
            r14 = 8
            r13.<init>(r1, r14, r11)
            t28 r14 = new t28
            r14.<init>(r13)
            upe r13 = new upe
            r13.<init>()
            r13.a = r0
            r13.b = r11
            q1a r0 = defpackage.iqd.g(r13)
            java.lang.Iterable r13 = r1.b
            java.util.Iterator r13 = r13.iterator()
            boolean r15 = r13.hasNext()
            if (r15 != 0) goto L_0x0430
            ypc r13 = new ypc
            r15 = 10
            r13.<init>(r1, r15, r11)
            rqd r1 = new rqd
            r1.<init>(r0, r13, r8)
            ib3 r0 = new ib3
            r0.<init>(r14, r2, r1)
            hme r1 = new hme
            r13 = 7
            r1.<init>(r13)
            o28 r13 = new o28
            r13.<init>(r0, r8, r1)
            bqc r0 = new bqc
            r1 = 28
            r0.<init>(r1, r11)
            e38 r8 = new e38
            kj6 r1 = defpackage.ft.e
            r66 r14 = defpackage.ft.d
            r8.<init>(r13, r1, r0, r14)
            te r13 = new te
            r0 = r13
            r1 = r11
            r14 = r2
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            bkg r0 = new bkg
            r1 = 18
            r0.<init>(r1, r7)
            p00 r1 = new p00
            r2 = 6
            r1.<init>(r7, r2, r10)
            g28 r2 = new g28
            r2.<init>(r13, r0, r1)
            r8.a(r2)
            r12.put(r10, r2)
        L_0x042e:
            r1 = 0
            goto L_0x0442
        L_0x0430:
            java.lang.Object r0 = r13.next()
            defpackage.au1.r(r0)
            java.lang.String r0 = "transformer is null"
            r1 = 0
            java.util.Objects.requireNonNull(r1, r0)
            throw r1
        L_0x043e:
            r1 = 0
            r7 = r31
            r14 = r2
        L_0x0442:
            boolean r0 = r9.j
            if (r0 != 0) goto L_0x044c
            r0 = 495(0x1ef, float:6.94E-43)
            lqe r9 = defpackage.lqe.a(r9, r1, r14, r0)
        L_0x044c:
            khe r0 = r7.i
            java.lang.Object r0 = r0.getValue()
            j29 r0 = (defpackage.j29) r0
            a3f r1 = new a3f
            os0 r2 = r31.d()
            boolean r3 = r33.d()
            w6a r2 = (defpackage.w6a) r2
            android.content.Context r2 = r2.a
            qp4 r2 = r6.b(r2)
            fka r2 = r2.i()
            nr2 r2 = r2.a()
            is0 r2 = r2.d(r3)
            ls0 r2 = r2.d
            int r2 = r2.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            float r3 = r9.a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r4 = r33.d()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.<init>(r2, r3, r4)
            java.lang.Object r0 = r0.c(r1)
            if (r0 == 0) goto L_0x04b2
            r12 = r0
            android.text.TextPaint r12 = (android.text.TextPaint) r12
            int r0 = r9.h
            int r0 = r34 - r0
            int r1 = r9.i
            int r13 = r0 - r1
            je7 r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            fe7 r10 = (defpackage.fe7) r10
            boolean r15 = r9.c
            android.text.TextUtils$TruncateAt r0 = r9.f
            int r14 = r9.e
            r16 = r0
            android.text.Layout r0 = r10.a(r11, r12, r13, r14, r15, r16)
            return r0
        L_0x04b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k29.b(e52, es8, int, java.lang.CharSequence, boolean):android.text.Layout");
    }

    public final os0 d() {
        return (os0) this.c.getValue();
    }

    public final mw7 e() {
        return (mw7) this.f.getValue();
    }
}

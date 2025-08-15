package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: nu5  reason: default package */
public final class nu5 extends pnf {
    public static final /* synthetic */ bc7[] D0;
    public volatile at5 A0;
    public final w4d B0 = mqd.D();
    public final w4d C0 = mqd.D();
    public final ta2 X;
    public final je7 Y;
    public final je7 Z;
    public final String b;
    public final long c;
    public final kke o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public final q0e v0;
    public final w7c w0;
    public final s35 x0 = new s35(0);
    public final AtomicReference y0 = new AtomicReference(new LinkedHashSet());
    public final AtomicReference z0 = new AtomicReference(vv7.a());

    static {
        Class<nu5> cls = nu5.class;
        D0 = new bc7[]{new oi9(cls, "addChatsClickJob", "getAddChatsClickJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "addChatsResultJob", "getAddChatsResultJob()Lkotlinx/coroutines/Job;")};
    }

    public nu5(String str, long j) {
        xv5 xv5 = xv5.a;
        kke kke = (kke) xv5.getAccessor().c(kke.class);
        xv5.getAccessor().d(q33.class);
        khe d = xv5.getAccessor().d(lr2.class);
        khe d2 = xv5.getAccessor().d(iy2.class);
        khe d3 = xv5.getAccessor().d(hda.class);
        xv5.getAccessor().d(jz2.class);
        this.b = str;
        this.c = j;
        this.o = kke;
        this.X = (ta2) xv5.getAccessor().c(ta2.class);
        this.Y = d;
        this.Z = d2;
        this.s0 = d3;
        q0e a = r0e.a(new xt5());
        this.t0 = a;
        this.u0 = new w7c(a);
        q0e a2 = r0e.a(nz4.a);
        this.v0 = a2;
        this.w0 = new w7c(a2);
        if (str != null) {
            a.m((Object) null, new yt5(str, (CharSequence) null, 5));
            pnf.n(this, ((w9a) kke).b(), (vx3) null, new bu5(this, d3, d, (Continuation) null), 2);
            return;
        }
        a.m((Object) null, new xt5());
        if (j != 0) {
            pnf.n(this, ((w9a) kke).b(), (vx3) null, new cu5(this, d, (Continuation) null), 2);
            return;
        }
        a2.m((Object) null, y53.M(new st5((iqe) null, true), new ou5(2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.nu5 r16, java.util.Set r17, kotlin.coroutines.Continuation r18) {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof defpackage.ku5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ku5 r2 = (defpackage.ku5) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w0 = r3
            goto L_0x001c
        L_0x0017:
            ku5 r2 = new ku5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.u0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.w0
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 != r6) goto L_0x003b
            java.util.Iterator r0 = r2.t0
            xs r4 = r2.s0
            gi9 r7 = r2.Z
            java.util.Set r8 = r2.Y
            at5 r9 = r2.X
            nu5 r10 = r2.o
            defpackage.od2.a0(r1)
            r15 = r10
            r10 = r0
            r0 = r15
            goto L_0x00a2
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            defpackage.od2.a0(r1)
            at5 r1 = r0.A0
            java.util.concurrent.atomic.AtomicReference r4 = r0.y0
            oe2 r7 = new oe2
            r8 = 3
            r7.<init>(r8)
            java.lang.Object r4 = r4.updateAndGet(r7)
            java.util.Set r4 = (java.util.Set) r4
            java.util.concurrent.atomic.AtomicReference r7 = r0.z0
            oe2 r8 = new oe2
            r9 = 4
            r8.<init>(r9)
            java.lang.Object r7 = r7.updateAndGet(r8)
            gi9 r7 = (defpackage.gi9) r7
            xs r8 = new xs
            r8.<init>((int) r5)
            java.util.Iterator r9 = r17.iterator()
            r15 = r8
            r8 = r4
            r4 = r15
        L_0x0070:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d1
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            je7 r12 = r0.Z
            java.lang.Object r12 = r12.getValue()
            iy2 r12 = (defpackage.iy2) r12
            r2.o = r0
            r2.X = r1
            r2.Y = r8
            r2.Z = r7
            r2.s0 = r4
            r2.t0 = r9
            r2.w0 = r6
            java.lang.Object r10 = r12.d(r10, r2)
            if (r10 != r3) goto L_0x009e
            goto L_0x0138
        L_0x009e:
            r15 = r9
            r9 = r1
            r1 = r10
            r10 = r15
        L_0x00a2:
            e52 r1 = (defpackage.e52) r1
            k92 r11 = r1.b
            long r11 = r11.a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r4.add(r13)
            if (r9 == 0) goto L_0x00cb
            java.util.Set r11 = r9.v0
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00cb
            java.util.Set r11 = r9.v0
            k92 r12 = r1.b
            long r12 = r12.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            boolean r11 = r11.contains(r14)
            if (r11 != 0) goto L_0x00ce
        L_0x00cb:
            r8.add(r1)
        L_0x00ce:
            r1 = r9
            r9 = r10
            goto L_0x0070
        L_0x00d1:
            if (r1 == 0) goto L_0x00fa
            java.util.Set r1 = r1.v0
            if (r1 == 0) goto L_0x00fa
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fa
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r2)
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L_0x00db
            r7.a(r2)
            goto L_0x00db
        L_0x00fa:
            q0e r1 = r0.t0
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r1 instanceof defpackage.yt5
            if (r1 == 0) goto L_0x0136
            boolean r1 = r7.j()
            if (r1 != 0) goto L_0x0114
            boolean r1 = r8.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r1 = r5
            goto L_0x0115
        L_0x0114:
            r1 = r6
        L_0x0115:
            q0e r0 = r0.t0
        L_0x0117:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            zt5 r3 = (defpackage.zt5) r3
            yt5 r3 = (defpackage.yt5) r3
            if (r1 != 0) goto L_0x0129
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r4 = r5
            goto L_0x012a
        L_0x0129:
            r4 = r6
        L_0x012a:
            r7 = 0
            r8 = 3
            yt5 r3 = defpackage.yt5.b(r3, r7, r4, r8)
            boolean r2 = r0.c(r2, r3)
            if (r2 == 0) goto L_0x0117
        L_0x0136:
            e5f r3 = defpackage.e5f.a
        L_0x0138:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.q(nu5, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13, types: [kotlin.coroutines.Continuation, nx3] */
    /* JADX WARNING: type inference failed for: r6v20 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b7 A[EDGE_INSN: B:90:0x01b7->B:76:0x01b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b2 A[SYNTHETIC] */
    public static final java.lang.Object r(defpackage.nu5 r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof defpackage.lu5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            lu5 r2 = (defpackage.lu5) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.t0 = r3
            goto L_0x001c
        L_0x0017:
            lu5 r2 = new lu5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.t0
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            java.lang.Object r0 = r2.Y
            ti9 r4 = r2.X
            nu5 r7 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x0092
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            defpackage.od2.a0(r1)
            q0e r1 = r0.v0
            r4 = r1
        L_0x0040:
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            at5 r7 = r0.A0
            if (r7 == 0) goto L_0x00a5
            java.util.Set r7 = r7.v0
            if (r7 == 0) goto L_0x00a5
            lx3 r8 = r2.b
            kotlinx.coroutines.internal.ContextScope r8 = defpackage.j1e.a(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = defpackage.z53.S(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0064:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x007c
            java.lang.Object r10 = r7.next()
            mu5 r11 = new mu5
            r11.<init>(r10, r6, r0)
            r10 = 3
            zf4 r10 = defpackage.j47.h(r8, r6, r11, r10)
            r9.add(r10)
            goto L_0x0064
        L_0x007c:
            r2.o = r0
            r2.X = r4
            r2.Y = r1
            r2.t0 = r5
            java.lang.Object r7 = defpackage.pag.c(r9, r2)
            if (r7 != r3) goto L_0x008c
            goto L_0x01db
        L_0x008c:
            r24 = r7
            r7 = r0
            r0 = r1
            r1 = r24
        L_0x0092:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00a3
            java.util.List r1 = defpackage.x53.e0(r1)
            r24 = r1
            r1 = r0
            r0 = r7
            r7 = r4
            r4 = r2
            r2 = r24
            goto L_0x00a8
        L_0x00a3:
            r1 = r0
            r0 = r7
        L_0x00a5:
            r7 = r4
            r4 = r2
            r2 = r6
        L_0x00a8:
            if (r2 != 0) goto L_0x00ac
            nz4 r2 = defpackage.nz4.a
        L_0x00ac:
            java.util.concurrent.atomic.AtomicReference r8 = r0.z0
            java.lang.Object r8 = r8.get()
            gi9 r8 = (defpackage.gi9) r8
            java.util.concurrent.atomic.AtomicReference r9 = r0.y0
            java.lang.Object r9 = r9.get()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = defpackage.x53.t0(r2, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00c9:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00e4
            java.lang.Object r10 = r2.next()
            r11 = r10
            e52 r11 = (defpackage.e52) r11
            k92 r11 = r11.b
            long r11 = r11.a
            boolean r11 = r8.d(r11)
            if (r11 != 0) goto L_0x00c9
            r9.add(r10)
            goto L_0x00c9
        L_0x00e4:
            kl7 r2 = defpackage.j1e.l()
            q0e r8 = r0.t0
            java.lang.Object r8 = r8.getValue()
            zt5 r8 = (defpackage.zt5) r8
            java.lang.CharSequence r8 = r8.a()
            if (r8 != 0) goto L_0x00f8
            java.lang.String r8 = ""
        L_0x00f8:
            st5 r10 = new st5
            iqe r11 = new iqe
            r11.<init>(r8)
            at5 r8 = r0.A0
            if (r8 == 0) goto L_0x0106
            java.util.Set r8 = r8.C0
            goto L_0x0107
        L_0x0106:
            r8 = r6
        L_0x0107:
            if (r8 != 0) goto L_0x010b
            wz4 r8 = defpackage.wz4.a
        L_0x010b:
            cv5 r12 = defpackage.cv5.NO_TITLE_EDIT
            boolean r8 = r8.contains(r12)
            r8 = r8 ^ r5
            r10.<init>(r11, r8)
            r2.add(r10)
            ou5 r8 = new ou5
            boolean r10 = r9.isEmpty()
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x0125
            r10 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x0126
        L_0x0125:
            r10 = 2
        L_0x0126:
            r8.<init>(r10)
            r2.add(r8)
            java.util.Iterator r8 = r9.iterator()
            r10 = 0
            r11 = r10
        L_0x0132:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x01b7
            java.lang.Object r12 = r8.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x01b2
            e52 r12 = (defpackage.e52) r12
            int r14 = r9.size()
            int r14 = r14 - r5
            if (r11 != r14) goto L_0x014f
            r11 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x014c:
            r23 = r11
            goto L_0x0153
        L_0x014f:
            r11 = 1073741828(0x40000004, float:2.000001)
            goto L_0x014c
        L_0x0153:
            android.net.Uri r11 = t(r12)
            pu5 r15 = new pu5
            k92 r14 = r12.b
            r25 = r7
            long r6 = r14.a
            if (r11 == 0) goto L_0x0168
            java.lang.String r11 = r11.toString()
            r17 = r11
            goto L_0x016a
        L_0x0168:
            r17 = 0
        L_0x016a:
            je7 r11 = r0.Y
            java.lang.Object r11 = r11.getValue()
            lr2 r11 = (defpackage.lr2) r11
            ld2 r11 = (defpackage.ld2) r11
            r11.getClass()
            r12.k0()
            java.lang.CharSequence r11 = r12.u0
            long r19 = r12.f()
            r12.l0()
            java.lang.CharSequence r14 = r12.x0
            boolean r16 = r12.X()
            if (r16 != 0) goto L_0x019c
            uj3 r12 = r12.l()
            if (r12 == 0) goto L_0x0198
            boolean r12 = r12.u()
            if (r12 != r5) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            r22 = r10
        L_0x019a:
            r12 = r14
            goto L_0x019f
        L_0x019c:
            r22 = r5
            goto L_0x019a
        L_0x019f:
            r14 = r15
            r5 = r15
            r15 = r6
            r18 = r11
            r21 = r12
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
            r2.add(r5)
            r7 = r25
            r11 = r13
            r5 = 1
            r6 = 0
            goto L_0x0132
        L_0x01b2:
            defpackage.y53.R()
            r5 = 0
            throw r5
        L_0x01b7:
            r5 = r6
            r25 = r7
            at5 r6 = r0.A0
            if (r6 == 0) goto L_0x01cd
            java.util.Set r6 = r6.C0
            cv5 r7 = defpackage.cv5.NO_DELETE
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x01cd
            lt5 r6 = defpackage.lt5.a
            r2.add(r6)
        L_0x01cd:
            kl7 r2 = defpackage.j1e.d(r2)
            r6 = r25
            boolean r1 = r6.c(r1, r2)
            if (r1 == 0) goto L_0x01dc
            e5f r3 = defpackage.e5f.a
        L_0x01db:
            return r3
        L_0x01dc:
            r2 = r4
            r4 = r6
            r6 = r5
            r5 = 1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.r(nu5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Uri t(e52 e52) {
        String g = e52.g(kk0.b, jk0.a);
        if (g == null) {
            return null;
        }
        if (w9e.C0(g)) {
            g = null;
        }
        if (g != null) {
            return j47.N(g);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.concurrent.atomic.AtomicReference r3 = r0.y0
            java.lang.Object r3 = r3.get()
            java.util.Set r3 = (java.util.Set) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0017
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0017
            goto L_0x003f
        L_0x0017:
            java.util.Iterator r4 = r3.iterator()
        L_0x001b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            e52 r5 = (defpackage.e52) r5
            k92 r5 = r5.b
            long r5 = r5.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x001b
            jh2 r4 = new jh2
            r5 = 2
            r4.<init>(r1, r5)
            au5 r5 = new au5
            r6 = 0
            r5.<init>(r6, r4)
            r3.removeIf(r5)
            goto L_0x004a
        L_0x003f:
            java.util.concurrent.atomic.AtomicReference r3 = r0.z0
            java.lang.Object r3 = r3.get()
            gi9 r3 = (defpackage.gi9) r3
            r3.a(r1)
        L_0x004a:
            q0e r3 = r0.v0
        L_0x004c:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x005c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r5.next()
            r8 = r7
            ol7 r8 = (defpackage.ol7) r8
            boolean r9 = r8 instanceof defpackage.pu5
            if (r9 == 0) goto L_0x0076
            pu5 r8 = (defpackage.pu5) r8
            long r8 = r8.a
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0076
            goto L_0x005c
        L_0x0076:
            r6.add(r7)
            goto L_0x005c
        L_0x007a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            int r6 = r5.size()
            java.util.ListIterator r6 = r5.listIterator(r6)
        L_0x0087:
            boolean r7 = r6.hasPrevious()
            if (r7 == 0) goto L_0x012e
            java.lang.Object r7 = r6.previous()
            ol7 r7 = (defpackage.ol7) r7
            boolean r8 = r7 instanceof defpackage.lt5
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0087
            int r6 = r5.lastIndexOf(r7)
            int r8 = r7.l()
            r10 = 1073741824(0x40000000, float:2.0)
            r10 = r10 & r8
            if (r10 == 0) goto L_0x00ce
            boolean r10 = r7 instanceof defpackage.pu5
            if (r10 == 0) goto L_0x00ce
            pu5 r7 = (defpackage.pu5) r7
            pu5 r8 = new pu5
            long r11 = r7.a
            java.lang.String r13 = r7.b
            java.lang.CharSequence r14 = r7.c
            long r9 = r7.o
            java.lang.CharSequence r15 = r7.X
            boolean r7 = r7.Y
            r19 = -2147483644(0xffffffff80000004, float:-5.6E-45)
            r16 = r9
            r10 = r8
            r9 = r15
            r15 = r16
            r17 = r9
            r18 = r7
            r10.<init>(r11, r13, r14, r15, r17, r18, r19)
            r5.set(r6, r8)
            goto L_0x00e2
        L_0x00ce:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00e2
            boolean r8 = r7 instanceof defpackage.ou5
            if (r8 == 0) goto L_0x00e2
            ou5 r7 = (defpackage.ou5) r7
            ou5 r7 = new ou5
            r8 = 2
            r7.<init>(r8)
            r5.set(r6, r7)
        L_0x00e2:
            boolean r4 = r3.c(r4, r5)
            if (r4 == 0) goto L_0x004c
            at5 r3 = r0.A0
            r4 = 0
            if (r3 == 0) goto L_0x0100
            java.util.Set r3 = r3.v0
            if (r3 == 0) goto L_0x0100
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            boolean r1 = r3.contains(r1)
            r2 = 1
            if (r1 != r2) goto L_0x00fe
            r1 = r2
            goto L_0x0102
        L_0x00fe:
            r1 = r4
            goto L_0x0102
        L_0x0100:
            r2 = 1
            goto L_0x00fe
        L_0x0102:
            q0e r3 = r0.t0
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof defpackage.yt5
            if (r3 == 0) goto L_0x012d
            q0e r0 = r0.t0
        L_0x010e:
            java.lang.Object r3 = r0.getValue()
            r5 = r3
            zt5 r5 = (defpackage.zt5) r5
            yt5 r5 = (defpackage.yt5) r5
            if (r1 != 0) goto L_0x0120
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r6 = r4
            goto L_0x0121
        L_0x0120:
            r6 = r2
        L_0x0121:
            r7 = 3
            r8 = 0
            yt5 r5 = defpackage.yt5.b(r5, r8, r6, r7)
            boolean r3 = r0.c(r3, r5)
            if (r3 == 0) goto L_0x010e
        L_0x012d:
            return
        L_0x012e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu5.s(long):void");
    }

    public final void u() {
        pnf.n(this, ((w9a) this.o).b(), (vx3) null, new ju5((zt5) this.u0.a.getValue(), this, (Continuation) null), 2);
    }
}

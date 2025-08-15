package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: jq8  reason: default package */
public final class jq8 extends pnf {
    public static final /* synthetic */ bc7[] K0;
    public final rn8 A0;
    public final w4d B0 = mqd.D();
    public final w4d C0 = mqd.D();
    public final w4d D0 = mqd.D();
    public final LongSparseArray E0 = new LongSparseArray();
    public final q0e F0;
    public final w7c G0;
    public final s35 H0;
    public final khe I0;
    public final String J0;
    public final y7d X;
    public final q33 Y;
    public final kke Z;
    public final long b;
    public final long c;
    public final long o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<jq8> cls = jq8.class;
        K0 = new bc7[]{new oi9(cls, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;")};
    }

    public jq8(long j, long j2, long j3) {
        o19 o19 = o19.a;
        kke dispatchers = o19.getDispatchers();
        khe d = o19.getAccessor().d(iy2.class);
        khe d2 = o19.getAccessor().d(r79.class);
        khe d3 = o19.getAccessor().d(blb.class);
        khe d4 = o19.getAccessor().d(w7b.class);
        khe d5 = o19.getAccessor().d(mc6.class);
        khe d6 = o19.getAccessor().d(cc6.class);
        khe d7 = o19.getAccessor().d(u7b.class);
        khe d8 = o19.getAccessor().d(xb9.class);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = (y7d) o19.getAccessor().c(y7d.class);
        this.Y = (q33) o19.getAccessor().c(q33.class);
        this.Z = dispatchers;
        this.s0 = d;
        this.t0 = d2;
        this.u0 = d3;
        this.v0 = d4;
        this.w0 = d5;
        this.x0 = d6;
        this.y0 = d7;
        this.z0 = d8;
        v4 v4Var = ((o29) o19.getAccessor().c(o29.class)).a;
        this.A0 = new rn8(j2, j, (av0) v4Var.c(av0.class), (kke) v4Var.c(kke.class));
        q0e a = r0e.a(nz4.a);
        this.F0 = a;
        this.G0 = new w7c(a);
        this.H0 = new s35(0);
        this.I0 = new khe(new zj7(5, this));
        this.J0 = jq8.class.getName();
    }

    public static final void q(jq8 jq8) {
        Iterator it;
        LongSparseArray longSparseArray;
        jn8 jn8;
        jq8 jq82 = jq8;
        LongSparseArray longSparseArray2 = jq82.E0;
        if (longSparseArray2.size() != 0) {
            q0e q0e = jq82.F0;
            List list = (List) q0e.getValue();
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it2 = list.iterator();
            while (true) {
                jn8 jn82 = null;
                if (it2.hasNext()) {
                    Object obj = (ol7) it2.next();
                    if (obj instanceof jn8) {
                        jn82 = obj;
                    }
                    if (jn82 != null) {
                        long j = jn82.a;
                        if (longSparseArray2.indexOfKey(j) >= 0) {
                            jn8 jn83 = (jn8) obj;
                            long j2 = jn83.a;
                            boolean z = jn83.t0;
                            boolean z2 = jn83.u0;
                            CharSequence charSequence = jn83.b;
                            jqe jqe = jn83.c;
                            String str = jn83.o;
                            boolean z3 = jn83.X;
                            longSparseArray = longSparseArray2;
                            it = it2;
                            boolean z4 = z2;
                            long j3 = jn83.Y;
                            boolean z5 = z;
                            jn8 = new jn8(j2, charSequence, jqe, str, z3, j3, jn83.Z, (v5c) longSparseArray2.get(j), z5, z4);
                            arrayList.add(jn8);
                            it2 = it;
                            longSparseArray2 = longSparseArray;
                        }
                    }
                    longSparseArray = longSparseArray2;
                    it = it2;
                    jn8 = obj;
                    arrayList.add(jn8);
                    it2 = it;
                    longSparseArray2 = longSparseArray;
                } else {
                    q0e.m((Object) null, arrayList);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.jq8 r9, defpackage.e52 r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof defpackage.bq8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            bq8 r0 = (defpackage.bq8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            bq8 r0 = new bq8
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r6) goto L_0x0044
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r9 = r0.o
            ti9 r9 = (defpackage.ti9) r9
            defpackage.od2.a0(r11)
            goto L_0x00a7
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.o
            ti9 r9 = (defpackage.ti9) r9
            defpackage.od2.a0(r11)
            goto L_0x0095
        L_0x0044:
            e52 r10 = r0.X
            java.lang.Object r9 = r0.o
            jq8 r9 = (defpackage.jq8) r9
            defpackage.od2.a0(r11)
            goto L_0x0068
        L_0x004e:
            defpackage.od2.a0(r11)
            je7 r11 = r9.t0
            java.lang.Object r11 = r11.getValue()
            r79 r11 = (defpackage.r79) r11
            r0.o = r9
            r0.X = r10
            r0.s0 = r6
            long r6 = r9.c
            java.lang.Object r11 = r11.a(r6, r0)
            if (r11 != r1) goto L_0x0068
            goto L_0x00b2
        L_0x0068:
            cu8 r11 = (defpackage.cu8) r11
            boolean r2 = r9.w()
            q0e r6 = r9.F0
            r7 = 0
            if (r2 == 0) goto L_0x00ac
            if (r11 != 0) goto L_0x0076
            goto L_0x00ac
        L_0x0076:
            k92 r2 = r10.b
            int r2 = r2.c()
            k92 r8 = r10.b
            java.util.Map r8 = r8.e
            int r8 = r8.size()
            if (r2 > r8) goto L_0x0099
            r0.o = r6
            r0.X = r7
            r0.s0 = r5
            r2 = 0
            java.io.Serializable r11 = r9.u(r10, r11, r2, r0)
            if (r11 != r1) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            r9 = r6
        L_0x0095:
            r9.setValue(r11)
            goto L_0x00aa
        L_0x0099:
            r0.o = r6
            r0.X = r7
            r0.s0 = r4
            java.io.Serializable r11 = r9.v(r10, r11, r0)
            if (r11 != r1) goto L_0x00a6
            goto L_0x00b2
        L_0x00a6:
            r9 = r6
        L_0x00a7:
            r9.setValue(r11)
        L_0x00aa:
            r1 = r3
            goto L_0x00b2
        L_0x00ac:
            nz4 r9 = defpackage.nz4.a
            r6.m(r7, r9)
            goto L_0x00aa
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.r(jq8, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085 A[LOOP:0: B:20:0x007f->B:22:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.jq8 r5, defpackage.e52 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dq8
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dq8 r0 = (defpackage.dq8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            dq8 r0 = new dq8
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            jq8 r5 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x0054
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.od2.a0(r7)
            java.lang.String r7 = r5.J0
            java.lang.String r2 = "load reactions"
            defpackage.hm9.m(r7, r2, new java.lang.Object[0])
            kke r7 = r5.Z
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            eq8 r2 = new eq8
            r2.<init>(r5, r6, r3)
            r0.o = r5
            r0.Z = r4
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L_0x0054
            goto L_0x0097
        L_0x0054:
            kx8 r7 = (defpackage.kx8) r7
            java.lang.String r6 = r5.J0
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x005d
            goto L_0x0074
        L_0x005d:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0074
            us7 r1 = defpackage.us7.X
            java.util.List r2 = r7.a
            int r2 = r2.size()
            java.lang.String r4 = "reactions count: "
            java.lang.String r2 = defpackage.zr6.h(r2, r4)
            r0.d(r1, r6, r2, r3)
        L_0x0074:
            android.util.LongSparseArray r6 = r5.E0
            r6.clear()
            java.util.List r6 = r7.a
            java.util.Iterator r6 = r6.iterator()
        L_0x007f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0095
            java.lang.Object r7 = r6.next()
            ex8 r7 = (defpackage.ex8) r7
            android.util.LongSparseArray r0 = r5.E0
            long r1 = r7.a
            v5c r7 = r7.b
            r0.put(r1, r7)
            goto L_0x007f
        L_0x0095:
            e5f r1 = defpackage.e5f.a
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.s(jq8, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        this.E0.clear();
        rn8 rn8 = this.A0;
        rn8.c.f(rn8);
    }

    public final e52 t() {
        return (e52) ((jz2) ((iy2) this.s0.getValue())).m(this.b).a.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, mec] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0119 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable u(defpackage.e52 r17, defpackage.cu8 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r3 = 2
            boolean r4 = r1 instanceof defpackage.yp8
            if (r4 == 0) goto L_0x0018
            r4 = r1
            yp8 r4 = (defpackage.yp8) r4
            int r5 = r4.u0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0018
            int r5 = r5 - r6
            r4.u0 = r5
            goto L_0x001d
        L_0x0018:
            yp8 r4 = new yp8
            r4.<init>(r0, r1)
        L_0x001d:
            java.lang.Object r1 = r4.s0
            tx3 r5 = defpackage.tx3.a
            int r6 = r4.u0
            r7 = 3
            r8 = 1
            if (r6 == 0) goto L_0x006e
            if (r6 == r8) goto L_0x005b
            if (r6 == r3) goto L_0x0046
            if (r6 != r7) goto L_0x003e
            java.io.Serializable r0 = r4.Y
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r4.X
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r4.o
            java.util.List r3 = (java.util.List) r3
            defpackage.od2.a0(r1)
            goto L_0x0248
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.io.Serializable r0 = r4.Y
            mec r0 = (defpackage.mec) r0
            java.lang.Object r6 = r4.X
            cu8 r6 = (defpackage.cu8) r6
            java.lang.Object r9 = r4.o
            e52 r9 = (defpackage.e52) r9
            defpackage.od2.a0(r1)
            r1 = r6
            r6 = r0
            r0 = r9
        L_0x0058:
            r9 = r4
            goto L_0x0197
        L_0x005b:
            int r0 = r4.Z
            java.io.Serializable r6 = r4.Y
            mec r6 = (defpackage.mec) r6
            java.lang.Object r9 = r4.X
            cu8 r9 = (defpackage.cu8) r9
            java.lang.Object r10 = r4.o
            e52 r10 = (defpackage.e52) r10
            defpackage.od2.a0(r1)
            goto L_0x0120
        L_0x006e:
            defpackage.od2.a0(r1)
            mec r1 = new mec
            r1.<init>()
            r1.a = r0
            r0 = r17
            r6 = r1
            r9 = r4
            r1 = r18
            r4 = r19
        L_0x0080:
            java.lang.Object r10 = r6.a
            jq8 r10 = (defpackage.jq8) r10
            je7 r10 = r10.s0
            java.lang.Object r10 = r10.getValue()
            iy2 r10 = (defpackage.iy2) r10
            r9.o = r0
            r9.X = r1
            r9.Y = r6
            r9.Z = r4
            r9.u0 = r8
            jz2 r10 = (defpackage.jz2) r10
            p82 r10 = r10.l()
            r10.getClass()
            iu8 r11 = r1.u0
            iu8 r12 = defpackage.iu8.SENDING
            if (r11 == r12) goto L_0x00ad
            iu8 r12 = defpackage.iu8.ERROR
            if (r11 == r12) goto L_0x00ad
            iu8 r12 = defpackage.iu8.UNKNOWN
            if (r11 != r12) goto L_0x00b0
        L_0x00ad:
            r16 = r9
            goto L_0x0112
        L_0x00b0:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            k92 r12 = r0.b
            java.util.Map r12 = r12.e
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00c1:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x010f
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.Long r14 = (java.lang.Long) r14
            long r14 = r14.longValue()
            r16 = r9
            long r8 = r1.Y
            int r8 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x010b
            java.lang.Object r8 = r13.getValue()
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            long r14 = r1.o
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x010b
            rm4 r8 = r10.r
            java.lang.Object r8 = r8.get()
            el3 r8 = (defpackage.el3) r8
            java.lang.Object r9 = r13.getKey()
            java.lang.Long r9 = (java.lang.Long) r9
            long r13 = r9.longValue()
            r9 = 0
            uj3 r8 = r8.i(r13, r9)
            if (r8 == 0) goto L_0x010b
            r11.add(r8)
        L_0x010b:
            r9 = r16
            r8 = 1
            goto L_0x00c1
        L_0x010f:
            r16 = r9
            goto L_0x0117
        L_0x0112:
            java.util.List r8 = java.util.Collections.emptyList()
            r11 = r8
        L_0x0117:
            if (r11 != r5) goto L_0x011a
            return r5
        L_0x011a:
            r10 = r0
            r9 = r1
            r0 = r4
            r1 = r11
            r4 = r16
        L_0x0120:
            java.util.List r1 = (java.util.List) r1
            r8 = 0
            if (r0 != 0) goto L_0x01a1
            gi9 r0 = new gi9
            r0.<init>((java.lang.Object) r8)
            java.util.Iterator r11 = r1.iterator()
        L_0x012e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0148
            java.lang.Object r12 = r11.next()
            uj3 r12 = (defpackage.uj3) r12
            boolean r13 = r12.w()
            if (r13 == 0) goto L_0x012e
            long r12 = r12.n()
            r0.a(r12)
            goto L_0x012e
        L_0x0148:
            java.util.ArrayList r11 = r10.j()
            java.util.Iterator r11 = r11.iterator()
        L_0x0150:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x016a
            java.lang.Object r12 = r11.next()
            uj3 r12 = (defpackage.uj3) r12
            boolean r13 = r12.w()
            if (r13 == 0) goto L_0x0150
            long r12 = r12.n()
            r0.a(r12)
            goto L_0x0150
        L_0x016a:
            boolean r11 = r0.j()
            if (r11 == 0) goto L_0x01a1
            java.lang.Object r1 = r6.a
            jq8 r1 = (defpackage.jq8) r1
            je7 r1 = r1.z0
            java.lang.Object r1 = r1.getValue()
            xb9 r1 = (defpackage.xb9) r1
            r4.o = r10
            r4.X = r9
            r4.Y = r6
            r4.u0 = r3
            int r8 = defpackage.ft4.o
            kt4 r8 = defpackage.kt4.SECONDS
            long r11 = defpackage.z7.R(r3, r8)
            java.lang.Object r0 = r1.t(r0, r11, r4)
            if (r0 != r5) goto L_0x0193
            return r5
        L_0x0193:
            r1 = r9
            r0 = r10
            goto L_0x0058
        L_0x0197:
            java.lang.Object r4 = r6.a
            jq8 r4 = (defpackage.jq8) r4
            r6.a = r4
            r4 = 1
            r8 = 1
            goto L_0x0080
        L_0x01a1:
            kl7 r0 = defpackage.j1e.l()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r1.iterator()
        L_0x01ae:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01fc
            java.lang.Object r13 = r12.next()
            uj3 r13 = (defpackage.uj3) r13
            boolean r14 = r13.w()
            if (r14 == 0) goto L_0x01c4
            r2 = r8
            r17 = r12
            goto L_0x01f1
        L_0x01c4:
            java.lang.Object r14 = r6.a
            jq8 r14 = (defpackage.jq8) r14
            dk2 r15 = new dk2
            wm3 r8 = defpackage.iz7.t(r13)
            java.lang.Object r7 = r6.a
            jq8 r7 = (defpackage.jq8) r7
            je7 r7 = r7.y0
            java.lang.Object r7 = r7.getValue()
            u7b r7 = (defpackage.u7b) r7
            long r2 = r13.n()
            r7b r2 = r7.b(r2)
            s7b r2 = defpackage.iz7.m(r2)
            r17 = r12
            r12 = 0
            r15.<init>(r8, r2, r12)
            jn8 r2 = r14.y(r15)
        L_0x01f1:
            if (r2 == 0) goto L_0x01f6
            r11.add(r2)
        L_0x01f6:
            r12 = r17
            r3 = 2
            r7 = 3
            r8 = 0
            goto L_0x01ae
        L_0x01fc:
            r0.addAll(r11)
            java.util.ArrayList r2 = r10.j()
            at r3 = new at
            r7 = 2
            r3.<init>(r7, r2)
            lr1 r2 = new lr1
            r7 = 6
            r2.<init>(r1, r6, r9, r7)
            qk5 r1 = defpackage.l6d.Z(r3, r2)
            wz7 r2 = new wz7
            r2.<init>(r7, r6)
            r1f r3 = new r1f
            r3.<init>(r1, r2)
            defpackage.d63.W(r0, r3)
            long r1 = r9.Y
            java.lang.Object r3 = r6.a
            jq8 r3 = (defpackage.jq8) r3
            q33 r3 = r3.Y
            hyc r3 = (defpackage.hyc) r3
            long r7 = r3.t()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x024d
            java.lang.Object r1 = r6.a
            jq8 r1 = (defpackage.jq8) r1
            r4.o = r0
            r4.X = r0
            r4.Y = r0
            r2 = 3
            r4.u0 = r2
            java.lang.Object r1 = r1.x(r4)
            if (r1 != r5) goto L_0x0246
            return r5
        L_0x0246:
            r2 = r0
            r3 = r2
        L_0x0248:
            r0.add(r1)
            r0 = r2
            goto L_0x024e
        L_0x024d:
            r3 = r0
        L_0x024e:
            fs4 r1 = defpackage.fs4.Y
            defpackage.c63.U(r0, r1)
            kl7 r0 = defpackage.j1e.d(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.u(e52, cu8, boolean, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: cu8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: kl7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable v(defpackage.e52 r8, defpackage.cu8 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.zp8
            if (r0 == 0) goto L_0x0013
            r0 = r10
            zp8 r0 = (defpackage.zp8) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.u0 = r1
            goto L_0x0018
        L_0x0013:
            zp8 r0 = new zp8
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            kl7 r7 = r0.Z
            kl7 r8 = r0.Y
            java.lang.Object r9 = r0.X
            java.util.List r9 = (java.util.List) r9
            jq8 r0 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x00c5
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            java.lang.Object r7 = r0.X
            r9 = r7
            cu8 r9 = (defpackage.cu8) r9
            jq8 r7 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x006d
        L_0x0049:
            defpackage.od2.a0(r10)
            java.lang.String r10 = r7.J0
            java.lang.String r2 = "load members from server"
            defpackage.hm9.m(r10, r2, new java.lang.Object[0])
            kke r10 = r7.Z
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            aq8 r2 = new aq8
            r2.<init>(r7, r8, r3)
            r0.o = r7
            r0.X = r9
            r0.u0 = r5
            java.lang.Object r10 = defpackage.j47.t0(r10, r2, r0)
            if (r10 != r1) goto L_0x006d
            return r1
        L_0x006d:
            fk2 r10 = (defpackage.fk2) r10
            nz4 r8 = defpackage.nz4.a
            if (r10 == 0) goto L_0x00f0
            java.util.ArrayList r10 = r10.c
            if (r10 != 0) goto L_0x0079
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0080
            return r8
        L_0x0080:
            kl7 r8 = defpackage.j1e.l()
            at r2 = new at
            r5 = 2
            r2.<init>(r5, r10)
            ga r10 = new ga
            r5 = 19
            r10.<init>(r7, r5, r9)
            qk5 r10 = defpackage.l6d.Z(r2, r10)
            wz7 r2 = new wz7
            r5 = 7
            r2.<init>(r5, r7)
            r1f r5 = new r1f
            r5.<init>(r10, r2)
            defpackage.d63.W(r8, r5)
            long r9 = r9.Y
            q33 r2 = r7.Y
            hyc r2 = (defpackage.hyc) r2
            long r5 = r2.t()
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00ca
            r0.o = r7
            r0.X = r8
            r0.Y = r8
            r0.Z = r8
            r0.u0 = r4
            java.lang.Object r10 = r7.x(r0)
            if (r10 != r1) goto L_0x00c2
            return r1
        L_0x00c2:
            r0 = r7
            r7 = r8
            r9 = r7
        L_0x00c5:
            r7.add(r10)
            r7 = r0
            goto L_0x00cb
        L_0x00ca:
            r9 = r8
        L_0x00cb:
            fs4 r10 = defpackage.fs4.Y
            defpackage.c63.U(r8, r10)
            kl7 r8 = defpackage.j1e.d(r9)
            java.lang.String r7 = r7.J0
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x00db
            goto L_0x00f0
        L_0x00db:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00f0
            us7 r10 = defpackage.us7.X
            int r0 = r8.getSize()
            java.lang.String r1 = "members count from server: "
            java.lang.String r0 = defpackage.zr6.h(r0, r1)
            r9.d(r10, r7, r0, r3)
        L_0x00f0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.v(e52, cu8, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final boolean w() {
        e52 t = t();
        if (t == null || t.M() || t.I() || this.o == 0) {
            return false;
        }
        k92 k92 = t.b;
        return k92.c() <= ((Number) this.I0.getValue()).intValue() && k92.c() > 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fq8
            if (r0 == 0) goto L_0x0013
            r0 = r7
            fq8 r0 = (defpackage.fq8) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            fq8 r0 = new fq8
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            jq8 r6 = r0.X
            jq8 r0 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x0054
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            defpackage.od2.a0(r7)
            je7 r7 = r6.u0
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            q33 r2 = r6.Y
            hyc r2 = (defpackage.hyc) r2
            long r4 = r2.t()
            r0.o = r6
            r0.X = r6
            r0.s0 = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r6
        L_0x0054:
            oab r7 = (defpackage.oab) r7
            uj3 r7 = r7.d
            wm3 r7 = defpackage.iz7.t(r7)
            je7 r1 = r0.y0
            java.lang.Object r1 = r1.getValue()
            u7b r1 = (defpackage.u7b) r1
            q33 r0 = r0.Y
            hyc r0 = (defpackage.hyc) r0
            long r2 = r0.t()
            r7b r0 = r1.b(r2)
            s7b r0 = defpackage.iz7.m(r0)
            dk2 r1 = new dk2
            r2 = 0
            r1.<init>(r7, r0, r2)
            jn8 r6 = r6.y(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jq8.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jn8 y(dk2 dk2) {
        jqe iqe;
        dk2 dk22 = dk2;
        int i = ((u7b) this.y0.getValue()).b(dk22.a.a).a;
        boolean z = i == 10 || i == 20 || i == 40;
        kk0 kk0 = kk0.c;
        wm3 wm3 = dk22.a;
        String d = wm3.d(kk0);
        vm3 vm3 = vm3.BOT;
        List list = wm3.u0;
        boolean contains = list.contains(vm3);
        long j = wm3.a;
        if (contains && list.contains(vm3.SERVICE_ACCOUNT)) {
            iqe = new eqe(oda.w0);
        } else if (list.contains(vm3)) {
            iqe = new eqe(oda.u);
        } else {
            w7b w7b = (w7b) this.v0.getValue();
            w7b.getClass();
            uj3 h = ((el3) ((zxc) w7b.X.getValue()).a.c(el3.class)).h(j, false);
            boolean z2 = h != null && h.c();
            s7b s7b = dk22.b;
            iqe = new iqe(w7b.a(j, z2, s7b != null ? iz7.l(s7b) : null));
        }
        jqe jqe = iqe;
        String a = wm3.a();
        String str = "";
        String str2 = a == null ? str : a;
        if (d == null) {
            d = str;
        }
        v5c v5c = (v5c) this.E0.get(j);
        boolean z3 = j == ((hyc) this.Y).t();
        Pattern pattern = fca.a;
        String b2 = wm3.b();
        if (b2 != null) {
            str = b2;
        }
        return new jn8(wm3.a, str2, jqe, d, z, dk22.c, fca.b(str, wm3.c()), v5c, true, z3);
    }
}

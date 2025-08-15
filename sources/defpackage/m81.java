package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: m81  reason: default package */
public final class m81 extends pnf {
    public final ks1 X;
    public final je7 Y;
    public final je7 Z;
    public final v81 b;
    public final rg1 c;
    public final k70 o;
    public final ph4 s0;
    public final je7 t0;
    public final q0e u0;
    public final q0e v0;
    public final q0e w0;
    public final q0e x0;
    public Long y0;

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, ph4] */
    public m81(Context context, v81 v81, rg1 rg1) {
        jyc jyc = jyc.a;
        k70 k70 = new k70(((hyc) ((q33) jyc.getAccessor().c(q33.class))).t());
        ks1 ks1 = (ks1) jyc.getAccessor().c(ks1.class);
        je7 je7 = iyc.i;
        je7 je72 = iyc.j;
        moa moa = new moa(context);
        je7 je73 = iyc.t;
        ? obj = new Object();
        obj.a = moa;
        obj.b = je73;
        khe d = s71.a.getAccessor().d(bt1.class);
        this.b = v81;
        this.c = rg1;
        this.o = k70;
        this.X = ks1;
        this.Y = je7;
        this.Z = je72;
        this.s0 = obj;
        this.t0 = d;
        q0e a = r0e.a(epa.a);
        this.u0 = a;
        this.v0 = a;
        q0e a2 = r0e.a(Boolean.FALSE);
        this.w0 = a2;
        this.x0 = a2;
        s();
        ks1.getClass();
        ks1.g(new is1(ks1, 5));
    }

    public final al6 q(long j) {
        il6 il6;
        fpa fpa = (fpa) this.u0.getValue();
        if (!(fpa instanceof dpa) || (il6 = (il6) ((dpa) fpa).a.get(Long.valueOf(j))) == null) {
            return null;
        }
        return il6.v0;
    }

    public final boolean r() {
        k70 k70 = this.o;
        huc huc = v81.b;
        v81 v81 = this.b;
        huc.getClass();
        if (!((ArrayList) (v81 == v81.MISSING ? k70.X : k70.o)).isEmpty()) {
            ks1 ks1 = this.X;
            if (ks1.c == null || ks1.c.o || !ks1.b) {
                return true;
            }
        }
        return false;
    }

    public final void s() {
        hm9.m("CallHistoryPageViewModel", "register load history callbacks for type=" + this.b, new Object[0]);
        ks1 ks1 = this.X;
        ks1.getClass();
        ks1.z0.b(new is1(ks1, 3));
        ks1.Y.add(this);
        t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: zk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: wk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: xk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: wk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: xk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: yk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: xk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: wk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: xk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: wk6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r40 = this;
            r0 = r40
            r1 = 1
            q0e r2 = r0.u0
        L_0x0005:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            fpa r4 = (defpackage.fpa) r4
            k70 r5 = r0.o
            je7 r6 = r0.Z
            java.lang.Object r6 = r6.getValue()
            p82 r6 = (defpackage.p82) r6
            ks1 r7 = r0.X
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.o
            java.lang.Object r8 = r5.o
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.clear()
            int r9 = r8.size()
            java.util.Iterator r7 = r7.iterator()
        L_0x0029:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x005d
            java.lang.Object r10 = r7.next()
            es8 r10 = (defpackage.es8) r10
            cu8 r11 = r10.a
            long r11 = r11.t0
            e52 r11 = r6.C(r11)
            if (r11 == 0) goto L_0x0029
            boolean r12 = r11.M()
            if (r12 == 0) goto L_0x0054
            uj3 r11 = r11.l()
            if (r11 == 0) goto L_0x0029
            es1 r12 = new es1
            r12.<init>((defpackage.es8) r10, (defpackage.uj3) r11)
            r8.add(r12)
            goto L_0x0029
        L_0x0054:
            es1 r12 = new es1
            r12.<init>((defpackage.e52) r11, (defpackage.es8) r10)
            r8.add(r12)
            goto L_0x0029
        L_0x005d:
            int r6 = r8.size()
            int r6 = r6 - r1
            r5.a(r8, r9, r6)
            huc r5 = defpackage.v81.b
            v81 r6 = r0.b
            r5.getClass()
            v81 r5 = defpackage.v81.MISSING
            r7 = 0
            if (r6 != r5) goto L_0x0073
            r5 = r1
            goto L_0x0074
        L_0x0073:
            r5 = r7
        L_0x0074:
            if (r5 == 0) goto L_0x00ff
            k70 r6 = r0.o
            je7 r8 = r0.Y
            java.lang.Object r8 = r8.getValue()
            el3 r8 = (defpackage.el3) r8
            ks1 r9 = r0.X
            java.util.concurrent.CopyOnWriteArrayList r9 = r9.o
            ph4 r10 = r0.s0
            r10.getClass()
            java.lang.Object r10 = r6.X
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
            if (r9 == 0) goto L_0x0098
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x009c
        L_0x0098:
            r15 = r2
            r16 = r3
            goto L_0x00ef
        L_0x009c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00a5:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00eb
            java.lang.Object r12 = r9.next()
            r13 = r12
            es8 r13 = (defpackage.es8) r13     // Catch:{ all -> 0x00dc }
            boolean r13 = defpackage.m6d.t(r13)     // Catch:{ all -> 0x00dc }
            if (r13 == 0) goto L_0x00de
            es8 r12 = (defpackage.es8) r12     // Catch:{ all -> 0x00dc }
            cu8 r13 = r12.a     // Catch:{ all -> 0x00dc }
            l10 r13 = r13.d()     // Catch:{ all -> 0x00dc }
            java.util.List r13 = r13.f     // Catch:{ all -> 0x00dc }
            es1 r14 = new es1     // Catch:{ all -> 0x00dc }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x00dc }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x00dc }
            r15 = r2
            r16 = r3
            long r2 = r13.longValue()     // Catch:{ all -> 0x00dc }
            uj3 r2 = r8.i(r2, r1)     // Catch:{ all -> 0x00dc }
            r14.<init>((defpackage.es8) r12, (defpackage.uj3) r2)     // Catch:{ all -> 0x00dc }
            r11.add(r14)     // Catch:{ all -> 0x00dc }
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e5
        L_0x00de:
            r15 = r2
            r16 = r3
        L_0x00e1:
            r2 = r15
            r3 = r16
            goto L_0x00a5
        L_0x00e5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00eb:
            r15 = r2
            r16 = r3
            goto L_0x00f3
        L_0x00ef:
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x00f3:
            r10.addAll(r11)
            int r2 = r10.size()
            int r2 = r2 - r1
            r6.a(r10, r7, r2)
            goto L_0x0102
        L_0x00ff:
            r15 = r2
            r16 = r3
        L_0x0102:
            k70 r2 = r0.o
            if (r5 == 0) goto L_0x010b
            java.lang.Object r2 = r2.X
        L_0x0108:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            goto L_0x010e
        L_0x010b:
            java.lang.Object r2 = r2.o
            goto L_0x0108
        L_0x010e:
            r3 = 10
            int r3 = defpackage.z53.S(r2, r3)
            int r3 = defpackage.mz7.Z(r3)
            r5 = 16
            if (r3 >= r5) goto L_0x011d
            r3 = r5
        L_0x011d:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0126:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0548
            java.lang.Object r3 = r2.next()
            es1 r3 = (defpackage.es1) r3
            dc1 r6 = r3.d
            if (r6 == 0) goto L_0x013e
            java.lang.String r6 = r6.b
            int r6 = r6.hashCode()
            long r8 = (long) r6
            goto L_0x0144
        L_0x013e:
            es8 r6 = r3.c
            cu8 r6 = r6.a
            long r8 = r6.b
        L_0x0144:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            ph4 r8 = r0.s0
            r8.getClass()
            es8 r9 = r3.c
            e52 r10 = r3.a
            java.lang.Object r11 = r8.a
            moa r11 = (defpackage.moa) r11
            r11.getClass()
            java.util.List r12 = r3.e
            if (r12 != 0) goto L_0x015e
            r12 = r7
            goto L_0x0162
        L_0x015e:
            int r12 = r12.size()
        L_0x0162:
            uj3 r13 = r3.b
            java.lang.String r14 = ""
            if (r13 == 0) goto L_0x0187
            if (r12 <= 0) goto L_0x0187
            int r12 = r12 + r1
            java.lang.Object r11 = r11.a
            android.content.Context r11 = (android.content.Context) r11
            int r7 = defpackage.c0c.call_history_item_call_call_title_with_count_calls
            java.lang.String r13 = r13.d()
            if (r13 != 0) goto L_0x0178
            r13 = r14
        L_0x0178:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r13, r12}
            java.lang.String r7 = r11.getString(r7, r12)
        L_0x0184:
            r25 = r7
            goto L_0x01ab
        L_0x0187:
            if (r13 == 0) goto L_0x0192
            java.lang.String r7 = r13.d()
            if (r7 != 0) goto L_0x0184
            r25 = r14
            goto L_0x01ab
        L_0x0192:
            e52 r7 = r3.a
            if (r7 == 0) goto L_0x01a0
            r7.k0()
            java.lang.CharSequence r7 = r7.u0
            java.lang.String r7 = r7.toString()
            goto L_0x0184
        L_0x01a0:
            java.lang.Object r7 = r11.a
            android.content.Context r7 = (android.content.Context) r7
            int r11 = defpackage.c0c.call_history_item_call_unknown_call_title
            java.lang.String r7 = r7.getString(r11)
            goto L_0x0184
        L_0x01ab:
            es8 r7 = r3.c
            uj3 r11 = r3.b
            if (r11 == 0) goto L_0x01cd
            yk6 r13 = new yk6
            long r18 = r11.n()
            cu8 r7 = r7.a
            r31 = r2
            long r1 = r7.t0
            java.util.ArrayList r22 = r3.a()
            r17 = r13
            r20 = r1
            r17.<init>(r18, r20, r22)
            r2 = r13
        L_0x01c9:
            r24 = r14
            goto L_0x0286
        L_0x01cd:
            r31 = r2
            e52 r1 = r3.a
            if (r1 == 0) goto L_0x0229
            boolean r2 = r1.R()
            if (r2 == 0) goto L_0x0229
            cu8 r2 = r7.a
            if (r2 == 0) goto L_0x01e2
            l10 r2 = r2.d()
            goto L_0x01e3
        L_0x01e2:
            r2 = 0
        L_0x01e3:
            if (r2 == 0) goto L_0x0229
            cu8 r2 = r7.a
            if (r2 == 0) goto L_0x01f2
            l10 r2 = r2.d()
            if (r2 == 0) goto L_0x01f2
            java.lang.String r2 = r2.b
            goto L_0x01f3
        L_0x01f2:
            r2 = 0
        L_0x01f3:
            if (r2 != 0) goto L_0x01f8
            r18 = r14
            goto L_0x01fa
        L_0x01f8:
            r18 = r2
        L_0x01fa:
            cu8 r2 = r7.a
            if (r2 == 0) goto L_0x0209
            l10 r2 = r2.d()
            if (r2 == 0) goto L_0x0209
            java.lang.String r2 = r2.a
            r22 = r2
            goto L_0x020b
        L_0x0209:
            r22 = 0
        L_0x020b:
            xk6 r2 = new xk6
            k92 r1 = r1.b
            long r11 = r1.a
            if (r22 == 0) goto L_0x021d
            r17 = r2
            r19 = r11
            r21 = r25
            r17.<init>(r18, r19, r21, r22)
            goto L_0x01c9
        L_0x021d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0229:
            if (r1 == 0) goto L_0x0264
            boolean r2 = r1.R()
            if (r2 != 0) goto L_0x0264
            wk6 r2 = new wk6
            k92 r11 = r1.b
            long r11 = r11.a
            r24 = r14
            long r13 = r1.a
            boolean r37 = r1.P()
            java.util.ArrayList r38 = r3.a()
            if (r7 == 0) goto L_0x0252
            cu8 r1 = r7.a
            if (r1 == 0) goto L_0x0252
            l10 r1 = r1.d()
            if (r1 == 0) goto L_0x0252
            java.lang.String r1 = r1.b
            goto L_0x0253
        L_0x0252:
            r1 = 0
        L_0x0253:
            if (r1 != 0) goto L_0x0258
            r39 = r24
            goto L_0x025a
        L_0x0258:
            r39 = r1
        L_0x025a:
            r32 = r2
            r33 = r11
            r35 = r13
            r32.<init>(r33, r35, r37, r38, r39)
            goto L_0x0286
        L_0x0264:
            r24 = r14
            dc1 r2 = r3.d
            if (r2 == 0) goto L_0x0283
            xk6 r7 = new xk6
            java.lang.String r11 = r2.b
            k92 r1 = r1.b
            long r12 = r1.a
            java.lang.String r1 = r2.a
            r17 = r7
            r18 = r11
            r19 = r12
            r21 = r25
            r22 = r1
            r17.<init>(r18, r19, r21, r22)
            r2 = r7
            goto L_0x0286
        L_0x0283:
            zk6 r1 = defpackage.zk6.a
            r2 = r1
        L_0x0286:
            dc1 r1 = r3.d
            if (r1 == 0) goto L_0x0294
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            long r11 = (long) r1
        L_0x0291:
            r18 = r11
            goto L_0x029b
        L_0x0294:
            es8 r1 = r3.c
            cu8 r1 = r1.a
            long r11 = r1.b
            goto L_0x0291
        L_0x029b:
            uj3 r1 = r3.b
            if (r1 == 0) goto L_0x02a6
            long r11 = r1.n()
        L_0x02a3:
            r20 = r11
            goto L_0x02b5
        L_0x02a6:
            e52 r1 = r3.a
            if (r1 == 0) goto L_0x02af
            k92 r1 = r1.b
            long r11 = r1.a
            goto L_0x02a3
        L_0x02af:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02a3
        L_0x02b5:
            kk0 r1 = defpackage.kk0.b
            uj3 r7 = r3.b
            if (r7 == 0) goto L_0x02c0
            java.lang.String r1 = r7.p(r1)
            goto L_0x02cc
        L_0x02c0:
            e52 r7 = r3.a
            if (r7 == 0) goto L_0x02cb
            jk0 r11 = defpackage.jk0.a
            java.lang.String r1 = r7.g(r1, r11)
            goto L_0x02cc
        L_0x02cb:
            r1 = 0
        L_0x02cc:
            if (r9 == 0) goto L_0x02dd
            boolean r7 = defpackage.m6d.t(r9)
            if (r7 == 0) goto L_0x02dd
            boolean r7 = r9.d()
            if (r7 == 0) goto L_0x02dd
            r27 = 1
            goto L_0x02df
        L_0x02dd:
            r27 = 0
        L_0x02df:
            if (r9 == 0) goto L_0x02f6
            cu8 r11 = r9.a
            l10 r11 = r11.d()
            if (r11 == 0) goto L_0x02f2
            boolean r11 = r11.d()
            r12 = 1
            if (r11 != r12) goto L_0x02f2
            r12 = 2
            goto L_0x02f3
        L_0x02f2:
            r12 = 1
        L_0x02f3:
            r29 = r12
            goto L_0x02f8
        L_0x02f6:
            r29 = 1
        L_0x02f8:
            java.lang.Object r12 = r8.a
            moa r12 = (defpackage.moa) r12
            java.lang.Object r13 = r12.a
            r14 = r13
            android.content.Context r14 = (android.content.Context) r14
            r11 = 17
            r32 = 0
            if (r9 == 0) goto L_0x0388
            if (r10 == 0) goto L_0x0388
            boolean r10 = r10.R()
            if (r10 == 0) goto L_0x0388
            cu8 r7 = r9.a
            l10 r7 = r7.d()
            r10 = r14
            if (r7 == 0) goto L_0x031d
            long r13 = r7.e
            r34 = r13
            goto L_0x031f
        L_0x031d:
            r34 = r32
        L_0x031f:
            java.lang.Object r7 = r12.s0
            je7 r7 = (defpackage.je7) r7
            java.lang.Object r7 = r7.getValue()
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            int r12 = r7.getIntrinsicWidth()
            int r13 = r7.getIntrinsicWidth()
            r14 = 0
            r7.setBounds(r14, r14, r12, r13)
            yl5 r12 = new yl5
            r13 = 0
            r14 = 6
            r12.<init>((android.graphics.drawable.Drawable) r7, (defpackage.sl5) r13, (int) r14)
            android.content.res.Resources r7 = r10.getResources()
            int r10 = defpackage.t7a.n
            java.lang.String r7 = r7.getString(r10)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            r14 = 160(0xa0, float:2.24E-43)
            android.text.SpannableStringBuilder r13 = r10.append(r14)
            android.text.SpannableStringBuilder r13 = r13.append(r14)
            r13.append(r7)
            r7 = 0
            r13 = 1
            r10.setSpan(r12, r7, r13, r11)
            int r7 = (r34 > r32 ? 1 : (r34 == r32 ? 0 : -1))
            if (r7 == 0) goto L_0x037a
            java.lang.String[] r7 = defpackage.are.b
            java.lang.String r7 = defpackage.tfg.c(r34)
            r11 = 32
            android.text.SpannableStringBuilder r11 = r10.append(r11)
            r12 = 183(0xb7, float:2.56E-43)
            android.text.SpannableStringBuilder r11 = r11.append(r12)
            android.text.SpannableStringBuilder r11 = r11.append(r14)
            r11.append(r7)
        L_0x037a:
            android.text.SpannedString r7 = new android.text.SpannedString
            r7.<init>(r10)
            r28 = r8
            r32 = r15
            r10 = 0
            r11 = 0
        L_0x0385:
            r13 = 1
            goto L_0x04d4
        L_0x0388:
            r10 = r14
            r14 = 6
            if (r9 == 0) goto L_0x04cb
            cu8 r13 = r9.a
            l10 r13 = r13.d()
            if (r13 == 0) goto L_0x039d
            boolean r13 = r13.d()
            r11 = 1
            if (r13 != r11) goto L_0x039d
            r13 = 2
            goto L_0x039e
        L_0x039d:
            r13 = 1
        L_0x039e:
            cu8 r11 = r9.a
            l10 r14 = r11.d()
            r28 = r8
            if (r14 == 0) goto L_0x03c1
            long r7 = r14.e
            java.lang.Long r14 = java.lang.Long.valueOf(r7)
            int r7 = (r7 > r32 ? 1 : (r7 == r32 ? 0 : -1))
            if (r7 == 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03b3:
            r14 = 0
        L_0x03b4:
            if (r14 == 0) goto L_0x03c1
            long r7 = r14.longValue()
            java.lang.String[] r14 = defpackage.are.b
            java.lang.String r7 = defpackage.tfg.c(r7)
            goto L_0x03c2
        L_0x03c1:
            r7 = 0
        L_0x03c2:
            boolean r8 = defpackage.m6d.t(r9)
            if (r8 == 0) goto L_0x03d0
            boolean r8 = r9.d()
            if (r8 == 0) goto L_0x03d0
            r8 = 1
            goto L_0x03d1
        L_0x03d0:
            r8 = 0
        L_0x03d1:
            boolean r14 = r9.d()
            if (r14 == 0) goto L_0x03ee
            l10 r11 = r11.d()
            if (r11 == 0) goto L_0x03ee
            r14 = 4
            r32 = r15
            int r15 = r11.d
            if (r15 != r14) goto L_0x03e5
            goto L_0x03eb
        L_0x03e5:
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x03f0
        L_0x03eb:
            r11 = 1
        L_0x03ec:
            r14 = 2
            goto L_0x03f2
        L_0x03ee:
            r32 = r15
        L_0x03f0:
            r11 = 0
            goto L_0x03ec
        L_0x03f2:
            if (r13 != r14) goto L_0x0406
            if (r11 != 0) goto L_0x03fb
            if (r8 == 0) goto L_0x03f9
            goto L_0x03fb
        L_0x03f9:
            r14 = 2
            goto L_0x0406
        L_0x03fb:
            java.lang.Object r12 = r12.b
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x0406:
            if (r13 != r14) goto L_0x0419
            boolean r15 = r9.d()
            if (r15 == 0) goto L_0x0419
            java.lang.Object r12 = r12.o
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x0419:
            if (r13 != r14) goto L_0x0426
            java.lang.Object r12 = r12.Y
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x0426:
            r14 = 1
            if (r13 != r14) goto L_0x042e
            if (r11 != 0) goto L_0x0430
            if (r8 == 0) goto L_0x042e
            goto L_0x0430
        L_0x042e:
            r14 = 1
            goto L_0x043b
        L_0x0430:
            java.lang.Object r12 = r12.c
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x043b:
            if (r13 != r14) goto L_0x044e
            boolean r15 = r9.d()
            if (r15 == 0) goto L_0x044e
            java.lang.Object r12 = r12.X
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x044e:
            if (r13 != r14) goto L_0x045b
            java.lang.Object r12 = r12.Z
            je7 r12 = (defpackage.je7) r12
            java.lang.Object r12 = r12.getValue()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            goto L_0x045c
        L_0x045b:
            r12 = 0
        L_0x045c:
            if (r8 == 0) goto L_0x0465
            int r7 = defpackage.c0c.call_history_item_call_missed
            java.lang.String r7 = r10.getString(r7)
            goto L_0x049d
        L_0x0465:
            if (r11 == 0) goto L_0x046e
            int r7 = defpackage.c0c.call_history_item_call_reject
            java.lang.String r7 = r10.getString(r7)
            goto L_0x049d
        L_0x046e:
            boolean r8 = r9.d()
            if (r8 == 0) goto L_0x0489
            if (r7 == 0) goto L_0x0482
            int r8 = defpackage.c0c.call_history_item_call_incoming_with_time
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r7 = r10.getString(r8, r7)
            if (r7 != 0) goto L_0x049d
        L_0x0482:
            int r7 = defpackage.c0c.call_history_item_call_incoming
            java.lang.String r7 = r10.getString(r7)
            goto L_0x049d
        L_0x0489:
            if (r7 == 0) goto L_0x0497
            int r8 = defpackage.c0c.call_history_item_call_outgoing_with_time
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r7 = r10.getString(r8, r7)
            if (r7 != 0) goto L_0x049d
        L_0x0497:
            int r7 = defpackage.c0c.call_history_item_call_outgoing
            java.lang.String r7 = r10.getString(r7)
        L_0x049d:
            if (r12 == 0) goto L_0x04b3
            int r8 = r12.getIntrinsicWidth()
            int r10 = r12.getIntrinsicHeight()
            r11 = 0
            r12.setBounds(r11, r11, r8, r10)
            yl5 r8 = new yl5
            r10 = 0
            r14 = 6
            r8.<init>((android.graphics.drawable.Drawable) r12, (defpackage.sl5) r10, (int) r14)
            goto L_0x04b6
        L_0x04b3:
            r10 = 0
            r11 = 0
            r8 = r10
        L_0x04b6:
            java.lang.String r12 = "​ "
            java.lang.String r7 = defpackage.wg0.i(r12, r7)
            if (r8 == 0) goto L_0x0385
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>(r7)
            r7 = 17
            r13 = 1
            r12.setSpan(r8, r11, r13, r7)
            r7 = r12
            goto L_0x04d4
        L_0x04cb:
            r28 = r8
            r32 = r15
            r10 = 0
            r11 = 0
            r13 = 1
            r7 = r24
        L_0x04d4:
            if (r9 == 0) goto L_0x0505
            r8 = r28
            java.lang.Object r8 = r8.b
            je7 r8 = (defpackage.je7) r8
            java.lang.Object r8 = r8.getValue()
            kr2 r8 = (defpackage.kr2) r8
            cu8 r9 = r9.a
            long r9 = r9.o
            rm4 r8 = r8.b
            java.lang.Object r8 = r8.get()
            ida r8 = (defpackage.ida) r8
            t33 r12 = r8.c
            java.util.Locale r34 = r12.v()
            long r37 = r12.n()
            android.content.Context r8 = r8.a
            r39 = 1
            r33 = r8
            r35 = r9
            java.lang.String r12 = defpackage.ay7.j(r33, r34, r35, r37, r39)
            goto L_0x0506
        L_0x0505:
            r12 = r10
        L_0x0506:
            if (r12 != 0) goto L_0x050b
            r26 = r24
            goto L_0x050d
        L_0x050b:
            r26 = r12
        L_0x050d:
            uj3 r8 = r3.b
            if (r8 == 0) goto L_0x0518
            java.lang.CharSequence r14 = r8.m()
        L_0x0515:
            r22 = r14
            goto L_0x052c
        L_0x0518:
            e52 r8 = r3.a
            if (r8 == 0) goto L_0x052a
            boolean r8 = r8.R()
            if (r8 != 0) goto L_0x052a
            e52 r3 = r3.a
            r3.l0()
            java.lang.CharSequence r14 = r3.x0
            goto L_0x0515
        L_0x052a:
            r22 = r24
        L_0x052c:
            boolean r3 = r2 instanceof defpackage.xk6
            il6 r8 = new il6
            r17 = r8
            r23 = r1
            r24 = r3
            r28 = r7
            r30 = r2
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.put(r6, r8)
            r7 = r11
            r1 = r13
            r2 = r31
            r15 = r32
            goto L_0x0126
        L_0x0548:
            r13 = r1
            r32 = r15
            huc r1 = defpackage.v81.b
            v81 r2 = r0.b
            r1.getClass()
            v81 r1 = defpackage.v81.ALL
            if (r2 != r1) goto L_0x0570
            q0e r1 = r0.w0
        L_0x0558:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.getClass()
            boolean r3 = r5.isEmpty()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r2 = r1.c(r2, r3)
            if (r2 == 0) goto L_0x0558
        L_0x0570:
            boolean r1 = r4 instanceof defpackage.dpa
            if (r1 == 0) goto L_0x0583
            dpa r4 = (defpackage.dpa) r4
            r4.getClass()
            dpa r1 = new dpa
            r1.<init>(r5)
        L_0x057e:
            r3 = r16
            r2 = r32
            goto L_0x0589
        L_0x0583:
            dpa r1 = new dpa
            r1.<init>(r5)
            goto L_0x057e
        L_0x0589:
            boolean r1 = r2.c(r3, r1)
            if (r1 == 0) goto L_0x0590
            return
        L_0x0590:
            r1 = r13
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m81.t():void");
    }
}

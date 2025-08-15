package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rff  reason: default package */
public final class rff {
    public final Context a;
    public final q33 b;
    public final pk c;
    public final zi5 d;
    public final ief e;
    public final String f = rff.class.getName();
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final kld j;
    public final v7c k;
    public final Set l;
    public final ContextScope m;

    public rff(Context context, je7 je7, q33 q33, pk pkVar, zi5 zi5, ief ief, kke kke, je7 je72, je7 je73) {
        this.a = context;
        this.b = q33;
        this.c = pkVar;
        this.d = zi5;
        this.e = ief;
        this.g = je7;
        this.h = je72;
        this.i = je73;
        kld b2 = lld.b(1, 0, 2, 2);
        this.j = b2;
        this.k = new v7c(b2);
        this.l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.m = j1e.a(((w9a) kke).b().plus(f46.a()).plus(new qj(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.rff r9, defpackage.cu8 r10, long r11, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof defpackage.qff
            if (r0 == 0) goto L_0x0014
            r0 = r13
            qff r0 = (defpackage.qff) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.s0 = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            qff r0 = new qff
            r0.<init>(r9, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r7.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.s0
            e5f r8 = defpackage.e5f.a
            r2 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r2) goto L_0x002f
            cu8 r10 = r7.X
            rff r9 = r7.o
            defpackage.od2.a0(r13)
            goto L_0x006f
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            defpackage.od2.a0(r13)
            g20 r13 = defpackage.g20.o
            boolean r1 = r10.m(r13)
            if (r1 == 0) goto L_0x004f
            l20 r13 = r10.a(r13)
            if (r13 != 0) goto L_0x0051
            java.lang.String r9 = r9.f
            java.lang.String r10 = "Fetch video. Can't start fetch because attach not exist"
            defpackage.hm9.m(r9, r10, new java.lang.Object[0])
        L_0x004f:
            r0 = r8
            goto L_0x007c
        L_0x0051:
            java.lang.Long r1 = new java.lang.Long
            long r3 = r10.b
            r1.<init>(r3)
            java.util.Set r3 = r9.l
            r3.add(r1)
            r7.o = r9
            r7.X = r10
            r7.s0 = r2
            long r5 = r10.c
            r1 = r9
            r2 = r13
            r3 = r11
            java.lang.Object r11 = r1.c(r2, r3, r5, r7)
            if (r11 != r0) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            java.util.Set r9 = r9.l
            long r10 = r10.b
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            r9.remove(r12)
            goto L_0x004f
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rff.a(rff, cu8, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [ik5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [e47, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0 A[SYNTHETIC, Splitter:B:43:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0152 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.l20 r13, long r14, long r16, kotlin.coroutines.Continuation r18) {
        /*
            r12 = this;
            r1 = r12
            r0 = r13
            r2 = r18
            boolean r3 = r2 instanceof defpackage.mff
            if (r3 == 0) goto L_0x0017
            r3 = r2
            mff r3 = (defpackage.mff) r3
            int r4 = r3.s0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.s0 = r4
            goto L_0x001c
        L_0x0017:
            mff r3 = new mff
            r3.<init>(r12, r2)
        L_0x001c:
            java.lang.Object r2 = r3.Y
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.s0
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0041
            if (r5 != r7) goto L_0x0039
            k20 r1 = r3.X
            rff r3 = r3.o
            defpackage.od2.a0(r2)     // Catch:{ Exception -> 0x0034 }
            r0 = r2
            r2 = r1
            r1 = r3
            goto L_0x0117
        L_0x0034:
            r0 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x0141
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            defpackage.od2.a0(r2)
            boolean r2 = defpackage.s5c.P(r13)
            if (r2 == 0) goto L_0x0051
            s10 r2 = r0.j
            l20 r2 = r2.d
            k20 r2 = r2.d
            goto L_0x0053
        L_0x0051:
            k20 r2 = r0.d
        L_0x0053:
            boolean r5 = r13.i()
            boolean r8 = defpackage.s5c.P(r13)
            java.lang.String r9 = r1.f
            if (r5 != 0) goto L_0x0069
            if (r8 != 0) goto L_0x0069
            java.lang.String r0 = "Fetch video. Build fetcher: can't fetch because don't have video"
            defpackage.hm9.m0(r9, r0, new java.lang.Object[0])
        L_0x0066:
            r0 = r6
            goto L_0x00d8
        L_0x0069:
            java.lang.String r10 = r12.d(r13)
            if (r10 == 0) goto L_0x007e
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            vq7 r0 = new vq7
            android.content.Context r5 = r1.a
            r0.<init>((android.content.Context) r5, (java.lang.String) r10)
            goto L_0x00d8
        L_0x007e:
            if (r5 == 0) goto L_0x00b2
            k20 r5 = r0.d
            java.lang.String r10 = r5.h
            if (r10 == 0) goto L_0x008c
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00b2
        L_0x008c:
            java.lang.String r0 = "Fetch video. Build fetcher: internal video"
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            e47 r0 = new e47
            long r10 = r5.a
            java.lang.String r5 = r5.m
            pk r8 = r1.c
            r0.<init>()
            r0.Y = r8
            r0.a = r10
            r10 = r14
            r0.b = r10
            r10 = r16
            r0.X = r10
            r0.c = r5
            java.lang.Class<e47> r5 = defpackage.e47.class
            java.lang.String r5 = r5.getName()
            r0.o = r5
            goto L_0x00d8
        L_0x00b2:
            if (r8 == 0) goto L_0x00d2
            java.lang.String r5 = "Fetch video. Build fetcher: video file"
            defpackage.hm9.m(r9, r5, new java.lang.Object[0])
            ik5 r5 = new ik5
            s10 r0 = r0.j
            long r10 = r0.a
            pk r0 = r1.c
            r5.<init>()
            r5.b = r0
            r5.a = r10
            java.lang.Class<ik5> r0 = defpackage.ik5.class
            java.lang.String r0 = r0.getName()
            r5.c = r0
            r0 = r5
            goto L_0x00d8
        L_0x00d2:
            java.lang.String r0 = "Fetch video. Build fetcher: unknown type! null"
            defpackage.hm9.m0(r9, r0, new java.lang.Object[0])
            goto L_0x0066
        L_0x00d8:
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "Fetch video. Fetcher is null"
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            return r6
        L_0x00e0:
            nff r5 = new nff     // Catch:{ Exception -> 0x0140 }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x0140 }
            mqc r0 = new mqc     // Catch:{ Exception -> 0x0140 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0140 }
            kt4 r5 = defpackage.kt4.SECONDS     // Catch:{ Exception -> 0x0140 }
            r8 = 30
            long r8 = defpackage.z7.S(r8, r5)     // Catch:{ Exception -> 0x0140 }
            zo5 r5 = new zo5     // Catch:{ Exception -> 0x0140 }
            r5.<init>(r8, r0, r6)     // Catch:{ Exception -> 0x0140 }
            qn5 r0 = new qn5     // Catch:{ Exception -> 0x0140 }
            r8 = 0
            r0.<init>(r8, r5)     // Catch:{ Exception -> 0x0140 }
            vg2 r5 = new vg2     // Catch:{ Exception -> 0x0140 }
            r8 = 1
            r5.<init>(r12, r6, r8)     // Catch:{ Exception -> 0x0140 }
            ac r8 = new ac     // Catch:{ Exception -> 0x0140 }
            r9 = 19
            r8.<init>(r0, r9, r5)     // Catch:{ Exception -> 0x0140 }
            r3.o = r1     // Catch:{ Exception -> 0x0140 }
            r3.X = r2     // Catch:{ Exception -> 0x0140 }
            r3.s0 = r7     // Catch:{ Exception -> 0x0140 }
            java.lang.Object r0 = defpackage.od2.A(r8, r3)     // Catch:{ Exception -> 0x0140 }
            if (r0 != r4) goto L_0x0117
            return r4
        L_0x0117:
            gf5 r0 = (defpackage.gf5) r0     // Catch:{ Exception -> 0x0140 }
            java.lang.String r3 = r2.i
            java.lang.String r4 = "ACTION_VIDEO_FETCH_OK"
            if (r3 == 0) goto L_0x0134
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0126
            goto L_0x0134
        L_0x0126:
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            ad r1 = (defpackage.ad) r1
            java.lang.String r2 = r2.i
            r1.g(r4, r2)
            goto L_0x013f
        L_0x0134:
            je7 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            ad r1 = (defpackage.ad) r1
            r1.f(r4)
        L_0x013f:
            return r0
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            boolean r3 = r0 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x0153
            r3 = r0
            ru.ok.tamtam.errors.TamErrorException r3 = (ru.ok.tamtam.errors.TamErrorException) r3
            pke r3 = r3.a
            java.lang.String r3 = r3.b
            boolean r3 = defpackage.f46.U(r3)
            if (r3 == 0) goto L_0x0153
            return r6
        L_0x0153:
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x018f
            java.lang.String r3 = r1.f
            java.lang.String r4 = r2.h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Fetch video. Failed to fetch "
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.hm9.p(r3, r4, r0)
            je7 r0 = r1.g
            java.lang.String r1 = "ACTION_VIDEO_FETCH_FAILURE"
            java.lang.String r2 = r2.i
            if (r2 == 0) goto L_0x0185
            int r3 = r2.length()
            if (r3 != 0) goto L_0x017b
            goto L_0x0185
        L_0x017b:
            java.lang.Object r0 = r0.getValue()
            ad r0 = (defpackage.ad) r0
            r0.g(r1, r2)
            goto L_0x018e
        L_0x0185:
            java.lang.Object r0 = r0.getValue()
            ad r0 = (defpackage.ad) r0
            r0.f(r1)
        L_0x018e:
            return r6
        L_0x018f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rff.b(l20, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [gef, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r12v13, types: [fe9] */
    /* JADX WARNING: type inference failed for: r12v14, types: [fe9] */
    /* JADX WARNING: type inference failed for: r12v15, types: [zn6] */
    /* JADX WARNING: type inference failed for: r12v16, types: [c24] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.l20 r26, long r27, long r29, kotlin.coroutines.Continuation r31) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof defpackage.pff
            if (r1 == 0) goto L_0x001a
            r1 = r0
            pff r1 = (defpackage.pff) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.t0 = r2
        L_0x0018:
            r6 = r1
            goto L_0x0020
        L_0x001a:
            pff r1 = new pff
            r1.<init>(r7, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r6.Z
            tx3 r9 = defpackage.tx3.a
            int r1 = r6.t0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x003f
            if (r1 != r10) goto L_0x0037
            k20 r1 = r6.Y
            l20 r2 = r6.X
            rff r3 = r6.o
            defpackage.od2.a0(r0)
            goto L_0x00d5
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            defpackage.od2.a0(r0)
            java.lang.String r0 = r7.f
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L_0x004d
        L_0x0048:
            r12 = r27
            r4 = r29
            goto L_0x006b
        L_0x004d:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0048
            us7 r2 = defpackage.us7.X
            java.lang.String r3 = "Fetch video. Start fetch, getVideoContent chatServerId="
            java.lang.String r4 = ", messageServerId="
            r12 = r27
            java.lang.StringBuilder r3 = defpackage.au1.k(r12, r3, r4)
            r4 = r29
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.d(r2, r0, r3, r11)
        L_0x006b:
            boolean r0 = defpackage.s5c.P(r26)
            if (r0 == 0) goto L_0x0079
            s10 r0 = r8.j
            l20 r0 = r0.d
            k20 r0 = r0.d
        L_0x0077:
            r14 = r0
            goto L_0x007c
        L_0x0079:
            k20 r0 = r8.d
            goto L_0x0077
        L_0x007c:
            java.lang.String r0 = r14.h
            int r0 = r0.length()
            if (r0 != 0) goto L_0x028f
            boolean r0 = r14.g
            if (r0 == 0) goto L_0x009e
            long r0 = r14.k
            q33 r2 = r7.b
            hyc r2 = (defpackage.hyc) r2
            long r2 = r2.n()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009e
            java.lang.String r0 = r7.f
            java.lang.String r1 = "Fetch video. Live stream not started"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            return r11
        L_0x009e:
            java.lang.String r0 = r25.d(r26)
            java.lang.String r1 = r7.f
            java.lang.String r2 = "Fetch video. Check local path, getVideoContent: local path = %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.hm9.m(r1, r2, r0)
            ief r0 = r7.e
            java.lang.String r1 = r8.r
            r0.getClass()
            gef r0 = defpackage.ief.a(r1)
            if (r0 == 0) goto L_0x00bb
            return r0
        L_0x00bb:
            r6.o = r7
            r6.X = r8
            r6.Y = r14
            r6.t0 = r10
            r0 = r25
            r1 = r26
            r2 = r27
            r4 = r29
            java.lang.Object r0 = r0.b(r1, r2, r4, r6)
            if (r0 != r9) goto L_0x00d2
            return r9
        L_0x00d2:
            r3 = r7
            r2 = r8
            r1 = r14
        L_0x00d5:
            gf5 r0 = (defpackage.gf5) r0
            r3.getClass()
            if (r0 == 0) goto L_0x0256
            java.util.List r0 = r0.a
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00e6
            goto L_0x0256
        L_0x00e6:
            j20 r4 = r1.l
            if (r4 == 0) goto L_0x00f0
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x00f0
            r5 = r10
            goto L_0x00f1
        L_0x00f0:
            r5 = 0
        L_0x00f1:
            java.util.Iterator r6 = r0.iterator()
        L_0x00f5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0108
            java.lang.Object r7 = r6.next()
            r8 = r7
            ef5 r8 = (defpackage.ef5) r8
            int r8 = r8.a
            r9 = 2
            if (r8 != r9) goto L_0x00f5
            goto L_0x0109
        L_0x0108:
            r7 = r11
        L_0x0109:
            ef5 r7 = (defpackage.ef5) r7
            if (r7 == 0) goto L_0x0137
            c24 r0 = new c24
            java.lang.String r4 = r7.b
            uy r6 = r1.n
            long r7 = r1.a
            long r9 = r1.c
            long r14 = r1.k
            boolean r13 = r1.g
            int r12 = r1.e
            int r1 = r1.f
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r7
            r17 = r9
            r21 = r6
            r22 = r4
            r24 = r5
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x0257
        L_0x0137:
            java.util.Iterator r6 = r0.iterator()
        L_0x013b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x014d
            java.lang.Object r7 = r6.next()
            r8 = r7
            ef5 r8 = (defpackage.ef5) r8
            int r8 = r8.a
            if (r8 != r10) goto L_0x013b
            goto L_0x014e
        L_0x014d:
            r7 = r11
        L_0x014e:
            ef5 r7 = (defpackage.ef5) r7
            if (r7 == 0) goto L_0x017c
            zn6 r0 = new zn6
            java.lang.String r4 = r7.b
            uy r6 = r1.n
            long r7 = r1.a
            long r9 = r1.c
            long r14 = r1.k
            boolean r13 = r1.g
            int r12 = r1.e
            int r1 = r1.f
            r16 = r12
            r12 = r0
            r23 = r13
            r13 = r16
            r19 = r14
            r14 = r1
            r15 = r7
            r17 = r9
            r21 = r6
            r22 = r4
            r24 = r5
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23, r24)
            goto L_0x0257
        L_0x017c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0185:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x019b
            java.lang.Object r7 = r0.next()
            r8 = r7
            ef5 r8 = (defpackage.ef5) r8
            int r8 = r8.a
            r9 = 3
            if (r8 != r9) goto L_0x0185
            r6.add(r7)
            goto L_0x0185
        L_0x019b:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01a2
            r6 = r11
        L_0x01a2:
            if (r6 == 0) goto L_0x020e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01ab
            goto L_0x020e
        L_0x01ab:
            if (r4 == 0) goto L_0x020e
            float r0 = r4.b
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x020e
            java.lang.Object r6 = defpackage.x53.g0(r6)
            ef5 r6 = (defpackage.ef5) r6
            de9 r7 = new de9
            java.lang.String r8 = r6.b
            int r9 = r6.c
            int r10 = r6.d
            int r12 = r6.e
            r7.<init>(r9, r8, r10, r12)
            long r8 = r6.f
            long r12 = r1.c
            long r12 = r8 - r12
            long r12 = java.lang.Math.abs(r12)
            r14 = 10
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x01f0
            x2f r1 = new x2f
            float r6 = (float) r8
            float r4 = r4.a
            float r4 = r4 * r6
            long r8 = (long) r4
            float r0 = r0 * r6
            long r12 = (long) r0
            r25 = r1
            r26 = r7
            r27 = r8
            r29 = r12
            r31 = r5
            r25.<init>(r26, r27, r29, r31)
            r0 = r1
            goto L_0x0257
        L_0x01f0:
            java.util.List r13 = java.util.Collections.singletonList(r7)
            fe9 r0 = new fe9
            uy r14 = r1.n
            long r6 = r1.a
            long r8 = r1.c
            int r4 = r1.e
            int r1 = r1.f
            r12 = r0
            r15 = r6
            r17 = r8
            r19 = r5
            r20 = r4
            r21 = r1
            r12.<init>(r13, r14, r15, r17, r19, r20, r21)
            goto L_0x0257
        L_0x020e:
            if (r6 == 0) goto L_0x0256
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.z53.S(r6, r0)
            r13.<init>(r0)
            java.util.Iterator r0 = r6.iterator()
        L_0x021f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x023c
            java.lang.Object r4 = r0.next()
            ef5 r4 = (defpackage.ef5) r4
            de9 r6 = new de9
            java.lang.String r7 = r4.b
            int r8 = r4.c
            int r9 = r4.d
            int r4 = r4.e
            r6.<init>(r8, r7, r9, r4)
            r13.add(r6)
            goto L_0x021f
        L_0x023c:
            fe9 r0 = new fe9
            uy r14 = r1.n
            long r6 = r1.a
            long r8 = r1.c
            int r4 = r1.e
            int r1 = r1.f
            r12 = r0
            r15 = r6
            r17 = r8
            r19 = r5
            r20 = r4
            r21 = r1
            r12.<init>(r13, r14, r15, r17, r19, r20, r21)
            goto L_0x0257
        L_0x0256:
            r0 = r11
        L_0x0257:
            if (r0 == 0) goto L_0x026e
            ief r1 = r3.e
            java.lang.String r2 = r2.r
            r1.getClass()
            android.util.LruCache r1 = defpackage.ief.a
            hef r4 = new hef
            long r5 = java.lang.System.currentTimeMillis()
            r4.<init>(r0, r5)
            r1.put(r2, r4)
        L_0x026e:
            java.lang.String r1 = r3.f
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0275
            goto L_0x028e
        L_0x0275:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x028e
            us7 r3 = defpackage.us7.X
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Fetch video. Finish fetch, getVideoContent: processFetchResult for videoContent "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r1, r4, r11)
        L_0x028e:
            return r0
        L_0x028f:
            java.lang.String r0 = r7.f
            java.lang.String r1 = "Fetch video. Video hosting in black list"
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rff.c(l20, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String d(l20 l20) {
        long j2;
        boolean P = s5c.P(l20);
        boolean i2 = l20.i();
        String str = l20.s;
        if (i2) {
            j2 = l20.d.a;
        } else {
            if (!P) {
                str = "";
            }
            j2 = 0;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        if (kj6.g(new File(str))) {
            return str;
        }
        if (j2 == 0) {
            return null;
        }
        File s = ((kk5) this.d).s(j2);
        if (kj6.g(s)) {
            return s.getAbsolutePath();
        }
        return null;
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hce  reason: default package */
public final class hce extends ffe implements a66 {
    public final /* synthetic */ int A0 = 10;
    public List X;
    public kec Y;
    public int Z;
    public int s0;
    public int t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ gde w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ moa z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hce(gde gde, String str, int i, moa moa, Continuation continuation) {
        super(2, continuation);
        this.w0 = gde;
        this.x0 = str;
        this.y0 = i;
        this.z0 = moa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hce hce = new hce(this.w0, this.x0, this.y0, this.z0, continuation);
        hce.v0 = obj;
        return hce;
    }

    /* JADX WARNING: type inference failed for: r15v7, types: [kec, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            r6 = 2
            int r8 = r0.A0
            gde r9 = r0.w0
            moa r10 = r0.z0
            int r11 = r0.y0
            java.lang.String r12 = r0.x0
            if (r2 == 0) goto L_0x004d
            if (r2 == r3) goto L_0x0038
            if (r2 != r6) goto L_0x0030
            int r1 = r0.Z
            kec r2 = r0.Y
            java.util.List r6 = r0.X
            java.lang.Object r0 = r0.v0
            sx3 r0 = (defpackage.sx3) r0
            defpackage.od2.a0(r18)     // Catch:{ all -> 0x002b }
            r0 = r18
            r15 = r2
            r2 = 0
            goto L_0x017d
        L_0x002b:
            r0 = move-exception
            r15 = r2
            r2 = 0
            goto L_0x0186
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            int r2 = r0.t0
            int r13 = r0.s0
            int r14 = r0.Z
            kec r15 = r0.Y
            java.util.List r6 = r0.X
            java.lang.Object r4 = r0.v0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r18)     // Catch:{ all -> 0x00a6 }
            r5 = r18
            goto L_0x00d0
        L_0x004d:
            defpackage.od2.a0(r18)
            java.lang.Object r2 = r0.v0
            r4 = r2
            sx3 r4 = (defpackage.sx3) r4
            java.lang.String r2 = r9.a
            boolean r2 = defpackage.tpa.f(r2, r12)
            if (r2 == 0) goto L_0x0066
            int r2 = r9.b
            if (r2 != r11) goto L_0x0066
            boolean r2 = r9.f
            if (r2 != 0) goto L_0x0066
            return r9
        L_0x0066:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            kec r15 = new kec
            r15.<init>()
            java.lang.Object r2 = r10.a
            j92 r2 = (defpackage.j92) r2
            j92 r13 = defpackage.j92.b
            if (r2 == r13) goto L_0x007f
            j92 r13 = defpackage.j92.o
            if (r2 != r13) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r13 = 0
            goto L_0x0080
        L_0x007f:
            r13 = r3
        L_0x0080:
            s25 r2 = new s25
            r2.<init>(r12, r11, r10)
            khe r14 = new khe
            r14.<init>(r2)
            int r2 = r9.e
            if (r13 != 0) goto L_0x00a9
            java.lang.Object r16 = r14.getValue()
            r5 = r16
            jce r5 = (defpackage.jce) r5
            jce r7 = defpackage.jce.c
            if (r5 == r7) goto L_0x00a9
            java.lang.Object r5 = r14.getValue()
            jce r5 = (defpackage.jce) r5
            jce r7 = defpackage.jce.o
            if (r5 != r7) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            r14 = r2
        L_0x00a6:
            r2 = 0
            goto L_0x011d
        L_0x00a9:
            r0.v0 = r4     // Catch:{ all -> 0x011a }
            r0.X = r6     // Catch:{ all -> 0x011a }
            r0.Y = r15     // Catch:{ all -> 0x011a }
            r0.Z = r2     // Catch:{ all -> 0x011a }
            r0.s0 = r13     // Catch:{ all -> 0x011a }
            r0.t0 = r8     // Catch:{ all -> 0x011a }
            r0.u0 = r3     // Catch:{ all -> 0x011a }
            java.lang.Object r5 = r10.b     // Catch:{ all -> 0x011a }
            kke r5 = (defpackage.kke) r5     // Catch:{ all -> 0x011a }
            w9a r5 = (defpackage.w9a) r5     // Catch:{ all -> 0x011a }
            nx3 r5 = r5.a()     // Catch:{ all -> 0x011a }
            fce r7 = new fce     // Catch:{ all -> 0x011a }
            r14 = 0
            r7.<init>(r10, r12, r11, r14)     // Catch:{ all -> 0x011a }
            java.lang.Object r5 = defpackage.j47.t0(r5, r7, r0)     // Catch:{ all -> 0x011a }
            if (r5 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r14 = r2
            r2 = r8
        L_0x00d0:
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x00a6 }
            int r7 = r5.size()     // Catch:{ all -> 0x00a6 }
            r15.a = r7     // Catch:{ all -> 0x00a6 }
            int r7 = r5.size()     // Catch:{ all -> 0x00a6 }
            if (r7 <= r14) goto L_0x00a6
            int r2 = r2 + r14
            int r7 = r5.size()     // Catch:{ all -> 0x00a6 }
            if (r2 <= r7) goto L_0x00e6
            r2 = r7
        L_0x00e6:
            java.util.List r2 = r5.subList(r14, r2)     // Catch:{ all -> 0x00a6 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00a6 }
            r7 = 10
            int r3 = defpackage.z53.S(r2, r7)     // Catch:{ all -> 0x00a6 }
            r5.<init>(r3)     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x00f9:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a6 }
            ybe r3 = (defpackage.ybe) r3     // Catch:{ all -> 0x00a6 }
            fde r7 = new fde     // Catch:{ all -> 0x00a6 }
            r18 = r2
            r2 = 0
            r7.<init>(r3, r2)     // Catch:{ all -> 0x011d }
            r5.add(r7)     // Catch:{ all -> 0x011d }
            r2 = r18
            goto L_0x00f9
        L_0x0113:
            r2 = 0
            r6.addAll(r5)     // Catch:{ all -> 0x011d }
            goto L_0x011d
        L_0x0118:
            r14 = r3
            goto L_0x011d
        L_0x011a:
            r3 = r2
            r2 = 0
            goto L_0x0118
        L_0x011d:
            if (r13 == 0) goto L_0x015a
            java.lang.Object r3 = r10.Z
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x015a
            boolean r3 = r3.isEmpty()
            r5 = 1
            r3 = r3 ^ r5
            if (r3 != r5) goto L_0x015a
            java.lang.Object r3 = r10.Z
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x013f
            java.lang.Object r3 = defpackage.x53.i0(r3)
            ybe r3 = (defpackage.ybe) r3
            if (r3 == 0) goto L_0x013f
            int r3 = r3.b
        L_0x013d:
            r5 = 1
            goto L_0x0141
        L_0x013f:
            r3 = r2
            goto L_0x013d
        L_0x0141:
            if (r3 == r5) goto L_0x015a
            r10.X = r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            r10.Y = r0
            java.util.List r0 = r9.d
            java.util.ArrayList r0 = defpackage.x53.t0(r0, r6)
            int r1 = r15.a
            gde r2 = new gde
            r2.<init>(r12, r11, r1, r0)
            return r2
        L_0x015a:
            r0.v0 = r4     // Catch:{ all -> 0x0184 }
            r0.X = r6     // Catch:{ all -> 0x0184 }
            r0.Y = r15     // Catch:{ all -> 0x0184 }
            r0.Z = r14     // Catch:{ all -> 0x0184 }
            r3 = 2
            r0.u0 = r3     // Catch:{ all -> 0x0184 }
            java.lang.Object r3 = r10.b     // Catch:{ all -> 0x0184 }
            kke r3 = (defpackage.kke) r3     // Catch:{ all -> 0x0184 }
            w9a r3 = (defpackage.w9a) r3     // Catch:{ all -> 0x0184 }
            nx3 r3 = r3.a()     // Catch:{ all -> 0x0184 }
            gce r4 = new gce     // Catch:{ all -> 0x0184 }
            r5 = 0
            r4.<init>(r10, r12, r11, r5)     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = defpackage.j47.t0(r3, r4, r0)     // Catch:{ all -> 0x0184 }
            if (r0 != r1) goto L_0x017c
            return r1
        L_0x017c:
            r1 = r14
        L_0x017d:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0180 }
            goto L_0x018c
        L_0x0180:
            r0 = move-exception
            goto L_0x0186
        L_0x0182:
            r1 = r14
            goto L_0x0186
        L_0x0184:
            r0 = move-exception
            goto L_0x0182
        L_0x0186:
            njc r3 = new njc
            r3.<init>(r0)
            r0 = r3
        L_0x018c:
            nz4 r3 = defpackage.nz4.a
            boolean r4 = r0 instanceof defpackage.njc
            if (r4 == 0) goto L_0x0193
            r0 = r3
        L_0x0193:
            java.util.List r0 = (java.util.List) r0
            int r3 = r6.size()
            if (r3 < r8) goto L_0x01ae
            java.util.List r1 = r9.d
            java.util.ArrayList r1 = defpackage.x53.t0(r1, r6)
            int r2 = r15.a
            int r0 = r0.size()
            int r0 = r0 + r2
            gde r2 = new gde
            r2.<init>(r12, r11, r0, r1)
            return r2
        L_0x01ae:
            int r3 = r15.a
            int r1 = r1 - r3
            if (r1 >= 0) goto L_0x01b5
            r4 = r2
            goto L_0x01b6
        L_0x01b5:
            r4 = r1
        L_0x01b6:
            int r1 = r0.size()
            int r1 = r1 + r3
            r15.a = r1
            int r1 = r6.size()     // Catch:{ all -> 0x01fc }
            int r8 = r8 - r1
            int r1 = r0.size()     // Catch:{ all -> 0x01fc }
            if (r1 <= r4) goto L_0x01fc
            int r8 = r8 + r4
            int r1 = r0.size()     // Catch:{ all -> 0x01fc }
            if (r8 <= r1) goto L_0x01d0
            r8 = r1
        L_0x01d0:
            java.util.List r0 = r0.subList(r4, r8)     // Catch:{ all -> 0x01fc }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01fc }
            r2 = 10
            int r2 = defpackage.z53.S(r0, r2)     // Catch:{ all -> 0x01fc }
            r1.<init>(r2)     // Catch:{ all -> 0x01fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01fc }
        L_0x01e3:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x01fc }
            if (r2 == 0) goto L_0x01f9
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x01fc }
            ybe r2 = (defpackage.ybe) r2     // Catch:{ all -> 0x01fc }
            fde r3 = new fde     // Catch:{ all -> 0x01fc }
            r4 = 1
            r3.<init>(r2, r4)     // Catch:{ all -> 0x01fc }
            r1.add(r3)     // Catch:{ all -> 0x01fc }
            goto L_0x01e3
        L_0x01f9:
            r6.addAll(r1)     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r10.X = r12
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            r10.Y = r0
            java.util.List r0 = r9.d
            java.util.ArrayList r0 = defpackage.x53.t0(r0, r6)
            int r1 = r15.a
            gde r2 = new gde
            r2.<init>(r12, r11, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hce.o(java.lang.Object):java.lang.Object");
    }
}

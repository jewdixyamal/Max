package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pb9  reason: default package */
public final class pb9 extends ffe implements a66 {
    public Object X;
    public Object Y;
    public xb9 Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ xb9 v0;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pb9(List list, xb9 xb9, long j, Continuation continuation) {
        super(2, continuation);
        this.u0 = list;
        this.v0 = xb9;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pb9 pb9 = new pb9(this.u0, this.v0, this.w0, continuation);
        pb9.t0 = obj;
        return pb9;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r14.s0
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x004f
            if (r1 == r5) goto L_0x003b
            if (r1 == r4) goto L_0x002b
            if (r1 != r3) goto L_0x0023
            java.lang.Object r1 = r14.Y
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r14.X
            xb9 r4 = (defpackage.xb9) r4
            java.lang.Object r5 = r14.t0
            gi9 r5 = (defpackage.gi9) r5
            defpackage.od2.a0(r15)
            r15 = r4
            r10 = r5
            goto L_0x0113
        L_0x0023:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x002b:
            java.lang.Object r1 = r14.X
            xs r1 = (defpackage.xs) r1
            java.lang.Object r4 = r14.t0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0038 }
            goto L_0x00dd
        L_0x0038:
            r15 = move-exception
            goto L_0x00e4
        L_0x003b:
            xb9 r1 = r14.Z
            java.lang.Object r5 = r14.Y
            xi9 r5 = (defpackage.xi9) r5
            java.lang.Object r6 = r14.X
            xs r6 = (defpackage.xs) r6
            java.lang.Object r7 = r14.t0
            sx3 r7 = (defpackage.sx3) r7
            defpackage.od2.a0(r15)
        L_0x004c:
            r15 = r1
            r1 = r6
            goto L_0x0080
        L_0x004f:
            defpackage.od2.a0(r15)
            java.lang.Object r15 = r14.t0
            sx3 r15 = (defpackage.sx3) r15
            java.util.List r1 = r14.u0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0061
            gi9 r14 = defpackage.vv7.a
            return r14
        L_0x0061:
            java.util.List r1 = r14.u0
            xs r6 = new xs
            r6.<init>((java.util.Collection) r1)
            xb9 r1 = r14.v0
            aj9 r7 = r1.s0
            r14.t0 = r15
            r14.X = r6
            r14.Y = r7
            r14.Z = r1
            r14.s0 = r5
            java.lang.Object r5 = r7.d(r14)
            if (r5 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r5 = r7
            r7 = r15
            goto L_0x004c
        L_0x0080:
            xs r6 = r15.t0     // Catch:{ all -> 0x0160 }
            r1.c(r6)     // Catch:{ all -> 0x0160 }
            xs r15 = r15.t0     // Catch:{ all -> 0x0160 }
            r15.a(r1)     // Catch:{ all -> 0x0160 }
            aj9 r5 = (defpackage.aj9) r5
            r5.e(r2)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x00be
            java.util.List r8 = r14.u0
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            boolean r15 = r14.c()
            if (r15 == 0) goto L_0x00bb
            us7 r15 = defpackage.us7.Y
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = 63
            java.lang.String r0 = defpackage.x53.n0(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "requestContacts: idsForRequest skipped! missedIds=["
            java.lang.String r3 = "]"
            java.lang.String r0 = defpackage.zr6.i(r1, r0, r3)
            java.lang.String r1 = "MissedContactsController"
            r14.d(r15, r1, r0, r2)
        L_0x00bb:
            gi9 r14 = defpackage.vv7.a
            return r14
        L_0x00be:
            long r5 = r14.w0     // Catch:{ all -> 0x00e2 }
            ob9 r15 = new ob9     // Catch:{ all -> 0x00e2 }
            xb9 r8 = r14.v0     // Catch:{ all -> 0x00e2 }
            r15.<init>(r1, r8, r2)     // Catch:{ all -> 0x00e2 }
            r14.t0 = r7     // Catch:{ all -> 0x00e2 }
            r14.X = r1     // Catch:{ all -> 0x00e2 }
            r14.Y = r2     // Catch:{ all -> 0x00e2 }
            r14.Z = r2     // Catch:{ all -> 0x00e2 }
            r14.s0 = r4     // Catch:{ all -> 0x00e2 }
            long r4 = defpackage.j47.p0(r5)     // Catch:{ all -> 0x00e2 }
            java.lang.Object r15 = defpackage.fp3.H(r4, r15, r14)     // Catch:{ all -> 0x00e2 }
            if (r15 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r4 = r7
        L_0x00dd:
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x0038 }
            goto L_0x00ed
        L_0x00e0:
            r4 = r7
            goto L_0x00e4
        L_0x00e2:
            r15 = move-exception
            goto L_0x00e0
        L_0x00e4:
            boolean r5 = r15 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L_0x0158
            boolean r5 = r15 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r5 != 0) goto L_0x0158
            r15 = r2
        L_0x00ed:
            boolean r4 = defpackage.j1e.z(r4)
            if (r4 == 0) goto L_0x014c
            if (r15 == 0) goto L_0x014c
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto L_0x00fc
            goto L_0x014c
        L_0x00fc:
            xb9 r4 = r14.v0
            boolean r4 = r4.i()
            if (r4 != 0) goto L_0x0105
            goto L_0x014c
        L_0x0105:
            gi9 r1 = new gi9
            r1.<init>((java.lang.Object) r2)
            xb9 r4 = r14.v0
            java.util.Iterator r15 = r15.iterator()
            r10 = r1
            r1 = r15
            r15 = r4
        L_0x0113:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x014b
            java.lang.Object r4 = r1.next()
            kpa r4 = (defpackage.kpa) r4
            java.lang.Object r5 = r4.a
            r7 = r5
            long[] r7 = (long[]) r7
            java.lang.Object r4 = r4.b
            r5 = r4
            kpa r5 = (defpackage.kpa) r5
            r14.t0 = r10
            r14.X = r15
            r14.Y = r1
            r14.Z = r2
            r14.s0 = r3
            r15.getClass()
            mb9 r11 = new mb9
            r9 = 0
            r4 = r11
            r6 = r15
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r4 = defpackage.j1e.k(r11, r14)
            if (r4 != r0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            e5f r4 = defpackage.e5f.a
        L_0x0148:
            if (r4 != r0) goto L_0x0113
            return r0
        L_0x014b:
            return r10
        L_0x014c:
            xb9 r14 = r14.v0
            xs r14 = r14.t0
            r14.c(r1)
            gi9 r14 = defpackage.oag.G(r1)
            return r14
        L_0x0158:
            xb9 r14 = r14.v0
            xs r14 = r14.t0
            r14.c(r1)
            throw r15
        L_0x0160:
            r14 = move-exception
            aj9 r5 = (defpackage.aj9) r5
            r5.e(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb9.o(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: pf5  reason: default package */
public final class pf5 {
    public final String a = pf5.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;

    public pf5(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79) {
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = je75;
        this.g = je76;
        this.h = je77;
        this.i = je78;
        this.j = je79;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r14, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.coroutines.Continuation r22) {
        /*
            r13 = this;
            r1 = r13
            r5 = r16
            r0 = r18
            r2 = r20
            r3 = r22
            boolean r4 = r3 instanceof defpackage.nf5
            if (r4 == 0) goto L_0x001d
            r4 = r3
            nf5 r4 = (defpackage.nf5) r4
            int r7 = r4.Z
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001d
            int r7 = r7 - r8
            r4.Z = r7
        L_0x001b:
            r9 = r4
            goto L_0x0023
        L_0x001d:
            nf5 r4 = new nf5
            r4.<init>(r13, r3)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r3 = r9.X
            tx3 r10 = defpackage.tx3.a
            int r4 = r9.Z
            zla r11 = defpackage.zla.a
            r7 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 != r7) goto L_0x0039
            pf5 r1 = r9.o
            defpackage.od2.a0(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0091
        L_0x0036:
            r0 = move-exception
            goto L_0x00dc
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            defpackage.od2.a0(r3)
            java.lang.String r3 = r1.a
            java.lang.String r4 = "File attach click. Start process open file"
            defpackage.hm9.m(r3, r4, new java.lang.Object[0])
            je7 r4 = r1.c
            if (r2 == 0) goto L_0x005f
            int r8 = r20.length()     // Catch:{ all -> 0x0036 }
            if (r8 != 0) goto L_0x0056
            goto L_0x005f
        L_0x0056:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0036 }
            r8.<init>(r2)     // Catch:{ all -> 0x0036 }
            r2 = r8
            r8 = r19
            goto L_0x006b
        L_0x005f:
            java.lang.Object r2 = r4.getValue()     // Catch:{ all -> 0x0036 }
            kk5 r2 = (defpackage.kk5) r2     // Catch:{ all -> 0x0036 }
            r8 = r19
            java.io.File r2 = r2.i(r8)     // Catch:{ all -> 0x0036 }
        L_0x006b:
            boolean r12 = r2.exists()     // Catch:{ all -> 0x0036 }
            if (r12 != 0) goto L_0x0092
            java.lang.String r2 = "file attach not found"
            r4 = 0
            defpackage.hm9.p(r3, r2, r4)     // Catch:{ all -> 0x0036 }
            je7 r2 = r1.e     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0036 }
            k6f r2 = (defpackage.k6f) r2     // Catch:{ all -> 0x0036 }
            d20 r8 = defpackage.d20.a     // Catch:{ all -> 0x0036 }
            r9.o = r1     // Catch:{ all -> 0x0036 }
            r9.Z = r7     // Catch:{ all -> 0x0036 }
            r3 = r14
            r5 = r16
            r7 = r18
            java.lang.Object r0 = r2.a(r3, r5, r7, r8, r9)     // Catch:{ all -> 0x0036 }
            if (r0 != r10) goto L_0x0091
            return r10
        L_0x0091:
            return r11
        L_0x0092:
            int r3 = defpackage.au1.s(r21)     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x00d6
            if (r3 == r7) goto L_0x00d0
            r0 = 2
            if (r3 != r0) goto L_0x00ca
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0036 }
            kk5 r0 = (defpackage.kk5) r0     // Catch:{ all -> 0x0036 }
            je7 r3 = r1.d     // Catch:{ all -> 0x0036 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0036 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x0036 }
            android.net.Uri r0 = r0.f(r3, r2)     // Catch:{ all -> 0x0036 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch:{ all -> 0x0036 }
            r2.setFlags(r7)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = defpackage.tfg.q(r19)     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = "*/*"
        L_0x00c1:
            r2.setDataAndType(r0, r3)     // Catch:{ all -> 0x0036 }
            ama r3 = new ama     // Catch:{ all -> 0x0036 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00db
        L_0x00ca:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x00d0:
            bma r3 = new bma     // Catch:{ all -> 0x0036 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00db
        L_0x00d6:
            bma r3 = new bma     // Catch:{ all -> 0x0036 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0036 }
        L_0x00db:
            return r3
        L_0x00dc:
            njc r2 = new njc
            r2.<init>(r0)
            java.lang.Throwable r0 = defpackage.pjc.a(r2)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = r1.a
            java.lang.String r2 = "cant open file attach"
            defpackage.hm9.p(r1, r2, r0)
        L_0x00ee:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf5.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(long j2, long j3, long j4, String str, Continuation continuation) {
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        String str2 = this.a;
        if (i2 == 0) {
            hm9.m(str2, "File attach click. Start process delete message", new Object[0]);
            hu8 hu8 = (hu8) this.f.getValue();
            hu8.getClass();
            Object a2 = hu8.a(true, Collections.singletonList(new Long(j3)), continuation);
            if (a2 != tx3) {
                a2 = e5f;
            }
            return a2 == tx3 ? a2 : e5f;
        }
        long j5 = j3;
        Continuation continuation2 = continuation;
        hm9.m(str2, "File attach click. Start process cancel download", new Object[0]);
        Object a3 = ((k6f) this.e.getValue()).a(j2, j3, str, d20.b, continuation);
        return a3 == tx3 ? a3 : e5f;
    }
}

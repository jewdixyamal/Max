package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: o5d  reason: default package */
public final class o5d extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ p5d u0;
    public final /* synthetic */ long v0;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ cz5 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o5d(List list, boolean z, CharSequence charSequence, p5d p5d, long j, Long l, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = z;
        this.t0 = charSequence;
        this.u0 = p5d;
        this.v0 = j;
        this.w0 = l;
        this.x0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o5d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o5d(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v44, types: [java.util.Queue] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = 2
            tx3 r3 = defpackage.tx3.a
            int r0 = r1.Y
            r4 = 0
            java.lang.String r5 = "SendMessageWithMediaUseCase"
            java.lang.CharSequence r6 = r1.t0
            long r7 = r1.v0
            p5d r10 = r1.u0
            r11 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r11) goto L_0x002b
            if (r0 != r2) goto L_0x0023
            java.lang.Object r0 = r1.X
            java.util.Queue r0 = (java.util.Queue) r0
            defpackage.od2.a0(r19)
            r15 = r0
            r0 = r19
            goto L_0x012a
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            java.lang.Object r0 = r1.X
            q7b r0 = (defpackage.q7b) r0
            defpackage.od2.a0(r19)
            r13 = r0
            r0 = r19
            goto L_0x0077
        L_0x0036:
            defpackage.od2.a0(r19)
            java.util.List r0 = r1.Z
            int r12 = r0.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Sending messages with media. Media count "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            defpackage.hm9.G(r5, r12, r4)
            boolean r12 = r1.s0
            if (r12 != 0) goto L_0x005c
            int r12 = r0.size()
            if (r12 <= r11) goto L_0x005c
            r12 = r11
            goto L_0x005d
        L_0x005c:
            r12 = 0
        L_0x005d:
            q7b r13 = new q7b
            r13.<init>(r0, r12, r6)
            je7 r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            x19 r0 = (defpackage.x19) r0
            r1.X = r13
            r1.Y = r11
            java.lang.Long r12 = r1.w0
            java.lang.Object r0 = r0.a(r7, r12, r1)
            if (r0 != r3) goto L_0x0077
            return r3
        L_0x0077:
            r12 = r0
            bw8 r12 = (defpackage.bw8) r12
            je7 r0 = r10.f
            java.lang.Object r0 = r0.getValue()
            dc6 r0 = (defpackage.dc6) r0
            java.util.List r14 = r0.b(r6, r7)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            je7 r0 = r10.c
            java.lang.Object r0 = r0.getValue()
            zm8 r0 = (defpackage.zm8) r0
            r0.getClass()
            boolean r9 = r13.b
            if (r9 == 0) goto L_0x00af
            y7d r0 = r0.a
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f63maxattachcount
            r11 = 12
            r17 = r3
            long r2 = (long) r11
            long r2 = r0.q(r9, r2)
            int r0 = (int) r2
            r2 = r0
            goto L_0x00b2
        L_0x00af:
            r17 = r3
            r2 = 1
        L_0x00b2:
            java.util.List r3 = r13.a
            if (r3 == 0) goto L_0x00bc
            int r0 = r3.size()
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = 0
        L_0x00bd:
            if (r9 != 0) goto L_0x00cd
            java.lang.CharSequence r0 = r13.c
            boolean r0 = defpackage.oag.t(r0)
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "Unexpected empty media list"
            defpackage.hm9.p(r5, r0, r4)
            goto L_0x0112
        L_0x00cd:
            if (r9 <= 0) goto L_0x0112
            r0 = 0
            r16 = 0
        L_0x00d2:
            if (r0 >= r9) goto L_0x0112
            java.util.ArrayList r5 = new java.util.ArrayList
            int r11 = r0 + r2
            int r13 = java.lang.Math.min(r9, r11)
            java.util.List r0 = r3.subList(r0, r13)
            r5.<init>(r0)
            d9d r0 = new d9d     // Catch:{ all -> 0x0108 }
            r0.<init>(r7, r5)     // Catch:{ all -> 0x0108 }
            if (r16 != 0) goto L_0x00ff
            if (r6 == 0) goto L_0x00f1
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00fb }
            goto L_0x00f2
        L_0x00f1:
            r5 = r4
        L_0x00f2:
            r0.m = r5     // Catch:{ all -> 0x00fb }
            r0.n = r14     // Catch:{ all -> 0x00fb }
            r0.b = r12     // Catch:{ all -> 0x00fb }
            r16 = 1
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            r16 = 1
            goto L_0x0109
        L_0x00ff:
            e9d r5 = new e9d     // Catch:{ all -> 0x0108 }
            r5.<init>(r0)     // Catch:{ all -> 0x0108 }
            r15.add(r5)     // Catch:{ all -> 0x0108 }
            goto L_0x0110
        L_0x0108:
            r0 = move-exception
        L_0x0109:
            java.lang.String r5 = "zm8"
            java.lang.String r13 = "splitMedias: Exception after split medias for send"
            defpackage.hm9.p(r5, r13, r0)
        L_0x0110:
            r0 = r11
            goto L_0x00d2
        L_0x0112:
            je7 r0 = r10.d
            java.lang.Object r0 = r0.getValue()
            xb6 r0 = (defpackage.xb6) r0
            r1.X = r15
            r2 = 2
            r1.Y = r2
            cz5 r3 = r1.x0
            java.lang.Object r0 = r0.b(r3, r1)
            r1 = r17
            if (r0 != r1) goto L_0x012a
            return r1
        L_0x012a:
            java.util.List r0 = (java.util.List) r0
            r15.addAll(r0)
            h8d r0 = new h8d
            r0.<init>(r7, r15, r2)
            h9d r1 = new h9d
            r1.<init>(r0)
            je7 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            r0.a(r1)
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5d.o(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m44  reason: default package */
public final class m44 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m44(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = obj;
        this.s0 = obj2;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new m44((o44) this.Z, (gi9) this.s0, continuation, 0).o(e5f.a);
            case 1:
                return new m44((on5) this.Z, (mec) this.s0, continuation, 1).o(e5f.a);
            default:
                return new m44((hmc) this.Z, (k5d) ((m56) this.s0), continuation, 2).o(e5f.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r5) goto L_0x0016
            defpackage.od2.a0(r11)
            goto L_0x0059
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            defpackage.od2.a0(r11)
            r6 = r3
        L_0x0022:
            lx3 r11 = r10.b
            boolean r11 = defpackage.pag.r(r11)
            if (r11 == 0) goto L_0x00a2
            java.lang.Object r11 = r10.Z
            hmc r11 = (defpackage.hmc) r11
            s1e r11 = r11.a()
            r10.Y = r5
            r11.getClass()
            java.lang.String r1 = "\n            SELECT id FROM events\n            WHERE status = 0\n                AND id > ?\n            ORDER BY id ASC\n            LIMIT ?\n        "
            r8 = 2
            xlc r1 = defpackage.xlc.a(r8, r1)
            r1.j(r5, r6)
            long r6 = (long) r2
            r1.j(r8, r6)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            r1e r7 = new r1e
            r8 = 2
            r7.<init>(r11, r1, r8)
            ilc r11 = r11.a
            java.lang.Object r11 = defpackage.ote.i(r11, r6, r7, r10)
            if (r11 != r0) goto L_0x0059
            goto L_0x00a4
        L_0x0059:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r1 = r10.Z
            hmc r1 = (defpackage.hmc) r1
            java.lang.String r1 = r1.c
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x007c
            us7 r7 = defpackage.us7.X
            int r8 = r11.size()
            java.lang.String r9 = "Selecting batch of waiting to send logs, ids size="
            java.lang.String r8 = defpackage.zr6.h(r8, r9)
            r9 = 0
            r6.d(r7, r1, r8, r9)
        L_0x007c:
            java.lang.Object r1 = r10.s0
            m56 r1 = (defpackage.m56) r1
            r1.invoke(r11)
            java.lang.Object r1 = defpackage.x53.q0(r11)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0090
            long r6 = r1.longValue()
            goto L_0x0091
        L_0x0090:
            r6 = r3
        L_0x0091:
            int r11 = r11.size()
            if (r11 >= r2) goto L_0x0022
            java.lang.Object r10 = r10.Z
            hmc r10 = (defpackage.hmc) r10
            java.lang.String r10 = r10.c
            java.lang.String r11 = "Last batch is not size of limit, stopping cycle"
            defpackage.hm9.m(r10, r11, new java.lang.Object[0])
        L_0x00a2:
            e5f r0 = defpackage.e5f.a
        L_0x00a4:
            return r0
        L_0x00a5:
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 0
            java.lang.Object r3 = r10.s0
            mec r3 = (defpackage.mec) r3
            r4 = 1
            if (r1 == 0) goto L_0x00bf
            if (r1 != r4) goto L_0x00b7
            defpackage.od2.a0(r11)
            goto L_0x00d6
        L_0x00b7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x00bf:
            defpackage.od2.a0(r11)
            kotlinx.coroutines.internal.Symbol r11 = defpackage.ay9.a
            java.lang.Object r1 = r3.a
            if (r1 != r11) goto L_0x00c9
            r1 = r2
        L_0x00c9:
            r10.Y = r4
            java.lang.Object r11 = r10.Z
            on5 r11 = (defpackage.on5) r11
            java.lang.Object r10 = r11.a(r1, r10)
            if (r10 != r0) goto L_0x00d6
            goto L_0x00da
        L_0x00d6:
            r3.a = r2
            e5f r0 = defpackage.e5f.a
        L_0x00da:
            return r0
        L_0x00db:
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Y
            r2 = 1
            if (r1 == 0) goto L_0x00f0
            if (r1 != r2) goto L_0x00e8
            defpackage.od2.a0(r11)
            goto L_0x0118
        L_0x00e8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.Z
            o44 r11 = (defpackage.o44) r11
            f44 r1 = r11.g
            f44 r9 = new f44
            gi9 r6 = r1.e
            java.lang.Object r3 = r10.s0
            gi9 r3 = (defpackage.gi9) r3
            r6.b(r3)
            r8 = 0
            boolean r4 = r1.a
            boolean r5 = r1.b
            boolean r7 = r1.c
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r10.Y = r2
            java.lang.Object r10 = defpackage.o44.a(r11, r9, r10)
            if (r10 != r0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            e5f r0 = defpackage.e5f.a
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m44.o(java.lang.Object):java.lang.Object");
    }
}

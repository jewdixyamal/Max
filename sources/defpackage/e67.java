package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: e67  reason: default package */
public final class e67 extends ffe implements a66 {
    public InviteByQrBottomSheet X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ InviteByQrBottomSheet s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e67(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.s0 = inviteByQrBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e67 e67 = new e67(this.s0, continuation);
        e67.Z = obj;
        return e67;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Y
            e5f r2 = defpackage.e5f.a
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r3 = r9.s0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r4) goto L_0x0019
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r0 = r9.X
            java.lang.Object r9 = r9.Z
            sx3 r9 = (defpackage.sx3) r9
            defpackage.od2.a0(r10)     // Catch:{ all -> 0x0017 }
            goto L_0x0057
        L_0x0017:
            r10 = move-exception
            goto L_0x0076
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0021:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Z
            sx3 r10 = (defpackage.sx3) r10
            bc7[] r1 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.G0     // Catch:{ all -> 0x0074 }
            je7 r1 = r3.D0     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0074 }
            h67 r1 = (defpackage.h67) r1     // Catch:{ all -> 0x0074 }
            r9.Z = r10     // Catch:{ all -> 0x0074 }
            r9.X = r3     // Catch:{ all -> 0x0074 }
            r9.Y = r4     // Catch:{ all -> 0x0074 }
            je7 r5 = r1.Y     // Catch:{ all -> 0x0074 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0074 }
            kke r5 = (defpackage.kke) r5     // Catch:{ all -> 0x0074 }
            w9a r5 = (defpackage.w9a) r5     // Catch:{ all -> 0x0074 }
            nx3 r5 = r5.b()     // Catch:{ all -> 0x0074 }
            g67 r6 = new g67     // Catch:{ all -> 0x0074 }
            r7 = 0
            r6.<init>(r1, r7)     // Catch:{ all -> 0x0074 }
            java.lang.Object r9 = defpackage.j47.t0(r5, r6, r9)     // Catch:{ all -> 0x0074 }
            if (r9 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r0 = r3
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0057:
            android.net.Uri r10 = (android.net.Uri) r10     // Catch:{ all -> 0x0017 }
            if (r10 != 0) goto L_0x005c
            return r2
        L_0x005c:
            khe r1 = r0.F0     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0017 }
            cn3 r1 = (defpackage.cn3) r1     // Catch:{ all -> 0x0017 }
            android.content.Context r5 = r0.getContext()     // Catch:{ all -> 0x0017 }
            r1.a(r5, r10)     // Catch:{ all -> 0x0017 }
            r0.s0(r4)     // Catch:{ all -> 0x0017 }
            r0 = r2
            goto L_0x007b
        L_0x0070:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0076
        L_0x0074:
            r9 = move-exception
            goto L_0x0070
        L_0x0076:
            njc r0 = new njc
            r0.<init>(r10)
        L_0x007b:
            java.lang.Throwable r10 = defpackage.pjc.a(r0)
            if (r10 == 0) goto L_0x0099
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = "shareQrCode: failed to share qr code"
            defpackage.hm9.p(r9, r0, r10)
            je7 r9 = r3.B0
            java.lang.Object r9 = r9.getValue()
            wha r9 = (defpackage.wha) r9
            r9.i()
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e67.o(java.lang.Object):java.lang.Object");
    }
}

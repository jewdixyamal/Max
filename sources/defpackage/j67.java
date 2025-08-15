package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;

/* renamed from: j67  reason: default package */
public final class j67 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ InviteFriendsToMaxBottomSheet Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j67(InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Z = inviteFriendsToMaxBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j67 j67 = new j67(this.Z, continuation);
        j67.Y = obj;
        return j67;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 0
            r3 = 1
            one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet r4 = r8.Z
            if (r1 == 0) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r8 = r8.Y
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x0015 }
            goto L_0x008b
        L_0x0015:
            r9 = move-exception
            goto L_0x0094
        L_0x0018:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0020:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            sx3 r9 = (defpackage.sx3) r9
            android.content.Context r9 = r4.getContext()
            je7 r1 = r4.z0
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            ne7 r5 = r1.g
            java.lang.String r6 = "invite-long"
            java.lang.String r5 = r5.getString(r6, r2)
            if (r5 == 0) goto L_0x0041
            r9 = r5
            goto L_0x0057
        L_0x0041:
            int r5 = defpackage.dpc.C
            java.lang.String r9 = r9.getString(r5)
            java.lang.String r1 = r1.p()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r9 = java.lang.String.format(r9, r1)
        L_0x0057:
            android.content.Context r1 = r4.getContext()
            java.lang.String r5 = r9.toString()
            defpackage.tpa.o(r1, r5)
            je7 r1 = r4.B0     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0092 }
            h67 r1 = (defpackage.h67) r1     // Catch:{ all -> 0x0092 }
            r8.Y = r9     // Catch:{ all -> 0x0092 }
            r8.X = r3     // Catch:{ all -> 0x0092 }
            je7 r5 = r1.Y     // Catch:{ all -> 0x0092 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0092 }
            kke r5 = (defpackage.kke) r5     // Catch:{ all -> 0x0092 }
            w9a r5 = (defpackage.w9a) r5     // Catch:{ all -> 0x0092 }
            nx3 r5 = r5.b()     // Catch:{ all -> 0x0092 }
            g67 r6 = new g67     // Catch:{ all -> 0x0092 }
            r6.<init>(r1, r2)     // Catch:{ all -> 0x0092 }
            java.lang.Object r8 = defpackage.j47.t0(r5, r6, r8)     // Catch:{ all -> 0x0092 }
            if (r8 != r0) goto L_0x0088
            return r0
        L_0x0088:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x008b:
            android.net.Uri r9 = (android.net.Uri) r9     // Catch:{ all -> 0x0015 }
            goto L_0x009a
        L_0x008e:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0094
        L_0x0092:
            r8 = move-exception
            goto L_0x008e
        L_0x0094:
            njc r0 = new njc
            r0.<init>(r9)
            r9 = r0
        L_0x009a:
            boolean r0 = r9 instanceof defpackage.njc
            if (r0 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = r9
        L_0x00a0:
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r9 = defpackage.o37.a
            android.content.Context r9 = r4.getContext()
            defpackage.o37.d(r9, r8, r2)
            je7 r8 = r4.A0
            java.lang.Object r8 = r8.getValue()
            l67 r8 = (defpackage.l67) r8
            java.lang.String r9 = "clicked_to_invite"
            java.lang.String r0 = "main"
            java.lang.String r1 = "trigger_max"
            r8.a(r9, r0, r1)
            je7 r8 = r4.y0
            java.lang.Object r8 = r8.getValue()
            q33 r8 = (defpackage.q33) r8
            hyc r8 = (defpackage.hyc) r8
            java.lang.String r9 = "app.already.invited.friends"
            r8.j(r9, r3)
            r4.s0(r3)
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j67.o(java.lang.Object):java.lang.Object");
    }
}

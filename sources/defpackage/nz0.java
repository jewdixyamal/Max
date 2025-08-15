package defpackage;

import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: nz0  reason: default package */
public final /* synthetic */ class nz0 implements ParticipantStatesManager.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ um1 b;

    public /* synthetic */ nz0(um1 um1, int i) {
        this.a = i;
        this.b = um1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        r4 = r4.getMe();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onParticipantStateChanged(ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager r4, ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.StateChangedEvent r5) {
        /*
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            um1 r3 = r3.b
            cra r3 = (defpackage.cra) r3
            r3.d()
            return
        L_0x000d:
            um1 r3 = r3.b
            yz0 r3 = (defpackage.yz0) r3
            fw3 r4 = r3.d()
            ru.ok.android.externcalls.sdk.Conversation r4 = r4.a()
            r0 = 0
            if (r4 == 0) goto L_0x0027
            ru.ok.android.externcalls.sdk.ConversationParticipant r4 = r4.getMe()
            if (r4 == 0) goto L_0x0027
            ru.ok.android.externcalls.sdk.id.ParticipantId r4 = r4.getExternalId()
            goto L_0x0028
        L_0x0027:
            r4 = r0
        L_0x0028:
            java.util.Collection r5 = r5.getChanges()
            java.util.Iterator r5 = r5.iterator()
        L_0x0030:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0048
            java.lang.Object r1 = r5.next()
            r2 = r1
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange r2 = (ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.ParticipantStateChange) r2
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getParticipantId()
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 == 0) goto L_0x0030
            r0 = r1
        L_0x0048:
            ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$ParticipantStateChange r0 = (ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.ParticipantStateChange) r0
            if (r0 == 0) goto L_0x0065
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.x0
            boolean r5 = r0.isOn()
            r5 = r5 ^ 1
            boolean r0 = r0.isOn()
            boolean r4 = r4.compareAndSet(r5, r0)
            if (r4 == 0) goto L_0x0065
            kld r3 = r3.C0
            ta r4 = defpackage.ta.a
            r3.g(r4)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz0.onParticipantStateChanged(ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager, ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager$StateChangedEvent):void");
    }
}

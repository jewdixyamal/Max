package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: cra  reason: default package */
public final class cra implements oqa, um1 {
    public final je7 X;
    public final je7 Y;
    public final khe Z = new khe(new zj7(24, this));
    public final jr1 a;
    public final so1 b;
    public final ld1 c;
    public final je7 o;
    public final AtomicReference s0;
    public final kld t0;
    public vxd u0;
    public vxd v0;
    public final w7c w0;

    public cra(je7 je7, je7 je72, jr1 jr1, so1 so1, ld1 ld1, je7 je73, je7 je74) {
        this.a = jr1;
        this.b = so1;
        this.c = ld1;
        this.o = je7;
        this.X = je74;
        this.Y = je72;
        AtomicReference atomicReference = new AtomicReference(new pqa(fqa.c));
        this.s0 = atomicReference;
        kld a2 = lld.a(1, 1, 2);
        this.t0 = a2;
        ((os1) je73.getValue()).d(this);
        this.w0 = od2.X(new uqa(od2.x(new uqa(new m58(new t03(od2.d0(a2, new y03(3, (Continuation) null, 6)), 11), 20), this, 1)), this, 2), jr1, wld.b, atomicReference.get());
    }

    public final void b() {
        Conversation a2 = ((fw3) this.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = a2 != null ? a2.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.removeHandListener((ParticipantStatesManager.Listener) this.Z.getValue());
        }
        vxd vxd = this.u0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.u0 = null;
        vxd vxd2 = this.v0;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        this.v0 = null;
        if (this.s0.get() != null) {
            e(new pqa(c()));
        }
    }

    public final fqa c() {
        return ((pqa) this.s0.get()).a;
    }

    public final void d() {
        this.t0.g(((fw3) this.o.getValue()).a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x0011, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.pqa r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.s0
            java.lang.Object r0 = r2.get()
        L_0x0006:
            boolean r1 = r2.compareAndSet(r0, r3)
            if (r1 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0006
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cra.e(pqa):void");
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        b();
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        d();
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        b();
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            d();
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void onParticipantsAdded(List list) {
        d();
    }

    public final void onParticipantsChanged(List list) {
        d();
    }

    public final void onParticipantsRemoved(List list) {
        d();
    }

    public final void onParticipantsUpdated(Collection collection) {
        d();
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        d();
    }
}

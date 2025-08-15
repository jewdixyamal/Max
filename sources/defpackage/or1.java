package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* renamed from: or1  reason: default package */
public final class or1 implements um1 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ wr1 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 o;

    public or1(wr1 wr1, je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = wr1;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
    }

    public final void onCallAccepted() {
        Object value;
        d04 j;
        super.onCallAccepted();
        ((lkc) this.b.getValue()).c();
        ((a11) ((z01) this.c.getValue())).a(CallsAudioManager.State.CONVERSATION);
        wr1 wr1 = this.a;
        q0e q0e = wr1.H;
        do {
            value = q0e.getValue();
            d04 d04 = (d04) value;
            j = wr1.j();
            if (!j.f) {
                wr1.B(true);
            }
        } while (!q0e.c(value, d04.a(j, (j1e) null, System.currentTimeMillis(), (String) null, (String) null, false, false, false, (u8b) null, (i95) null, 1021)));
        if (wr1.k().f) {
            for (zl1 onCallAccepted : wr1.G) {
                onCallAccepted.onCallAccepted();
            }
            ((hl1) this.o.getValue()).getClass();
            hl1.d((Context) this.X.getValue());
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        wr1.b(this.a, conversationEndInfo.getReason());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        wr1 wr1 = this.a;
        i95 i95 = wr1.j().j;
        if (!(i95 instanceof c95) && !(i95 instanceof b95) && !(i95 instanceof d95)) {
            wr1.b(wr1, conversationDestroyedInfo.getReason());
        }
        wr1.z();
        for (zl1 i : wr1.G) {
            i.i();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        Object value;
        Object value2;
        wr1 wr1 = this.a;
        j1e j1e = wr1.j().a;
        if (j1e != null) {
            boolean z = j1e instanceof ym1;
            q0e q0e = wr1.H;
            if (z) {
                do {
                    value2 = q0e.getValue();
                    d04 d04 = (d04) value2;
                } while (!q0e.c(value2, d04.a(wr1.j(), new ym1(str, ((ym1) j1e).e), 0, (String) null, str, false, false, false, (u8b) null, (i95) null, 1014)));
                return;
            }
            do {
                value = q0e.getValue();
                d04 d042 = (d04) value;
            } while (!q0e.c(value, d04.a(wr1.j(), (j1e) null, 0, (String) null, str, false, false, false, (u8b) null, (i95) null, 1015)));
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        Object value;
        d04 j;
        boolean z2 = z;
        super.onMeInWaitingRoomChanged(z);
        hm9.m("CallEngineTag", "me waiting room changed: isMeInWaitingRoom=" + z2, new Object[0]);
        wr1 wr1 = this.a;
        q0e q0e = wr1.H;
        do {
            value = q0e.getValue();
            d04 d04 = (d04) value;
            j = wr1.j();
        } while (!q0e.c(value, z2 ? d04.a(j, (j1e) null, 0, (String) null, (String) null, false, false, false, (u8b) null, h95.b, 511) : d04.a(j, (j1e) null, 0, (String) null, (String) null, false, false, false, (u8b) null, f95.b, 511)));
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        String str;
        boolean isFirstConnection = connectedInfo.isFirstConnection();
        wr1 wr1 = this.a;
        wr1.B(isFirstConnection);
        if (!connectedInfo.isFirstConnection() && (str = wr1.j().c) != null) {
            bt1 m = wr1.m();
            boolean z = wr1.j().h;
            m.getClass();
            bt1.c(m, "BAD_CONNECTION_ALERT", str, "RECONNECT", (Long) null, (String) null, (String) null, z, 56);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        wr1 wr1 = this.a;
        q0e q0e = wr1.H;
        do {
            value = q0e.getValue();
            d04 d04 = (d04) value;
        } while (!q0e.c(value, d04.a(wr1.j(), (j1e) null, 0, (String) null, (String) null, false, false, false, (u8b) null, g95.b, 511)));
        if (!wr1.j().h) {
            lkc u = wr1.u();
            u.getClass();
            u.c = kkc.CONNECTING;
            xh1 a2 = u.a();
            if (((Boolean) a2.f.getValue()).booleanValue()) {
                a2.a(a2.b.d, true);
            }
        }
    }

    public final void onParticipantsAdded(List list) {
        wr1.c(this.a);
    }

    public final void onParticipantsChanged(List list) {
        wr1.c(this.a);
    }

    public final void onParticipantsRemoved(List list) {
        wr1.c(this.a);
    }

    public final void onParticipantsUpdated(Collection collection) {
        wr1.c(this.a);
    }
}

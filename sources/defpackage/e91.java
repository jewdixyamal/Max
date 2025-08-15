package defpackage;

import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: e91  reason: default package */
public final class e91 extends pnf implements um1 {
    public final kr1 X;
    public final os1 Y;
    public final bn1 Z;
    public final boolean b;
    public final long c;
    public final b31 o;
    public final z01 s0;
    public final q0e t0;
    public final q0e u0;

    public e91(boolean z, long j, String str, String str2, b31 b31, kr1 kr1, os1 os1, ida ida, bn1 bn1, z01 z01) {
        boolean z2 = z;
        String str3 = str2;
        os1 os12 = os1;
        bn1 bn12 = bn1;
        this.b = z2;
        this.c = j;
        this.o = b31;
        this.X = kr1;
        this.Y = os12;
        this.Z = bn12;
        this.s0 = z01;
        q0e a = r0e.a(new a91(new m31((Long) null, (CharSequence) str, new md0(oag.a(fca.a(str, ida), Long.valueOf(j)), str3 != null ? new String(Base64.decode(str3, 0), StandardCharsets.UTF_8) : null), false, 9), z2, bn12.c(z2)));
        this.t0 = a;
        this.u0 = a;
        os12.d(this);
        j47.T(this.a, (lx3) null, (vx3) null, new d91(this, (Continuation) null), 3);
    }

    public final void onCallAccepted() {
        q0e q0e;
        Object value;
        super.onCallAccepted();
        do {
            q0e = this.t0;
            value = q0e.getValue();
            c91 c91 = (c91) value;
        } while (!q0e.c(value, new b91(true)));
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        q0e q0e;
        Object value;
        do {
            q0e = this.t0;
            value = q0e.getValue();
            c91 c91 = (c91) value;
        } while (!q0e.c(value, new b91(false)));
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        q0e q0e;
        Object value;
        do {
            q0e = this.t0;
            value = q0e.getValue();
            c91 c91 = (c91) value;
        } while (!q0e.c(value, new b91(true)));
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void q() {
        q0e q0e;
        Object value;
        ((wr1) this.X).e();
        MicrophoneManager c2 = ((a11) this.s0).c();
        if (c2 != null) {
            c2.setMicEnabled(true);
        }
        je1.c.P1().b(":call-active?place=".concat(""), (Bundle) null);
        do {
            q0e = this.t0;
            value = q0e.getValue();
            c91 c91 = (c91) value;
        } while (!q0e.c(value, new b91(true)));
    }
}

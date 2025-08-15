package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;

/* renamed from: z51  reason: default package */
public final class z51 implements um1 {
    public final /* synthetic */ iab a;

    public z51(iab iab) {
        this.a = iab;
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (!connectedInfo.isFirstConnection()) {
            ((fab) this.a).n(f51.c);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        ((fab) this.a).n(g51.c);
    }
}

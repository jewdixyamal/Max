package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;

/* renamed from: um1  reason: default package */
public interface um1 extends ConversationEventsListener, qm1, MediaConnectionListener {
    void a(String str) {
    }

    void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
    }

    void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}

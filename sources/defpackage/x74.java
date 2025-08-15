package defpackage;

import android.media.AudioRouting;

/* renamed from: x74  reason: default package */
public final /* synthetic */ class x74 implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ y74 a;

    public /* synthetic */ x74(y74 y74) {
        this.a = y74;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.a.b(audioRouting);
    }
}

package defpackage;

import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* renamed from: kpb  reason: default package */
public final class kpb implements ProximityTracker {
    public final je7 a;

    public kpb(je7 je7) {
        this.a = je7;
    }

    public final boolean getCanUseSpeaker() {
        je7 je7 = this.a;
        return ((jpb) je7.getValue()).f != null && !((jpb) je7.getValue()).e;
    }

    public final void startTrackingProximity() {
        ((jpb) this.a.getValue()).a();
    }

    public final void stopTrackingProximity() {
        ((jpb) this.a.getValue()).b();
    }
}

package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: re4  reason: default package */
public final class re4 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ cf4 a;

    public re4(cf4 cf4) {
        this.a = cf4;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        cf4 cf4 = this.a;
        zma zma = cf4.j;
        cf4.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        cf4 cf4 = this.a;
        zma zma = cf4.j;
        cf4.g();
    }
}

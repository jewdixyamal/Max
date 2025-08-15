package defpackage;

import android.os.Parcel;

/* renamed from: yjg  reason: default package */
public abstract class yjg extends idg implements ekg {
    public yjg() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    public final boolean I0(Parcel parcel, int i) {
        if (i == 1) {
            zfg.c(parcel);
            h((ejg) zfg.a(parcel, ejg.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            b0();
        }
        return true;
    }
}

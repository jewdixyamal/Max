package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xgg  reason: default package */
public final class xgg extends idg {
    public final /* synthetic */ int d;
    public final /* synthetic */ qne e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xgg(int i, qne qne) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 5);
        this.d = i;
        switch (i) {
            case 1:
                this.e = qne;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 5);
                return;
            default:
                this.e = qne;
                return;
        }
    }

    public final boolean I0(Parcel parcel, int i) {
        switch (this.d) {
            case 0:
                if (i != 1) {
                    return false;
                }
                zfg.c(parcel);
                mqd.G(((rr7) zfg.a(parcel, rr7.CREATOR)).a, new mq9(12), this.e);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                zfg.c(parcel);
                mqd.G((Status) zfg.a(parcel, Status.CREATOR), (Location) zfg.a(parcel, Location.CREATOR), this.e);
                return true;
        }
    }
}

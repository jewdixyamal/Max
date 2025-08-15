package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: ahg  reason: default package */
public final class ahg extends idg implements tkg {
    public static final /* synthetic */ int e = 0;
    public final td d;

    public ahg(td tdVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.d = tdVar;
    }

    public final boolean I0(Parcel parcel, int i) {
        td tdVar = this.d;
        if (i == 1) {
            zfg.c(parcel);
            tdVar.x().b(new wmc((LocationResult) zfg.a(parcel, LocationResult.CREATOR), false));
        } else if (i == 2) {
            zfg.c(parcel);
            tdVar.x().b(new u5e((LocationAvailability) zfg.a(parcel, LocationAvailability.CREATOR)));
        } else if (i != 3) {
            return false;
        } else {
            u();
        }
        return true;
    }

    public final void u() {
        this.d.x().b(new w5e(this));
    }
}

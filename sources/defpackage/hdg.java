package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: hdg  reason: default package */
public final class hdg implements neg {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ moa d;

    public hdg(moa moa, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = moa;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    public final int a() {
        return 0;
    }

    public final void b() {
        b9b b9b = (b9b) this.d.a;
        Activity activity = this.a;
        Bundle bundle = this.c;
        b9b.getClass();
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) this.b.getParcelable("MapOptions");
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            yig yig = (yig) b9b.c;
            oy9 oy9 = new oy9(activity);
            Parcel G0 = yig.G0();
            agg.c(G0, oy9);
            agg.b(G0, googleMapOptions);
            agg.b(G0, bundle2);
            yig.H0(G0, 2);
            ngg.N(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}

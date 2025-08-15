package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.fragment.app.a;

/* renamed from: qdg  reason: default package */
public final class qdg implements neg {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ moa b;

    public qdg(moa moa, Bundle bundle) {
        this.b = moa;
        this.a = bundle;
    }

    public final int a() {
        return 1;
    }

    public final void b() {
        b9b b9b = (b9b) this.b.a;
        Bundle bundle = this.a;
        b9b.getClass();
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            Bundle bundle3 = ((a) b9b.b).Z;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                ngg.O(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            yig yig = (yig) b9b.c;
            Parcel G0 = yig.G0();
            agg.b(G0, bundle2);
            yig.H0(G0, 3);
            ngg.N(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}

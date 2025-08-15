package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: seg  reason: default package */
public final class seg extends a {
    public final ooe K0;

    public seg(Context context, Looper looper, kad kad, ooe ooe, ge6 ge6, he6 he6) {
        super(context, looper, 270, kad, ge6, he6);
        this.K0 = ooe;
    }

    public final int g() {
        return 203400000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof oeg ? (oeg) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    public final pe5[] m() {
        return dy7.l;
    }

    public final Bundle n() {
        ooe ooe = this.K0;
        ooe.getClass();
        Bundle bundle = new Bundle();
        String str = ooe.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean r() {
        return true;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* renamed from: xjg  reason: default package */
public final class xjg extends a {
    public final v70 K0;

    /* JADX WARNING: type inference failed for: r8v1, types: [cjg, java.lang.Object] */
    public xjg(Context context, Looper looper, kad kad, v70 v70, ge6 ge6, he6 he6) {
        super(context, looper, 68, kad, ge6, he6);
        v70 = v70 == null ? v70.o : v70;
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        obj.a = v70.a;
        obj.b = Boolean.valueOf(v70.b);
        obj.c = v70.c;
        byte[] bArr = new byte[16];
        yfg.a.nextBytes(bArr);
        obj.c = Base64.encodeToString(bArr, 11);
        this.K0 = new v70(obj);
    }

    public final int g() {
        return 12800000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof skg ? (skg) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 4);
    }

    public final Bundle n() {
        v70 v70 = this.K0;
        v70.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", v70.a);
        bundle.putBoolean("force_save_dialog", v70.b);
        bundle.putString("log_session_id", v70.c);
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

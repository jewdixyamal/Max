package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: big  reason: default package */
public final class big extends a {
    public final GoogleSignInOptions K0;

    /* JADX WARNING: type inference failed for: r8v3, types: [s04, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [s04, java.lang.Object] */
    public big(Context context, Looper looper, kad kad, GoogleSignInOptions googleSignInOptions, ge6 ge6, he6 he6) {
        super(context, looper, 91, kad, ge6, he6);
        s04 s04;
        if (googleSignInOptions != null) {
            ? obj = new Object();
            obj.d = new HashSet();
            obj.h = new HashMap();
            obj.d = new HashSet(googleSignInOptions.b);
            obj.a = googleSignInOptions.X;
            obj.b = googleSignInOptions.Y;
            obj.c = googleSignInOptions.o;
            obj.e = googleSignInOptions.Z;
            obj.f = googleSignInOptions.c;
            obj.g = googleSignInOptions.s0;
            obj.h = GoogleSignInOptions.c(googleSignInOptions.t0);
            obj.i = googleSignInOptions.u0;
            s04 = obj;
        } else {
            ? obj2 = new Object();
            obj2.d = new HashSet();
            obj2.h = new HashMap();
            s04 = obj2;
        }
        byte[] bArr = new byte[16];
        yfg.a.nextBytes(bArr);
        s04.i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = (Set) kad.c;
        if (!set.isEmpty()) {
            for (Scope add : set) {
                HashSet hashSet = (HashSet) s04.d;
                hashSet.add(add);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.K0 = s04.b();
    }

    public final int g() {
        return 12451000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof wkg ? (wkg) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 4);
    }

    public final String p() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}

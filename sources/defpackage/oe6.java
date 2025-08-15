package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: oe6  reason: default package */
public final class oe6 {
    public static void a(Context context, pr7 pr7) {
        int i = or7.a;
        de6 de6 = new de6(context, reg.w0, (nk) nk.d, ce6.c);
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest();
        ay7.U(100);
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        qr7 qr7 = new qr7(arrayList, false, false);
        er0 er0 = new er0();
        er0.c = true;
        er0.d = new frf(qr7);
        er0.b = 2426;
        ukg c = de6.c(0, er0.a());
        c.i(new ne6(pr7));
        Objects.requireNonNull(pr7);
        c.c(xne.a, new ne6(pr7));
    }
}

package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: vm1  reason: default package */
public final class vm1 {
    public final qz7 a;
    public final xje b;
    public final crd c;
    public final fd7 d;
    public final imc e;
    public final a8g f;
    public final die g;
    public final sm1 h;
    public final ax i;
    public final n61 j;
    public volatile boolean k;
    public final c11 l;
    public final q7 m;

    /* JADX WARNING: type inference failed for: r5v1, types: [crd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [die, java.lang.Object] */
    public vm1(Context context, qz7 qz7, wte wte, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, a4c a4c, vx0 vx0, hw3 hw3) {
        qz7 qz72 = qz7;
        wte wte2 = wte;
        ConnectivityManager connectivityManager2 = connectivityManager;
        TelephonyManager telephonyManager2 = telephonyManager;
        a4c a4c2 = a4c;
        this.a = qz72;
        xje xje = new xje(1, (Object) vx0);
        this.b = xje;
        ? obj = new Object();
        this.c = obj;
        fd7 fd7 = new fd7(hw3);
        this.d = fd7;
        imc imc = new imc(connectivityManager2, telephonyManager2, false, 27);
        this.e = imc;
        this.f = new a8g(qz7, connectivityManager2, telephonyManager2, a4c2);
        ? obj2 = new Object();
        obj2.a = qz72;
        obj2.b = connectivityManager2;
        obj2.c = telephonyManager2;
        obj2.o = new Object();
        this.g = obj2;
        this.h = new sm1(qz7, a4c, xje, obj, fd7, imc, wte);
        ax axVar = new ax();
        this.i = axVar;
        CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) qz72.c;
        n61 n61 = new n61(callAnalyticsSender, wte2);
        this.j = n61;
        Context context2 = context;
        this.l = new c11(callAnalyticsSender, new o23(context, a4c2, wte2), wte2);
        this.m = new q7(n61, wte2);
        sd7 sd7 = (sd7) axVar.c;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        axVar.c = qy9.k(MultiFileUploader.UPLOAD_NEXT_INTERVAL, MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, muc.b()).p(new y7f(2, axVar));
    }
}

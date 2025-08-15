package defpackage;

import android.content.Context;

/* renamed from: reg  reason: default package */
public final class reg extends de6 implements noe {
    public static final qz7 v0 = new qz7("ClientTelemetry.API", (z04) new ddg(2), (pq9) new Object());
    public static final qz7 w0 = new qz7("LocationServices.API", (z04) new ddg(4), (pq9) new Object());
    public static final qz7 x0 = new qz7("SmsRetriever.API", (z04) new ddg(3), (pq9) new Object());
    public static int y0 = 1;

    public ukg d(moe moe) {
        er0 er0 = new er0();
        er0.b = 0;
        er0.e = new pe5[]{dy7.k};
        er0.c = false;
        er0.d = new ece(moe);
        return c(2, er0.a());
    }

    public synchronized int e() {
        try {
            if (y0 == 1) {
                Context context = this.a;
                ee6 ee6 = ee6.d;
                int b = ee6.b(context, 12451000);
                if (b == 0) {
                    y0 = 4;
                } else if (ee6.a(b, context, (String) null) != null || lu4.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    y0 = 2;
                } else {
                    y0 = 3;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return y0;
    }
}

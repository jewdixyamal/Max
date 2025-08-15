package defpackage;

import android.content.Context;
import javax.net.ssl.SSLException;

/* renamed from: axd  reason: default package */
public final class axd implements zwd {
    public final String a = axd.class.getName().concat("(DEF_SSL)");
    public final Context b;
    public final bxd c;
    public final ey1 d;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, bxd] */
    public axd(Context context) {
        this.b = context.getApplicationContext();
        ? obj = new Object();
        this.c = obj;
        this.d = new ey1(29, obj);
    }

    public final pud a(String str) {
        String str2 = this.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str2, zr6.i("createSocketFactory, host=", str, " ->"), (Throwable) null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            pud pud = new pud(this.b, str);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            bxd bxd = this.c;
            if (currentTimeMillis2 >= 0) {
                bxd.a = currentTimeMillis2;
                bxd.b += currentTimeMillis2;
                bxd.c++;
            } else {
                bxd.getClass();
            }
            String str3 = this.a;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, str3, ey8.i(currentTimeMillis2, "<- createSocketFactory, took=", "ms"), (Throwable) null);
            }
            return pud;
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException("Failed to create socket factory", th);
        }
    }
}

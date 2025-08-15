package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: tke  reason: default package */
public final class tke implements x7d {
    public static final /* synthetic */ int j = 0;
    public final ri4 a;
    public final o45 b;
    public volatile boolean c;
    public final boolean d;
    public final je7 e;
    public volatile String f;
    public volatile List g;
    public final String h;
    public u2a i;

    public tke(ri4 ri4, o45 o45, y7d y7d, khe khe) {
        this.a = ri4;
        this.b = o45;
        qyc qyc = (qyc) y7d;
        qyc.getClass();
        this.d = v44.a((int) qyc.q(PmsKey.f28debugmode, (long) 0)) != v44.DISABLED;
        this.e = khe;
        f(mqd.a(qyc.w(PmsKey.proxy, (String) null)));
        List h2 = qyc.h(PmsKey.f102proxydomains.name(), nz4.a);
        synchronized (this) {
            this.g = h2;
        }
        StringBuilder sb = new StringBuilder("OKMessages/");
        sb.append(ri4.h().b);
        sb.append(" (");
        sb.append(ri4.h().e);
        sb.append("; ");
        sb.append(ri4.h().h);
        sb.append("; ");
        String l = zr6.l(sb, ri4.h().i, ")");
        try {
            this.h = URLEncoder.encode(l, Charset.defaultCharset().name());
        } catch (UnsupportedEncodingException unused) {
            this.h = l;
        }
    }

    public static void c(tke tke, od3 od3, boolean z) {
        int i2 = 80;
        if (!oag.t(tke.f)) {
            od3.h(tke.f);
            if (z) {
                i2 = 443;
            }
            od3.k(i2);
            return;
        }
        tke.b.a(new IllegalStateException("proxy is null or empty!"));
        if (z) {
            i2 = 443;
        }
        od3.k(i2);
    }

    public final void a(String str, String str2) {
        f(str2);
    }

    public final void b(List list, List list2) {
        synchronized (this) {
            this.g = list2;
        }
    }

    public final boolean d(String str) {
        if (oag.t(str)) {
            return false;
        }
        for (String str2 : this.g) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public final u2a e() {
        if (this.i == null) {
            t2a t2a = new t2a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            t2a.y = naf.b(timeUnit);
            t2a.z = naf.b(timeUnit);
            a8g a8g = new a8g(7);
            a8g.a = (ExecutorService) this.e.getValue();
            t2a.a = a8g;
            t2a.x = naf.b(timeUnit);
            t2a.c.add(new ske(this, 1));
            ske ske = new ske(this, 0);
            ArrayList arrayList = t2a.d;
            arrayList.add(ske);
            if (!this.d) {
                this.a.e();
            } else {
                arrayList.add(new ur0(1, "tke"));
            }
            this.i = new u2a(t2a);
        }
        return this.i;
    }

    public final synchronized void f(String str) {
        this.c = !oag.t(str);
        this.f = str;
    }
}

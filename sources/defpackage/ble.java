package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpGet;

/* renamed from: ble  reason: default package */
public final class ble extends mr0 {
    public final je7 n;
    public u2a o;
    public ExecutorService p;

    public ble(je7 je7) {
        this.n = je7;
    }

    public final HashMap D(hf5 hf5, int i) {
        w2a w2a = (w2a) hf5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(w2a.e - w2a.d));
        hashMap.put("fetch_time", Long.toString(w2a.f - w2a.e));
        hashMap.put("total_time", Long.toString(w2a.f - w2a.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public final void P(hf5 hf5) {
        ((w2a) hf5).f = SystemClock.elapsedRealtime();
    }

    public final void c0(w2a w2a, h7b h7b, mhc mhc) {
        u2a u2a = this.o;
        je7 je7 = this.n;
        if (u2a == null) {
            this.o = (u2a) je7.getValue();
        }
        u2a u2a2 = this.o;
        if (this.p == null) {
            this.p = ((u2a) je7.getValue()).a.h();
        }
        b8c b = u2a2.b(mhc);
        ((oj0) w2a.b).a(new xq6(this, b, false, 3));
        b.e(new m5d(this, w2a, h7b, mhc, 15));
    }

    public final hf5 n(fi0 fi0, eab eab) {
        return new hf5(fi0, eab);
    }

    public final void t(hf5 hf5, h7b h7b) {
        h7b h7b2 = h7b;
        w2a w2a = (w2a) hf5;
        w2a.d = SystemClock.elapsedRealtime();
        Uri uri = ((oj0) w2a.b).a.b;
        try {
            l84 l84 = new l84();
            String jw0 = new jw0(false, true, -1, -1, false, false, false, -1, -1, false, false, false, (String) null).toString();
            if (jw0.length() == 0) {
                ((bj6) l84.c).g("Cache-Control");
            } else {
                ((bj6) l84.c).h("Cache-Control", jw0);
            }
            l84.S(uri.toString());
            ((bj6) l84.c).a("Accept", "image/webp,/;q=0.8");
            l84.G(HttpGet.METHOD_NAME, (tfg) null);
            l84.Q(UUID.randomUUID().toString());
            c0(w2a, h7b2, l84.r());
        } catch (Exception e) {
            h7b2.d(e);
        }
    }
}

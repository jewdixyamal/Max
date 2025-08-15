package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: db4  reason: default package */
public final class db4 implements fn6 {
    public final /* synthetic */ hb4 a;

    public db4(hb4 hb4) {
        this.a = hb4;
    }

    public final void b() {
        this.a.c.remove(this);
    }

    public final boolean e(Uri uri, wn7 wn7, boolean z) {
        HashMap hashMap;
        fb4 fb4;
        hb4 hb4 = this.a;
        if (((pm6) hb4.z0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = maf.a;
            List list = ((xm6) hb4.y0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = hb4.b;
                if (i2 >= size) {
                    break;
                }
                fb4 fb42 = (fb4) hashMap.get(((vm6) list.get(i2)).a);
                if (fb42 != null && elapsedRealtime < fb42.s0) {
                    i3++;
                }
                i2++;
            }
            ty4 ty4 = new ty4(1, 0, ((xm6) hb4.y0).e.size(), i3, 1);
            ((buc) hb4.u0).getClass();
            b11 u = buc.u(ty4, wn7);
            if (!(u == null || u.b != 2 || (fb4 = (fb4) hashMap.get(uri)) == null)) {
                fb4.a(fb4, u.c);
            }
        }
        return false;
    }
}

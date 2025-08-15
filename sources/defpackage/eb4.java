package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: eb4  reason: default package */
public final class eb4 implements gn6 {
    public final /* synthetic */ hb4 a;

    public eb4(hb4 hb4) {
        this.a = hb4;
    }

    public final void b() {
        this.a.c.remove(this);
    }

    public final boolean c(Uri uri, wn7 wn7, boolean z) {
        HashMap hashMap;
        gb4 gb4;
        hb4 hb4 = this.a;
        if (((qm6) hb4.z0) == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = oaf.a;
            List list = ((ym6) hb4.y0).e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                hashMap = hb4.b;
                if (i2 >= size) {
                    break;
                }
                gb4 gb42 = (gb4) hashMap.get(((wm6) list.get(i2)).a);
                if (gb42 != null && elapsedRealtime < gb42.s0) {
                    i3++;
                }
                i2++;
            }
            ty4 ty4 = new ty4(1, 0, ((ym6) hb4.y0).e.size(), i3, 2);
            ((huc) hb4.u0).getClass();
            b11 o = huc.o(ty4, wn7);
            if (!(o == null || o.b != 2 || (gb4 = (gb4) hashMap.get(uri)) == null)) {
                gb4.a(gb4, o.c);
            }
        }
        return false;
    }
}

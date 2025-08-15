package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: y4d  reason: default package */
public final class y4d {
    public final LinkedHashMap a = new LinkedHashMap();

    public y4d(w4d w4d, o67 o67, p94 p94) {
        xq9 xq9 = xq9.a;
        nx3 nx3 = o67.a;
        nx3.plus(xq9);
        uh uhVar = new uh(w4d, 25, xlc.a(0, "SELECT * FROM selected_mentions"));
        mn5 x = od2.x(od2.F(new mqc(new cy3((ilc) w4d.b, new String[]{"selected_mentions"}, uhVar, (Continuation) null)), nx3));
        nx3 nx32 = p94.a;
        od2.L(new zn5(od2.F(x, nx32), new x4d(this, (Continuation) null), 5), j1e.a(nx32));
    }

    public final int a(long j) {
        int i;
        v4d v4d = (v4d) this.a.get(Long.valueOf(j));
        if (v4d == null || (i = v4d.b) == 0) {
            return 1;
        }
        return i;
    }
}

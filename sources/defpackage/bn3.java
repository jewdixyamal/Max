package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bn3  reason: default package */
public final class bn3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public bn3(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public final void a(ym3 ym3, long[] jArr, long j) {
        ((el3) this.b.getValue()).s(ym3.c(), jArr);
        List c2 = ym3.c();
        xs xsVar = new xs(0);
        Iterator it = ((ArrayList) c2).iterator();
        while (it.hasNext()) {
            xsVar.add(Long.valueOf(((wm3) it.next()).a));
        }
        for (long valueOf : jArr) {
            xsVar.add(Long.valueOf(valueOf));
        }
        if (!xsVar.isEmpty()) {
            ((r47) this.c.getValue()).a(xsVar);
            ((av0) this.a.getValue()).c(new ps3(j, xsVar));
        }
    }
}

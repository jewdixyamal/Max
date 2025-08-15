package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zfc  reason: default package */
public final class zfc {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public zfc(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public static void a(zfc zfc, long j) {
        e52 e52;
        p82 p82 = (p82) zfc.a.getValue();
        p82.getClass();
        hm9.m("p82", "removeChatInternal, chatId = " + j, new Object[0]);
        e52 C = p82.C(j);
        e52 e522 = null;
        if (C == null) {
            e52 = null;
        } else {
            k92 k92 = C.b;
            long j2 = k92.a;
            ((sna) p82.v.get()).getClass();
            sna.a(j2);
            i92 i92 = (C.I() || !C.T()) ? i92.X : i92.c;
            ((s8g) p82.w.get()).a(new j8d(j, k92.k, true));
            e52 = p82.h(j, false, new f9(p82, 18, i92));
        }
        if (e52 != null) {
            p82.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), true));
            List singletonList = Collections.singletonList(Long.valueOf(j));
            o82 o82 = p82.G;
            if (o82 != null) {
                o82.b(singletonList);
            }
            je7 je7 = p82.C;
            if (je7.getValue() != null) {
                long j3 = e52.b.a;
                zb2 zb2 = (zb2) ((ta2) je7.getValue());
                zb2.getClass();
                j47.T(zb2.Z, (lx3) null, (vx3) null, new mb2(zb2, j3, (Continuation) null), 3);
            }
            e522 = e52;
        }
        if (e522 != null) {
            ((rs9) zfc.d.getValue()).getClass();
            rs9.a(e522, (cea) zfc.c.getValue());
        }
    }
}

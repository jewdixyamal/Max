package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zu8  reason: default package */
public final class zu8 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public zu8(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
    }

    public static es8 a(zu8 zu8, cu8 cu8) {
        zu8 zu82 = zu8;
        cu8 cu82 = cu8;
        zu8.getClass();
        cu8 cu83 = cu82.C0;
        bw8 bw8 = cu83 != null ? new bw8(cu82.A0, cu82.B0, a(zu82, cu83), cu82.D0, cu82.E0, cu82.J0, cu82.K0) : null;
        cu8 cu84 = cu82.L0;
        return new es8(cu8, ((el3) zu82.a.getValue()).i(cu82.Y, true), bw8, cu84 != null ? a(zu82, cu84) : null, ((t6b) zu82.b.getValue()).c(cu82), (sw8) zu82.c.getValue(), (zx8) zu82.d.getValue(), (lr2) zu82.e.getValue(), 0);
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (cu8) it.next()));
        }
        return arrayList2;
    }
}

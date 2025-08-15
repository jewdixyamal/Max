package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: sma  reason: default package */
public final class sma implements ol7 {
    public static final sma o = new sma(nz4.a, 0, 1);
    public final int a;
    public final int b;
    public final List c;

    public sma(List list, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        sma sma = (sma) obj;
        if (this.a != sma.a || this.b != sma.b) {
            return false;
        }
        List list = this.c;
        int size = list.size();
        List list2 = sma.c;
        if (size != list2.size()) {
            return false;
        }
        ArrayList J0 = x53.J0(list, list2);
        if (!J0.isEmpty()) {
            Iterator it = J0.iterator();
            while (it.hasNext()) {
                kpa kpa = (kpa) it.next();
                if (!tpa.f((kb1) kpa.a, (kb1) kpa.b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final boolean h(ol7 ol7) {
        sma sma = (sma) ol7;
        return sma.b == this.b && sma.a == this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ey8.g(this.b, this.a * 31, 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        sma sma = (sma) ((ol7) obj);
        return equals(sma) ? nz4.a : Collections.singletonList(new rma(sma));
    }

    public final boolean t(Object obj) {
        ol7 ol7 = (ol7) obj;
        sma sma = (sma) ol7;
        return ol7.equals(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentsPageState(pagePosition=");
        sb.append(this.a);
        sb.append(", pageType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SCREEN_SHARING" : "DEFAULT");
        sb.append(", opponents=");
        return au1.i(sb, this.c, ")");
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bn8  reason: default package */
public class bn8 extends ci9 {
    public final rqc l = new rqc();

    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            nqc nqc = (nqc) it;
            if (nqc.hasNext()) {
                ((an8) ((Map.Entry) nqc.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            nqc nqc = (nqc) it;
            if (nqc.hasNext()) {
                an8 an8 = (an8) ((Map.Entry) nqc.next()).getValue();
                an8.a.j(an8);
            } else {
                return;
            }
        }
    }

    public void l(xm7 xm7, g2a g2a) {
        if (xm7 != null) {
            an8 an8 = new an8(xm7, g2a);
            an8 an82 = (an8) this.l.b(xm7, an8);
            if (an82 != null && an82.b != g2a) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (an82 == null && this.c > 0) {
                an8.b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}

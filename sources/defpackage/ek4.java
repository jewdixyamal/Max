package defpackage;

import java.util.Iterator;

/* renamed from: ek4  reason: default package */
public class ek4 extends sh4 {
    public int m;

    public ek4(r5g r5g) {
        super(r5g);
        if (r5g instanceof eo6) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                oh4 oh4 = (oh4) it.next();
                oh4.a(oh4);
            }
        }
    }
}

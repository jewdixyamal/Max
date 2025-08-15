package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: xw1  reason: default package */
public final /* synthetic */ class xw1 implements sw1 {
    public final /* synthetic */ yw1 b;

    public /* synthetic */ xw1(yw1 yw1) {
        this.b = yw1;
    }

    public final List a(List list) {
        String d = this.b.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw1 yw1 = (yw1) it.next();
            c54.k(yw1 instanceof yw1);
            if (yw1.d().equals(d)) {
                return Collections.singletonList(yw1);
            }
        }
        throw new IllegalStateException(zr6.i("Unable to find camera with id ", d, " from list of available cameras."));
    }
}

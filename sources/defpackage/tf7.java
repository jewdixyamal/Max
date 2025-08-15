package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: tf7  reason: default package */
public final class tf7 implements sw1 {
    public final int b;

    public tf7(int i) {
        this.b = i;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw1 yw1 = (yw1) it.next();
            c54.j("The camera info doesn't contain internal implementation.", yw1 instanceof yw1);
            if (yw1.g() == this.b) {
                arrayList.add(yw1);
            }
        }
        return arrayList;
    }
}

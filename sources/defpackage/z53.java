package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: z53  reason: default package */
public abstract class z53 extends y53 {
    public static int S(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList T(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d63.V((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}

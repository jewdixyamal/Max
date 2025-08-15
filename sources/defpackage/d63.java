package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

/* renamed from: d63  reason: default package */
public abstract class d63 extends c63 {
    public static void V(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static void W(AbstractList abstractList, c6d c6d) {
        for (Object add : c6d) {
            abstractList.add(add);
        }
    }

    public static void X(AbstractList abstractList, Object[] objArr) {
        abstractList.addAll(Arrays.asList(objArr));
    }

    public static void Y(ArrayList arrayList, m56 m56) {
        int L;
        int L2 = y53.L(arrayList);
        int i = 0;
        if (L2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) m56.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == L2) {
                    break;
                }
                i++;
            }
            i = i2;
        }
        if (i < arrayList.size() && i <= (L = y53.L(arrayList))) {
            while (true) {
                arrayList.remove(L);
                if (L != i) {
                    L--;
                } else {
                    return;
                }
            }
        }
    }

    public static void Z(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            arrayList.remove(y53.L(arrayList));
            return;
        }
        throw new NoSuchElementException("List is empty.");
    }
}

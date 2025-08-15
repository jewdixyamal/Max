package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: px1  reason: default package */
public final class px1 {
    public static final px1 b;
    public static final px1 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new tf7(0));
        b = new px1(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new tf7(1));
        c = new px1(linkedHashSet2);
    }

    public px1(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((sw1) it.next()).a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            sw1 sw1 = (sw1) it.next();
            if (sw1 instanceof tf7) {
                Integer valueOf = Integer.valueOf(((tf7) sw1).b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final ax1 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((ax1) it.next()).p());
        }
        List a2 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ax1 ax1 = (ax1) it2.next();
            if (a2.contains(ax1.p())) {
                linkedHashSet2.add(ax1);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (ax1) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}

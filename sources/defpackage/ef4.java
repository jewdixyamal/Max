package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ef4  reason: default package */
public final class ef4 {
    public final String a;
    public final wd6 b;

    public ef4(Set set, wd6 wd6) {
        this.a = b(set);
        this.b = wd6;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            va0 va0 = (va0) it.next();
            sb.append(va0.a);
            sb.append('/');
            sb.append(va0.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        wd6 wd6 = this.b;
        synchronized (((HashSet) wd6.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) wd6.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) wd6.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) wd6.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}

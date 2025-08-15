package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: tc9  reason: default package */
public final class tc9 {
    public final long a;
    public final List b;

    public /* synthetic */ tc9(long j, AbstractCollection abstractCollection) {
        this.a = j;
        this.b = (List) abstractCollection;
    }

    public CharSequence a() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s5g s5g = (s5g) obj;
            if ((s5g instanceof v5g) && ((v5g) s5g).c) {
                break;
            }
        }
        v5g v5g = obj instanceof v5g ? (v5g) obj : null;
        if (v5g != null) {
            return v5g.a;
        }
        return null;
    }
}

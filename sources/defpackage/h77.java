package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.u;

/* renamed from: h77  reason: default package */
public final class h77 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ i77 b;

    public h77(i77 i77, Iterator it) {
        this.b = i77;
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        Object next = this.a.next();
        ((u) this.b.c).getClass();
        return u.a(next);
    }
}

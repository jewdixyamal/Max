package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: tm7  reason: default package */
public final class tm7 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final w56 b;

    public tm7(w56 w56, List list) {
        list.getClass();
        this.a = list;
        this.b = w56;
    }

    public final ListIterator listIterator(int i) {
        return new rm7(this, this.a.listIterator(i), 1);
    }

    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    public final int size() {
        return this.a.size();
    }
}

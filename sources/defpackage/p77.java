package defpackage;

import java.util.NoSuchElementException;

/* renamed from: p77  reason: default package */
public final class p77 extends m5f {
    public static final Object c = new Object();
    public Object b;

    public final boolean hasNext() {
        return this.b != c;
    }

    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}

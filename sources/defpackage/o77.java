package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o77  reason: default package */
public enum o77 implements Iterator {
    ;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}

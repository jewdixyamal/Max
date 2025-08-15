package defpackage;

import java.util.NoSuchElementException;

/* renamed from: cl0  reason: default package */
public final class cl0 {
    public final va8[] a;

    public cl0(va8[] va8Arr) {
        this.a = va8Arr;
    }

    public final Object a(sk0 sk0) {
        for (va8 va8 : this.a) {
            if (va8.c == sk0) {
                Object obj = va8.b;
                if (!(obj instanceof jl)) {
                    return obj;
                }
                return null;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}

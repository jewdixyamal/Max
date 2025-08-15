package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: s55  reason: default package */
public final class s55 implements Enumeration {
    public final Enumeration a;

    public s55(t55 t55) {
        this.a = Collections.enumeration(t55.a);
    }

    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}

package defpackage;

import java.util.AbstractMap;

/* renamed from: lx6  reason: default package */
public final class lx6 extends zw6 {
    public final /* synthetic */ mx6 c;

    public lx6(mx6 mx6) {
        this.c = mx6;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        mx6 mx6 = this.c;
        return new AbstractMap.SimpleImmutableEntry(mx6.o.X.a().get(i), mx6.o.Y.get(i));
    }

    public final int size() {
        return this.c.o.Y.size();
    }
}

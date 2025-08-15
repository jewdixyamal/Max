package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: gfc  reason: default package */
public final class gfc extends zw6 {
    public final /* synthetic */ hfc c;

    public gfc(hfc hfc) {
        this.c = hfc;
    }

    public final boolean f() {
        return true;
    }

    public final Object get(int i) {
        hfc hfc = this.c;
        z04.k(i, hfc.Z);
        int i2 = i * 2;
        int i3 = hfc.Y;
        Object[] objArr = hfc.X;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.c.Z;
    }
}

package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: og9  reason: default package */
public final class og9 implements jde, Serializable {
    public final int a;

    public og9(int i) {
        wmd.i(i, "expectedValuesPerKey");
        this.a = i;
    }

    public final Object get() {
        return new ArrayList(this.a);
    }
}

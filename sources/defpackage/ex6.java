package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: ex6  reason: default package */
public final class ex6 extends AbstractMap {
    public final uaf[] a;

    public ex6(uaf[] uafArr) {
        this.a = uafArr;
    }

    public final Set entrySet() {
        return new ps(this.a);
    }
}

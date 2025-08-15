package defpackage;

import java.util.Arrays;

/* renamed from: ldg  reason: default package */
public final class ldg {
    public final zk a;
    public final pe5 b;

    public /* synthetic */ ldg(zk zkVar, pe5 pe5) {
        this.a = zkVar;
        this.b = pe5;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ldg)) {
            ldg ldg = (ldg) obj;
            return s36.l(this.a, ldg.a) && s36.l(this.b, ldg.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(this.a, "key");
        qz7.h(this.b, "feature");
        return qz7.toString();
    }
}

package defpackage;

import java.util.Arrays;

/* renamed from: zk  reason: default package */
public final class zk {
    public final int a;
    public final qz7 b;
    public final nk c;
    public final String d;

    public zk(qz7 qz7, nk nkVar, String str) {
        this.b = qz7;
        this.c = nkVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qz7, nkVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return s36.l(this.b, zkVar.b) && s36.l(this.c, zkVar.c) && s36.l(this.d, zkVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}

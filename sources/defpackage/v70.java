package defpackage;

import java.util.Arrays;

/* renamed from: v70  reason: default package */
public final class v70 implements nk {
    public static final v70 o;
    public final String a;
    public final boolean b;
    public final String c;

    /* JADX WARNING: type inference failed for: r0v0, types: [cjg, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        o = new v70(obj);
    }

    public v70(cjg cjg) {
        this.a = (String) cjg.a;
        this.b = ((Boolean) cjg.b).booleanValue();
        this.c = (String) cjg.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70 = (v70) obj;
        return s36.l(this.a, v70.a) && this.b == v70.b && s36.l(this.c, v70.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }
}

package defpackage;

/* renamed from: x27  reason: default package */
public final class x27 {
    public static final x27 c = new x27(0, (yq0) null, 3);
    public static final x27 d = new x27(3, new yq0(3, 3, false));
    public final int a;
    public final yq0 b;

    public x27(int i, yq0 yq0) {
        this.a = i;
        this.b = yq0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27 = (x27) obj;
        int i = x27.a;
        int i2 = this.a;
        if (i2 != 0 ? i != 0 && i2 == i : i == 0) {
            return tpa.f(this.b, x27.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = this.a;
        int s = (i2 == 0 ? 0 : au1.s(i2)) * 31;
        yq0 yq0 = this.b;
        if (yq0 != null) {
            i = yq0.hashCode();
        }
        return s + i;
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 0) {
            str = "null";
        } else {
            str = "TopInsetConfig(persistentType=" + ey8.o(i) + ")";
        }
        StringBuilder m = au1.m("InsetsConfig(topConfig=", str, ", bottomConfig=");
        m.append(this.b);
        m.append(")");
        return m.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x27(int i, yq0 yq0, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : yq0);
    }
}

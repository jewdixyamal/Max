package defpackage;

import java.util.List;

/* renamed from: uw1  reason: default package */
public final class uw1 extends ww1 {
    public final String a;
    public final List b;

    public uw1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw1)) {
            return false;
        }
        uw1 uw1 = (uw1) obj;
        return tpa.f(this.a, uw1.a) && tpa.f(this.b, uw1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Front(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}

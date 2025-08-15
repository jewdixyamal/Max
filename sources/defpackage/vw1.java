package defpackage;

import java.util.List;

/* renamed from: vw1  reason: default package */
public final class vw1 extends ww1 {
    public final String a;
    public final List b;

    public vw1(String str, List list) {
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
        if (!(obj instanceof vw1)) {
            return false;
        }
        vw1 vw1 = (vw1) obj;
        return tpa.f(this.a, vw1.a) && tpa.f(this.b, vw1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}

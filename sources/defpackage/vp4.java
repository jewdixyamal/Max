package defpackage;

/* renamed from: vp4  reason: default package */
public final class vp4 {
    public final kp4 a;
    public final kp4 b;

    public vp4(kp4 kp4, kp4 kp42) {
        this.a = kp4;
        this.b = kp42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp4)) {
            return false;
        }
        vp4 vp4 = (vp4) obj;
        return tpa.f(this.a, vp4.a) && tpa.f(this.b, vp4.b);
    }

    public final int hashCode() {
        int i = 0;
        kp4 kp4 = this.a;
        int hashCode = (kp4 == null ? 0 : kp4.hashCode()) * 31;
        kp4 kp42 = this.b;
        if (kp42 != null) {
            i = kp42.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftsNews(chats=" + this.a + ", users=" + this.b + ")";
    }
}

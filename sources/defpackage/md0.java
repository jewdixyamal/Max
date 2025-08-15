package defpackage;

/* renamed from: md0  reason: default package */
public final class md0 {
    public final uc0 a;
    public final String b;

    public md0(uc0 uc0, String str) {
        this.a = uc0;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md0)) {
            return false;
        }
        md0 md0 = (md0) obj;
        return tpa.f(this.a, md0.a) && tpa.f(this.b, md0.b);
    }

    public final int hashCode() {
        int i = 0;
        uc0 uc0 = this.a;
        int hashCode = (uc0 == null ? 0 : uc0.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}

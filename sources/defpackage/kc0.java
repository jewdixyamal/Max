package defpackage;

/* renamed from: kc0  reason: default package */
public final class kc0 {
    public final String a;
    public final int b;
    public final ha0 c;

    public kc0(String str, int i, ha0 ha0) {
        this.a = str;
        this.b = i;
        this.c = ha0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0 = (kc0) obj;
        if (this.a.equals(kc0.a) && this.b == kc0.b) {
            ha0 ha0 = kc0.c;
            ha0 ha02 = this.c;
            if (ha02 == null) {
                if (ha0 == null) {
                    return true;
                }
            } else if (ha02.equals(ha0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        ha0 ha0 = this.c;
        return (ha0 == null ? 0 : ha0.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleVideoProfile=" + this.c + "}";
    }
}

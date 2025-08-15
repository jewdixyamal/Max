package defpackage;

import java.util.Set;

/* renamed from: jz5  reason: default package */
public final class jz5 implements nz5 {
    public final Long a;
    public final Set b;
    public final Long c;
    public final boolean d;
    public final zy5 e;

    public jz5(Long l, Set set, Long l2, boolean z, zy5 zy5, int i) {
        set = (i & 2) != 0 ? null : set;
        l2 = (i & 4) != 0 ? null : l2;
        z = (i & 8) != 0 ? false : z;
        zy5 = (i & 16) != 0 ? null : zy5;
        this.a = l;
        this.b = set;
        this.c = l2;
        this.d = z;
        this.e = zy5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz5)) {
            return false;
        }
        jz5 jz5 = (jz5) obj;
        return tpa.f(this.a, jz5.a) && tpa.f(this.b, jz5.b) && tpa.f(this.c, jz5.c) && this.d == jz5.d && tpa.f(this.e, jz5.e);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Long l2 = this.c;
        int d2 = ms2.d((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d);
        zy5 zy5 = this.e;
        if (zy5 != null) {
            i = zy5.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", fwdMsgIds=" + this.b + ", fwdAttachId=" + this.c + ", isForwardAttach=" + this.d + ", inAppReviewData=" + this.e + ")";
    }
}

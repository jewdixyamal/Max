package defpackage;

import java.util.Set;

/* renamed from: zy8  reason: default package */
public final class zy8 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final bz8 d;
    public final dz8 e;

    public zy8(Set set, Long l, boolean z, bz8 bz8, dz8 dz8) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = bz8;
        this.e = dz8;
    }

    public final cz5 a() {
        bz8 bz8 = this.d;
        return new cz5(this.a, this.b, this.c, bz8 != null ? bz8.a : null, this.e.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        zy8 zy8 = (zy8) obj;
        return tpa.f(this.a, zy8.a) && tpa.f(this.b, zy8.b) && this.c == zy8.c && tpa.f(this.d, zy8.d) && tpa.f(this.e, zy8.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        Long l = this.b;
        int d2 = ms2.d((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        bz8 bz8 = this.d;
        if (bz8 != null) {
            i = bz8.hashCode();
        }
        return this.e.hashCode() + ((d2 + i) * 31);
    }

    public final String toString() {
        return "ForwardMessagesData(messageIds=" + this.a + ", fwdAttachId=" + this.b + ", isForwardAttach=" + this.c + ", inputData=" + this.d + ", quoteData=" + this.e + ")";
    }
}

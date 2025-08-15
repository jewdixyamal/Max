package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: nb1  reason: default package */
public final class nb1 {
    public final md0 a;
    public final m38 b;
    public final m38 c;
    public final boolean d;
    public final jqe e;
    public final List f;
    public final jqe g;

    public nb1(md0 md0, m38 m38, m38 m382, boolean z, jqe jqe, List list, jqe jqe2) {
        this.a = md0;
        this.b = m38;
        this.c = m382;
        this.d = z;
        this.e = jqe;
        this.f = list;
        this.g = jqe2;
    }

    public static nb1 a(nb1 nb1, md0 md0, m38 m38, m38 m382, boolean z, jqe jqe, ArrayList arrayList, jqe jqe2, int i) {
        nb1 nb12 = nb1;
        md0 md02 = (i & 1) != 0 ? nb12.a : md0;
        m38 m383 = (i & 2) != 0 ? nb12.b : m38;
        m38 m384 = (i & 4) != 0 ? nb12.c : m382;
        boolean z2 = (i & 8) != 0 ? nb12.d : z;
        jqe jqe3 = (i & 16) != 0 ? nb12.e : jqe;
        List list = (i & 32) != 0 ? nb12.f : arrayList;
        jqe jqe4 = (i & 64) != 0 ? nb12.g : jqe2;
        nb1.getClass();
        return new nb1(md02, m383, m384, z2, jqe3, list, jqe4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1 = (nb1) obj;
        return tpa.f(this.a, nb1.a) && this.b == nb1.b && this.c == nb1.c && this.d == nb1.d && tpa.f(this.e, nb1.e) && tpa.f(this.f, nb1.f) && tpa.f(this.g, nb1.g);
    }

    public final int hashCode() {
        int i = 0;
        md0 md0 = this.a;
        int f2 = k7d.f(ms2.d((this.c.hashCode() + ((this.b.hashCode() + ((md0 == null ? 0 : md0.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (f2 + (list == null ? 0 : list.hashCode())) * 31;
        jqe jqe = this.g;
        if (jqe != null) {
            i = jqe.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserPreviewState(avatar=" + this.a + ", microphoneState=" + this.b + ", videoState=" + this.c + ", isFrontCamera=" + this.d + ", title=" + this.e + ", avatarInfo=" + this.f + ", participantsTitle=" + this.g + ")";
    }
}

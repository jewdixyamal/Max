package defpackage;

import java.util.List;

/* renamed from: rc1  reason: default package */
public final class rc1 {
    public static final List j = y53.M(fc1.a, hc1.a, ic1.a);
    public static final rc1 k = new rc1((String) null, (uc0) null, (CharSequence) null, new oc1(new iqe("")), new eqe(t7a.k), nz4.a, (mc1) null, true, (Long) null);
    public final String a;
    public final uc0 b;
    public final CharSequence c;
    public final qc1 d;
    public final jqe e;
    public final List f;
    public final mc1 g;
    public final boolean h;
    public final Long i;

    public rc1(String str, uc0 uc0, CharSequence charSequence, qc1 qc1, jqe jqe, List list, mc1 mc1, boolean z, Long l) {
        this.a = str;
        this.b = uc0;
        this.c = charSequence;
        this.d = qc1;
        this.e = jqe;
        this.f = list;
        this.g = mc1;
        this.h = z;
        this.i = l;
    }

    public static rc1 a(rc1 rc1, uc0 uc0, String str, qc1 qc1, jqe jqe, List list, mc1 mc1, boolean z, Long l, int i2) {
        rc1 rc12 = rc1;
        int i3 = i2;
        String str2 = rc12.a;
        uc0 uc02 = (i3 & 2) != 0 ? rc12.b : uc0;
        CharSequence charSequence = (i3 & 4) != 0 ? rc12.c : str;
        qc1 qc12 = (i3 & 8) != 0 ? rc12.d : qc1;
        jqe jqe2 = (i3 & 16) != 0 ? rc12.e : jqe;
        mc1 mc12 = (i3 & 64) != 0 ? rc12.g : mc1;
        boolean z2 = (i3 & 128) != 0 ? rc12.h : z;
        Long l2 = (i3 & 256) != 0 ? rc12.i : l;
        rc1.getClass();
        return new rc1(str2, uc02, charSequence, qc12, jqe2, list, mc12, z2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc1)) {
            return false;
        }
        rc1 rc1 = (rc1) obj;
        return tpa.f(this.a, rc1.a) && tpa.f(this.b, rc1.b) && tpa.f(this.c, rc1.c) && tpa.f(this.d, rc1.d) && tpa.f(this.e, rc1.e) && tpa.f(this.f, rc1.f) && tpa.f(this.g, rc1.g) && this.h == rc1.h && tpa.f(this.i, rc1.i);
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        uc0 uc0 = this.b;
        int hashCode2 = (hashCode + (uc0 == null ? 0 : uc0.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int g2 = k7d.g(this.f, k7d.f((this.d.hashCode() + ((hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31, 31, this.e), 31);
        mc1 mc1 = this.g;
        int d2 = ms2.d((g2 + (mc1 == null ? 0 : mc1.hashCode())) * 31, 31, this.h);
        Long l = this.i;
        if (l != null) {
            i2 = l.hashCode();
        }
        return d2 + i2;
    }

    public final String toString() {
        return "CallLinkInfo(icon=" + this.a + ", avatarAbbreviationModel=" + this.b + ", callLink=" + this.c + ", linkInfo=" + this.d + ", title=" + this.e + ", action=" + this.f + ", button=" + this.g + ", isNew=" + this.h + ", serverChatId=" + this.i + ")";
    }
}

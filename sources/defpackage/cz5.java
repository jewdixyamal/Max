package defpackage;

import java.util.Set;

/* renamed from: cz5  reason: default package */
public final class cz5 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;

    public cz5(Set set, Long l, boolean z, CharSequence charSequence, boolean z2) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz5)) {
            return false;
        }
        cz5 cz5 = (cz5) obj;
        return tpa.f(this.a, cz5.a) && tpa.f(this.b, cz5.b) && this.c == cz5.c && tpa.f(this.d, cz5.d) && this.e == cz5.e;
    }

    public final int hashCode() {
        int i = 0;
        Set set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Long l = this.b;
        int d2 = ms2.d((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Boolean.hashCode(this.e) + ((d2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardMessagesSendData(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", shouldHideAuthor=");
        return au1.j(sb, this.e, ")");
    }
}

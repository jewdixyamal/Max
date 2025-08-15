package defpackage;

import java.util.Set;

/* renamed from: av5  reason: default package */
public final class av5 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final hy3 d;
    public final Set e;

    public av5(String str, CharSequence charSequence, CharSequence charSequence2, hy3 hy3, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = hy3;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av5)) {
            return false;
        }
        av5 av5 = (av5) obj;
        return tpa.f(this.a, av5.a) && tpa.f(this.b, av5.b) && tpa.f(this.c, av5.c) && tpa.f(this.d, av5.d) && tpa.f(this.e, av5.e);
    }

    public final int hashCode() {
        int f = rh4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + k7d.e(this.d.a, (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + this.b + ", emoji=" + this.c + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}

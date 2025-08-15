package defpackage;

/* renamed from: xt5  reason: default package */
public final class xt5 extends zt5 {
    public final CharSequence a;
    public final boolean b;

    public xt5(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt5)) {
            return false;
        }
        xt5 xt5 = (xt5) obj;
        return tpa.f(this.a, xt5.a) && this.b == xt5.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Creation(name=" + this.a + ", isCreateButtonEnabled=" + this.b + ")";
    }

    public /* synthetic */ xt5() {
        this((CharSequence) null, false);
    }
}

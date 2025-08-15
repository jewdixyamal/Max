package defpackage;

/* renamed from: cxe  reason: default package */
public final class cxe extends s36 {
    public final CharSequence h;

    public cxe(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxe) && tpa.f(this.h, ((cxe) obj).h);
    }

    public final int hashCode() {
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final CharSequence q() {
        return this.h;
    }

    public final String toString() {
        return "LostConnection(text=" + this.h + ")";
    }
}

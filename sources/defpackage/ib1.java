package defpackage;

/* renamed from: ib1  reason: default package */
public final class ib1 implements kb1 {
    public final String a;

    public ib1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib1) && tpa.f(this.a, ((ib1) obj).a);
    }

    public final long getItemId() {
        return 9223372036854775805L;
    }

    public final boolean h(ol7 ol7) {
        return 9223372036854775805L == ol7.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 3;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CallShareLinkPreviewState(link="), this.a, ")");
    }
}

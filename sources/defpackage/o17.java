package defpackage;

/* renamed from: o17  reason: default package */
public final class o17 extends wm9 {
    public final afc b;

    public o17(afc afc) {
        super(e5f.a);
        this.b = afc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o17) && tpa.f(this.b, ((o17) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NeuroAvatarScreen(registrationData=" + this.b + ")";
    }
}

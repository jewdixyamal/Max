package defpackage;

/* renamed from: z9f  reason: default package */
public final class z9f implements ol7 {
    public final jqe a;
    public final uc0 b;
    public final String c;
    public final gg1 o;

    public z9f(iqe iqe, uc0 uc0, String str, gg1 gg1) {
        this.a = iqe;
        this.b = uc0;
        this.c = str;
        this.o = gg1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9f)) {
            return false;
        }
        z9f z9f = (z9f) obj;
        return tpa.f(this.a, z9f.a) && tpa.f(this.b, z9f.b) && tpa.f(this.c, z9f.c) && tpa.f(this.o, z9f.o);
    }

    public final long getItemId() {
        return this.o.a;
    }

    public final int hashCode() {
        return this.o.hashCode() + rh4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final int l() {
        return y7a.U0;
    }

    public final String toString() {
        return "UserInWaitingData(name=" + this.a + ", avatarAbbreviationModel=" + this.b + ", url=" + this.c + ", participantId=" + this.o + ")";
    }
}

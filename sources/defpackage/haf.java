package defpackage;

/* renamed from: haf  reason: default package */
public final class haf {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final llf d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final llf h;

    public haf(long j, boolean z, boolean z2, llf llf, boolean z3, boolean z4, boolean z5, llf llf2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = llf;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = llf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf)) {
            return false;
        }
        haf haf = (haf) obj;
        return this.a == haf.a && this.b == haf.b && this.c == haf.c && tpa.f(this.d, haf.d) && this.e == haf.e && this.f == haf.f && this.g == haf.g && tpa.f(this.h, haf.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ms2.d(ms2.d(ms2.d((this.d.hashCode() + ms2.d(ms2.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "UserVideoState(id=" + this.a + ", isMe=" + this.b + ", isVideoEnabled=" + this.c + ", videoState=" + this.d + ", isConnected=" + this.e + ", isAccepted=" + this.f + ", isScreenCaptureEnabled=" + this.g + ", screenCaptureState=" + this.h + ")";
    }
}

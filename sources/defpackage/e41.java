package defpackage;

/* renamed from: e41  reason: default package */
public final class e41 implements g41 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public e41(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e41)) {
            return false;
        }
        e41 e41 = (e41) obj;
        return tpa.f(this.a, e41.a) && this.b == e41.b && this.c == e41.c && this.d == e41.d && this.e == e41.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(ms2.d(ms2.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", isNewLink=");
        sb.append(this.b);
        sb.append(", isFrontCameraEnabled=");
        sb.append(this.c);
        sb.append(", isVideoEnabled=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        return au1.j(sb, this.e, ")");
    }
}

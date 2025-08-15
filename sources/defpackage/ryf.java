package defpackage;

/* renamed from: ryf  reason: default package */
public final class ryf {
    public static final qyf Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ ryf(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        ju0.I(i, 3, pyf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryf)) {
            return false;
        }
        ryf ryf = (ryf) obj;
        return tpa.f(this.a, ryf.a) && tpa.f(this.b, ryf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppRequestPhoneResponse(requestId=");
        sb.append(this.a);
        sb.append(", phone=");
        return zr6.l(sb, this.b, ")");
    }

    public ryf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

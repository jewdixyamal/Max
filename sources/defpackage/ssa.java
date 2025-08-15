package defpackage;

/* renamed from: ssa  reason: default package */
public final class ssa {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final usa f;
    public final int g;
    public final int h;
    public final String i;

    public ssa(int i2, int i3, int i4, int i5, String str, usa usa, int i6, int i7, String str2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = str;
        this.f = usa;
        this.g = i6;
        this.h = i7;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!ssa.class.equals(obj.getClass())) {
            return false;
        }
        ssa ssa = (ssa) obj;
        if (this.a == ssa.a && this.b == ssa.b && this.c == ssa.c && this.d == ssa.d && this.h == ssa.h && tpa.f(this.i, ssa.i) && tpa.f(this.f, ssa.f) && this.g == ssa.g) {
            return tpa.f(this.e, ssa.e);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31;
        int i3 = 0;
        String str = this.e;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        usa usa = this.f;
        int hashCode2 = (((hashCode + (usa != null ? usa.a.hashCode() : 0)) * 31) + this.g) * 31;
        String str2 = this.i;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeerVideoSettings{maxDimension=");
        sb.append(this.a);
        sb.append(", initialMaxDimension=");
        sb.append(this.b);
        sb.append(", maxBitrateK=");
        sb.append(this.c);
        sb.append(", maxFrameRate=");
        sb.append(this.d);
        sb.append(", temporalLayersCount=");
        sb.append(this.h);
        sb.append(", degradationPreference='");
        sb.append(this.e);
        sb.append("', bitrateTable=");
        sb.append(this.f);
        sb.append(", mediaAdaptationScale=");
        sb.append(this.g);
        sb.append(", source='");
        return zr6.l(sb, this.i, "'}");
    }
}

package defpackage;

/* renamed from: f1f  reason: default package */
public final class f1f {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public f1f(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ty, java.lang.Object] */
    public final ty a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.c = this.b;
        obj.o = this.c;
        obj.b = this.d;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1f)) {
            return false;
        }
        f1f f1f = (f1f) obj;
        return this.a == f1f.a && oaf.a(this.b, f1f.b) && oaf.a(this.c, f1f.c) && this.d == f1f.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return au1.h(sb, this.d, '}');
    }
}

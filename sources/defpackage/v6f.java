package defpackage;

/* renamed from: v6f  reason: default package */
public final class v6f {
    public final d7f a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final q8f g;
    public final p8f h;
    public final long i;

    public v6f(u6f u6f) {
        this.a = u6f.a;
        this.b = u6f.b;
        this.c = u6f.c;
        this.d = u6f.d;
        this.e = u6f.e;
        this.f = u6f.f;
        this.g = u6f.g;
        this.h = u6f.h;
        this.i = u6f.i;
    }

    public final boolean a() {
        return this.g == q8f.UPLOADED && this.h != null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [u6f, java.lang.Object] */
    public final u6f b() {
        ? obj = new Object();
        q8f q8f = q8f.UNKNOWN;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.h = this.h;
        obj.g = this.g;
        obj.f = this.f;
        obj.e = this.e;
        obj.i = this.i;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v6f.class != obj.getClass()) {
            return false;
        }
        v6f v6f = (v6f) obj;
        if (Float.compare(v6f.e, this.e) != 0 || this.f != v6f.f || this.i != v6f.i) {
            return false;
        }
        d7f d7f = v6f.a;
        d7f d7f2 = this.a;
        if (d7f2 == null ? d7f != null : !d7f2.equals(d7f)) {
            return false;
        }
        String str = v6f.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = v6f.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = v6f.d;
        String str6 = this.d;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        if (this.g != v6f.g) {
            return false;
        }
        p8f p8f = v6f.h;
        p8f p8f2 = this.h;
        return p8f2 != null ? p8f2.equals(p8f) : p8f == null;
    }

    public final int hashCode() {
        int i2 = 0;
        d7f d7f = this.a;
        int hashCode = (d7f != null ? d7f.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f2 = this.e;
        int floatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        long j = this.f;
        int i3 = (((hashCode4 + floatToIntBits) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        q8f q8f = this.g;
        int hashCode5 = (i3 + (q8f != null ? q8f.hashCode() : 0)) * 31;
        p8f p8f = this.h;
        if (p8f != null) {
            i2 = p8f.hashCode();
        }
        long j2 = this.i;
        return ((hashCode5 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(this.b);
        sb.append("', fileName='");
        sb.append(this.c);
        sb.append("', uploadUrl='");
        sb.append(this.d);
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", createdTime=");
        return z7b.i(sb, this.i, '}');
    }
}

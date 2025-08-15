package defpackage;

import java.util.Objects;

/* renamed from: iy8  reason: default package */
public final class iy8 {
    public final nw8 a;
    public final String b;
    public final long c;
    public final int d;
    public final ref e;
    public final String f;

    public iy8(hy8 hy8) {
        this.a = hy8.a;
        this.b = hy8.b;
        this.c = hy8.c;
        this.d = hy8.d;
        this.e = hy8.e;
        this.f = hy8.f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hy8, java.lang.Object] */
    public final hy8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.f = this.f;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iy8.class != obj.getClass()) {
            return false;
        }
        iy8 iy8 = (iy8) obj;
        if (this.c != iy8.c) {
            return false;
        }
        nw8 nw8 = iy8.a;
        nw8 nw82 = this.a;
        if (nw82 == null ? nw8 != null : !nw82.equals(nw8)) {
            return false;
        }
        String str = iy8.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.d != iy8.d || !Objects.equals(this.f, iy8.f)) {
            return false;
        }
        ref ref = iy8.e;
        ref ref2 = this.e;
        return ref2 != null ? ref2.equals(ref) : ref == null;
    }

    public final int hashCode() {
        int i = 0;
        nw8 nw8 = this.a;
        int hashCode = (nw8 != null ? nw8.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = this.d;
        int s = (i2 + (i3 != 0 ? au1.s(i3) : 0)) * 31;
        ref ref = this.e;
        int hashCode3 = (s + (ref != null ? ref.hashCode() : 0)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MessageUpload{messageMediaUploadKey=" + this.a + ", path='" + this.b + "', attachLocalId='" + this.f + "', lastModified=" + this.c + ", uploadType=" + h4f.t(this.d) + ", videoConvertOptions=" + this.e + '}';
    }
}

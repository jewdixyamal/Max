package defpackage;

import java.util.Arrays;

/* renamed from: vne  reason: default package */
public final class vne {
    public final long a;
    public final iua b;
    public final goe c;
    public final int d;
    public final long e;
    public final int f;
    public final byte[] g;
    public final long h;

    public vne(long j, iua iua, goe goe, int i, long j2, int i2, byte[] bArr, long j3) {
        this.a = j;
        this.b = iua;
        this.c = goe;
        this.d = i;
        this.e = j2;
        this.f = i2;
        this.g = bArr;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vne)) {
            return false;
        }
        vne vne = (vne) obj;
        return this.a == vne.a && this.b == vne.b && this.c == vne.c && this.d == vne.d && this.e == vne.e && this.f == vne.f && tpa.f(this.g, vne.g) && this.h == vne.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int e2 = k7d.e(this.f, h4f.m(k7d.e(this.d, (hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31), 31, this.e), 31);
        return Long.hashCode(this.h) + ((Arrays.hashCode(this.g) + e2) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("TaskEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", failsCount=");
        sb.append(this.d);
        sb.append(", dependsRequestId=");
        sb.append(this.e);
        sb.append(", dependencyType=");
        sb.append(this.f);
        sb.append(", data=");
        sb.append(arrays);
        sb.append(", createdTime=");
        return zr6.k(sb, this.h, ")");
    }
}

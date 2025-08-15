package defpackage;

/* renamed from: ep3  reason: default package */
public final class ep3 {
    public static final /* synthetic */ int e = 0;
    public final long a;
    public final long b;
    public final er7 c;
    public final String d;

    static {
        er7 er7 = er7.Z;
        qy qyVar = new qy(er7);
        if (((er7) qyVar.X) == null) {
            qyVar.X = er7;
        }
        new ep3(qyVar);
    }

    public ep3(qy qyVar) {
        this.a = qyVar.b;
        this.b = qyVar.c;
        this.c = (er7) qyVar.X;
        this.d = (String) qyVar.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ep3.class != obj.getClass()) {
            return false;
        }
        ep3 ep3 = (ep3) obj;
        if (this.a != ep3.a || this.b != ep3.b) {
            return false;
        }
        er7 er7 = ep3.c;
        er7 er72 = this.c;
        if (er72 == null ? er7 != null : !er72.equals(er7)) {
            return false;
        }
        String str = ep3.d;
        String str2 = this.d;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        int i2 = 0;
        er7 er7 = this.c;
        int hashCode = (i + (er7 != null ? er7.hashCode() : 0)) * 31;
        String str = this.d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactLocation{contactServerId=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(nu0.G(Long.valueOf(this.b)));
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", deviceId='");
        return zr6.l(sb, this.d, "'}");
    }
}

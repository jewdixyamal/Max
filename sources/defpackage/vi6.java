package defpackage;

/* renamed from: vi6  reason: default package */
public final class vi6 {
    public static final aw0 d = oq9.j(":");
    public static final aw0 e = oq9.j(":status");
    public static final aw0 f = oq9.j(":method");
    public static final aw0 g = oq9.j(":path");
    public static final aw0 h = oq9.j(":scheme");
    public static final aw0 i = oq9.j(":authority");
    public final int a;
    public final aw0 b;
    public final aw0 c;

    public vi6(aw0 aw0, aw0 aw02) {
        this.b = aw0;
        this.c = aw02;
        this.a = aw02.c() + aw0.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi6)) {
            return false;
        }
        vi6 vi6 = (vi6) obj;
        return tpa.f(this.b, vi6.b) && tpa.f(this.c, vi6.c);
    }

    public final int hashCode() {
        int i2 = 0;
        aw0 aw0 = this.b;
        int hashCode = (aw0 != null ? aw0.hashCode() : 0) * 31;
        aw0 aw02 = this.c;
        if (aw02 != null) {
            i2 = aw02.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return this.b.j() + ": " + this.c.j();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vi6(defpackage.aw0 r3, java.lang.String r4) {
        /*
            r2 = this;
            aw0 r0 = new aw0
            java.nio.charset.Charset r1 = defpackage.a52.a
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.b = r4
            r2.<init>((defpackage.aw0) r3, (defpackage.aw0) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi6.<init>(aw0, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vi6(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            aw0 r0 = new aw0
            java.nio.charset.Charset r1 = defpackage.a52.a
            byte[] r1 = r3.getBytes(r1)
            r0.<init>(r1)
            r0.b = r3
            aw0 r3 = new aw0
            java.nio.charset.Charset r1 = defpackage.a52.a
            byte[] r1 = r4.getBytes(r1)
            r3.<init>(r1)
            r3.b = r4
            r2.<init>((defpackage.aw0) r0, (defpackage.aw0) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi6.<init>(java.lang.String, java.lang.String):void");
    }
}

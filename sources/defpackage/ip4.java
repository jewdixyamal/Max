package defpackage;

/* renamed from: ip4  reason: default package */
public final class ip4 extends gle {
    public long c;

    public ip4(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        if (str.equals("time")) {
            this.c = lz7.M(gy8, 0);
        } else {
            gy8.z();
        }
    }

    public final String toString() {
        return ey8.i(this.c, "Response{time=", "}");
    }
}

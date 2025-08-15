package defpackage;

/* renamed from: i4e  reason: default package */
public final class i4e extends gle {
    public String c;

    public i4e(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        if (str.equals("url")) {
            this.c = gy8.z0();
        } else {
            gy8.z();
        }
    }

    public final String toString() {
        return zr6.i("{url='", this.c, "'}");
    }
}

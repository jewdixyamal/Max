package defpackage;

/* renamed from: cgc  reason: default package */
public final class cgc extends gle {
    public nab c;

    public cgc(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        if (str.equals("profile")) {
            this.c = nd7.C(gy8);
        } else {
            gy8.z();
        }
    }

    public final String toString() {
        nab nab = this.c;
        return "{profile=" + nab + "}";
    }
}

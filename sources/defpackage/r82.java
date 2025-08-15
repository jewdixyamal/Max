package defpackage;

/* renamed from: r82  reason: default package */
public final class r82 extends gle {
    public f52 c;

    public r82(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        if (str.equals("chat")) {
            this.c = f52.a(gy8);
        } else {
            gy8.z();
        }
    }

    public final String toString() {
        f52 f52 = this.c;
        return "{chat=" + f52 + "}";
    }
}

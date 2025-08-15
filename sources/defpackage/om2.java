package defpackage;

/* renamed from: om2  reason: default package */
public final class om2 extends gle {
    public f52 c;

    public om2(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals("chat")) {
            gy8.z();
        } else {
            this.c = f52.a(gy8);
        }
    }

    public final String toString() {
        f52 f52 = this.c;
        return "{chat=" + f52 + "}";
    }
}

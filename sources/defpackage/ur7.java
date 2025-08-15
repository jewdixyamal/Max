package defpackage;

/* renamed from: ur7  reason: default package */
public final class ur7 extends gle {
    public fs8 c;

    public ur7(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals("message")) {
            gy8.z();
        } else {
            this.c = tpa.z(gy8);
        }
    }

    public final String toString() {
        fs8 fs8 = this.c;
        return "{message=" + fs8 + "}";
    }
}

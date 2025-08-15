package defpackage;

/* renamed from: qf9  reason: default package */
public final class qf9 extends gle {
    public wz c;

    public qf9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals("attachments")) {
            gy8.z();
        } else {
            this.c = wz.a(gy8);
        }
    }

    public final String toString() {
        wz wzVar = this.c;
        return "{attaches=" + wzVar + "}";
    }
}

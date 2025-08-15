package defpackage;

/* renamed from: vr9  reason: default package */
public final class vr9 extends gle {
    public wm3 c;

    public final void b(gy8 gy8, String str) {
        if (str.equals("contact")) {
            this.c = wm3.e(gy8);
        } else {
            gy8.z();
        }
    }

    public final String toString() {
        wm3 wm3 = this.c;
        return "{contact=" + wm3 + "}";
    }
}

package defpackage;

import java.util.List;

/* renamed from: lc2  reason: default package */
public final class lc2 extends gle {
    public wm3 X;
    public List c;
    public f52 o;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    c2 = 1;
                    break;
                }
                break;
            case 94623771:
                if (str.equals("chats")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = f52.a(gy8);
                return;
            case 1:
                this.X = wm3.e(gy8);
                return;
            case 2:
                this.c = wz.b(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        o84.Z.getClass();
        Integer valueOf = Integer.valueOf(s5c.o(this.c));
        f52 f52 = this.o;
        wm3 wm3 = this.X;
        return "{chats=" + valueOf + ", chat=" + f52 + ", contact=" + wm3 + "}";
    }
}

package defpackage;

import java.util.ArrayList;

/* renamed from: fk2  reason: default package */
public final class fk2 extends gle {
    public ArrayList c;
    public long o = -1;

    public fk2(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8.w0();
        } else if (!str.equals("members")) {
            gy8.z();
        } else {
            int G = lz7.G(gy8);
            this.c = new ArrayList();
            for (int i = 0; i < G; i++) {
                this.c.add(dk2.a(gy8));
            }
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        long j = this.o;
        return "{members=" + o2 + ", marker=" + j + "}";
    }
}

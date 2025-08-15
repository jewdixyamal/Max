package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s44  reason: default package */
public final class s44 extends gle {
    public fm5 c;
    public List o;

    public s44(gy8 gy8) {
        super(gy8);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("cmd")) {
            String P = lz7.P(gy8);
            fm5 fm5 = fm5.e;
            if (P != null) {
                if (P.equals("SYNC_CONTACTS")) {
                    fm5 = fm5.g;
                } else if (P.equals("SEND_LOG")) {
                    fm5 = fm5.f;
                }
            }
            this.c = fm5;
        } else if (!str.equals("args")) {
            gy8.z();
        } else {
            int G = lz7.G(gy8);
            this.o = new ArrayList(G);
            for (int i = 0; i < G; i++) {
                this.o.add(lz7.P(gy8));
            }
        }
    }

    public final String toString() {
        fm5 fm5 = this.c;
        List list = this.o;
        return "{cmd='" + fm5 + "', args=" + list + "}";
    }
}

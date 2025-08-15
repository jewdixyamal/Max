package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sk2  reason: default package */
public final class sk2 extends gle {
    public List X;
    public f52 c;
    public fs8 o;

    public sk2(gy8 gy8) {
        super(gy8);
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        ArrayList arrayList;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -573649366:
                if (str.equals("deletedMessageIds")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (gy8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s0 = gy8.s0();
                    for (int i = 0; i < s0; i++) {
                        arrayList.add(Long.valueOf(lz7.M(gy8, 0)));
                    }
                } else {
                    gy8.z();
                    arrayList = null;
                }
                this.X = arrayList;
                return;
            case 1:
                this.c = f52.a(gy8);
                return;
            case 2:
                this.o = tpa.z(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        f52 f52 = this.c;
        fs8 fs8 = this.o;
        int o2 = s5c.o(this.X);
        StringBuilder sb = new StringBuilder("{chat=");
        sb.append(f52);
        sb.append(", message=");
        sb.append(fs8);
        sb.append(", deletedMessageIds=");
        return zr6.j(sb, o2, "}");
    }
}

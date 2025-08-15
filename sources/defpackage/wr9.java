package defpackage;

import java.util.ArrayList;

/* renamed from: wr9  reason: default package */
public final class wr9 extends gle {
    public ArrayList X;
    public ArrayList c;
    public ArrayList o;

    public wr9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        ArrayList arrayList = null;
        int i = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -989040443:
                if (str.equals("phones")) {
                    c2 = 0;
                    break;
                }
                break;
            case -930898016:
                if (str.equals("rindex")) {
                    c2 = 1;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
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
                    while (i < s0) {
                        arrayList.add(lz7.P(gy8));
                        i++;
                    }
                } else {
                    gy8.z();
                }
                this.c = arrayList;
                return;
            case 1:
                if (gy8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s02 = gy8.s0();
                    while (i < s02) {
                        arrayList.add(Integer.valueOf(lz7.L(gy8)));
                        i++;
                    }
                } else {
                    gy8.z();
                }
                this.o = arrayList;
                return;
            case 2:
                if (gy8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s03 = gy8.s0();
                    while (i < s03) {
                        arrayList.add(Long.valueOf(lz7.M(gy8, 0)));
                        i++;
                    }
                } else {
                    gy8.z();
                }
                this.X = arrayList;
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        int o3 = s5c.o(this.o);
        return zr6.j(wg0.j("{phones=", o2, ", rindex=", o3, ", ids="), s5c.o(this.X), "}");
    }
}

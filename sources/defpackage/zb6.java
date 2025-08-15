package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zb6  reason: default package */
public final class zb6 extends gle {
    public final /* synthetic */ int c;
    public ArrayList o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zb6(gy8 gy8, int i) {
        super(gy8);
        this.c = i;
        switch (i) {
            case 1:
                super(gy8);
                if (this.o == null) {
                    this.o = new ArrayList();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b(gy8 gy8, String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                if (!str.equals("calls")) {
                    gy8.z();
                    return;
                }
                this.o = new ArrayList();
                int G = lz7.G(gy8);
                for (int i = 0; i < G; i++) {
                    this.o.add(idf.a(gy8));
                }
                return;
            default:
                if (tpa.f(str, "members")) {
                    int G2 = lz7.G(gy8);
                    this.o = new ArrayList();
                    j37 Y = ote.Y(0, G2);
                    ArrayList arrayList = new ArrayList(z53.S(Y, 10));
                    Iterator it = Y.iterator();
                    while (((i37) it).c) {
                        ((i37) it).a();
                        arrayList.add(dk2.a(gy8));
                    }
                    ArrayList arrayList2 = this.o;
                    if (arrayList2 == null) {
                        arrayList2 = null;
                    }
                    arrayList2.addAll(arrayList);
                    return;
                }
                gy8.z();
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = this.o;
                return "Response{calls=" + arrayList + "}";
            default:
                ArrayList arrayList2 = this.o;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                return zr6.i("{members : [", x53.n0(arrayList2, (String) null, (String) null, (String) null, new w8c(25), 31), "]}");
        }
    }
}

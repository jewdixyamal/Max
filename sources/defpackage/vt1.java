package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: vt1  reason: default package */
public final /* synthetic */ class vt1 implements Runnable {
    public final /* synthetic */ o9f X;
    public final /* synthetic */ vb0 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fad o;

    public /* synthetic */ vt1(fu1 fu1, String str, fad fad, o9f o9f, vb0 vb0, List list, int i) {
        this.a = i;
        this.b = fu1;
        this.c = str;
        this.o = fad;
        this.X = o9f;
        this.Y = vb0;
        this.Z = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fu1 fu1 = this.b;
                String str = this.c;
                fad fad = this.o;
                o9f o9f = this.X;
                vb0 vb0 = this.Y;
                List list = this.Z;
                fu1.getClass();
                fu1.toString();
                fu1.a.I(str, fad, o9f, vb0, list);
                fu1.q();
                fu1.D();
                fu1.K();
                if (fu1.S0 == 9) {
                    fu1.B();
                    return;
                }
                return;
            case 1:
                fu1 fu12 = this.b;
                fu12.getClass();
                fu12.toString();
                fu12.a.I(this.c, this.o, this.X, this.Y, this.Z);
                fu12.K();
                return;
            default:
                fu1 fu13 = this.b;
                fu13.getClass();
                fu13.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fu13.a.a;
                String str2 = this.c;
                m9f m9f = (m9f) linkedHashMap.get(str2);
                fad fad2 = this.o;
                o9f o9f2 = this.X;
                vb0 vb02 = this.Y;
                List list2 = this.Z;
                if (m9f == null) {
                    m9f = new m9f(fad2, o9f2, vb02, list2);
                    linkedHashMap.put(str2, m9f);
                }
                m9f.f = true;
                fu13.a.I(str2, fad2, o9f2, vb02, list2);
                fu13.K();
                return;
        }
    }
}

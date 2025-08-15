package defpackage;

import android.content.Context;

/* renamed from: ec3  reason: default package */
public final /* synthetic */ class ec3 implements gpb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ec3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                fc3 fc3 = (fc3) this.b;
                fc3.getClass();
                nb3 nb3 = (nb3) this.c;
                return nb3.f.f(new bg4(nb3, fc3));
            case 1:
                return new nj6((Context) this.b, (String) this.c);
            default:
                fl5 fl5 = (fl5) this.b;
                String c2 = fl5.c();
                zpb zpb = (zpb) fl5.d.a(zpb.class);
                return new h24((Context) this.c, c2);
        }
    }
}

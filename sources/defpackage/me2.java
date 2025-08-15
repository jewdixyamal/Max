package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: me2  reason: default package */
public final /* synthetic */ class me2 implements UnaryOperator {
    public final /* synthetic */ cu8 a;
    public final /* synthetic */ s10 b;
    public final /* synthetic */ l20 c;
    public final /* synthetic */ en4 d;

    public /* synthetic */ me2(cu8 cu8, s10 s10, l20 l20, en4 en4) {
        this.a = cu8;
        this.b = s10;
        this.c = l20;
        this.d = en4;
    }

    public final Object apply(Object obj) {
        ne2 ne2 = (ne2) obj;
        return new ne2(this.a.b, this.b.a, this.c.r, this.d, false);
    }
}

package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: qe2  reason: default package */
public final /* synthetic */ class qe2 implements UnaryOperator {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ en4 d;

    public /* synthetic */ qe2(long j, long j2, String str, en4 en4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = en4;
    }

    public final Object apply(Object obj) {
        ne2 ne2 = (ne2) obj;
        return new ne2(this.a, this.b, this.c, this.d, false);
    }
}

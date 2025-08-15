package defpackage;

import java.util.List;

/* renamed from: qb1  reason: default package */
public final class qb1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5[] b;

    public /* synthetic */ qb1(mn5[] mn5Arr, int i) {
        this.a = i;
        this.b = mn5Arr;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new uj3[this.b.length];
            case 1:
                return new List[this.b.length];
            case 2:
                return new Object[this.b.length];
            case 3:
                return new uj3[this.b.length];
            case 4:
                return new kba[this.b.length];
            default:
                return new rya[this.b.length];
        }
    }
}

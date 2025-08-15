package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: o5e  reason: default package */
public final /* synthetic */ class o5e implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ o5e(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                l5e l5e = (l5e) obj;
                return new l5e(this.b, 2);
            default:
                c6e c6e = (c6e) obj;
                return new c6e(this.b, 1);
        }
    }
}

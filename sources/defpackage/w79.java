package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: w79  reason: default package */
public final /* synthetic */ class w79 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ w79(long j, int i, int i2, boolean z) {
        this.a = i2;
        this.b = i;
        this.c = z;
        this.d = j;
    }

    public final Object apply(Object obj) {
        y79 y79 = (y79) obj;
        switch (this.a) {
            case 0:
                return new y79(this.b, false, false, this.c, 0, this.d, 22);
            default:
                return new y79(this.b, false, false, this.c, 0, this.d, 22);
        }
    }
}

package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vu7  reason: default package */
public final /* synthetic */ class vu7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv7 b;

    public /* synthetic */ vu7(mv7 mv7, int i) {
        this.a = i;
        this.b = mv7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [a66, ffe] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new t03(od2.D(new t03(new qn5(1, this.b.b.g()), 23), new ffe(2, (Continuation) null)), 24);
            case 1:
                mv7 mv7 = this.b;
                mv7.s0.m((Object) null, x53.D0((List) mv7.Z.take()));
                return e5f.a;
            default:
                mv7 mv72 = this.b;
                mv72.Y.m((Object) null, x53.D0((List) mv72.X.take()));
                return e5f.a;
        }
    }
}

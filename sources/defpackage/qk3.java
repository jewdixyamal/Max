package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qk3  reason: default package */
public final class qk3 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ zk3 c;

    public /* synthetic */ qk3(vy1 vy1, zk3 zk3, int i) {
        this.a = i;
        this.b = vy1;
        this.c = zk3;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new pk3(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new pk3(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}

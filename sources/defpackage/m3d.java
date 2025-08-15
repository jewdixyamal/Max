package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m3d  reason: default package */
public final class m3d implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ q3d c;

    public /* synthetic */ m3d(mn5 mn5, q3d q3d, int i) {
        this.a = i;
        this.b = mn5;
        this.c = q3d;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new l3d(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new l3d(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}

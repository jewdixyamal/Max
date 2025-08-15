package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wk2  reason: default package */
public final class wk2 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ bl2 c;

    public /* synthetic */ wk2(mn5 mn5, bl2 bl2, int i) {
        this.a = i;
        this.b = mn5;
        this.c = bl2;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new vk2(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            default:
                Object d2 = this.b.d(new vk2(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
        }
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: t09  reason: default package */
public final class t09 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ MessageWriteWidget c;

    public /* synthetic */ t09(w7c w7c, MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = w7c;
        this.c = messageWriteWidget;
    }

    public final Object d(on5 on5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object d = this.b.d(new s09(on5, this.c, 0), continuation);
                return d == tx3.a ? d : e5f.a;
            case 1:
                Object d2 = this.b.d(new s09(on5, this.c, 1), continuation);
                return d2 == tx3.a ? d2 : e5f.a;
            default:
                Object d3 = this.b.d(new s09(on5, this.c, 2), continuation);
                return d3 == tx3.a ? d3 : e5f.a;
        }
    }
}

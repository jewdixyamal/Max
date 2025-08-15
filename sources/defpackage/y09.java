package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: y09  reason: default package */
public final class y09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((y09) n((lce) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y09 y09 = new y09(continuation, this.Y);
        y09.X = obj;
        return y09;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        lce lce = (lce) this.X;
        MessageWriteWidget messageWriteWidget = this.Y;
        rt3 rt3 = messageWriteWidget.B0;
        if (rt3 != null) {
            rt3.dismiss();
        }
        if (lce != null) {
            rce rce = lce.b;
            if (!rce.Y.isEmpty()) {
                List list = rce.Y;
                ArrayList arrayList = new ArrayList(z53.S(list, 10));
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(new tt3(i, (jqe) new iqe((String) next), (Integer) null, (Integer) null, 28));
                        i = i2;
                    } else {
                        y53.R();
                        throw null;
                    }
                }
                rt3 build = dy7.c(1).Y(lce.a).I(arrayList).s().build();
                build.q(messageWriteWidget);
                messageWriteWidget.B0 = build;
            }
        }
        return e5f.a;
    }
}

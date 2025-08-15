package defpackage;

import java.util.function.BiConsumer;
import one.me.android.OneMeApplication;

/* renamed from: a29  reason: default package */
public final /* synthetic */ class a29 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;

    public /* synthetic */ a29(a66 a66, int i) {
        this.a = i;
        this.b = a66;
    }

    public final void accept(Object obj, Object obj2) {
        a66 a66 = this.b;
        switch (this.a) {
            case 0:
                a66.invoke(obj, obj2);
                return;
            default:
                int i = OneMeApplication.s0;
                a66.invoke(obj, obj2);
                return;
        }
    }
}

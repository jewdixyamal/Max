package defpackage;

import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: qse  reason: default package */
public final /* synthetic */ class qse implements a66 {
    public final /* synthetic */ int a;

    public /* synthetic */ qse(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ThreadContextKt.findOne$lambda$1((pse) obj, (jx3) obj2);
            default:
                return ThreadContextKt.countAll$lambda$0(obj, (jx3) obj2);
        }
    }
}

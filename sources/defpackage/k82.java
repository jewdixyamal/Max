package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: k82  reason: default package */
public final /* synthetic */ class k82 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k82(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final void accept(Object obj, Object obj2) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                e52 e52 = (e52) obj2;
                if (((gi9) this.c).d(l.longValue())) {
                    ((ArrayList) this.b).add(e52);
                    return;
                }
                return;
            case 1:
                e52 e522 = (e52) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((ArrayList) this.b).add(e522);
                    return;
                }
                return;
            default:
                uj3 uj3 = (uj3) obj2;
                if (((Collection) this.c).contains(l)) {
                    ((Map) this.b).put(l, uj3);
                    return;
                }
                return;
        }
    }
}

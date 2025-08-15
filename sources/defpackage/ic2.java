package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ic2  reason: default package */
public final /* synthetic */ class ic2 implements sj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ic2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void accept(Object obj) {
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                jc2 jc2 = (jc2) obj2;
                jc2.getClass();
                hm9.m("jc2", "ValidateMessagesTimeUseCase found some items for delete, size = %d", Integer.valueOf(collection.size()));
                jc2.h.b(new tb2((Object) jc2, this.b, (Object) collection, 1));
                return;
            default:
                for (lna g : (List) obj) {
                    ((vlc) obj2).g(g, this.b);
                }
                return;
        }
    }
}

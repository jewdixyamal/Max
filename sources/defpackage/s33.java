package defpackage;

import java.util.function.BiConsumer;

/* renamed from: s33  reason: default package */
public final /* synthetic */ class s33 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((t33) this.b).m((String) obj, (String) obj2);
                return;
            default:
                Long l = (Long) obj;
                uj3 uj3 = (uj3) obj2;
                el3 el3 = (el3) this.b;
                if (uj3 != null) {
                    glc glc = ((k24) ((c34) el3.f.get())).d;
                    l.getClass();
                    glc.h().c(uj3.a.c, ((d56) ((khe) glc.o).getValue()).a);
                    return;
                }
                el3.getClass();
                return;
        }
    }
}

package defpackage;

import java.util.List;

/* renamed from: xu7  reason: default package */
public final /* synthetic */ class xu7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mv7 b;
    public final /* synthetic */ List c;

    public /* synthetic */ xu7(mv7 mv7, List list, int i) {
        this.a = i;
        this.b = mv7;
        this.c = list;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.X.put(this.c);
                return e5f.a;
            default:
                this.b.Z.put(this.c);
                return e5f.a;
        }
    }
}

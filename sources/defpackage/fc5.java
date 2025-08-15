package defpackage;

import java.util.List;

/* renamed from: fc5  reason: default package */
public final /* synthetic */ class fc5 implements b66, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ fc5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public Object m59apply(Object obj) {
        switch (this.a) {
            case 0:
                return new sa3(1, new gc5((od5) obj, this.b, this.c, 0));
            case 1:
                return new qa3(((wc5) obj).a(), 2, new fc5(this.c, 2, this.b));
            default:
                return new sa3(1, new gc5((fd5) obj, this.b, this.c, 1));
        }
    }

    public /* synthetic */ fc5(int i, long j) {
        this.a = 3;
        this.c = i;
        this.b = j;
    }

    public bm7 apply(Object obj) {
        return fm9.F(new ph8(this.c, this.b, (List) obj));
    }
}

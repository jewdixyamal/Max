package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: qg8  reason: default package */
public final class qg8 implements Runnable {
    public final /* synthetic */ sg8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ wd6 b;
    public final /* synthetic */ zf8 c;
    public final /* synthetic */ Collection o;

    public /* synthetic */ qg8(sg8 sg8, wd6 wd6, zf8 zf8, ArrayList arrayList, int i) {
        this.a = i;
        this.X = sg8;
        this.b = wd6;
        this.c = zf8;
        this.o = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A(this.X, this.c, (ArrayList) this.o);
                return;
            default:
                this.b.A(this.X, this.c, (ArrayList) this.o);
                return;
        }
    }
}

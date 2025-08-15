package defpackage;

import android.util.Pair;

/* renamed from: nk8  reason: default package */
public final /* synthetic */ class nk8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ pc8 o;

    public /* synthetic */ nk8(imc imc, Pair pair, pc8 pc8, int i) {
        this.a = i;
        this.b = imc;
        this.c = pair;
        this.o = pc8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                yj8 yj8 = (yj8) pair.second;
                yj8.getClass();
                ((i74) ((vk8) this.b.c).j).A(intValue, yj8, this.o);
                return;
            default:
                Pair pair2 = this.c;
                ((i74) ((vk8) this.b.c).j).L(((Integer) pair2.first).intValue(), (yj8) pair2.second, this.o);
                return;
        }
    }
}

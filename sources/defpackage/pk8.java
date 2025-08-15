package defpackage;

import android.util.Pair;

/* renamed from: pk8  reason: default package */
public final /* synthetic */ class pk8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ yn7 o;

    public /* synthetic */ pk8(imc imc, Pair pair, yn7 yn7, pc8 pc8, int i) {
        this.a = i;
        this.b = imc;
        this.c = pair;
        this.o = yn7;
        this.X = pc8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((i74) ((vk8) this.b.c).j).r(((Integer) pair.first).intValue(), (yj8) pair.second, this.o, this.X);
                return;
            case 1:
                Pair pair2 = this.c;
                ((i74) ((vk8) this.b.c).j).x(((Integer) pair2.first).intValue(), (yj8) pair2.second, this.o, this.X);
                return;
            default:
                Pair pair3 = this.c;
                ((i74) ((vk8) this.b.c).j).t(((Integer) pair3.first).intValue(), (yj8) pair3.second, this.o, this.X);
                return;
        }
    }
}

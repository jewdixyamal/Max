package defpackage;

import android.util.Pair;

/* renamed from: ok8  reason: default package */
public final /* synthetic */ class ok8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ imc b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ ok8(imc imc, Pair pair, int i) {
        this.a = i;
        this.b = imc;
        this.c = pair;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((i74) ((vk8) this.b.c).j).z(((Integer) pair.first).intValue(), (yj8) pair.second);
                return;
            case 1:
                Pair pair2 = this.c;
                ((i74) ((vk8) this.b.c).j).D(((Integer) pair2.first).intValue(), (yj8) pair2.second);
                return;
            case 2:
                Pair pair3 = this.c;
                ((i74) ((vk8) this.b.c).j).H(((Integer) pair3.first).intValue(), (yj8) pair3.second);
                return;
            default:
                Pair pair4 = this.c;
                ((i74) ((vk8) this.b.c).j).C(((Integer) pair4.first).intValue(), (yj8) pair4.second);
                return;
        }
    }
}

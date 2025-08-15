package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: ii5  reason: default package */
public final /* synthetic */ class ii5 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ii5(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
        this.X = obj3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ki5) this.c).a((ri9) this.o, this.b, (li9) this.X);
                return;
            case 1:
                ((lq1) this.c).b(this.o);
                if (this.b) {
                    ((bm7) this.X).cancel(true);
                    return;
                }
                return;
            case 2:
                ((ue) this.c).j((qh8) this.o, (sh0) this.X, this.b);
                return;
            default:
                si8 si8 = (si8) ((td) this.c).o;
                x4b x4b = si8.f.s;
                j47.m0(x4b, (ph8) this.o);
                int playbackState = x4b.getPlaybackState();
                if (playbackState == 1) {
                    if (x4b.t1(2)) {
                        x4b.prepare();
                    }
                } else if (playbackState == 4 && x4b.t1(4)) {
                    x4b.E();
                }
                boolean z = this.b;
                if (z && x4b.t1(1)) {
                    x4b.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int append : new int[]{31, 2}) {
                    fm9.k(!false);
                    sparseBooleanArray.append(append, true);
                }
                if (z) {
                    fm9.k(!false);
                    sparseBooleanArray.append(1, true);
                }
                fm9.k(!false);
                si8.f.p((oh8) this.X);
                return;
        }
    }

    public /* synthetic */ ii5(ue ueVar, qh8 qh8, sh0 sh0, boolean z) {
        this.a = 2;
        this.c = ueVar;
        this.o = qh8;
        this.X = sh0;
        this.b = z;
    }

    public /* synthetic */ ii5(lq1 lq1, oq1 oq1) {
        this.a = 1;
        this.c = lq1;
        this.o = null;
        this.b = true;
        this.X = oq1;
    }
}

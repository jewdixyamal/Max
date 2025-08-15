package defpackage;

/* renamed from: wg3  reason: default package */
public final /* synthetic */ class wg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii8 b;
    public final /* synthetic */ oh8 c;

    public /* synthetic */ wg3(ii8 ii8, oh8 oh8, int i) {
        this.a = i;
        this.b = ii8;
        this.c = oh8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ii8 ii8 = this.b;
                if (!ii8.i()) {
                    if (ii8.z) {
                        oh8 oh8 = this.c;
                        if (!ii8.j(oh8)) {
                            if (ii8.h(oh8)) {
                                ii8.z = false;
                            }
                        } else {
                            return;
                        }
                    }
                    ii8.e.getClass();
                    return;
                }
                return;
            case 1:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 12, sj8.N0(new wa8(20)));
                return;
            case 2:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 11, sj8.N0(new wa8(15)));
                return;
            case 3:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 3, sj8.N0(new wa8(27)));
                return;
            case 4:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, sj8.N0(new wa8(12)));
                return;
            case 5:
                sj8 sj8 = this.b.g;
                sj8.getClass();
                oh8 oh82 = this.c;
                sj8.L0(oh82, Integer.MIN_VALUE, 1, sj8.N0(new y98((Object) sj8, 6, (Object) oh82)));
                return;
            case 6:
                sj8 sj82 = this.b.g;
                sj82.getClass();
                oh8 oh83 = this.c;
                sj82.L0(oh83, Integer.MIN_VALUE, 1, sj8.N0(new y98((Object) sj82, 6, (Object) oh83)));
                return;
            case 7:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 1, sj8.N0(new wa8(12)));
                return;
            case 8:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 9, sj8.N0(new wa8(21)));
                return;
            default:
                this.b.g.L0(this.c, Integer.MIN_VALUE, 7, sj8.N0(new wa8(17)));
                return;
        }
    }
}

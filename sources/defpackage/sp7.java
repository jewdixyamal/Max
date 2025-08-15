package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sp7  reason: default package */
public final /* synthetic */ class sp7 implements Callable {
    public final /* synthetic */ long X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ tp7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ sp7(tp7 tp7, long j, long j2, boolean z, long j3, long j4) {
        this.a = tp7;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.X = j3;
        this.Y = j4;
    }

    public final Object call() {
        cu8 cu8;
        long j = this.c;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        es8 es8 = null;
        tp7 tp7 = this.a;
        long j2 = this.Y;
        if (i != 0) {
            cu8 = ((au8) tp7.a.getValue()).j(j2, j);
        } else {
            long j3 = this.X;
            if (j3 == 0) {
                cu8 = ((au8) tp7.a.getValue()).q(this.b);
            } else {
                vlc vlc = ((k24) ((au8) tp7.a.getValue()).a).c;
                ru8 h = vlc.d().h(j2, j3);
                cu8 = h != null ? vlc.b(h) : null;
            }
        }
        if (cu8 != null && (this.o || cu8.v0 != vx8.DELETED)) {
            es8 = zu8.a((zu8) tp7.b.getValue(), cu8);
        }
        if (es8 != null) {
            return es8;
        }
        throw new IllegalStateException("message not found or deleted");
    }
}

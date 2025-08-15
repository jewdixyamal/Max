package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yue  reason: default package */
public final /* synthetic */ class yue implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tve b;
    public final /* synthetic */ sv0 c;

    public /* synthetic */ yue(tve tve, sv0 sv0, int i) {
        this.a = i;
        this.b = tve;
        this.c = sv0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                tve tve = this.b;
                ByteBuffer e = tve.i.e();
                sv0 sv0 = this.c;
                int i = sv0.c;
                return tve.a.unwrap(e, (ByteBuffer[]) sv0.e, sv0.b, i);
            default:
                tve tve2 = this.b;
                ByteBuffer e2 = tve2.j.e();
                sv0 sv02 = this.c;
                int i2 = sv02.c;
                return tve2.a.wrap((ByteBuffer[]) sv02.e, sv02.b, i2, e2);
        }
    }
}

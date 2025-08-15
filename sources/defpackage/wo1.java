package defpackage;

import android.content.Context;

/* renamed from: wo1  reason: default package */
public final /* synthetic */ class wo1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ap1 c;

    public /* synthetic */ wo1(Context context, ap1 ap1, int i) {
        this.a = i;
        this.b = context;
        this.c = ap1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ap1.y(this.b, this.c);
            case 1:
                return ap1.A(this.b, this.c);
            case 2:
                return ap1.B(this.b, this.c);
            default:
                ip1 ip1 = new ip1(this.b);
                ip1.setLayoutParams(new ti3(-1, -1));
                dy7.M(ip1, false);
                ap1 ap1 = this.c;
                ip1.setListener(new ync(19, ap1));
                ip1.setVideoLayoutUpdatesControllerProvider(new uo1(ap1, 1));
                return ip1;
        }
    }
}

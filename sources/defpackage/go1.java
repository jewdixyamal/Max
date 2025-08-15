package defpackage;

import android.content.Context;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: go1  reason: default package */
public final /* synthetic */ class go1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ no1 c;

    public /* synthetic */ go1(Context context, no1 no1, int i) {
        this.a = i;
        this.b = context;
        this.c = no1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return no1.E(this.b, this.c);
            case 1:
                return no1.C(this.b, this.c);
            case 2:
                lmd lmd = new lmd(this.b);
                kmd kmd = lmd.b;
                kmd.c(false);
                lmd.onThemeChanged(qp4.u0.p(this.c).c);
                lmd.o = tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density);
                imd imd = imd.b;
                jmd jmd = kmd.u0;
                bc7[] bc7Arr = kmd.A0;
                jmd.o1(kmd, bc7Arr[2], imd);
                kmd.getClass();
                kmd.v0.o1(kmd, bc7Arr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                return lmd;
            default:
                return no1.w(this.b, this.c);
        }
    }
}

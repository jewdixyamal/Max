package defpackage;

import android.content.Context;
import one.me.sdk.arch.Widget;

/* renamed from: s25  reason: default package */
public final /* synthetic */ class s25 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ s25(int i, t25 t25) {
        this.a = 0;
        this.b = i;
        this.c = "one.me.webapp.domain.jsbridge.SuccessResponse.Status";
        this.o = t25;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, mec] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, mec] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = this.b;
                r6d[] r6dArr = new r6d[i];
                for (int i2 = 0; i2 < i; i2++) {
                    r6dArr[i2] = oag.f(((String) this.c) + '.' + ((t25) this.o).e[i2], nae.h, new r6d[0]);
                }
                return r6dArr;
            case 1:
                ? obj = new Object();
                snd snd = new snd(obj, 1);
                wha wha = new wha((Widget) this.c);
                vj1 vj1 = (vj1) this.o;
                wha.g(vj1.D);
                wha.e(nia.a);
                wha.f(pia.a);
                wha.d(new ypc(snd, 5, vj1.E));
                wha.c(new eia(0, 0, this.b, 3));
                vha i3 = wha.i();
                obj.a = i3;
                return i3;
            case 2:
                ? obj2 = new Object();
                Widget widget = (Widget) this.o;
                Context context = widget.getContext();
                uj1 uj1 = (uj1) this.c;
                CharSequence b2 = uj1.D.b(context);
                if (b2 == null) {
                    b2 = "";
                }
                snd snd2 = new snd(obj2, 0);
                wha wha2 = new wha(widget);
                wha2.h(b2);
                Integer num = uj1.E;
                if (num != null) {
                    wha2.e(new kia(num.intValue()));
                }
                wha2.d(new ho1(3, snd2));
                wha2.c(new eia(0, 0, this.b, 3));
                vha i4 = wha2.i();
                obj2.a = i4;
                return i4;
            default:
                return ece.c((String) this.c, this.b, (j92) ((moa) this.o).a);
        }
    }

    public /* synthetic */ s25(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    public /* synthetic */ s25(String str, int i, moa moa) {
        this.a = 3;
        this.c = str;
        this.b = i;
        this.o = moa;
    }
}

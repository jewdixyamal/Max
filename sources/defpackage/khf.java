package defpackage;

import android.content.Context;
import android.view.Surface;

/* renamed from: khf  reason: default package */
public final /* synthetic */ class khf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ khf(Context context, dif dif) {
        this.a = 1;
        this.b = context;
        this.c = dif;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ohf.a((ohf) this.c, (Context) this.b);
            case 1:
                ohf ohf = new ohf((Context) this.b);
                ohf.setListener((dif) this.c);
                ohf.setOnLongClickListener(new zl0(13, ohf));
                return ohf;
            case 2:
                fjf fjf = ((sif) this.c).u0;
                if (fjf != null) {
                    fjf.w = (m56) this.b;
                }
                return e5f.a;
            case 3:
                sif sif = (sif) this.b;
                zh6 zh6 = sif.X;
                kee kee = (kee) this.c;
                Surface d = kee.d(zh6, new qif(sif, kee));
                fjf fjf2 = sif.u0;
                if (fjf2 != null) {
                    fjf2.p(d);
                    sif.Z.put(kee, d);
                    return e5f.a;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                zzf zzf = (zzf) this.c;
                long t = ((hyc) zzf.Z).t();
                jwf jwf = jwf.a;
                w7c w7c = new w7c(zzf.H0);
                khe d2 = jwf.getAccessor().d(mtf.class);
                return new ouf(t, zzf.b, zzf.a, (Context) jwf.getAccessor().c(Context.class), w7c, d2, (je7) this.b);
        }
    }

    public /* synthetic */ khf(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}

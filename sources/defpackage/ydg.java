package defpackage;

import android.os.Parcel;

/* renamed from: ydg  reason: default package */
public final class ydg extends pw6 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public ydg() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }

    public final void g(ok okVar, qne qne) {
        switch (this.d) {
            case 0:
                ((ofc) ((er0) this.e).d).accept(okVar, qne);
                return;
            default:
                this.e = qne;
                aig aig = (aig) ((jig) okVar).o();
                djg djg = new djg(this);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i = jgg.a;
                obtain.writeStrongBinder(djg);
                Parcel obtain2 = Parcel.obtain();
                try {
                    aig.c.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    public ydg(er0 er0, pe5[] pe5Arr, boolean z, int i) {
        this.e = er0;
        this.c = pe5Arr;
        boolean z2 = false;
        if (pe5Arr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }
}

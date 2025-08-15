package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import org.apache.http.HttpStatus;

/* renamed from: tig  reason: default package */
public final class tig extends qjg {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tig(mdg mdg, int i) {
        super(mdg);
        this.o = i;
        fp3.o(mdg, "GoogleApiClient must not be null");
        fp3.o(w70.a, "Api must not be null");
    }

    public final /* synthetic */ rjc P(Status status) {
        int i = this.o;
        return status;
    }

    public final void T(ok okVar) {
        switch (this.o) {
            case 0:
                big big = (big) okVar;
                wkg wkg = (wkg) big.o();
                kjg kjg = new kjg(this, 0);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(wkg.e);
                int i = zhg.a;
                obtain.writeStrongBinder(kjg);
                GoogleSignInOptions googleSignInOptions = big.K0;
                if (googleSignInOptions == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    googleSignInOptions.writeToParcel(obtain, 0);
                }
                wkg.H0(obtain, HttpStatus.SC_PROCESSING);
                return;
            default:
                big big2 = (big) okVar;
                wkg wkg2 = (wkg) big2.o();
                kjg kjg2 = new kjg(this, 1);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(wkg2.e);
                int i2 = zhg.a;
                obtain2.writeStrongBinder(kjg2);
                GoogleSignInOptions googleSignInOptions2 = big2.K0;
                if (googleSignInOptions2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(obtain2, 0);
                }
                wkg2.H0(obtain2, 103);
                return;
        }
    }
}

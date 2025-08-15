package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import org.apache.http.HttpStatus;

/* renamed from: fgg  reason: default package */
public abstract class fgg extends idg implements ikg {
    public final boolean J0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case HttpStatus.SC_SWITCHING_PROTOCOLS /*101*/:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zhg.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zhg.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case HttpStatus.SC_PROCESSING /*102*/:
                g((Status) zhg.a(parcel, Status.CREATOR));
                break;
            case 103:
                n((Status) zhg.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public void g(Status status) {
        throw new UnsupportedOperationException();
    }

    public void n(Status status) {
        throw new UnsupportedOperationException();
    }
}

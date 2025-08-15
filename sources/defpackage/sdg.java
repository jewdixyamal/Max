package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: sdg  reason: default package */
public abstract class sdg extends idg implements eeg {
    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                ph3 ph3 = (ph3) rdg.a(parcel, ph3.CREATOR);
                edg edg = (edg) rdg.a(parcel, edg.CREATOR);
                rdg.b(parcel);
                break;
            case 4:
                Status status = (Status) rdg.a(parcel, Status.CREATOR);
                rdg.b(parcel);
                break;
            case 6:
                Status status2 = (Status) rdg.a(parcel, Status.CREATOR);
                rdg.b(parcel);
                break;
            case 7:
                Status status3 = (Status) rdg.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) rdg.a(parcel, GoogleSignInAccount.CREATOR);
                rdg.b(parcel);
                break;
            case 8:
                rdg.b(parcel);
                xdg xdg = (xdg) this;
                xdg.e.post(new i76((Object) xdg, (Object) (qeg) rdg.a(parcel, qeg.CREATOR), false, 29));
                break;
            case 9:
                leg leg = (leg) rdg.a(parcel, leg.CREATOR);
                rdg.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

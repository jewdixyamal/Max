package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a;

/* renamed from: iod  reason: default package */
public final class iod extends a implements ok {
    public static final /* synthetic */ int O0 = 0;
    public final boolean K0 = true;
    public final kad L0;
    public final Bundle M0;
    public final Integer N0;

    public iod(Context context, Looper looper, kad kad, Bundle bundle, ge6 ge6, he6 he6) {
        super(context, looper, 44, kad, ge6, he6);
        this.L0 = kad;
        this.M0 = bundle;
        this.N0 = (Integer) kad.Z;
    }

    public final int g() {
        return 12451000;
    }

    public final boolean j() {
        return this.K0;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof heg ? (heg) queryLocalInterface : new cdg(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    public final Bundle n() {
        kad kad = this.L0;
        boolean equals = this.c.getPackageName().equals((String) kad.o);
        Bundle bundle = this.M0;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) kad.o);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void w() {
        e(new fd7(this));
    }

    public final void x(eeg eeg) {
        Parcel obtain;
        Parcel obtain2;
        fp3.o(eeg, "Expecting a valid ISignInCallbacks");
        try {
            Account account = (Account) this.L0.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? l8e.a(this.c).b() : null;
            Integer num = this.N0;
            fp3.n(num);
            veg veg = new veg(2, account, num.intValue(), b);
            heg heg = (heg) o();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(heg.e);
            int i = rdg.a;
            obtain.writeInt(1);
            int T = ay7.T(obtain, 20293);
            ay7.X(obtain, 1, 4);
            obtain.writeInt(1);
            ay7.P(obtain, 2, veg, 0);
            ay7.W(obtain, T);
            obtain.writeStrongBinder(eeg.asBinder());
            obtain2 = Parcel.obtain();
            heg.d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e) {
            try {
                xdg xdg = (xdg) eeg;
                xdg.e.post(new i76((Object) xdg, (Object) new qeg(1, new ph3(8, (PendingIntent) null), (weg) null), false, 29));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}

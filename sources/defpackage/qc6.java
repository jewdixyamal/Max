package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* renamed from: qc6  reason: default package */
public final class qc6 extends n3 {
    public static final pe5[] A0 = new pe5[0];
    public static final Parcelable.Creator<qc6> CREATOR = new ufg(15);
    public static final Scope[] z0 = new Scope[0];
    public IBinder X;
    public Scope[] Y;
    public Bundle Z;
    public final int a;
    public final int b;
    public final int c;
    public String o;
    public Account s0;
    public pe5[] t0;
    public pe5[] u0;
    public final boolean v0;
    public final int w0;
    public boolean x0;
    public final String y0;

    public qc6(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pe5[] pe5Arr, pe5[] pe5Arr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        int i5 = i;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        Scope[] scopeArr2 = scopeArr == null ? z0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        pe5[] pe5Arr3 = A0;
        pe5[] pe5Arr4 = pe5Arr == null ? pe5Arr3 : pe5Arr;
        pe5Arr3 = pe5Arr2 != null ? pe5Arr2 : pe5Arr3;
        this.a = i5;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str3)) {
            this.o = "com.google.android.gms";
        } else {
            this.o = str3;
        }
        if (i5 < 2) {
            account2 = null;
            if (iBinder2 != null) {
                int i6 = w4.d;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Object cdg = queryLocalInterface instanceof dr6 ? (dr6) queryLocalInterface : new cdg(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (cdg != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        rkg rkg = (rkg) cdg;
                        Parcel k = rkg.k(rkg.G0(), 2);
                        Account account3 = (Account) kgg.a(k, Account.CREATOR);
                        k.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.X = iBinder2;
            account2 = account;
        }
        this.s0 = account2;
        this.Y = scopeArr2;
        this.Z = bundle2;
        this.t0 = pe5Arr4;
        this.u0 = pe5Arr3;
        this.v0 = z;
        this.w0 = i4;
        this.x0 = z2;
        this.y0 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ufg.a(this, parcel, i);
    }
}

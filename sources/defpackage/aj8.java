package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aj8  reason: default package */
public final class aj8 extends Binder implements sr6 {
    public final WeakReference c;
    public final Handler d;
    public final xi8 e;
    public final Set f = Collections.synchronizedSet(new HashSet());

    public aj8(bj8 bj8) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(bj8);
        Context applicationContext = bj8.getApplicationContext();
        this.d = new Handler(applicationContext.getMainLooper());
        this.e = xi8.a(applicationContext);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [sr6, rr6, java.lang.Object] */
    public static sr6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof sr6)) {
            return (sr6) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void f0(kr6 kr6, Bundle bundle) {
        if (kr6 != null && bundle != null) {
            try {
                oh3 a = oh3.a(bundle);
                if (this.c.get() == null) {
                    try {
                        kr6.c(0);
                    } catch (RemoteException unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    if (callingPid == 0) {
                        callingPid = a.d;
                    }
                    vi8 vi8 = new vi8(a.c, callingPid, callingUid);
                    boolean b = this.e.b(vi8);
                    this.f.add(kr6);
                    try {
                        this.d.post(new nd8(1, this, kr6, vi8, a, b));
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } catch (RuntimeException e2) {
                z04.d0("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        } else if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            f0(ga8.k(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}

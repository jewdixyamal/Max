package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: lr6  reason: default package */
public final class lr6 implements mr6 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void f(i3b i3b) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (i3b != null) {
                obtain.writeInt(1);
                i3b.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(3, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(6, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onRepeatModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(9, obtain, (Parcel) null, 1)) {
                int i2 = d98.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onSessionDestroyed() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (!this.c.transact(2, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onShuffleModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(12, obtain, (Parcel) null, 1)) {
                int i2 = d98.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void q(ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeTypedList(arrayList);
            if (!this.c.transact(5, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void t(upa upa) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (upa != null) {
                obtain.writeInt(1);
                upa.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(8, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void y0(hd8 hd8) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (hd8 != null) {
                obtain.writeInt(1);
                obtain.writeBundle(hd8.a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(4, obtain, (Parcel) null, 1)) {
                int i = d98.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}

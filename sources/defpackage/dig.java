package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: dig  reason: default package */
public final class dig implements IInterface {
    public final IBinder c;

    public dig(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }
}

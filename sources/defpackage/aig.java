package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aig  reason: default package */
public final class aig implements IInterface {
    public final IBinder c;

    public aig(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }
}

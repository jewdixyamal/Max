package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: tif  reason: default package */
public final class tif implements uif {
    public final uif a;
    public final Handler b;

    public tif(ejf ejf) {
        this.a = ejf;
        Looper myLooper = Looper.myLooper();
        this.b = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
    }

    public final void c() {
        this.b.post(new ule(13, this.a));
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: c78  reason: default package */
public final class c78 implements b78 {
    public final Messenger a;

    public c78(Messenger messenger) {
        this.a = messenger;
    }

    public final void a(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        this.a.send(obtain);
    }
}

package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: gk0  reason: default package */
public final class gk0 implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            au1.r(message.obj);
            throw null;
        } else if (i != 1) {
            return false;
        } else {
            au1.r(message.obj);
            throw null;
        }
    }
}

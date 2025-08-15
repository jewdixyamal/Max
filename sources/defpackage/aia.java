package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aia  reason: default package */
public final /* synthetic */ class aia implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Handler handler = cia.a;
        bia bia = (bia) message.obj;
        AtomicBoolean atomicBoolean = cia.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (tpa.f(cia.b, bia) || tpa.f(cia.c, bia)) {
                cia.a(bia, yha.a);
            }
            atomicBoolean.set(false);
        }
        return true;
    }
}

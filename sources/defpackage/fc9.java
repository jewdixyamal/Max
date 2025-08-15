package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: fc9  reason: default package */
public class fc9 extends Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ fc9() {
        this.a = 1;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ec9 ec9 = (ec9) message.obj;
                int i = message.what;
                if (i == 1) {
                    sx sxVar = ec9.a;
                    Object obj = ec9.b[0];
                    if (sxVar.o.get()) {
                        CountDownLatch countDownLatch = sxVar.Y;
                        try {
                            rgg rgg = sxVar.Z;
                            if (rgg.i == sxVar) {
                                SystemClock.uptimeMillis();
                                rgg.i = null;
                                rgg.b();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    } else {
                        try {
                            rgg rgg2 = sxVar.Z;
                            if (rgg2.h != sxVar) {
                                if (rgg2.i == sxVar) {
                                    SystemClock.uptimeMillis();
                                    rgg2.i = null;
                                    rgg2.b();
                                }
                            } else if (!rgg2.d) {
                                SystemClock.uptimeMillis();
                                rgg2.h = null;
                                mo7 mo7 = rgg2.b;
                                if (mo7 != null) {
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        mo7.k(obj);
                                    } else {
                                        mo7.i(obj);
                                    }
                                }
                            }
                        } finally {
                            sxVar.Y.countDown();
                        }
                    }
                    sxVar.c = 3;
                    return;
                } else if (i == 2) {
                    ec9.a.getClass();
                    return;
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc9(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc9(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fc9(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }
}

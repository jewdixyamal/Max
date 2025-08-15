package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: lj0  reason: default package */
public final class lj0 extends fc9 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            au1.r(pair.first);
            rjc rjc = (rjc) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                yu0 yu0 = BasePendingResult.n;
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", zr6.h(i, "Don't know how to handle message: "), new Exception());
        } else {
            ((BasePendingResult) message.obj).Q(Status.s0);
        }
    }
}

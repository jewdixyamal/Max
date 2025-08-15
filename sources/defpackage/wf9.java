package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: wf9  reason: default package */
public final class wf9 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public wf9(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ur6 ur6 = (ur6) iInterface;
        this.a.b.remove((Integer) obj);
    }
}

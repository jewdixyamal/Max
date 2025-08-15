package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: hw9  reason: default package */
public final class hw9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ NotificationsImagesProvider Y;
    public final /* synthetic */ Uri Z;
    public final /* synthetic */ ww0 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hw9(NotificationsImagesProvider notificationsImagesProvider, Uri uri, tpd tpd, Continuation continuation) {
        super(2, continuation);
        this.Y = notificationsImagesProvider;
        this.Z = uri;
        this.s0 = tpd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hw9(this.Y, this.Z, (tpd) this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gw9 gw9 = new gw9(this.Y, this.Z, this.s0, (Continuation) null);
            this.X = 1;
            obj = fp3.H(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, gw9, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}

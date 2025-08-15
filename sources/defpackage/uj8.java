package defpackage;

import org.webrtc.JniCommon;

/* renamed from: uj8  reason: default package */
public final /* synthetic */ class uj8 implements Runnable {
    public final /* synthetic */ long a;

    public /* synthetic */ uj8(long j) {
        this.a = j;
    }

    public final void run() {
        JniCommon.nativeReleaseRef(this.a);
    }
}

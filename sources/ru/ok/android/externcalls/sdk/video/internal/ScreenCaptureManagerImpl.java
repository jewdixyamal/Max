package ru.ok.android.externcalls.sdk.video.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ScreenCaptureManagerImpl;", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "Lpy0;", "call", "<init>", "(Lpy0;)V", "", "enabled", "isFastScreenShareEnabled", "Le5f;", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "Lpy0;", "isScreenCaptureEnabled", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final py0 call;

    public ScreenCaptureManagerImpl(py0 py0) {
        this.call = py0;
    }

    public boolean isScreenCaptureEnabled() {
        return this.call.y1.b;
    }

    public void setAudioCaptureEnabled(boolean z) {
        this.call.D(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (defpackage.kd1.d(new defpackage.sq1(0, 2, defpackage.hi9.class, r0.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;")) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScreenCaptureEnabled(boolean r10, boolean r11) {
        /*
            r9 = this;
            py0 r9 = r9.call
            boolean r0 = r9.i()
            if (r0 != 0) goto L_0x000a
            goto L_0x0082
        L_0x000a:
            boolean r0 = r9.i()
            if (r0 != 0) goto L_0x0012
            goto L_0x0082
        L_0x0012:
            if (r10 == 0) goto L_0x0019
            java.lang.String r0 = "rtc.screencapture.enabled"
            r9.v(r0)
        L_0x0019:
            kd1 r0 = r9.L1
            r0.getClass()
            if (r10 == 0) goto L_0x0036
            sq1 r8 = new sq1
            hi9 r5 = r0.i
            java.lang.Class<hi9> r4 = defpackage.hi9.class
            java.lang.String r6 = "screenshareState"
            java.lang.String r7 = "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"
            r2 = 0
            r3 = 2
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r0 = defpackage.kd1.d(r8)
            if (r0 == 0) goto L_0x0082
        L_0x0036:
            ji9 r0 = r9.y1
            boolean r1 = r0.b
            if (r1 == r10) goto L_0x004c
            r0.b = r10
            r0.c = r11
            r0.a()
            r9.x()
            w51 r11 = defpackage.w51.X
            r1 = 0
            r9.k(r11, r1)
        L_0x004c:
            yn1 r11 = r9.t1
            if (r11 != 0) goto L_0x0051
            goto L_0x0082
        L_0x0051:
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x005c
            boolean r0 = r9.d2
            if (r0 != 0) goto L_0x005c
            ssa r0 = r9.l2
            goto L_0x005e
        L_0x005c:
            ssa r0 = r9.m2
        L_0x005e:
            if (r0 != 0) goto L_0x0061
            goto L_0x0082
        L_0x0061:
            boolean r11 = r11.I()
            if (r11 == 0) goto L_0x0073
            yn1 r11 = r9.t1
            r11.B0 = r0
            u38 r11 = r11.x0
            if (r11 == 0) goto L_0x0082
            r11.e(r0)
            goto L_0x0082
        L_0x0073:
            yn1 r11 = r9.t1
            r11.B0 = r0
            u38 r1 = r11.x0
            if (r1 == 0) goto L_0x007f
            r1.e(r0)
            goto L_0x0082
        L_0x007f:
            r11.U(r0)
        L_0x0082:
            if (r10 != 0) goto L_0x0088
            r10 = 0
            r9.D(r10)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl.setScreenCaptureEnabled(boolean, boolean):void");
    }
}

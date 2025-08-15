package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: jz1  reason: default package */
public final class jz1 extends iv1 {
    public final CameraCaptureSession.CaptureCallback a;

    public jz1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}

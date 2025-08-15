package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* renamed from: ex1  reason: default package */
public class ex1 extends dle {
    public final CameraCharacteristics E(String str) {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void b0(q6d q6d, yt1 yt1) {
        ((CameraManager) this.b).registerAvailabilityCallback(q6d, yt1);
    }

    public final void g0(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}

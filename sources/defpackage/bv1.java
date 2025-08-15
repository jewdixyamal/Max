package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import java.util.LinkedHashSet;

/* renamed from: bv1  reason: default package */
public final /* synthetic */ class bv1 {
    public static y7g a(Context context, Object obj, LinkedHashSet linkedHashSet) {
        try {
            return new y7g(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new Exception(e);
        }
    }
}

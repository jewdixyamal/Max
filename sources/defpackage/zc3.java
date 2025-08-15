package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory;

/* renamed from: zc3  reason: default package */
public final class zc3 implements t8b {
    public final zff a;

    public zc3(yc3 yc3) {
        this.a = yc3;
    }

    public final s8b a(Context context, i63 i63, pgf pgf, wc3 wc3, ffc ffc) {
        try {
            return PreviewingSingleInputVideoGraph$Factory.class.getConstructor(new Class[]{zff.class}).newInstance(new Object[]{this.a}).a(context, i63, pgf, wc3, ffc);
        } catch (Exception e) {
            throw VideoFrameProcessingException.a(e);
        }
    }
}

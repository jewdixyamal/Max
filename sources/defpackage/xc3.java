package defpackage;

import android.util.Base64;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xc3  reason: default package */
public final /* synthetic */ class xc3 implements jde {
    public final /* synthetic */ int a;

    public /* synthetic */ xc3(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                Class<DefaultVideoFrameProcessor$Factory$Builder> cls = DefaultVideoFrameProcessor$Factory$Builder.class;
                try {
                    Object invoke = cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null);
                    invoke.getClass();
                    return (zff) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof qm7) {
                    return (qm7) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new pc9((ScheduledExecutorService) newSingleThreadExecutor) : new mc9(newSingleThreadExecutor);
            case 2:
                byte[] bArr = new byte[12];
                zc4.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new ec4(new n64(0), 50000, 50000, 2500, 5000);
            case 4:
                return new fc4(new n64(1), 50000, 50000, 2500, 5000, false);
            default:
                throw new IllegalStateException();
        }
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: pf  reason: default package */
public final class pf implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).invalidateSelf();
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            case 2:
                ((g5a) this.b).invalidateSelf();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                yia yia = (yia) this.b;
                if (isCurrentThread) {
                    yia.invalidate();
                    return;
                }
                Handler handler = yia.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new xia(yia, 0));
                    return;
                } else {
                    yia.post(new xia(yia, 1));
                    return;
                }
            default:
                ((f9f) this.b).invalidateSelf();
                return;
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((sf) this.b).scheduleSelf(runnable, j);
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 2:
                ((g5a) this.b).scheduleSelf(runnable, j);
                return;
            case 3:
                ((yia) this.b).postDelayed(runnable, j);
                return;
            default:
                ((f9f) this.b).scheduleSelf(runnable, j);
                return;
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((g5a) this.b).unscheduleSelf(runnable);
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                yia yia = (yia) this.b;
                if (isCurrentThread) {
                    yia.removeCallbacks(runnable);
                    return;
                }
                Handler handler = yia.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new i76((Object) yia, 14, (Object) runnable));
                    return;
                } else {
                    yia.post(new h76(yia, 17, runnable));
                    return;
                }
            default:
                ((f9f) this.b).unscheduleSelf(runnable);
                return;
        }
    }
}

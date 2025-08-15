package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: n5  reason: default package */
public final class n5 extends ii0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void a(String str, ru6 ru6, Animatable animatable) {
        switch (this.b) {
            case 0:
                Point point = new Point(ru6.getWidth(), ru6.getHeight());
                ActAvatarCrop actAvatarCrop = (ActAvatarCrop) this.c;
                actAvatarCrop.a1 = point;
                actAvatarCrop.Z0.setEnabled(true);
                return;
            case 1:
                ((g5a) this.c).invalidateSelf();
                return;
            case 2:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                s5a s5a = (s5a) this.c;
                if (isCurrentThread) {
                    k56 k56 = s5a.C0;
                    if (k56 != null) {
                        k56.invoke();
                    }
                    s5a.invalidate();
                    return;
                }
                Handler handler = s5a.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new n5a(s5a, 0));
                    return;
                } else {
                    s5a.post(new n5a(s5a, 1));
                    return;
                }
            case 3:
                boolean isCurrentThread2 = Looper.getMainLooper().isCurrentThread();
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (isCurrentThread2) {
                    oneMeDraweeView.p(ru6, animatable);
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler2 = oneMeDraweeView.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new xaa(oneMeDraweeView, str, ru6, animatable, 0));
                    return;
                } else {
                    oneMeDraweeView.post(new xaa(oneMeDraweeView, str, ru6, animatable, 1));
                    return;
                }
            case 4:
                ((f9f) this.c).invalidateSelf();
                return;
            default:
                br7.N((ZoomableDraweeView) this.c, new fre(this, 24, ru6));
                return;
        }
    }

    public void d(String str, Throwable th) {
        switch (this.b) {
            case 1:
                String str2 = ((g5a) this.c).c;
                hm9.m0(str2, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                return;
            case 2:
                s5a s5a = (s5a) this.c;
                String str3 = s5a.a;
                hm9.l0(str3, "Failed to load image. ID: " + str, th);
                s5a.postInvalidate();
                return;
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                String str4 = oneMeDraweeView.x0;
                hm9.m0(str4, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                if (Looper.getMainLooper().isCurrentThread()) {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler = oneMeDraweeView.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new waa(oneMeDraweeView, 0));
                    return;
                } else {
                    oneMeDraweeView.post(new waa(oneMeDraweeView, 1));
                    return;
                }
            case 4:
                m56 m56 = ((f9f) this.c).c;
                if (m56 != null) {
                    m56.invoke(th);
                    return;
                }
                return;
            case 5:
                br7.N((ZoomableDraweeView) this.c, new fre(this, 25, th));
                return;
            default:
                return;
        }
    }

    public void g(String str) {
        switch (this.b) {
            case 5:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                br7.N(zoomableDraweeView, new kag(zoomableDraweeView, 1));
                return;
            default:
                return;
        }
    }

    public void h(String str, ru6 ru6) {
        switch (this.b) {
            case 1:
                ((g5a) this.c).invalidateSelf();
                return;
            case 2:
                ((s5a) this.c).postInvalidate();
                return;
            case 3:
                boolean isCurrentThread = Looper.getMainLooper().isCurrentThread();
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (isCurrentThread) {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    return;
                }
                Handler handler = oneMeDraweeView.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new waa(oneMeDraweeView, 2));
                    return;
                } else {
                    oneMeDraweeView.post(new waa(oneMeDraweeView, 3));
                    return;
                }
            case 5:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                zoomableDraweeView.removeCallbacks(zoomableDraweeView.B0);
                br7.N(zoomableDraweeView, zoomableDraweeView.B0);
                return;
            default:
                return;
        }
    }
}

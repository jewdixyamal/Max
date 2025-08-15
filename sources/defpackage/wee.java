package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: wee  reason: default package */
public final class wee extends pu9 {
    public SurfaceView e;
    public final vee f = new vee(this);

    public wee(FrameLayout frameLayout, l8b l8b) {
        super(frameLayout, l8b);
    }

    public final View f() {
        return this.e;
    }

    public final Bitmap g() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, createBitmap, new uee(semaphore), new Handler(handlerThread.getLooper()));
        try {
            semaphore.tryAcquire(1, 100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            handlerThread.quitSafely();
            throw th;
        }
        handlerThread.quitSafely();
        return createBitmap;
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l(see see, u00 u00) {
        SurfaceView surfaceView = this.e;
        boolean equals = Objects.equals((Size) this.b, see.b);
        if (surfaceView == null || !equals) {
            this.b = see.b;
            FrameLayout frameLayout = (FrameLayout) this.c;
            frameLayout.getClass();
            ((Size) this.b).getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor a = ot3.a(this.e.getContext());
        see.k.a(new u3c(24, u00), a);
        this.e.post(new ewc(this, see, u00, 7));
    }

    public final bm7 o() {
        return dw6.c;
    }
}

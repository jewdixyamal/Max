package ru.ok.messages.stickers.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

public class StickerView extends FrameLayout implements fq6, ik9, hc7, nse {
    public static final /* synthetic */ int x0 = 0;
    public final gq6 a = ((gq6) ((y8a) vl.b()).getAccessor().c(gq6.class));
    public final hq6 b = ((hq6) ((y8a) vl.b()).getAccessor().c(hq6.class));
    public final int c;
    public final SimpleDraweeView o;
    public boolean s0;
    public boolean t0;
    public j4e u0;
    public int v0;
    public final q57 w0;

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ((y8a) vl.b()).h();
        cj0 cj0 = (cj0) ((y8a) vl.b()).getAccessor().c(cj0.class);
        this.s0 = true;
        this.t0 = false;
        this.w0 = new q57(26, this);
        Collections.newSetFromMap(new WeakHashMap());
        setClipToPadding(false);
        fk4.b(128);
        this.c = fk4.b(144);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.o = simpleDraweeView;
        removeCallbacks(this.w0);
        if (((la6) simpleDraweeView.getHierarchy()).e.a(1) == null) {
            q57 q57 = new q57(26, (StickerView) this.w0.b);
            this.w0 = q57;
            postDelayed(q57, 100);
        }
        addView(simpleDraweeView, new FrameLayout.LayoutParams(-1, -1));
        KeyboardLottieAnimationView keyboardLottieAnimationView = new KeyboardLottieAnimationView(getContext(), (AttributeSet) null);
        addView(keyboardLottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        keyboardLottieAnimationView.setAutoRepeat(true);
        keyboardLottieAnimationView.setOnFirstFrameListener(new bqc(17, this));
        keyboardLottieAnimationView.setFailureListener(new m2e(23));
        keyboardLottieAnimationView.setVisibility(8);
        fk4.b(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fk4.b(28), fk4.b(28));
        layoutParams.setMarginEnd(fk4.b(2));
        layoutParams.bottomMargin = fk4.b(2);
        layoutParams.gravity = 8388693;
        setOnClickListener(new e44((View.OnClickListener) new elb(7, (Object) this), 0));
        simpleDraweeView.setOnClickListener(new e44((View.OnClickListener) new elb(7, (Object) this), 0));
        c();
    }

    private File getStickerFile() {
        throw null;
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        return false;
    }

    public final void T() {
    }

    public final void X() {
        hm9.k("ru.ok.messages.stickers.widgets.StickerView", "onVideoEnd");
        if (this.t0 && !this.s0) {
            throw null;
        }
    }

    public final void Y(Throwable th) {
        hm9.k("ru.ok.messages.stickers.widgets.StickerView", "videoPlayerError");
        this.o.setClickable(true);
    }

    public final void a() {
        g();
    }

    public final void b() {
    }

    public final void c() {
        Context context = getContext();
        khe khe = sme.a0;
        fm9.R(context);
    }

    public final void d() {
    }

    public final void e(File file) {
        super.clearAnimation();
        post(new j4e(this, 2));
        ((y8a) vl.b()).p().getClass();
        if (!((ge2) ((jyc) jke.b()).getAccessor().c(ge2.class)).e(true)) {
            ((y8a) vl.b()).r();
            throw null;
        }
    }

    public final void f() {
        g();
    }

    public final void g() {
        int i = this.v0 + 1;
        this.v0 = i;
        if (i > 6) {
            post(new j4e(this, 0));
            return;
        }
        j4e j4e = new j4e(this, 1);
        this.u0 = j4e;
        postDelayed(j4e, (long) (((i * i) * 1000) / 2));
    }

    public String getDownloadContext() {
        Locale locale = Locale.ENGLISH;
        throw null;
    }

    public int getMaxHeight() {
        return this.c;
    }

    public d2e getSticker() {
        return null;
    }

    public final void j(float f, long j) {
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.w0);
        SimpleDraweeView simpleDraweeView = this.o;
        simpleDraweeView.setClickable(true);
        this.a.c(this);
        this.b.c(this);
        this.s0 = true;
        this.t0 = false;
        this.v0 = 0;
        j4e j4e = this.u0;
        if (j4e != null) {
            removeCallbacks(j4e);
        }
        simpleDraweeView.setVisibility(0);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.o.setClickable(z);
    }

    public void setListener(k4e k4e) {
    }

    public void setLottieLayer(fw7 fw7) {
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.o.setOnLongClickListener(onLongClickListener);
    }

    public void setStickerMediaPlayerController(we8 we8) {
    }

    public void setUseMaxHeight(boolean z) {
    }
}

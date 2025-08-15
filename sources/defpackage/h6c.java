package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: h6c  reason: default package */
public final class h6c extends FrameLayout {
    public final String a = h6c.class.getName();
    public int b = 3;

    public h6c(Context context) {
        super(context, (AttributeSet) null, 0);
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static float c(int i, Rect rect) {
        return ((float) ((tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) / 2) + rh4.c((float) 10, fk4.d().getDisplayMetrics().density, rect.left))) - (((float) i) / 2.0f);
    }

    private final c6d getLotties() {
        return l6d.Z(new at(7, this), n71.Z);
    }

    public final void a(long j, RLottieDrawable rLottieDrawable, Rect rect) {
        pk5 pk5 = new pk5(l6d.Z(getLotties(), new jh2(j, 5)));
        while (pk5.hasNext()) {
            RLottieImageView rLottieImageView = (RLottieImageView) pk5.next();
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
        int childCount = getChildCount();
        int i = this.b;
        String str = this.a;
        if (childCount >= i) {
            hm9.m0(str, "Reaction effect. Reached max count of lotties effects", new Object[0]);
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        RLottieImageView rLottieImageView2 = new RLottieImageView(getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView2, rLottieDrawable);
        rLottieImageView2.playAnimation();
        tpa.J(wxb.tag_reaction_effects_view, rLottieImageView2, Long.valueOf(j));
        setLayoutDirection(0);
        rLottieImageView2.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView2.setX(c(intrinsicWidth, rect));
        rLottieImageView2.setY(((float) rect.centerY()) - (((float) intrinsicHeight) / 2.0f));
        addView(rLottieImageView2);
        f6c f6c = new f6c(this, rLottieImageView2);
        rLottieDrawable.addDrawableLoadListener(f6c);
        g6c g6c = new g6c(this, rLottieImageView2);
        rLottieDrawable.addOnAllFramesRenderedListener(g6c);
        if (!rLottieImageView2.isAttachedToWindow()) {
            hm9.m(str, "onDetach", new Object[0]);
            rLottieDrawable.removeDrawableLoadListener(f6c);
            rLottieDrawable.removeOnAllFramesRenderedListener(g6c);
            return;
        }
        rLottieImageView2.addOnAttachStateChangeListener(new e6c(rLottieImageView2, this, rLottieDrawable, f6c, g6c));
    }

    public final void b() {
        for (RLottieImageView rLottieImageView : getLotties()) {
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
    }

    public final void d(long j, Rect rect) {
        Object obj;
        Iterator it = getLotties().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (tpa.f(tpa.v((RLottieImageView) obj, wxb.tag_reaction_effects_view), Long.valueOf(j))) {
                break;
            }
        }
        RLottieImageView rLottieImageView = (RLottieImageView) obj;
        if (rLottieImageView != null) {
            if (!rLottieImageView.isPlaying()) {
                hm9.m(this.a, "Reaction effect. Skip move", new Object[0]);
                return;
            }
            Drawable drawable = rLottieImageView.getDrawable();
            rLottieImageView.setX(c(drawable.getIntrinsicWidth(), rect));
            rLottieImageView.setY(((float) rect.centerY()) - (((float) drawable.getIntrinsicHeight()) / 2.0f));
        }
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
    }

    public final void setScrollOffset(int i) {
        float f = (float) i;
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}

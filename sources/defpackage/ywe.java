package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ywe  reason: default package */
public final class ywe extends PopupWindow implements kre {
    public final int X;
    public final int Y;
    public final ImageView Z;
    public final View a;
    public final k56 b;
    public final k56 c;
    public final k56 o;
    public final TextView s0;
    public final TextView t0;
    public final ImageView u0;
    public final Handler v0;
    public ule w0;
    public final je7 x0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywe(Context context, View view, k56 k56, k56 k562, int i, int i2, int i3) {
        this(context, view, k56, (i3 & 8) != 0 ? new sh5(1, k56) : k562, (k56) (i3 & 16) != 0 ? new sh5(2, k56) : null, (i3 & 32) != 0 ? 2 : i, (i3 & 64) != 0 ? 2 : i2);
    }

    public static void b(ywe ywe, View view, boolean z, wwe wwe, int i) {
        wwe wwe2 = (i & 4) != 0 ? null : wwe;
        ywe.getClass();
        int i2 = xoc.R0;
        Object tag = view.getTag(i2);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (wwe2 != null) {
                    wwe2.invoke();
                    return;
                }
                return;
            }
        }
        boolean f = tpa.f(tag, "fade_in");
        boolean f2 = tpa.f(tag, "fade_out");
        if (f && z) {
            return;
        }
        if (!f2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float alpha = view.getAlpha();
            float f3 = z ? 1.0f : 0.0f;
            float f4 = z ? fk4.d().getDisplayMetrics().density * 24.0f : fk4.d().getDisplayMetrics().density * 0.0f;
            float f5 = z ? fk4.d().getDisplayMetrics().density * 0.0f : fk4.d().getDisplayMetrics().density * 24.0f;
            if (z) {
                view.setTranslationY(f4);
            }
            view.animate().setDuration(150).alpha(f3).translationY(f5).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new xwe(view, i2, str, alpha, f3, z, f5, wwe2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new wwe(this, 0), 2);
        }
    }

    public final void c(Integer num) {
        ImageView imageView = this.Z;
        int i = 0;
        imageView.setVisibility(num != null ? 0 : 8);
        k56 k56 = this.o;
        imageView.setImageTintList(k56 != null ? ColorStateList.valueOf(((Number) k56.invoke()).intValue()) : null);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        TextView textView = this.s0;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                i = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
            }
            marginLayoutParams.topMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void d(jqe jqe) {
        TextView textView = this.s0;
        textView.setText(jqe.b(textView.getContext()));
    }

    public final void dismiss() {
        super.dismiss();
        try {
            ule ule = this.w0;
            if (ule != null) {
                this.v0.removeCallbacks(ule);
            }
        } catch (Exception e) {
            hm9.l0(ywe.class.getName(), e.getMessage(), e);
        }
        this.w0 = null;
    }

    public final void e(Point point, int i, long j) {
        ule ule = this.w0;
        Handler handler = this.v0;
        if (ule != null) {
            handler.removeCallbacks(ule);
            this.w0 = null;
        }
        showAtLocation(this.a, i, point.x - (getWidth() / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, (wwe) null, 6);
        }
        ule ule2 = new ule(3, this);
        handler.postDelayed(ule2, j);
        this.w0 = ule2;
    }

    public final void onThemeChanged(fka fka) {
        k56 k56 = this.b;
        fka fka2 = (fka) k56.invoke();
        ImageView imageView = this.Z;
        k56 k562 = this.o;
        imageView.setImageTintList(k562 != null ? ColorStateList.valueOf(((Number) k562.invoke()).intValue()) : null);
        this.s0.setTextColor(ColorStateList.valueOf(fka2.getText().e));
        ((twe) this.x0.getValue()).onThemeChanged(fka);
        ImageView imageView2 = this.u0;
        ((fka) k56.invoke()).getIcon();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
    }

    public ywe(Context context, View view, k56 k56, k56 k562, k56 k563, int i, int i2) {
        Context context2 = context;
        int i3 = i;
        this.a = view;
        this.b = k56;
        this.c = k562;
        this.o = k563;
        this.X = i3;
        this.Y = i2;
        this.v0 = new Handler(Looper.getMainLooper());
        je7 r = tu0.r(3, new wwe(this, 1));
        this.x0 = r;
        fka fka = (fka) k56.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        ImageView imageView = new ImageView(context2);
        imageView.setId(xoc.T0);
        imageView.setLayoutParams(new ti3(-2, -2));
        imageView.setVisibility(8);
        this.Z = imageView;
        TextView textView = new TextView(context2);
        textView.setId(xoc.V0);
        textView.setLayoutParams(new ti3(-1, -2));
        textView.setGravity(17);
        textView.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(ColorStateList.valueOf(fka.getText().e));
        i4f.p.b(textView, du4.b);
        this.s0 = textView;
        ImageView imageView2 = new ImageView(context2);
        imageView2.setId(xoc.S0);
        float f = (float) 20;
        imageView2.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView2.setImageResource(woc.i0);
        ((fka) k56.invoke()).getClass();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        tu0.K(imageView2, 300, new elb(12, (Object) this));
        imageView2.setVisibility(8);
        this.u0 = imageView2;
        TextView textView2 = new TextView(context2);
        textView2.setId(xoc.U0);
        textView2.setLayoutParams(new ti3(-1, -2));
        textView2.setGravity(17);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(ColorStateList.valueOf(fka.getText().g));
        i4f.s.b(textView2, du4.b);
        textView2.setVisibility(8);
        this.t0 = textView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        float f2 = (float) 10;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2) + (i3 == 1 ? tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) : 0);
        int G2 = tu0.G(f2 * fk4.d().getDisplayMetrics().density) + (i3 == 2 ? tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density) : 0);
        float f3 = (float) 12;
        constraintLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), G, tu0.G(f3 * fk4.d().getDisplayMetrics().density), G2);
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        constraintLayout.setBackground((twe) r.getValue());
        constraintLayout.addView(imageView2);
        constraintLayout.addView(imageView);
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.setVisibility(8);
        dj3 q = fp3.q(constraintLayout);
        int id = imageView2.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, textView.getId(), 3);
        q.g(id2).d.W = 2;
        int id3 = textView.getId();
        q.d(id3, 3, imageView.getId(), 4);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, imageView2.getId(), 6);
        q.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        q.d(id4, 3, textView.getId(), 4);
        new l2a(q, 3, id4, 4).e(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
        q.d(id4, 7, textView.getId(), 7);
        q.d(id4, 6, textView.getId(), 6);
        q.d(id4, 4, 0, 4);
        q.a(constraintLayout);
        setContentView(constraintLayout);
    }
}
